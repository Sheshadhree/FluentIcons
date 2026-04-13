package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SplitHorizontal48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SplitHorizontal48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(42.75f, 25.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(43.44f, 23f, 42.75f, 23f)
            horizontalLineTo(5.25f)
            curveTo(4.56f, 23f, 4f, 23.56f, 4f, 24.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(37.5f)
            close()
            moveTo(10.5f, 39.75f)
            verticalLineTo(27.5f)
            horizontalLineTo(8f)
            verticalLineToRelative(12.25f)
            curveTo(8f, 42.097f, 9.903f, 44f, 12.25f, 44f)
            horizontalLineToRelative(23.5f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineTo(27.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(12.25f)
            curveToRelative(0f, 0.967f, -0.783f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-23.5f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.783f, -1.75f, -1.75f)
            close()
            moveTo(40f, 21f)
            verticalLineTo(8.25f)
            curveTo(40f, 5.903f, 38.097f, 4f, 35.75f, 4f)
            horizontalLineToRelative(-23.5f)
            curveTo(9.903f, 4f, 8f, 5.903f, 8f, 8.25f)
            verticalLineTo(21f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(8.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(23.5f)
            curveToRelative(0.967f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineTo(21f)
            horizontalLineTo(40f)
            close()
        }
    }.build()
}
