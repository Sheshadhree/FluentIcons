package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Desktop48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Desktop48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.25f, 5f)
            curveTo(5.903f, 5f, 4f, 6.903f, 4f, 9.25f)
            verticalLineToRelative(23.5f)
            curveTo(4f, 35.097f, 5.903f, 37f, 8.25f, 37f)
            horizontalLineTo(17f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(-2.75f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveTo(13.56f, 43f, 14.25f, 43f)
            horizontalLineToRelative(19.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(31f)
            verticalLineTo(37f)
            horizontalLineToRelative(8.75f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineTo(9.25f)
            curveTo(44f, 6.903f, 42.097f, 5f, 39.75f, 5f)
            horizontalLineTo(8.25f)
            close()
            moveTo(28.5f, 37f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(-9f)
            verticalLineTo(37f)
            horizontalLineToRelative(9f)
            close()
            moveTo(6.5f, 9.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(31.5f)
            curveToRelative(0.967f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(23.5f)
            curveToRelative(0f, 0.967f, -0.783f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(8.25f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.783f, -1.75f, -1.75f)
            verticalLineTo(9.25f)
            close()
        }
    }.build()
}
