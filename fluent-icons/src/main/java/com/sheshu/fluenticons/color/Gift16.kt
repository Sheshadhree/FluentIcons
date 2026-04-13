package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Gift16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Gift16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFBB45EA),
                    0.347899f to Color(0xFF8B57ED),
                    1f to Color(0xFF5B2AB5)
                ),
                start = Offset(6.92563f, 16.1613f),
                end = Offset(6.92563f, 6.35783f)
            )
        ) {
            moveTo(12f, 8.5f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.105f, -0.896f, 2f, -2f, 2f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(9f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.196406f to Color(0xFF5B2AB5),
                    0.762565f to Color(0xFF8B57ED),
                    1f to Color(0xFFBB45EA)
                ),
                center = Offset(7.5f, 3.5f),
                radius = 14.1674f
            )
        ) {
            moveTo(12f, 5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(3f)
            curveTo(2.448f, 9f, 2f, 8.552f, 2f, 8f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB5937),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(7f, 5.40625f),
                end = Offset(7f, 13.0435f)
            )
        ) {
            moveTo(8f, 8.5f)
            verticalLineTo(14f)
            horizontalLineTo(7f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB5937),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(7f, -12.1429f),
                end = Offset(7f, 15.8571f)
            )
        ) {
            moveTo(8f, 5f)
            verticalLineToRelative(4f)
            horizontalLineTo(7f)
            verticalLineTo(5f)
            horizontalLineToRelative(1f)
            close()
        }
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6f, 6f)
            curveTo(4.895f, 6f, 4f, 5.105f, 4f, 4f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            curveToRelative(0.597f, 0f, 1.133f, 0.262f, 1.5f, 0.677f)
            curveTo(7.867f, 2.262f, 8.403f, 2f, 9f, 2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            horizontalLineTo(6f)
            close()
            moveTo(5f, 4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(1f)
            horizontalLineTo(6f)
            curveTo(5.448f, 5f, 5f, 4.552f, 5f, 4f)
            close()
            moveToRelative(3f, 1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveTo(9.552f, 3f, 9f, 3f)
            reflectiveCurveTo(8f, 3.448f, 8f, 4f)
            verticalLineToRelative(1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(9.44444f, 5.999f),
                end = Offset(7.40072f, -2.23618f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6f, 6f)
            curveTo(4.895f, 6f, 4f, 5.105f, 4f, 4f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            curveToRelative(0.597f, 0f, 1.133f, 0.262f, 1.5f, 0.677f)
            curveTo(7.867f, 2.262f, 8.403f, 2f, 9f, 2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            horizontalLineTo(6f)
            close()
            moveTo(5f, 4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(1f)
            horizontalLineTo(6f)
            curveTo(5.448f, 5f, 5f, 4.552f, 5f, 4f)
            close()
            moveToRelative(3f, 1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveTo(9.552f, 3f, 9f, 3f)
            reflectiveCurveTo(8f, 3.448f, 8f, 4f)
            verticalLineToRelative(1f)
            close()
        }
    }.build()
}
