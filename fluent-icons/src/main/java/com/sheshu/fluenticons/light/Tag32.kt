package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Tag32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Tag32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.89f, 3f)
            curveToRelative(-0.862f, 0f, -1.689f, 0.342f, -2.298f, 0.952f)
            lineToRelative(-11.64f, 11.64f)
            curveToRelative(-1.27f, 1.27f, -1.27f, 3.327f, 0f, 4.596f)
            lineToRelative(7.86f, 7.861f)
            curveToRelative(1.27f, 1.27f, 3.328f, 1.27f, 4.597f, 0f)
            lineToRelative(11.64f, -11.64f)
            curveToRelative(0.61f, -0.61f, 0.952f, -1.436f, 0.952f, -2.298f)
            verticalLineTo(6.25f)
            curveTo(29f, 4.455f, 27.546f, 3f, 25.75f, 3f)
            horizontalLineToRelative(-7.86f)
            close()
            moveToRelative(-1.591f, 1.659f)
            curveTo(16.721f, 4.237f, 17.293f, 4f, 17.89f, 4f)
            horizontalLineToRelative(7.86f)
            curveTo(26.994f, 4f, 28f, 5.007f, 28f, 6.25f)
            verticalLineToRelative(7.86f)
            curveToRelative(0f, 0.598f, -0.236f, 1.17f, -0.658f, 1.592f)
            lineToRelative(-11.64f, 11.64f)
            curveToRelative(-0.879f, 0.879f, -2.303f, 0.879f, -3.182f, 0f)
            lineTo(4.659f, 19.48f)
            curveToRelative(-0.879f, -0.879f, -0.879f, -2.303f, 0f, -3.182f)
            lineToRelative(11.64f, -11.64f)
            close()
            moveTo(23f, 11f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
        }
    }.build()
}
