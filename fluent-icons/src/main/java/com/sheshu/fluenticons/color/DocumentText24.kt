package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DocumentText24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DocumentText24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF4894FE)
                ),
                start = Offset(15.2f, 2f),
                end = Offset(16.8215f, 18.8699f)
            )
        ) {
            moveTo(6f, 22f)
            horizontalLineToRelative(12f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(9f)
            lineToRelative(-5f, -2f)
            lineToRelative(-2f, -5f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.362364f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(20.6667f, 2.625f),
                radius = 12.562f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(6f, 22f)
            horizontalLineToRelative(12f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(9f)
            lineToRelative(-5f, -2f)
            lineToRelative(-2f, -5f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(16.4883f, 4.91667f),
                end = Offset(14.7383f, 7.83333f)
            )
        ) {
            moveTo(13f, 7.5f)
            verticalLineTo(2f)
            lineToRelative(7f, 7f)
            horizontalLineToRelative(-5.5f)
            curveTo(13.672f, 9f, 13f, 8.328f, 13f, 7.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color.White
                ),
                start = Offset(16f, 21.3f),
                end = Offset(8.19591f, 8.57981f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(8.75f, 11.5f)
            curveTo(8.336f, 11.5f, 8f, 11.836f, 8f, 12.25f)
            reflectiveCurveTo(8.336f, 13f, 8.75f, 13f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(0f, 2.75f)
            curveTo(8.336f, 14.25f, 8f, 14.586f, 8f, 15f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(0f, 2.75f)
            curveTo(8.336f, 17f, 8f, 17.336f, 8f, 17.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(15.664f, 17f, 15.25f, 17f)
            horizontalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
