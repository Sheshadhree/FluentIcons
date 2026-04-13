package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.BuildingGovernment16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.BuildingGovernment16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color(0xFF70777D))) {
            moveTo(7f, 2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(2.5f)
            horizontalLineTo(7f)
            verticalLineTo(2f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF83F54))) {
            moveTo(7f, 1.5f)
            curveTo(7f, 1.224f, 7.224f, 1f, 7.5f, 1f)
            horizontalLineToRelative(2f)
            curveTo(9.776f, 1f, 10f, 1.224f, 10f, 1.5f)
            verticalLineToRelative(1f)
            curveTo(10f, 2.776f, 9.776f, 3f, 9.5f, 3f)
            horizontalLineToRelative(-2f)
            curveTo(7.224f, 3f, 7f, 2.776f, 7f, 2.5f)
            verticalLineToRelative(-1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC205),
                    0.735f to Color(0xFFFFA43D),
                    1f to Color(0xFFE67505)
                ),
                start = Offset(8f, 4f),
                end = Offset(8f, 9.5f)
            )
        ) {
            moveTo(4f, 8f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            verticalLineToRelative(1.5f)
            horizontalLineTo(4f)
            verticalLineTo(8f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFD638),
                    1f to Color(0x00FFD638)
                ),
                center = Offset(10.8f, 4.84615f),
                radius = 2.96154f
            )
        ) {
            moveTo(4f, 8f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            verticalLineToRelative(1.5f)
            horizontalLineTo(4f)
            verticalLineTo(8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFAAB3BD),
                    1f to Color(0xFF889096)
                ),
                start = Offset(6.46875f, 9f),
                end = Offset(12.6753f, 15.6635f)
            )
        ) {
            moveTo(1f, 10.5f)
            curveTo(1f, 9.672f, 1.672f, 9f, 2.5f, 9f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-13f)
            curveTo(1.224f, 15f, 1f, 14.776f, 1f, 14.5f)
            verticalLineToRelative(-4f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFB357),
                    1f to Color(0x00FFB357)
                ),
                center = Offset(14.125f, 9f),
                radius = 3.45637f
            ),
            fillAlpha = 0.6f
        ) {
            moveTo(1f, 10.5f)
            curveTo(1f, 9.672f, 1.672f, 9f, 2.5f, 9f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-13f)
            curveTo(1.224f, 15f, 1f, 14.776f, 1f, 14.5f)
            verticalLineToRelative(-4f)
            close()
        }
        path(fill = SolidColor(Color(0xFF55595E))) {
            moveTo(6.5f, 12f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-3f)
            close()
        }
        path(fill = SolidColor(Color(0xFF63686E))) {
            moveTo(4.5f, 11f)
            curveTo(4.776f, 11f, 5f, 11.224f, 5f, 11.5f)
            verticalLineToRelative(1f)
            curveTo(5f, 12.776f, 4.776f, 13f, 4.5f, 13f)
            reflectiveCurveTo(4f, 12.776f, 4f, 12.5f)
            verticalLineToRelative(-1f)
            curveTo(4f, 11.224f, 4.224f, 11f, 4.5f, 11f)
            close()
            moveToRelative(7.5f, 0.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(11f, 11.224f, 11f, 11.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-1f)
            close()
        }
        path(fill = SolidColor(Color(0xFFCA6407))) {
            moveTo(9.5f, 6f)
            curveTo(9.776f, 6f, 10f, 6.224f, 10f, 6.5f)
            verticalLineToRelative(1f)
            curveTo(10f, 7.776f, 9.776f, 8f, 9.5f, 8f)
            reflectiveCurveTo(9f, 7.776f, 9f, 7.5f)
            verticalLineToRelative(-1f)
            curveTo(9f, 6.224f, 9.224f, 6f, 9.5f, 6f)
            close()
            moveToRelative(-3f, 0f)
            curveTo(6.776f, 6f, 7f, 6.224f, 7f, 6.5f)
            verticalLineToRelative(1f)
            curveTo(7f, 7.776f, 6.776f, 8f, 6.5f, 8f)
            reflectiveCurveTo(6f, 7.776f, 6f, 7.5f)
            verticalLineToRelative(-1f)
            curveTo(6f, 6.224f, 6.224f, 6f, 6.5f, 6f)
            close()
        }
    }.build()
}
