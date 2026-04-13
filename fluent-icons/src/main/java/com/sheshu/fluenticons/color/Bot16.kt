package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Bot16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Bot16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.535356f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(0.692307f, 7.80769f),
                radius = 14.2768f
            )
        ) {
            moveTo(4.5f, 9.5f)
            curveTo(3.672f, 9.5f, 3f, 10.172f, 3f, 11f)
            verticalLineToRelative(0.35f)
            curveToRelative(0f, 1.305f, 0.6f, 2.25f, 1.554f, 2.843f)
            curveTo(5.479f, 14.768f, 6.71f, 15f, 8f, 15f)
            curveToRelative(1.297f, 0f, 2.528f, -0.231f, 3.452f, -0.807f)
            curveTo(12.406f, 13.6f, 13f, 12.653f, 13f, 11.35f)
            verticalLineTo(11f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(8f, 8.84524f),
                end = Offset(10.699f, 18.0142f)
            )
        ) {
            moveTo(4.5f, 9.5f)
            curveTo(3.672f, 9.5f, 3f, 10.172f, 3f, 11f)
            verticalLineToRelative(0.35f)
            curveToRelative(0f, 1.305f, 0.6f, 2.25f, 1.554f, 2.843f)
            curveTo(5.479f, 14.768f, 6.71f, 15f, 8f, 15f)
            curveToRelative(1.297f, 0f, 2.528f, -0.231f, 3.452f, -0.807f)
            curveTo(12.406f, 13.6f, 13f, 12.653f, 13f, 11.35f)
            verticalLineTo(11f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(4f, -8f)
            curveTo(8.5f, 1.224f, 8.276f, 1f, 8f, 1f)
            reflectiveCurveTo(7.5f, 1.224f, 7.5f, 1.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-1f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.535356f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(2.2202f, -0.829803f),
                radius = 13.4772f
            )
        ) {
            moveTo(10.5f, 2f)
            curveTo(11.328f, 2f, 12f, 2.672f, 12f, 3.5f)
            verticalLineToRelative(3f)
            curveTo(12f, 7.328f, 11.328f, 8f, 10.5f, 8f)
            horizontalLineToRelative(-5f)
            curveTo(4.672f, 8f, 4f, 7.328f, 4f, 6.5f)
            verticalLineToRelative(-3f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineToRelative(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFF9DCFA)
                ),
                start = Offset(9.10565f, 4.3077f),
                end = Offset(10.2427f, 6.26992f)
            )
        ) {
            moveTo(9.5f, 4.25f)
            curveTo(9.086f, 4.25f, 8.75f, 4.586f, 8.75f, 5f)
            reflectiveCurveTo(9.086f, 5.75f, 9.5f, 5.75f)
            reflectiveCurveTo(10.25f, 5.414f, 10.25f, 5f)
            reflectiveCurveTo(9.914f, 4.25f, 9.5f, 4.25f)
            close()
            moveTo(5.75f, 5f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(7.25f, 4.586f, 7.25f, 5f)
            reflectiveCurveTo(6.914f, 5.75f, 6.5f, 5.75f)
            reflectiveCurveTo(5.75f, 5.414f, 5.75f, 5f)
            close()
        }
    }.build()
}
