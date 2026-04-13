package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Wifi24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Wifi24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.113636f to Color(0xFF8B52F4),
                    1f to Color(0xFFEA71EF)
                ),
                center = Offset(11.9997f, 17.3003f),
                radius = 12.4917f
            )
        ) {
            moveTo(17.784f, 10.708f)
            curveToRelative(0.597f, 0.597f, 1.111f, 1.318f, 1.504f, 2.085f)
            curveToRelative(0.251f, 0.492f, 0.056f, 1.094f, -0.435f, 1.346f)
            curveToRelative(-0.492f, 0.251f, -1.094f, 0.057f, -1.346f, -0.435f)
            curveToRelative(-0.3f, -0.586f, -0.693f, -1.138f, -1.137f, -1.582f)
            curveToRelative(-2.393f, -2.393f, -6.273f, -2.393f, -8.666f, 0f)
            curveToRelative(-0.465f, 0.466f, -0.843f, 0.988f, -1.133f, 1.563f)
            curveToRelative(-0.25f, 0.492f, -0.851f, 0.69f, -1.344f, 0.44f)
            curveToRelative(-0.493f, -0.249f, -0.69f, -0.85f, -0.441f, -1.343f)
            curveToRelative(0.386f, -0.763f, 0.888f, -1.458f, 1.504f, -2.074f)
            curveToRelative(3.174f, -3.174f, 8.32f, -3.174f, 11.494f, 0f)
            close()
            moveTo(15.735f, 13.7f)
            curveToRelative(0.46f, 0.46f, 0.838f, 1.024f, 1.102f, 1.624f)
            curveToRelative(0.221f, 0.506f, -0.01f, 1.096f, -0.515f, 1.318f)
            curveToRelative(-0.506f, 0.221f, -1.096f, -0.01f, -1.317f, -0.515f)
            curveToRelative(-0.166f, -0.377f, -0.404f, -0.733f, -0.684f, -1.013f)
            curveToRelative(-1.262f, -1.262f, -3.31f, -1.262f, -4.572f, 0f)
            curveToRelative(-0.278f, 0.278f, -0.505f, 0.619f, -0.672f, 1f)
            curveToRelative(-0.221f, 0.506f, -0.81f, 0.737f, -1.317f, 0.515f)
            curveToRelative(-0.506f, -0.22f, -0.736f, -0.81f, -0.515f, -1.317f)
            curveToRelative(0.264f, -0.603f, 0.63f, -1.152f, 1.09f, -1.612f)
            curveToRelative(2.044f, -2.044f, 5.357f, -2.044f, 7.4f, 0f)
            close()
            moveToRelative(4.684f, -5.401f)
            curveToRelative(0.508f, 0.508f, 0.987f, 1.087f, 1.404f, 1.691f)
            curveToRelative(0.314f, 0.455f, 0.2f, 1.078f, -0.255f, 1.391f)
            curveToRelative(-0.454f, 0.314f, -1.077f, 0.2f, -1.39f, -0.255f)
            curveToRelative(-0.35f, -0.506f, -0.753f, -0.993f, -1.173f, -1.413f)
            curveToRelative(-3.872f, -3.872f, -10.15f, -3.872f, -14.023f, 0f)
            curveToRelative(-0.399f, 0.399f, -0.797f, 0.886f, -1.16f, 1.41f)
            curveToRelative(-0.315f, 0.453f, -0.938f, 0.566f, -1.392f, 0.251f)
            curveToRelative(-0.454f, -0.315f, -0.566f, -0.938f, -0.252f, -1.392f)
            curveTo(2.607f, 9.365f, 3.08f, 8.788f, 3.569f, 8.3f)
            curveToRelative(4.653f, -4.654f, 12.198f, -4.654f, 16.851f, 0f)
            close()
            moveToRelative(-7.357f, 8.142f)
            curveToRelative(0.586f, 0.586f, 0.586f, 1.537f, 0f, 2.123f)
            curveToRelative(-0.587f, 0.586f, -1.537f, 0.586f, -2.123f, 0f)
            curveToRelative(-0.587f, -0.586f, -0.587f, -1.537f, 0f, -2.123f)
            curveToRelative(0.586f, -0.586f, 1.536f, -0.586f, 2.123f, 0f)
            close()
        }
    }.build()
}
