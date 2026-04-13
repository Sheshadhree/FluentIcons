package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Video20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Video20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4f)
            curveTo(3.343f, 4f, 2f, 5.343f, 2f, 7f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(5f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineToRelative(-0.321f)
            lineToRelative(3.037f, 2.097f)
            curveToRelative(0.83f, 0.572f, 1.96f, -0.021f, 1.96f, -1.029f)
            verticalLineTo(6.252f)
            curveToRelative(0f, -1.007f, -1.13f, -1.601f, -1.96f, -1.029f)
            lineTo(13f, 7.321f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(5f)
            close()
            moveToRelative(8f, 4.536f)
            lineToRelative(3.605f, -2.49f)
            curveToRelative(0.166f, -0.114f, 0.392f, 0.005f, 0.392f, 0.206f)
            verticalLineToRelative(7.495f)
            curveToRelative(0f, 0.202f, -0.226f, 0.32f, -0.392f, 0.206f)
            lineTo(13f, 11.463f)
            verticalLineTo(8.537f)
            close()
            moveTo(3f, 7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(5f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(7f)
            close()
        }
    }.build()
}
