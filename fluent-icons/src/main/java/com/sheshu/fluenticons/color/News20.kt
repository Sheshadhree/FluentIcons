package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.News20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.News20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF068BEB),
                    0.616664f to Color(0xFF0056CF),
                    0.974342f to Color(0xFF0027A7)
                ),
                center = Offset(19.5f, 7.5f),
                radius = 6.80074f
            )
        ) {
            moveTo(16f, 6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.21f, -0.859f, 2.218f, -2f, 2.45f)
            lineTo(15.5f, 16f)
            verticalLineTo(6f)
            horizontalLineTo(16f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3BD5FF),
                    1f to Color(0xFF367AF2)
                ),
                start = Offset(6f, 1f),
                end = Offset(16.5777f, 15.0548f)
            )
        ) {
            moveTo(2f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(10.95f)
            curveTo(15.838f, 15.983f, 15.671f, 16f, 15.5f, 16f)
            horizontalLineToRelative(-11f)
            curveTo(3.12f, 16f, 2f, 14.88f, 2f, 13.5f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.18125f to Color(0x002764E7),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(10f, 13.5f),
                end = Offset(10f, 16f)
            )
        ) {
            moveTo(2f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(10.95f)
            curveTo(15.838f, 15.983f, 15.671f, 16f, 15.5f, 16f)
            horizontalLineToRelative(-11f)
            curveTo(3.12f, 16f, 2f, 14.88f, 2f, 13.5f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00DCF8FF),
                    1f to Color(0xB2FF6CE8)
                ),
                start = Offset(9.5f, 7f),
                end = Offset(14.3993f, 19.6517f)
            )
        ) {
            moveTo(2f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(10.95f)
            curveTo(15.838f, 15.983f, 15.671f, 16f, 15.5f, 16f)
            horizontalLineToRelative(-11f)
            curveTo(3.12f, 16f, 2f, 14.88f, 2f, 13.5f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFDEFCFF),
                    1f to Color(0xFF9FF0F9)
                ),
                start = Offset(5.38177f, 8.80439f),
                end = Offset(7.38216f, 12.8091f)
            )
        ) {
            moveTo(5.5f, 9f)
            curveTo(5.224f, 9f, 5f, 9.224f, 5f, 9.5f)
            verticalLineToRelative(3f)
            curveTo(5f, 12.776f, 5.224f, 13f, 5.5f, 13f)
            horizontalLineToRelative(3f)
            curveTo(8.776f, 13f, 9f, 12.776f, 9f, 12.5f)
            verticalLineToRelative(-3f)
            curveTo(9f, 9.224f, 8.776f, 9f, 8.5f, 9f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(5f, 0f)
            curveTo(10.224f, 9f, 10f, 9.224f, 10f, 9.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 9f, 12.5f, 9f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(10f, 12.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.776f, 13f, 12.5f, 13f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            close()
            moveToRelative(-5f, -6f)
            curveTo(5f, 6.224f, 5.224f, 6f, 5.5f, 6f)
            horizontalLineToRelative(7f)
            curveTo(12.776f, 6f, 13f, 6.224f, 13f, 6.5f)
            reflectiveCurveTo(12.776f, 7f, 12.5f, 7f)
            horizontalLineToRelative(-7f)
            curveTo(5.224f, 7f, 5f, 6.776f, 5f, 6.5f)
            close()
        }
    }.build()
}
