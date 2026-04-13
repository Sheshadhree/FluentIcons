package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.BuildingStore24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.BuildingStore24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.312325f to Color(0xFF29C3FF),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(7.5f, 10.1818f),
                end = Offset(9.6845f, 22.6587f)
            )
        ) {
            moveTo(3f, 9.75f)
            curveTo(3f, 9.336f, 3.336f, 9f, 3.75f, 9f)
            horizontalLineToRelative(16.5f)
            curveTo(20.664f, 9f, 21f, 9.336f, 21f, 9.75f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 22f, 3f, 21.664f, 3f, 21.25f)
            verticalLineTo(9.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0067BF),
                    1f to Color(0xFF003580)
                ),
                start = Offset(6.21429f, 14.6875f),
                end = Offset(12.0331f, 18.7178f)
            ),
            fillAlpha = 0.8f
        ) {
            moveTo(6f, 13.75f)
            curveTo(6f, 13.336f, 6.336f, 13f, 6.75f, 13f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineTo(22f)
            horizontalLineTo(6f)
            verticalLineToRelative(-8.25f)
            close()
            moveToRelative(7f, 0f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-3.5f)
            curveTo(13.336f, 18f, 13f, 17.664f, 13f, 17.25f)
            verticalLineToRelative(-3.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB6F7B),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(17.1538f, 2f),
                end = Offset(17.1538f, 6.375f)
            )
        ) {
            moveTo(14f, 6f)
            lineToRelative(-1f, -4f)
            horizontalLineToRelative(4.909f)
            curveToRelative(0.28f, 0f, 0.549f, 0.118f, 0.738f, 0.326f)
            lineToRelative(3.092f, 3.388f)
            curveTo(21.907f, 5.898f, 22f, 6.138f, 22f, 6.388f)
            verticalLineTo(8f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            verticalLineTo(6f)
            close()
            moveTo(2f, 6.388f)
            curveToRelative(0f, -0.25f, 0.093f, -0.49f, 0.261f, -0.674f)
            lineToRelative(3.092f, -3.388f)
            curveTo(5.542f, 2.118f, 5.81f, 2f, 6.09f, 2f)
            horizontalLineTo(11f)
            lineToRelative(-1f, 4f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            verticalLineTo(6.388f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.303571f to Color(0xFFFF9FB2),
                    1f to Color(0xFFF97DBD)
                ),
                start = Offset(12f, 2f),
                end = Offset(12f, 6.375f)
            )
        ) {
            moveTo(8f, 6.176f)
            curveToRelative(0f, -0.116f, 0.02f, -0.232f, 0.062f, -0.34f)
            lineTo(9.5f, 2f)
            horizontalLineToRelative(5f)
            lineToRelative(1.438f, 3.835f)
            curveTo(15.98f, 5.945f, 16f, 6.06f, 16f, 6.176f)
            verticalLineTo(8f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            verticalLineTo(6.176f)
            close()
        }
    }.build()
}
