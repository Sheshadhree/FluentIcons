package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Megaphone20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Megaphone20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.113f, 3.352f)
            curveTo(17.066f, 3.098f, 18f, 3.816f, 18f, 4.802f)
            verticalLineToRelative(10.31f)
            curveToRelative(0f, 1.024f, -1.003f, 1.747f, -1.974f, 1.424f)
            lineTo(11.27f, 14.95f)
            curveTo(10.793f, 16.15f, 9.62f, 17f, 8.25f, 17f)
            curveTo(6.455f, 17f, 5f, 15.545f, 5f, 13.75f)
            verticalLineToRelative(-0.89f)
            lineToRelative(-1.974f, -0.658f)
            curveTo(2.413f, 11.998f, 2f, 11.425f, 2f, 10.78f)
            verticalLineTo(8.27f)
            curveToRelative(0f, -0.68f, 0.457f, -1.275f, 1.114f, -1.45f)
            lineToRelative(13f, -3.467f)
            close()
            moveTo(6f, 13.194f)
            verticalLineToRelative(0.556f)
            curveTo(6f, 14.993f, 7.007f, 16f, 8.25f, 16f)
            curveToRelative(0.929f, 0f, 1.727f, -0.563f, 2.07f, -1.366f)
            lineTo(6f, 13.194f)
            close()
        }
    }.build()
}
