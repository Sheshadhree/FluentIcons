package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ShareAndroid32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ShareAndroid32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(5.26416f, 8.10556f),
                end = Offset(10.7923f, 25.6836f)
            )
        ) {
            moveTo(21.053f, 8.106f)
            lineToRelative(0.894f, 1.788f)
            lineTo(9.737f, 16f)
            lineToRelative(14.21f, 7.106f)
            lineToRelative(-0.894f, 1.788f)
            lineTo(5.264f, 16f)
            lineToRelative(15.789f, -7.894f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(24.5002f, 24.5001f),
                radius = 6.94622f
            )
        ) {
            moveTo(21.053f, 8.106f)
            lineToRelative(0.894f, 1.788f)
            lineTo(9.737f, 16f)
            lineToRelative(14.21f, 7.106f)
            lineToRelative(-0.894f, 1.788f)
            lineTo(5.264f, 16f)
            lineToRelative(15.789f, -7.894f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(7.50024f, 16.0001f),
                radius = 6f
            )
        ) {
            moveTo(21.053f, 8.106f)
            lineToRelative(0.894f, 1.788f)
            lineTo(9.737f, 16f)
            lineToRelative(14.21f, 7.106f)
            lineToRelative(-0.894f, 1.788f)
            lineTo(5.264f, 16f)
            lineToRelative(15.789f, -7.894f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(24.5002f, 7.50009f),
                radius = 6.26498f
            )
        ) {
            moveTo(21.053f, 8.106f)
            lineToRelative(0.894f, 1.788f)
            lineTo(9.737f, 16f)
            lineToRelative(14.21f, 7.106f)
            lineToRelative(-0.894f, 1.788f)
            lineTo(5.264f, 16f)
            lineToRelative(15.789f, -7.894f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.528807f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0078D4)
                ),
                center = Offset(14.5625f, 9.96875f),
                radius = 24.3384f
            )
        ) {
            moveTo(29f, 24.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(20f, 26.985f, 20f, 24.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveTo(12f, 16f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(3f, 18.485f, 3f, 16f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveTo(12f, 13.515f, 12f, 16f)
            close()
            moveToRelative(17f, -8.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(20f, 9.985f, 20f, 7.5f)
            reflectiveCurveTo(22.015f, 3f, 24.5f, 3f)
            reflectiveCurveTo(29f, 5.015f, 29f, 7.5f)
            close()
        }
    }.build()
}
