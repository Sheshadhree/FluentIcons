package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Certificate32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Certificate32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(3f, 7.9375f),
                end = Offset(16.7656f, 27.0067f)
            )
        ) {
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineTo(20f)
            horizontalLineToRelative(0.525f)
            curveToRelative(0.092f, 0.933f, 0.441f, 1.79f, 0.975f, 2.5f)
            verticalLineTo(25f)
            horizontalLineToRelative(23.25f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(7.25f)
            curveTo(30f, 5.455f, 28.545f, 4f, 26.75f, 4f)
            horizontalLineTo(5.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color.White
                ),
                start = Offset(31.2f, 30.7f),
                end = Offset(20.4037f, 1.77095f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(8f, 11f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(14f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(9f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(9f, 6f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-6f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF163697),
                    1f to Color(0xFF29C3FF)
                ),
                center = Offset(7.5f, 21.9999f),
                radius = 11.421f
            )
        ) {
            moveTo(12f, 21.862f)
            curveTo(10.783f, 22.884f, 9.213f, 23.5f, 7.5f, 23.5f)
            reflectiveCurveTo(4.217f, 22.884f, 3f, 21.862f)
            verticalLineTo(29f)
            curveToRelative(0f, 0.785f, 0.862f, 1.264f, 1.528f, 0.849f)
            lineToRelative(2.972f, -1.85f)
            lineToRelative(2.972f, 1.85f)
            curveTo(11.138f, 30.264f, 12f, 29.785f, 12f, 28.999f)
            verticalLineToRelative(-7.137f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.771547f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                center = Offset(-21.7679f, -24.5f),
                radius = 61.3992f
            )
        ) {
            moveTo(13f, 19.5f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            reflectiveCurveTo(2f, 22.538f, 2f, 19.5f)
            reflectiveCurveTo(4.462f, 14f, 7.5f, 14f)
            reflectiveCurveToRelative(5.5f, 2.462f, 5.5f, 5.5f)
            close()
        }
    }.build()
}
