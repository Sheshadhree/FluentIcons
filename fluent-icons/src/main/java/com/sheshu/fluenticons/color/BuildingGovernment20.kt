package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.BuildingGovernment20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.BuildingGovernment20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color(0xFF70777D))) {
            moveTo(9f, 3f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(2.5f)
            horizontalLineTo(9f)
            verticalLineTo(3f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF83F54))) {
            moveTo(9f, 2.5f)
            curveTo(9f, 2.224f, 9.224f, 2f, 9.5f, 2f)
            horizontalLineToRelative(3f)
            curveTo(12.776f, 2f, 13f, 2.224f, 13f, 2.5f)
            verticalLineToRelative(1f)
            curveTo(13f, 3.776f, 12.776f, 4f, 12.5f, 4f)
            horizontalLineToRelative(-3f)
            curveTo(9.224f, 4f, 9f, 3.776f, 9f, 3.5f)
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
                start = Offset(10f, 5f),
                end = Offset(10f, 11.5f)
            )
        ) {
            moveTo(10f, 5f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(10f)
            verticalLineTo(10f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFD638),
                    1f to Color(0x00FFD638)
                ),
                center = Offset(13.5f, 6f),
                radius = 3.5f
            )
        ) {
            moveTo(10f, 5f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(10f)
            verticalLineTo(10f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFAAB3BD),
                    1f to Color(0xFF889096)
                ),
                start = Offset(8.25f, 11f),
                end = Offset(15.5f, 18.625f)
            )
        ) {
            moveTo(4f, 11f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(14f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFB357),
                    1f to Color(0x00FFB357)
                ),
                center = Offset(17f, 11f),
                radius = 4.03113f
            ),
            fillAlpha = 0.6f
        ) {
            moveTo(4f, 11f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(14f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            close()
        }
        path(fill = SolidColor(Color(0xFF55595E))) {
            moveTo(8f, 15f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(9f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            close()
        }
        path(fill = SolidColor(Color(0xFF63686E))) {
            moveTo(6f, 13.5f)
            curveTo(6f, 13.224f, 5.776f, 13f, 5.5f, 13f)
            reflectiveCurveTo(5f, 13.224f, 5f, 13.5f)
            verticalLineToRelative(2f)
            curveTo(5f, 15.776f, 5.224f, 16f, 5.5f, 16f)
            reflectiveCurveTo(6f, 15.776f, 6f, 15.5f)
            verticalLineToRelative(-2f)
            close()
            moveToRelative(9f, 0f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(14f, 13.224f, 14f, 13.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-2f)
            close()
        }
        path(fill = SolidColor(Color(0xFFCA6407))) {
            moveTo(8.5f, 7.5f)
            curveTo(8.224f, 7.5f, 8f, 7.724f, 8f, 8f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(9f, 9.276f, 9f, 9f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
            moveTo(12f, 8f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(11f, 7.724f, 11f, 8f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(12f, 9.276f, 12f, 9f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}
