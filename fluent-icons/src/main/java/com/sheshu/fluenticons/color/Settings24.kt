package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Settings24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Settings24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF70777D),
                    1f to Color(0xFFB9C0C7)
                ),
                start = Offset(16.6816f, 20.9953f),
                end = Offset(5.7845f, 3.99641f)
            )
        ) {
            moveTo(12.012f, 2.25f)
            curveToRelative(0.734f, 0.009f, 1.465f, 0.093f, 2.182f, 0.253f)
            curveToRelative(0.312f, 0.07f, 0.546f, 0.33f, 0.582f, 0.649f)
            lineToRelative(0.17f, 1.527f)
            curveToRelative(0.077f, 0.7f, 0.669f, 1.232f, 1.375f, 1.233f)
            curveToRelative(0.19f, 0f, 0.377f, -0.04f, 0.552f, -0.117f)
            lineToRelative(1.4f, -0.615f)
            curveToRelative(0.292f, -0.128f, 0.633f, -0.059f, 0.85f, 0.174f)
            curveToRelative(1.012f, 1.08f, 1.766f, 2.377f, 2.205f, 3.792f)
            curveToRelative(0.094f, 0.305f, -0.015f, 0.636f, -0.272f, 0.825f)
            lineToRelative(-1.241f, 0.916f)
            curveToRelative(-0.354f, 0.26f, -0.563f, 0.673f, -0.563f, 1.112f)
            curveToRelative(0f, 0.44f, 0.209f, 0.853f, 0.564f, 1.114f)
            lineToRelative(1.242f, 0.915f)
            curveToRelative(0.257f, 0.19f, 0.366f, 0.521f, 0.272f, 0.826f)
            curveToRelative(-0.439f, 1.415f, -1.192f, 2.71f, -2.204f, 3.792f)
            curveToRelative(-0.217f, 0.232f, -0.557f, 0.302f, -0.849f, 0.175f)
            lineToRelative(-1.406f, -0.617f)
            curveToRelative(-0.402f, -0.176f, -0.864f, -0.15f, -1.244f, 0.07f)
            reflectiveCurveToRelative(-0.634f, 0.607f, -0.682f, 1.044f)
            lineToRelative(-0.17f, 1.526f)
            curveToRelative(-0.034f, 0.315f, -0.263f, 0.574f, -0.571f, 0.647f)
            curveToRelative(-1.448f, 0.345f, -2.958f, 0.345f, -4.406f, 0f)
            curveToRelative(-0.308f, -0.073f, -0.537f, -0.332f, -0.572f, -0.647f)
            lineTo(9.057f, 19.32f)
            curveToRelative(-0.05f, -0.436f, -0.303f, -0.822f, -0.683f, -1.041f)
            curveToRelative(-0.38f, -0.219f, -0.84f, -0.245f, -1.242f, -0.07f)
            lineToRelative(-1.406f, 0.617f)
            curveToRelative(-0.292f, 0.127f, -0.632f, 0.057f, -0.85f, -0.175f)
            curveToRelative(-1.011f, -1.082f, -1.765f, -2.38f, -2.203f, -3.796f)
            curveToRelative(-0.094f, -0.305f, 0.015f, -0.636f, 0.272f, -0.826f)
            lineToRelative(1.243f, -0.916f)
            curveToRelative(0.354f, -0.26f, 0.564f, -0.673f, 0.564f, -1.112f)
            curveToRelative(0f, -0.44f, -0.21f, -0.853f, -0.564f, -1.114f)
            lineTo(2.945f, 9.973f)
            curveTo(2.688f, 9.783f, 2.58f, 9.452f, 2.673f, 9.147f)
            curveToRelative(0.44f, -1.415f, 1.193f, -2.711f, 2.205f, -3.792f)
            curveToRelative(0.218f, -0.233f, 0.558f, -0.302f, 0.85f, -0.174f)
            lineToRelative(1.4f, 0.615f)
            curveToRelative(0.403f, 0.177f, 0.866f, 0.15f, 1.248f, -0.073f)
            curveToRelative(0.38f, -0.22f, 0.633f, -0.609f, 0.682f, -1.045f)
            lineToRelative(0.17f, -1.526f)
            curveToRelative(0.036f, -0.319f, 0.27f, -0.58f, 0.583f, -0.65f)
            curveToRelative(0.717f, -0.159f, 1.449f, -0.243f, 2.201f, -0.252f)
            close()
            moveTo(12f, 9f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            curveToRelative(1.656f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.344f, -3f, -3f, -3f)
            close()
        }
    }.build()
}
