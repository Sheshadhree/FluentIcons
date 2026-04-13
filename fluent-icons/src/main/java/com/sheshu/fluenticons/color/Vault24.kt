package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Vault24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Vault24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.005f to Color(0xFF88E06C),
                    1f to Color(0xFF0078D4)
                ),
                start = Offset(1.375f, 2.66667f),
                end = Offset(11.1256f, 25.6766f)
            )
        ) {
            moveTo(2f, 7.75f)
            curveTo(2f, 5.679f, 3.679f, 4f, 5.75f, 4f)
            horizontalLineToRelative(12.5f)
            curveTo(20.321f, 4f, 22f, 5.679f, 22f, 7.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(5.75f)
            curveTo(3.679f, 20f, 2f, 18.321f, 2f, 16.25f)
            verticalLineToRelative(-8.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(15.5714f, 12.8f),
                radius = 6.10346f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(2f, 7.75f)
            curveTo(2f, 5.679f, 3.679f, 4f, 5.75f, 4f)
            horizontalLineToRelative(12.5f)
            curveTo(20.321f, 4f, 22f, 5.679f, 22f, 7.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(5.75f)
            curveTo(3.679f, 20f, 2f, 18.321f, 2f, 16.25f)
            verticalLineToRelative(-8.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xB24A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(7f, 11.5f),
                radius = 6f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(2f, 7.75f)
            curveTo(2f, 5.679f, 3.679f, 4f, 5.75f, 4f)
            horizontalLineToRelative(12.5f)
            curveTo(20.321f, 4f, 22f, 5.679f, 22f, 7.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(5.75f)
            curveTo(3.679f, 20f, 2f, 18.321f, 2f, 16.25f)
            verticalLineToRelative(-8.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF)
                ),
                start = Offset(10.6998f, 8.14047f),
                end = Offset(12.0299f, 16.7147f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.28f, 8.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(1.195f, 1.196f)
            curveTo(11.151f, 10.923f, 11f, 11.444f, 11f, 12f)
            reflectiveCurveToRelative(0.151f, 1.077f, 0.415f, 1.524f)
            lineTo(10.22f, 14.72f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(1.196f, -1.195f)
            curveTo(12.923f, 14.849f, 13.444f, 15f, 14f, 15f)
            reflectiveCurveToRelative(1.077f, -0.151f, 1.524f, -0.415f)
            lineToRelative(1.196f, 1.195f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-1.195f, -1.196f)
            curveTo(16.849f, 13.077f, 17f, 12.556f, 17f, 12f)
            reflectiveCurveToRelative(-0.151f, -1.077f, -0.415f, -1.524f)
            lineTo(17.78f, 9.28f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-1.196f, 1.195f)
            curveTo(15.077f, 9.152f, 14.556f, 9f, 14f, 9f)
            reflectiveCurveToRelative(-1.077f, 0.152f, -1.524f, 0.415f)
            lineTo(11.28f, 8.22f)
            close()
            moveTo(14f, 13.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(5.75f, 7f)
            curveTo(6.164f, 7f, 6.5f, 7.336f, 6.5f, 7.75f)
            verticalLineToRelative(8.5f)
            curveTo(6.5f, 16.664f, 6.164f, 17f, 5.75f, 17f)
            reflectiveCurveTo(5f, 16.664f, 5f, 16.25f)
            verticalLineToRelative(-8.5f)
            curveTo(5f, 7.336f, 5.336f, 7f, 5.75f, 7f)
            close()
        }
    }.build()
}
