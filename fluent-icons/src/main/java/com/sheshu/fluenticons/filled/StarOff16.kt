package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.358f, 13.065f)
            lineToRelative(1.788f, 1.789f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(3.482f, 3.481f)
            lineToRelative(-2.356f, 0.343f)
            curveToRelative(-0.739f, 0.107f, -1.033f, 1.014f, -0.5f, 1.535f)
            lineToRelative(2.462f, 2.4f)
            lineTo(3.653f, 13f)
            curveToRelative(-0.126f, 0.735f, 0.645f, 1.296f, 1.306f, 0.948f)
            lineTo(8f, 12.35f)
            lineToRelative(3.042f, 1.6f)
            curveToRelative(0.64f, 0.336f, 1.386f, -0.181f, 1.315f, -0.884f)
            close()
            moveToRelative(-0.59f, -3.453f)
            lineToRelative(0.007f, 0.042f)
            lineTo(6.212f, 4.09f)
            lineTo(7.194f, 2.1f)
            curveToRelative(0.33f, -0.668f, 1.284f, -0.668f, 1.614f, 0f)
            lineToRelative(1.521f, 3.083f)
            lineToRelative(3.401f, 0.494f)
            curveToRelative(0.739f, 0.107f, 1.033f, 1.014f, 0.5f, 1.535f)
            lineToRelative(-2.462f, 2.4f)
            close()
        }
    }.build()
}
