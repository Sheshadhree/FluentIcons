package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Attach12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Attach12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.01f, 2.582f)
            curveTo(8.23f, 1.804f, 6.967f, 1.8f, 6.18f, 2.572f)
            lineTo(2.85f, 5.844f)
            curveTo(2.655f, 6.037f, 2.338f, 6.035f, 2.144f, 5.84f)
            curveTo(1.95f, 5.644f, 1.952f, 5.329f, 2.15f, 5.135f)
            lineToRelative(3.329f, -3.271f)
            curveToRelative(1.176f, -1.157f, 3.07f, -1.151f, 4.24f, 0.013f)
            curveToRelative(1.175f, 1.17f, 1.175f, 3.067f, 0f, 4.237f)
            lineToRelative(-4.332f, 4.314f)
            curveToRelative(-0.765f, 0.763f, -2.007f, 0.763f, -2.772f, 0f)
            curveToRelative(-0.766f, -0.762f, -0.766f, -1.999f, 0f, -2.761f)
            lineToRelative(4.04f, -4.023f)
            curveToRelative(0.194f, -0.195f, 0.511f, -0.195f, 0.706f, 0f)
            curveToRelative(0.196f, 0.194f, 0.196f, 0.51f, 0f, 0.704f)
            lineTo(3.32f, 8.371f)
            curveToRelative(-0.374f, 0.374f, -0.374f, 0.98f, 0f, 1.353f)
            curveToRelative(0.376f, 0.373f, 0.984f, 0.373f, 1.36f, 0f)
            lineTo(9.01f, 5.41f)
            curveToRelative(0.785f, -0.78f, 0.785f, -2.047f, 0f, -2.828f)
            close()
        }
    }.build()
}
