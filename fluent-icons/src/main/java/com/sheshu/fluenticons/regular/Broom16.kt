package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Broom16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Broom16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.854f, 1.147f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.707f, 0f)
            lineToRelative(-4.671f, 4.67f)
            curveTo(8.024f, 4.714f, 5.969f, 4.88f, 4.653f, 6.19f)
            lineTo(3.969f, 6.83f)
            lineTo(1.292f, 8.045f)
            curveTo(1.143f, 8.113f, 1.037f, 8.249f, 1.008f, 8.41f)
            curveTo(0.978f, 8.572f, 1.03f, 8.738f, 1.147f, 8.854f)
            lineToRelative(6f, 6f)
            curveToRelative(0.115f, 0.116f, 0.28f, 0.167f, 0.442f, 0.138f)
            curveToRelative(0.162f, -0.03f, 0.298f, -0.136f, 0.366f, -0.285f)
            lineToRelative(1.213f, -2.667f)
            lineToRelative(0.685f, -0.686f)
            curveToRelative(1.325f, -1.325f, 1.435f, -3.384f, 0.33f, -4.83f)
            lineToRelative(4.67f, -4.67f)
            curveToRelative(0.196f, -0.196f, 0.196f, -0.512f, 0f, -0.708f)
            close()
            moveTo(4.14f, 7.848f)
            lineToRelative(4.01f, 4.01f)
            lineToRelative(-0.808f, 1.777f)
            lineToRelative(-4.98f, -4.98f)
            lineToRelative(1.78f, -0.805f)
            close()
            moveToRelative(4.609f, 3.194f)
            lineToRelative(-3.78f, -3.78f)
            lineToRelative(0.371f, -0.347f)
            lineToRelative(0.012f, -0.012f)
            curveToRelative(1.065f, -1.065f, 2.75f, -1.095f, 3.793f, -0.05f)
            curveToRelative(1.055f, 1.054f, 1.055f, 2.738f, 0f, 3.793f)
            lineTo(8.75f, 11.043f)
            close()
        }
    }.build()
}
