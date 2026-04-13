package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationArrow20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationArrow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.637f, 2.07f)
            curveToRelative(0.81f, -0.312f, 1.604f, 0.483f, 1.293f, 1.292f)
            lineToRelative(-5.384f, 13.997f)
            curveToRelative(-0.348f, 0.906f, -1.653f, 0.834f, -1.9f, -0.105f)
            lineToRelative(-1.572f, -5.973f)
            curveToRelative(-0.046f, -0.174f, -0.182f, -0.31f, -0.356f, -0.356f)
            lineTo(2.745f, 9.353f)
            curveToRelative(-0.94f, -0.247f, -1.01f, -1.552f, -0.105f, -1.9f)
            lineToRelative(13.997f, -5.384f)
            close()
        }
    }.build()
}
