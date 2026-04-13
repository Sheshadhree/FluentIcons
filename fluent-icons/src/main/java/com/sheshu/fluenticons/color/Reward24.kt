package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Reward24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Reward24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF1A7F7C)
                ),
                start = Offset(22f, 2.85805f),
                end = Offset(14.9662f, 10.3091f)
            )
        ) {
            moveTo(16f, 11.65f)
            lineToRelative(4.662f, -2.448f)
            curveTo(21.485f, 8.771f, 22f, 7.918f, 22f, 6.99f)
            verticalLineTo(3.75f)
            curveTo(22f, 2.784f, 21.216f, 2f, 20.25f, 2f)
            horizontalLineTo(16f)
            lineToRelative(-1f, 5f)
            lineToRelative(1f, 4.65f)
            close()
            moveTo(8f, 2f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 2f, 2f, 2.784f, 2f, 3.75f)
            verticalLineToRelative(3.239f)
            curveTo(2f, 7.918f, 2.515f, 8.77f, 3.338f, 9.202f)
            lineTo(8f, 11.65f)
            lineToRelative(1f, -4.661f)
            lineTo(8f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF76EB95),
                    1f to Color(0xFF1EC8B0)
                ),
                start = Offset(12f, 0.558773f),
                end = Offset(15.6396f, 12.4053f)
            )
        ) {
            moveTo(8f, 11.65f)
            verticalLineTo(2f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(9.65f)
            lineToRelative(-3.187f, 1.673f)
            curveToRelative(-0.509f, 0.267f, -1.117f, 0.267f, -1.627f, 0f)
            lineTo(8f, 11.65f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.771547f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                center = Offset(-14.6071f, -23f),
                radius = 55.8175f
            )
        ) {
            moveTo(17f, 17f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            close()
        }
    }.build()
}
