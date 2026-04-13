package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.BuildingGovernmentSearch24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.BuildingGovernmentSearch24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF70777D))) {
            moveTo(11f, 4.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(2f)
            horizontalLineTo(11f)
            verticalLineToRelative(-2f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF83F54))) {
            moveTo(11.5f, 2f)
            horizontalLineToRelative(4f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 2.5f)
            verticalLineToRelative(2f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 5f)
            horizontalLineToRelative(-4f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 4.5f)
            verticalLineToRelative(-2f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC205),
                    0.735f to Color(0xFFFFA43D),
                    1f to Color(0xFFE67505)
                ),
                start = Offset(12f, 6f),
                end = Offset(12f, 13.5f)
            )
        ) {
            moveTo(5f, 13f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            verticalLineToRelative(0.5f)
            horizontalLineTo(5f)
            verticalLineTo(13f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFD638),
                    1f to Color(0x00FFD638)
                ),
                center = Offset(16.9f, 7.15385f),
                radius = 4.03846f
            )
        ) {
            moveTo(5f, 13f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            verticalLineToRelative(0.5f)
            horizontalLineTo(5f)
            verticalLineTo(13f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.494756f to Color(0xFFE67505),
                    0.837274f to Color(0x00E67505)
                ),
                center = Offset(5.5f, 17f),
                radius = 8.20061f
            )
        ) {
            moveTo(5f, 13f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            verticalLineToRelative(0.5f)
            horizontalLineTo(5f)
            verticalLineTo(13f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFAAB3BD),
                    1f to Color(0xFF889096)
                ),
                start = Offset(9.8125f, 13f),
                end = Offset(19.1435f, 22.541f)
            )
        ) {
            moveTo(4.5f, 13f)
            curveTo(3.12f, 13f, 2f, 14.12f, 2f, 15.5f)
            verticalLineTo(18f)
            horizontalLineToRelative(0.337f)
            curveToRelative(0.562f, 1.183f, 1.767f, 2f, 3.163f, 2f)
            curveToRelative(0.992f, 0f, 1.888f, -0.413f, 2.525f, -1.077f)
            lineToRelative(3f, 3.077f)
            horizontalLineTo(21.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(15.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-15f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.136092f to Color.Black.copy(alpha = 0.6862745f),
                    0.622433f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(8.875f, 21.3571f),
                end = Offset(14.1593f, 15.6474f)
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(4.5f, 13f)
            curveTo(3.12f, 13f, 2f, 14.12f, 2f, 15.5f)
            verticalLineTo(18f)
            horizontalLineToRelative(0.337f)
            curveToRelative(0.562f, 1.183f, 1.767f, 2f, 3.163f, 2f)
            curveToRelative(0.992f, 0f, 1.888f, -0.413f, 2.525f, -1.077f)
            lineToRelative(3f, 3.077f)
            horizontalLineTo(21.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(15.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-15f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.121875f to Color.Black,
                    0.884375f to Color.Transparent.copy(alpha = 0f)
                ),
                center = Offset(5.5f, 16.5f),
                radius = 7.07107f
            ),
            fillAlpha = 0.6f
        ) {
            moveTo(4.5f, 13f)
            curveTo(3.12f, 13f, 2f, 14.12f, 2f, 15.5f)
            verticalLineTo(18f)
            horizontalLineToRelative(0.337f)
            curveToRelative(0.562f, 1.183f, 1.767f, 2f, 3.163f, 2f)
            curveToRelative(0.992f, 0f, 1.888f, -0.413f, 2.525f, -1.077f)
            lineToRelative(3f, 3.077f)
            horizontalLineTo(21.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(15.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-15f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFB357),
                    1f to Color(0x00FFB357)
                ),
                center = Offset(20.75f, 13f),
                radius = 5.1807f
            ),
            fillAlpha = 0.6f
        ) {
            moveTo(4.5f, 13f)
            curveTo(3.12f, 13f, 2f, 14.12f, 2f, 15.5f)
            verticalLineTo(18f)
            horizontalLineToRelative(0.337f)
            curveToRelative(0.562f, 1.183f, 1.767f, 2f, 3.163f, 2f)
            curveToRelative(0.992f, 0f, 1.888f, -0.413f, 2.525f, -1.077f)
            lineToRelative(3f, 3.077f)
            horizontalLineTo(21.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(15.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-15f)
            close()
        }
        path(fill = SolidColor(Color(0xFF63686E))) {
            moveTo(19f, 16.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(19f, 19.164f, 19f, 18.75f)
            verticalLineToRelative(-2.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFFCA6407))) {
            moveTo(16f, 9.75f)
            curveTo(16f, 9.336f, 15.664f, 9f, 15.25f, 9f)
            reflectiveCurveTo(14.5f, 9.336f, 14.5f, 9.75f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(16f, 11.664f, 16f, 11.25f)
            verticalLineToRelative(-1.5f)
            close()
            moveTo(12f, 9f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-1.5f)
            curveTo(11.25f, 9.336f, 11.586f, 9f, 12f, 9f)
            close()
            moveTo(9.5f, 9.75f)
            curveTo(9.5f, 9.336f, 9.164f, 9f, 8.75f, 9f)
            reflectiveCurveTo(8f, 9.336f, 8f, 9.75f)
            verticalLineToRelative(1.5f)
            curveTo(8f, 11.664f, 8.336f, 12f, 8.75f, 12f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-1.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(7.25f, 14.1667f),
                end = Offset(2f, 20f)
            )
        ) {
            moveTo(9f, 16.5f)
            curveTo(9f, 18.433f, 7.433f, 20f, 5.5f, 20f)
            reflectiveCurveTo(2f, 18.433f, 2f, 16.5f)
            reflectiveCurveTo(3.567f, 13f, 5.5f, 13f)
            reflectiveCurveTo(9f, 14.567f, 9f, 16.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF29C3FF)
                ),
                start = Offset(1.57895f, 21.8421f),
                end = Offset(10.8421f, 14.3158f)
            )
        ) {
            moveTo(5.5f, 21f)
            curveToRelative(0.972f, 0f, 1.872f, -0.308f, 2.607f, -0.832f)
            lineToRelative(2.613f, 2.612f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-2.612f, -2.613f)
            curveTo(9.692f, 18.372f, 10f, 17.472f, 10f, 16.5f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            reflectiveCurveTo(1f, 14.015f, 1f, 16.5f)
            reflectiveCurveTo(3.015f, 21f, 5.5f, 21f)
            close()
            moveToRelative(0f, -1.5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            close()
        }
    }.build()
}
