package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CursorHover32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CursorHover32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 10f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(20f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.612f, -0.954f, 3.002f, -2.328f, 3.635f)
            curveToRelative(-0.14f, -0.275f, -0.325f, -0.53f, -0.55f, -0.756f)
            lineToRelative(-0.892f, -0.892f)
            curveTo(27.226f, 21.873f, 28f, 21.027f, 28f, 20f)
            verticalLineTo(10f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(2f)
            horizontalLineTo(6f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineTo(10f)
            close()
            moveToRelative(15.707f, 6.293f)
            curveToRelative(-0.286f, -0.286f, -0.716f, -0.372f, -1.09f, -0.217f)
            curveTo(16.244f, 16.231f, 16f, 16.596f, 16f, 17f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 0.43f, 0.275f, 0.813f, 0.684f, 0.949f)
            curveToRelative(0.408f, 0.136f, 0.858f, -0.005f, 1.116f, -0.349f)
            lineToRelative(2.7f, -3.6f)
            horizontalLineTo(25f)
            curveToRelative(0.404f, 0f, 0.77f, -0.244f, 0.924f, -0.617f)
            curveToRelative(0.155f, -0.374f, 0.07f, -0.804f, -0.217f, -1.09f)
            lineToRelative(-8f, -8f)
            close()
            moveTo(18f, 26f)
            verticalLineToRelative(-6.586f)
            lineTo(22.586f, 24f)
            horizontalLineTo(20f)
            curveToRelative(-0.315f, 0f, -0.611f, 0.148f, -0.8f, 0.4f)
            lineTo(18f, 26f)
            close()
        }
    }.build()
}
