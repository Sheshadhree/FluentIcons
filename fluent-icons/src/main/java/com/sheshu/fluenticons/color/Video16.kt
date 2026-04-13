package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Video16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Video16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.0810009f to Color(0xFFF08AF4),
                    0.341244f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(10.909f, 3.2f),
                radius = 10.0776f
            )
        ) {
            moveTo(13.144f, 11.789f)
            lineTo(7.34f, 8f)
            lineToRelative(5.804f, -3.789f)
            curveTo(13.942f, 3.691f, 15f, 4.263f, 15f, 5.216f)
            verticalLineToRelative(5.568f)
            curveToRelative(0f, 0.953f, -1.058f, 1.526f, -1.856f, 1.005f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF312A9A),
                    1f to Color(0x00312A9A)
                ),
                start = Offset(8.50006f, 8f),
                end = Offset(14.9905f, 7.75026f)
            ),
            fillAlpha = 0.75f
        ) {
            moveTo(13.144f, 11.789f)
            lineTo(7.34f, 8f)
            lineToRelative(5.804f, -3.789f)
            curveTo(13.942f, 3.691f, 15f, 4.263f, 15f, 5.216f)
            verticalLineToRelative(5.568f)
            curveToRelative(0f, 0.953f, -1.058f, 1.526f, -1.856f, 1.005f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.341244f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(-0.63612f, 3.4166f),
                radius = 14.8065f
            )
        ) {
            moveTo(1f, 5.5f)
            curveTo(1f, 4.12f, 2.099f, 3f, 3.455f, 3f)
            horizontalLineToRelative(4.09f)
            curveTo(8.902f, 3f, 10f, 4.12f, 10f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.099f, 2.5f, -2.455f, 2.5f)
            horizontalLineToRelative(-4.09f)
            curveTo(2.099f, 13f, 1f, 11.88f, 1f, 10.5f)
            verticalLineToRelative(-5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3B148A),
                    1f to Color(0xFF4B20A0)
                ),
                start = Offset(1.84095f, 7.99996f),
                end = Offset(2.82762f, 12.0252f)
            ),
            fillAlpha = 0.5f,
            strokeAlpha = 0.5f
        ) {
            moveTo(2f, 9.5f)
            curveTo(2f, 8.672f, 2.672f, 8f, 3.5f, 8f)
            horizontalLineToRelative(4f)
            curveTo(8.328f, 8f, 9f, 8.672f, 9f, 9.5f)
            reflectiveCurveTo(8.328f, 11f, 7.5f, 11f)
            horizontalLineToRelative(-4f)
            curveTo(2.672f, 11f, 2f, 10.328f, 2f, 9.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFFBABAFF))) {
            moveTo(7.5f, 10.3f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(7.914f, 8.8f, 7.5f, 8.8f)
            reflectiveCurveTo(6.75f, 9.136f, 6.75f, 9.55f)
            reflectiveCurveTo(7.086f, 10.3f, 7.5f, 10.3f)
            close()
            moveTo(3.5f, 9f)
            curveTo(3.224f, 9f, 3f, 9.224f, 3f, 9.5f)
            reflectiveCurveTo(3.224f, 10f, 3.5f, 10f)
            horizontalLineToRelative(2f)
            curveTo(5.776f, 10f, 6f, 9.776f, 6f, 9.5f)
            reflectiveCurveTo(5.776f, 9f, 5.5f, 9f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}
