package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.GlobeShield20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.GlobeShield20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF29C3FF),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(5.55556f, 4.66667f),
                end = Offset(17.1111f, 15.3333f)
            )
        ) {
            moveTo(10f, 18f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF003580),
                    1f to Color(0x00003580)
                ),
                center = Offset(14.9375f, 14.125f),
                radius = 6.72116f
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(10f, 18f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.411967f to Color(0xFF1B44B1),
                    1f to Color(0x001B44B1)
                ),
                center = Offset(15.25f, 14f),
                radius = 10.5253f
            ),
            fillAlpha = 0.2f
        ) {
            moveTo(10f, 18f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.445f to Color(0x003BD5FF),
                    0.815f to Color(0xFF3BD5FF)
                ),
                center = Offset(15f, 14.0024f),
                radius = 12.0242f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.853f, 2.291f)
            curveTo(7.542f, 2.716f, 7.27f, 3.23f, 7.037f, 3.801f)
            curveTo(6.669f, 4.707f, 6.387f, 5.796f, 6.21f, 7f)
            horizontalLineTo(2.58f)
            curveTo(2.45f, 7.323f, 2.34f, 7.657f, 2.251f, 8f)
            horizontalLineToRelative(3.84f)
            curveTo(6.031f, 8.644f, 6f, 9.314f, 6f, 10f)
            curveToRelative(0f, 0.686f, 0.031f, 1.356f, 0.091f, 2f)
            horizontalLineTo(2.252f)
            curveToRelative(0.088f, 0.343f, 0.199f, 0.677f, 0.33f, 1f)
            horizontalLineTo(6.21f)
            curveToRelative(0.176f, 1.204f, 0.458f, 2.293f, 0.826f, 3.199f)
            curveToRelative(0.232f, 0.572f, 0.505f, 1.085f, 0.816f, 1.51f)
            curveTo(8.536f, 17.899f, 9.256f, 18f, 10f, 18f)
            curveToRelative(0.744f, 0f, 1.463f, -0.102f, 2.147f, -0.291f)
            curveToRelative(0.311f, -0.425f, 0.583f, -0.938f, 0.816f, -1.51f)
            curveToRelative(0.368f, -0.906f, 0.65f, -1.995f, 0.826f, -3.199f)
            horizontalLineToRelative(3.63f)
            curveToRelative(0.13f, -0.323f, 0.24f, -0.657f, 0.329f, -1f)
            horizontalLineToRelative(-3.84f)
            curveTo(13.968f, 11.356f, 14f, 10.686f, 14f, 10f)
            curveToRelative(0f, -0.686f, -0.031f, -1.356f, -0.092f, -2f)
            horizontalLineToRelative(3.84f)
            curveToRelative(-0.088f, -0.343f, -0.199f, -0.677f, -0.33f, -1f)
            horizontalLineTo(13.79f)
            curveToRelative(-0.176f, -1.204f, -0.458f, -2.293f, -0.826f, -3.199f)
            curveToRelative(-0.233f, -0.572f, -0.505f, -1.085f, -0.816f, -1.51f)
            curveTo(11.463f, 2.101f, 10.744f, 2f, 10f, 2f)
            curveTo(9.256f, 2f, 8.536f, 2.102f, 7.853f, 2.291f)
            close()
            moveTo(7.223f, 7f)
            curveToRelative(0.166f, -1.076f, 0.42f, -2.035f, 0.74f, -2.822f)
            curveToRelative(0.298f, -0.733f, 0.642f, -1.292f, 1.003f, -1.66f)
            curveTo(9.324f, 2.153f, 9.672f, 2f, 10f, 2f)
            curveToRelative(0.328f, 0f, 0.676f, 0.153f, 1.034f, 0.518f)
            curveToRelative(0.36f, 0.368f, 0.705f, 0.927f, 1.003f, 1.66f)
            curveToRelative(0.32f, 0.787f, 0.574f, 1.746f, 0.74f, 2.822f)
            horizontalLineTo(7.223f)
            close()
            moveTo(10f, 18f)
            curveToRelative(0.328f, 0f, 0.676f, -0.153f, 1.034f, -0.518f)
            curveToRelative(0.36f, -0.368f, 0.705f, -0.927f, 1.003f, -1.66f)
            curveToRelative(0.32f, -0.787f, 0.574f, -1.746f, 0.74f, -2.822f)
            horizontalLineTo(7.223f)
            curveToRelative(0.167f, 1.076f, 0.421f, 2.035f, 0.741f, 2.822f)
            curveToRelative(0.298f, 0.733f, 0.642f, 1.292f, 1.003f, 1.66f)
            curveTo(9.324f, 17.847f, 9.672f, 18f, 10f, 18f)
            close()
            moveToRelative(-3f, -8f)
            curveToRelative(0f, 0.692f, 0.033f, 1.362f, 0.096f, 2f)
            horizontalLineToRelative(5.808f)
            curveTo(12.967f, 11.362f, 13f, 10.692f, 13f, 10f)
            reflectiveCurveToRelative(-0.033f, -1.362f, -0.096f, -2f)
            horizontalLineTo(7.096f)
            curveTo(7.033f, 8.638f, 7f, 9.308f, 7f, 10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF62BE55),
                    1f to Color(0xFF1E794A)
                ),
                start = Offset(12.5f, 9f),
                end = Offset(20.018f, 17.7005f)
            )
        ) {
            moveTo(14f, 18.524f)
            curveToRelative(-1.175f, -0.603f, -2.97f, -1.945f, -3f, -4.524f)
            verticalLineToRelative(-2.563f)
            curveToRelative(0f, -0.276f, 0.225f, -0.496f, 0.499f, -0.535f)
            curveToRelative(1.37f, -0.193f, 2.485f, -1.134f, 3.066f, -1.725f)
            curveTo(14.68f, 9.059f, 14.84f, 9f, 15f, 9f)
            curveToRelative(0.16f, 0f, 0.32f, 0.059f, 0.435f, 0.177f)
            curveToRelative(0.58f, 0.591f, 1.696f, 1.532f, 3.066f, 1.725f)
            curveToRelative(0.274f, 0.039f, 0.499f, 0.26f, 0.499f, 0.536f)
            verticalLineTo(14f)
            curveToRelative(-0.03f, 2.579f, -1.825f, 3.921f, -3f, 4.524f)
            curveToRelative(-0.384f, 0.197f, -0.701f, 0.316f, -0.87f, 0.372f)
            curveToRelative(-0.043f, 0.015f, -0.086f, 0.022f, -0.13f, 0.022f)
            curveToRelative(-0.044f, 0f, -0.087f, -0.007f, -0.13f, -0.021f)
            curveToRelative(-0.17f, -0.057f, -0.486f, -0.177f, -0.87f, -0.374f)
            close()
        }
    }.build()
}
