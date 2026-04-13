package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Premium32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Premium32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 4f)
            curveTo(6.621f, 4f, 6.275f, 4.214f, 6.106f, 4.553f)
            lineToRelative(-4f, 8f)
            curveToRelative(-0.176f, 0.351f, -0.13f, 0.773f, 0.118f, 1.078f)
            lineToRelative(13f, 16f)
            curveTo(15.414f, 29.864f, 15.699f, 30f, 16f, 30f)
            curveToRelative(0.301f, 0f, 0.586f, -0.136f, 0.776f, -0.37f)
            lineToRelative(13f, -16f)
            curveToRelative(0.248f, -0.304f, 0.294f, -0.726f, 0.118f, -1.077f)
            lineToRelative(-4f, -8f)
            curveTo(25.725f, 4.214f, 25.38f, 4f, 25f, 4f)
            horizontalLineTo(7f)
            close()
            moveToRelative(-2.382f, 8f)
            lineToRelative(3f, -6f)
            horizontalLineToRelative(4.101f)
            lineToRelative(-1.5f, 6f)
            horizontalLineTo(4.618f)
            close()
            moveToRelative(0.483f, 2f)
            horizontalLineToRelative(5.164f)
            lineToRelative(3.227f, 10.328f)
            lineTo(5.101f, 14f)
            close()
            moveToRelative(7.26f, 0f)
            horizontalLineToRelative(7.279f)
            lineTo(16f, 25.647f)
            lineTo(12.36f, 14f)
            close()
            moveToRelative(9.374f, 0f)
            horizontalLineTo(26.9f)
            lineToRelative(-8.391f, 10.328f)
            lineTo(21.735f, 14f)
            close()
            moveToRelative(5.647f, -2f)
            horizontalLineToRelative(-5.601f)
            lineToRelative(-1.5f, -6f)
            horizontalLineToRelative(4.101f)
            lineToRelative(3f, 6f)
            close()
            moveToRelative(-7.663f, 0f)
            horizontalLineToRelative(-7.438f)
            lineToRelative(1.5f, -6f)
            horizontalLineToRelative(4.438f)
            lineToRelative(1.5f, 6f)
            close()
        }
    }.build()
}
