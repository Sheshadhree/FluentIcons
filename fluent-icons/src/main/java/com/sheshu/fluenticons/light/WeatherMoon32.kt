package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.WeatherMoon32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.WeatherMoon32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.229f, 3.286f)
            curveTo(16.32f, 3.15f, 16.456f, 3.08f, 16.619f, 3.1f)
            curveTo(23.036f, 3.897f, 28f, 9.37f, 28f, 16f)
            curveToRelative(0f, 7.18f, -5.82f, 13f, -13f, 13f)
            curveToRelative(-5.01f, 0f, -9.36f, -2.835f, -11.53f, -6.99f)
            lineToRelative(0.008f, -0.005f)
            curveTo(3.48f, 22.002f, 3.486f, 22f, 3.496f, 22f)
            curveToRelative(7.456f, 0f, 13.5f, -6.044f, 13.5f, -13.5f)
            curveToRelative(0f, -1.638f, -0.292f, -3.208f, -0.827f, -4.662f)
            curveToRelative(-0.073f, -0.199f, -0.038f, -0.406f, 0.06f, -0.552f)
            close()
            moveTo(3.496f, 21f)
            curveToRelative(-0.705f, 0f, -1.293f, 0.744f, -0.919f, 1.462f)
            curveTo(4.912f, 26.941f, 9.598f, 30f, 15f, 30f)
            curveToRelative(7.732f, 0f, 14f, -6.268f, 14f, -14f)
            curveToRelative(0f, -7.142f, -5.348f, -13.034f, -12.257f, -13.893f)
            curveToRelative(-0.582f, -0.072f, -1.068f, 0.21f, -1.345f, 0.622f)
            curveToRelative(-0.271f, 0.405f, -0.354f, 0.948f, -0.167f, 1.455f)
            curveToRelative(0.495f, 1.344f, 0.765f, 2.798f, 0.765f, 4.316f)
            curveToRelative(0f, 6.904f, -5.596f, 12.5f, -12.5f, 12.5f)
            close()
        }
    }.build()
}
