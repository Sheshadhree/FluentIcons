package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Alert28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Alert28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.466f, 22.002f)
            curveToRelative(-0.244f, 1.697f, -1.703f, 3f, -3.466f, 3f)
            curveToRelative(-1.764f, 0f, -3.223f, -1.303f, -3.466f, -3f)
            horizontalLineToRelative(6.932f)
            close()
            moveTo(14f, 3f)
            curveToRelative(4.61f, 0f, 8.363f, 3.669f, 8.497f, 8.246f)
            verticalLineToRelative(0.255f)
            horizontalLineToRelative(0.004f)
            verticalLineToRelative(4.112f)
            lineToRelative(1.414f, 3.644f)
            curveToRelative(0.038f, 0.099f, 0.064f, 0.201f, 0.077f, 0.306f)
            lineToRelative(0.01f, 0.157f)
            curveToRelative(0f, 0.663f, -0.504f, 1.208f, -1.15f, 1.274f)
            lineTo(22.723f, 21f)
            horizontalLineTo(5.275f)
            curveToRelative(-0.159f, 0f, -0.316f, -0.03f, -0.464f, -0.087f)
            curveToRelative(-0.618f, -0.24f, -0.943f, -0.907f, -0.77f, -1.532f)
            lineToRelative(0.04f, -0.125f)
            lineToRelative(1.417f, -3.644f)
            verticalLineToRelative(-4.11f)
            curveTo(5.499f, 6.805f, 9.306f, 3f, 14f, 3f)
            close()
        }
    }.build()
}
