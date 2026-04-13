package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Airplane20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Airplane20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 2f)
            curveToRelative(0.607f, 0f, 1.157f, 0.36f, 1.4f, 0.916f)
            lineToRelative(2.368f, 5.41f)
            lineToRelative(3.236f, -0.201f)
            curveToRelative(1.036f, -0.065f, 1.928f, 0.722f, 1.992f, 1.758f)
            lineTo(18f, 10f)
            curveToRelative(0f, 1.038f, -0.841f, 1.879f, -1.879f, 1.879f)
            lineToRelative(-0.117f, -0.004f)
            lineToRelative(-3.236f, -0.202f)
            lineToRelative(-2.367f, 5.41f)
            curveTo(10.157f, 17.64f, 9.608f, 18f, 9f, 18f)
            curveToRelative(-0.488f, 0f, -0.883f, -0.395f, -0.883f, -0.883f)
            lineToRelative(0.002f, -0.055f)
            lineToRelative(0.703f, -5.636f)
            lineToRelative(-2.458f, -0.154f)
            lineToRelative(-1.14f, 2.28f)
            curveTo(5.087f, 13.828f, 4.806f, 14f, 4.5f, 14f)
            curveTo(4.224f, 14f, 4f, 13.776f, 4f, 13.5f)
            verticalLineToRelative(-2.376f)
            lineToRelative(-1.062f, -0.065f)
            curveTo(2.41f, 11.026f, 2f, 10.589f, 2f, 10.06f)
            verticalLineTo(9.94f)
            curveToRelative(0f, -0.53f, 0.41f, -0.966f, 0.938f, -1f)
            lineTo(4f, 8.875f)
            verticalLineTo(6.5f)
            curveTo(4f, 6.224f, 4.224f, 6f, 4.5f, 6f)
            curveToRelative(0.306f, 0f, 0.587f, 0.173f, 0.724f, 0.447f)
            lineToRelative(1.139f, 2.28f)
            lineToRelative(2.459f, -0.154f)
            lineToRelative(-0.698f, -5.58f)
            curveTo(8.064f, 2.508f, 8.407f, 2.066f, 8.89f, 2.006f)
            curveTo(8.928f, 2.002f, 8.963f, 2f, 9f, 2f)
            close()
        }
    }.build()
}
