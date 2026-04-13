package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Autosum16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Autosum16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.54f, 2.304f)
            curveTo(2.62f, 2.12f, 2.8f, 2f, 3f, 2f)
            horizontalLineToRelative(9.5f)
            curveTo(12.776f, 2f, 13f, 2.224f, 13f, 2.5f)
            reflectiveCurveTo(12.776f, 3f, 12.5f, 3f)
            horizontalLineTo(4.171f)
            lineToRelative(4.074f, 4.253f)
            curveToRelative(0.176f, 0.183f, 0.186f, 0.47f, 0.024f, 0.665f)
            lineTo(4.063f, 13f)
            horizontalLineTo(12.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.776f, 14f, 12.5f, 14f)
            horizontalLineTo(3f)
            curveToRelative(-0.194f, 0f, -0.37f, -0.112f, -0.452f, -0.287f)
            curveToRelative(-0.083f, -0.175f, -0.057f, -0.383f, 0.067f, -0.532f)
            lineToRelative(4.6f, -5.558f)
            lineToRelative(-4.576f, -4.777f)
            curveTo(2.5f, 2.7f, 2.462f, 2.488f, 2.54f, 2.304f)
            close()
        }
    }.build()
}
