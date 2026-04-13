package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SplitHorizontal48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SplitHorizontal48",
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
            moveTo(8f, 39.75f)
            verticalLineTo(27.5f)
            horizontalLineToRelative(32f)
            verticalLineToRelative(12.25f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-23.5f)
            curveTo(9.903f, 44f, 8f, 42.097f, 8f, 39.75f)
            close()
            moveTo(40f, 21f)
            verticalLineTo(8.25f)
            curveTo(40f, 5.903f, 38.097f, 4f, 35.75f, 4f)
            horizontalLineToRelative(-23.5f)
            curveTo(9.903f, 4f, 8f, 5.903f, 8f, 8.25f)
            verticalLineTo(21f)
            horizontalLineToRelative(32f)
            close()
        }
    }.build()
}
