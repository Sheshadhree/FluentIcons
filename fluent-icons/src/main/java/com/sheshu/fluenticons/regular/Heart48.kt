package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Heart48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Heart48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.923f, 10.155f)
            curveToRelative(4.113f, -3.297f, 10.04f, -3.003f, 13.806f, 0.684f)
            lineToRelative(2.272f, 2.223f)
            lineToRelative(2.266f, -2.22f)
            curveToRelative(3.767f, -3.689f, 9.695f, -3.984f, 13.809f, -0.687f)
            curveToRelative(4.85f, 3.887f, 5.242f, 11.13f, 0.837f, 15.516f)
            lineToRelative(-16.03f, 15.964f)
            curveToRelative(-0.488f, 0.486f, -1.276f, 0.486f, -1.764f, 0f)
            lineTo(7.087f, 25.67f)
            curveToRelative(-4.405f, -4.386f, -4.015f, -11.628f, 0.836f, -15.516f)
            close()
            moveToRelative(12.057f, 2.47f)
            curveToRelative(-2.863f, -2.802f, -7.367f, -3.025f, -10.494f, -0.52f)
            curveTo(5.8f, 15.06f, 5.503f, 20.565f, 8.851f, 23.9f)
            lineTo(24f, 38.986f)
            lineToRelative(15.148f, -15.087f)
            curveToRelative(3.348f, -3.334f, 3.05f, -8.839f, -0.636f, -11.793f)
            curveToRelative(-3.127f, -2.506f, -7.633f, -2.282f, -10.496f, 0.522f)
            lineToRelative(-3.141f, 3.077f)
            curveToRelative(-0.486f, 0.476f, -1.263f, 0.476f, -1.75f, 0f)
            lineToRelative(-3.146f, -3.08f)
            close()
        }
    }.build()
}
