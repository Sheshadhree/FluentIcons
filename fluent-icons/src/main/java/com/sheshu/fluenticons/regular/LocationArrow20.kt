package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LocationArrow20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LocationArrow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.93f, 3.362f)
            curveToRelative(0.31f, -0.81f, -0.484f, -1.604f, -1.293f, -1.293f)
            lineTo(2.64f, 7.453f)
            curveTo(1.734f, 7.8f, 1.806f, 9.106f, 2.745f, 9.353f)
            lineToRelative(5.973f, 1.572f)
            curveToRelative(0.174f, 0.046f, 0.31f, 0.182f, 0.356f, 0.356f)
            lineToRelative(1.572f, 5.973f)
            curveToRelative(0.247f, 0.94f, 1.552f, 1.01f, 1.9f, 0.105f)
            lineTo(17.93f, 3.362f)
            close()
            moveToRelative(-0.934f, -0.36f)
            lineTo(11.613f, 17f)
            lineToRelative(-1.572f, -5.973f)
            curveToRelative(-0.138f, -0.523f, -0.546f, -0.931f, -1.069f, -1.069f)
            lineTo(3f, 8.386f)
            lineToRelative(13.997f, -5.383f)
            close()
        }
    }.build()
}
