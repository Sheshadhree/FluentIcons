package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ShareAndroid24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ShareAndroid24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(4.98828f, 5.34882f),
                end = Offset(10.0296f, 18.7588f)
            )
        ) {
            moveTo(16.628f, 5.349f)
            lineToRelative(0.744f, 1.302f)
            lineTo(8.012f, 12f)
            lineToRelative(9.36f, 5.349f)
            lineToRelative(-0.744f, 1.302f)
            lineTo(4.988f, 12f)
            lineToRelative(11.64f, -6.651f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(17f, 18.0002f),
                radius = 4.71699f
            )
        ) {
            moveTo(16.628f, 5.349f)
            lineToRelative(0.744f, 1.302f)
            lineTo(8.012f, 12f)
            lineToRelative(9.36f, 5.349f)
            lineToRelative(-0.744f, 1.302f)
            lineTo(4.988f, 12f)
            lineToRelative(11.64f, -6.651f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(6.5f, 12.0002f),
                radius = 4.5f
            )
        ) {
            moveTo(16.628f, 5.349f)
            lineToRelative(0.744f, 1.302f)
            lineTo(8.012f, 12f)
            lineToRelative(9.36f, 5.349f)
            lineToRelative(-0.744f, 1.302f)
            lineTo(4.988f, 12f)
            lineToRelative(11.64f, -6.651f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(17f, 6.00018f),
                radius = 4.5976f
            )
        ) {
            moveTo(16.628f, 5.349f)
            lineToRelative(0.744f, 1.302f)
            lineTo(8.012f, 12f)
            lineToRelative(9.36f, 5.349f)
            lineToRelative(-0.744f, 1.302f)
            lineTo(4.988f, 12f)
            lineToRelative(11.64f, -6.651f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.528807f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0078D4)
                ),
                center = Offset(9.27083f, 6.69798f),
                radius = 18.9298f
            )
        ) {
            moveTo(20.5f, 18f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            close()
            moveTo(10f, 12f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(3f, 13.933f, 3f, 12f)
            reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveTo(10f, 10.067f, 10f, 12f)
            close()
            moveToRelative(10.5f, -6f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(13.5f, 7.933f, 13.5f, 6f)
            reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            close()
        }
    }.build()
}
