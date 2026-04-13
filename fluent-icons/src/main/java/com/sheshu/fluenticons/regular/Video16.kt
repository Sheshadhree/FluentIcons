package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Video16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Video16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 3f)
            curveTo(2.12f, 3f, 1f, 4.12f, 1f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(1f, 11.88f, 2.12f, 13f, 3.5f, 13f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-0.127f)
            lineToRelative(2.035f, 1.405f)
            curveToRelative(0.83f, 0.573f, 1.96f, -0.02f, 1.96f, -1.028f)
            verticalLineTo(5.252f)
            curveToRelative(0f, -1.007f, -1.13f, -1.601f, -1.96f, -1.029f)
            lineTo(11f, 5.63f)
            verticalLineTo(5.5f)
            curveTo(11f, 4.12f, 9.88f, 3f, 8.5f, 3f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(11f, 6.844f)
            lineToRelative(2.604f, -1.798f)
            curveToRelative(0.166f, -0.114f, 0.392f, 0.005f, 0.392f, 0.206f)
            verticalLineToRelative(5.498f)
            curveToRelative(0f, 0.201f, -0.226f, 0.32f, -0.392f, 0.205f)
            lineTo(11f, 9.158f)
            verticalLineTo(6.844f)
            close()
            moveTo(2f, 5.5f)
            curveTo(2f, 4.672f, 2.672f, 4f, 3.5f, 4f)
            horizontalLineToRelative(5f)
            curveTo(9.328f, 4f, 10f, 4.672f, 10f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(2.672f, 12f, 2f, 11.328f, 2f, 10.5f)
            verticalLineToRelative(-5f)
            close()
        }
    }.build()
}
