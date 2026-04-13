package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Pi20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pi20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.18f, 4.668f)
            curveTo(2.977f, 5.056f, 2.97f, 5.556f, 3.038f, 5.902f)
            curveTo(3.093f, 6.173f, 2.917f, 6.436f, 2.646f, 6.49f)
            curveToRelative(-0.27f, 0.054f, -0.534f, -0.122f, -0.588f, -0.392f)
            curveTo(1.961f, 5.61f, 1.953f, 4.86f, 2.292f, 4.208f)
            curveTo(2.655f, 3.504f, 3.377f, 3f, 4.542f, 3f)
            horizontalLineTo(16.5f)
            curveTo(16.776f, 3f, 17f, 3.224f, 17f, 3.5f)
            reflectiveCurveTo(16.776f, 4f, 16.5f, 4f)
            horizontalLineTo(14f)
            verticalLineToRelative(9.665f)
            curveToRelative(0f, 1.543f, 0.469f, 2.058f, 0.837f, 2.23f)
            curveToRelative(0.423f, 0.199f, 0.998f, 0.091f, 1.436f, -0.132f)
            curveToRelative(0.246f, -0.125f, 0.547f, -0.027f, 0.673f, 0.219f)
            curveToRelative(0.125f, 0.246f, 0.027f, 0.547f, -0.22f, 0.672f)
            curveToRelative(-0.56f, 0.286f, -1.486f, 0.534f, -2.313f, 0.148f)
            curveTo(13.531f, 16.389f, 13f, 15.378f, 13f, 13.665f)
            verticalLineTo(4f)
            horizontalLineTo(8f)
            verticalLineToRelative(0.028f)
            curveToRelative(-0.085f, 1.51f, -0.286f, 4.048f, -0.617f, 6.514f)
            curveToRelative(-0.166f, 1.232f, -0.365f, 2.453f, -0.6f, 3.522f)
            curveToRelative(-0.232f, 1.059f, -0.507f, 2.002f, -0.836f, 2.66f)
            curveToRelative(-0.123f, 0.247f, -0.424f, 0.347f, -0.67f, 0.223f)
            curveToRelative(-0.248f, -0.123f, -0.348f, -0.424f, -0.224f, -0.67f)
            curveToRelative(0.271f, -0.543f, 0.525f, -1.387f, 0.754f, -2.428f)
            curveToRelative(0.227f, -1.032f, 0.421f, -2.223f, 0.585f, -3.44f)
            curveTo(6.717f, 7.988f, 6.915f, 5.492f, 6.999f, 4f)
            horizontalLineTo(4.542f)
            curveTo(3.714f, 4f, 3.355f, 4.328f, 3.179f, 4.668f)
            close()
        }
    }.build()
}
