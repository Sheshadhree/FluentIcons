package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Vault20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Vault20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.005f to Color(0xFF88E06C),
                    1f to Color(0xFF0078D4)
                ),
                start = Offset(1.5f, 3f),
                end = Offset(8.48463f, 20.5815f)
            )
        ) {
            moveTo(2f, 7f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(10f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(7f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(12.8571f, 10.6f),
                radius = 3.73139f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(2f, 7f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(10f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(7f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.024416f to Color(0xB24A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(6.57143f, 10.6f),
                radius = 3.6f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(2f, 7f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(10f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF)
                ),
                start = Offset(9.93736f, 7.58779f),
                end = Offset(10.7687f, 12.9467f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.354f, 7.646f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-0.63f, 0.63f)
            curveTo(12.718f, 8.102f, 12.371f, 8f, 12f, 8f)
            curveToRelative(-0.37f, 0f, -0.718f, 0.101f, -1.016f, 0.277f)
            lineToRelative(-0.63f, -0.63f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.195f, -0.196f, 0.511f, 0f, 0.707f)
            lineToRelative(0.63f, 0.63f)
            curveTo(10.1f, 9.282f, 10f, 9.629f, 10f, 10f)
            curveToRelative(0f, 0.37f, 0.101f, 0.718f, 0.277f, 1.016f)
            lineToRelative(-0.63f, 0.63f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(0.63f, -0.63f)
            curveTo(11.282f, 11.898f, 11.629f, 12f, 12f, 12f)
            curveToRelative(0.37f, 0f, 0.718f, -0.101f, 1.016f, -0.277f)
            lineToRelative(0.63f, 0.63f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.708f, 0f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(-0.63f, -0.63f)
            curveTo(13.898f, 10.718f, 14f, 10.371f, 14f, 10f)
            curveToRelative(0f, -0.37f, -0.101f, -0.718f, -0.277f, -1.016f)
            lineToRelative(0.63f, -0.63f)
            curveToRelative(0.196f, -0.196f, 0.196f, -0.512f, 0f, -0.707f)
            close()
            moveTo(12f, 11f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveTo(5.5f, 7f)
            curveTo(5.776f, 7f, 6f, 7.224f, 6f, 7.5f)
            verticalLineToRelative(5f)
            curveTo(6f, 12.776f, 5.776f, 13f, 5.5f, 13f)
            reflectiveCurveTo(5f, 12.776f, 5f, 12.5f)
            verticalLineToRelative(-5f)
            curveTo(5f, 7.224f, 5.224f, 7f, 5.5f, 7f)
            close()
        }
    }.build()
}
