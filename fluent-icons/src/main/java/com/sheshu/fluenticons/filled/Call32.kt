package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Call32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Call32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.512f, 14.045f)
            lineToRelative(2.146f, -1.968f)
            curveToRelative(1.202f, -1.102f, 1.614f, -2.824f, 1.042f, -4.35f)
            lineToRelative(-0.917f, -2.448f)
            curveToRelative(-0.71f, -1.896f, -2.773f, -2.912f, -4.709f, -2.32f)
            curveToRelative(-3.432f, 1.05f, -6.07f, 4.24f, -5.258f, 8.029f)
            curveToRelative(0.534f, 2.492f, 1.555f, 5.62f, 3.492f, 8.949f)
            curveToRelative(1.94f, 3.335f, 4.156f, 5.8f, 6.055f, 7.53f)
            curveToRelative(2.87f, 2.612f, 6.97f, 1.959f, 9.608f, -0.5f)
            curveToRelative(1.467f, -1.37f, 1.617f, -3.643f, 0.342f, -5.192f)
            lineToRelative(-1.681f, -2.042f)
            curveToRelative(-1.037f, -1.26f, -2.734f, -1.763f, -4.29f, -1.274f)
            lineToRelative(-2.776f, 0.875f)
            curveToRelative(-0.107f, -0.11f, -0.23f, -0.241f, -0.366f, -0.392f)
            curveToRelative(-0.456f, -0.509f, -1.027f, -1.222f, -1.507f, -2.053f)
            reflectiveCurveToRelative(-0.812f, -1.682f, -1.024f, -2.332f)
            curveToRelative(-0.063f, -0.192f, -0.115f, -0.364f, -0.157f, -0.512f)
            close()
        }
    }.build()
}
