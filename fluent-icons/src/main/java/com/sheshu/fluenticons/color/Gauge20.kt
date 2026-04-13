package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Gauge20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Gauge20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF4F4F4),
                    1f to Color(0xFFCBCBCB)
                ),
                start = Offset(7.71429f, 2f),
                end = Offset(13.8443f, 17.1374f)
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
                    0f to Color(0xFF42B870),
                    0.590278f to Color(0xFFFF921F),
                    1f to Color(0xFFE82C41)
                ),
                center = Offset(3.5f, 14.5f),
                radius = 13.5f
            )
        ) {
            moveTo(10f, 5.25f)
            curveToRelative(-2.623f, 0f, -4.75f, 2.127f, -4.75f, 4.75f)
            curveToRelative(0f, 1.263f, 0.492f, 2.409f, 1.295f, 3.26f)
            curveToRelative(0.285f, 0.301f, 0.271f, 0.776f, -0.03f, 1.06f)
            curveToRelative(-0.301f, 0.285f, -0.776f, 0.271f, -1.06f, -0.03f)
            curveTo(4.399f, 13.17f, 3.75f, 11.66f, 3.75f, 10f)
            curveToRelative(0f, -3.452f, 2.798f, -6.25f, 6.25f, -6.25f)
            curveToRelative(0.8f, 0f, 1.567f, 0.15f, 2.273f, 0.426f)
            curveToRelative(0.386f, 0.151f, 0.576f, 0.586f, 0.426f, 0.972f)
            curveToRelative(-0.151f, 0.386f, -0.586f, 0.576f, -0.972f, 0.426f)
            curveTo(11.193f, 5.364f, 10.611f, 5.25f, 10f, 5.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x0042B870),
                    0.716189f to Color(0xFF42B870)
                ),
                start = Offset(8f, 11.5f),
                end = Offset(5f, 14f)
            )
        ) {
            moveTo(10f, 5.25f)
            curveToRelative(-2.623f, 0f, -4.75f, 2.127f, -4.75f, 4.75f)
            curveToRelative(0f, 1.263f, 0.492f, 2.409f, 1.295f, 3.26f)
            curveToRelative(0.285f, 0.301f, 0.271f, 0.776f, -0.03f, 1.06f)
            curveToRelative(-0.301f, 0.285f, -0.776f, 0.271f, -1.06f, -0.03f)
            curveTo(4.399f, 13.17f, 3.75f, 11.66f, 3.75f, 10f)
            curveToRelative(0f, -3.452f, 2.798f, -6.25f, 6.25f, -6.25f)
            curveToRelative(0.8f, 0f, 1.567f, 0.15f, 2.273f, 0.426f)
            curveToRelative(0.386f, 0.151f, 0.576f, 0.586f, 0.426f, 0.972f)
            curveToRelative(-0.151f, 0.386f, -0.586f, 0.576f, -0.972f, 0.426f)
            curveTo(11.193f, 5.364f, 10.611f, 5.25f, 10f, 5.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00E82C41),
                    0.5625f to Color(0xFFE82C41)
                ),
                start = Offset(13f, 12f),
                end = Offset(15f, 14f)
            )
        ) {
            moveTo(10f, 5.25f)
            curveToRelative(-2.623f, 0f, -4.75f, 2.127f, -4.75f, 4.75f)
            curveToRelative(0f, 1.263f, 0.492f, 2.409f, 1.295f, 3.26f)
            curveToRelative(0.285f, 0.301f, 0.271f, 0.776f, -0.03f, 1.06f)
            curveToRelative(-0.301f, 0.285f, -0.776f, 0.271f, -1.06f, -0.03f)
            curveTo(4.399f, 13.17f, 3.75f, 11.66f, 3.75f, 10f)
            curveToRelative(0f, -3.452f, 2.798f, -6.25f, 6.25f, -6.25f)
            curveToRelative(0.8f, 0f, 1.567f, 0.15f, 2.273f, 0.426f)
            curveToRelative(0.386f, 0.151f, 0.576f, 0.586f, 0.426f, 0.972f)
            curveToRelative(-0.151f, 0.386f, -0.586f, 0.576f, -0.972f, 0.426f)
            curveTo(11.193f, 5.364f, 10.611f, 5.25f, 10f, 5.25f)
            close()
            moveToRelative(4.852f, 2.051f)
            curveToRelative(0.386f, -0.15f, 0.821f, 0.04f, 0.972f, 0.426f)
            curveTo(16.099f, 8.433f, 16.25f, 9.2f, 16.25f, 10f)
            curveToRelative(0f, 1.66f, -0.649f, 3.171f, -1.705f, 4.29f)
            curveToRelative(-0.284f, 0.301f, -0.759f, 0.315f, -1.06f, 0.03f)
            curveToRelative(-0.301f, -0.284f, -0.315f, -0.759f, -0.03f, -1.06f)
            curveToRelative(0.803f, -0.851f, 1.295f, -1.997f, 1.295f, -3.26f)
            curveToRelative(0f, -0.61f, -0.115f, -1.193f, -0.324f, -1.727f)
            curveToRelative(-0.15f, -0.386f, 0.04f, -0.82f, 0.426f, -0.972f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x0042B870),
                    0.716189f to Color(0xFF42B870)
                ),
                start = Offset(8f, 11.5f),
                end = Offset(5f, 14f)
            )
        ) {
            moveTo(14.852f, 7.301f)
            curveToRelative(0.386f, -0.15f, 0.821f, 0.04f, 0.972f, 0.426f)
            curveTo(16.099f, 8.433f, 16.25f, 9.2f, 16.25f, 10f)
            curveToRelative(0f, 1.66f, -0.649f, 3.171f, -1.705f, 4.29f)
            curveToRelative(-0.284f, 0.301f, -0.759f, 0.315f, -1.06f, 0.03f)
            curveToRelative(-0.301f, -0.284f, -0.315f, -0.759f, -0.03f, -1.06f)
            curveToRelative(0.803f, -0.851f, 1.295f, -1.997f, 1.295f, -3.26f)
            curveToRelative(0f, -0.61f, -0.115f, -1.193f, -0.324f, -1.727f)
            curveToRelative(-0.15f, -0.386f, 0.04f, -0.82f, 0.426f, -0.972f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00E82C41),
                    0.5625f to Color(0xFFE82C41)
                ),
                start = Offset(13f, 12f),
                end = Offset(15f, 14f)
            )
        ) {
            moveTo(14.852f, 7.301f)
            curveToRelative(0.386f, -0.15f, 0.821f, 0.04f, 0.972f, 0.426f)
            curveTo(16.099f, 8.433f, 16.25f, 9.2f, 16.25f, 10f)
            curveToRelative(0f, 1.66f, -0.649f, 3.171f, -1.705f, 4.29f)
            curveToRelative(-0.284f, 0.301f, -0.759f, 0.315f, -1.06f, 0.03f)
            curveToRelative(-0.301f, -0.284f, -0.315f, -0.759f, -0.03f, -1.06f)
            curveToRelative(0.803f, -0.851f, 1.295f, -1.997f, 1.295f, -3.26f)
            curveToRelative(0f, -0.61f, -0.115f, -1.193f, -0.324f, -1.727f)
            curveToRelative(-0.15f, -0.386f, 0.04f, -0.82f, 0.426f, -0.972f)
            close()
            moveTo(14.085f, 5.82f)
            curveToRelative(0.182f, 0.155f, 0.228f, 0.417f, 0.111f, 0.625f)
            lineToRelative(-0.11f, 0.196f)
            lineToRelative(-0.296f, 0.52f)
            lineToRelative(-0.39f, 0.686f)
            lineToRelative(-0.23f, 0.402f)
            lineToRelative(-0.298f, 0.518f)
            lineToRelative(-0.422f, 0.727f)
            curveToRelative(-0.2f, 0.345f, -0.395f, 0.675f, -0.567f, 0.963f)
            curveToRelative(-0.146f, 0.243f, -0.278f, 0.459f, -0.385f, 0.628f)
            curveToRelative(-0.036f, 0.057f, -0.072f, 0.113f, -0.107f, 0.165f)
            curveToRelative(-0.025f, 0.038f, -0.05f, 0.075f, -0.074f, 0.108f)
            curveToRelative(-0.032f, 0.046f, -0.063f, 0.086f, -0.09f, 0.117f)
            curveToRelative(-0.537f, 0.63f, -1.484f, 0.705f, -2.114f, 0.167f)
            curveToRelative(-0.63f, -0.538f, -0.705f, -1.485f, -0.167f, -2.115f)
            curveTo(9.018f, 9.443f, 9.15f, 9.323f, 9.29f, 9.2f)
            curveToRelative(0.15f, -0.133f, 0.342f, -0.297f, 0.56f, -0.48f)
            curveToRelative(0.436f, -0.364f, 0.982f, -0.81f, 1.514f, -1.24f)
            curveToRelative(0.533f, -0.432f, 1.055f, -0.85f, 1.443f, -1.16f)
            lineToRelative(0.274f, -0.219f)
            lineToRelative(0.37f, -0.293f)
            curveToRelative(0.187f, -0.149f, 0.453f, -0.144f, 0.635f, 0.011f)
            close()
        }
    }.build()
}
