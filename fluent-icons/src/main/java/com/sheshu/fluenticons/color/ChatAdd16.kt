package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ChatAdd16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ChatAdd16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(2.42857f, 4.25f),
                end = Offset(12.9045f, 22.111f)
            )
        ) {
            moveTo(8f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            curveToRelative(-1.094f, 0f, -2.12f, -0.293f, -3.004f, -0.805f)
            lineToRelative(-2.338f, 0.78f)
            curveToRelative(-0.176f, 0.058f, -0.37f, 0.014f, -0.504f, -0.114f)
            reflectiveCurveToRelative(-0.186f, -0.32f, -0.135f, -0.498f)
            lineToRelative(0.712f, -2.491f)
            curveTo(2.265f, 10.019f, 2f, 9.04f, 2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            close()
            moveToRelative(0.5f, 3.5f)
            curveTo(8.5f, 5.224f, 8.276f, 5f, 8f, 5f)
            reflectiveCurveTo(7.5f, 5.224f, 7.5f, 5.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2f)
            curveTo(5.224f, 7.5f, 5f, 7.724f, 5f, 8f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            curveTo(7.5f, 10.776f, 7.724f, 11f, 8f, 11f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            curveTo(10.776f, 8.5f, 11f, 8.276f, 11f, 8f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF)
                ),
                start = Offset(5.52483f, 5.10535f),
                end = Offset(6.52241f, 11.536f)
            )
        ) {
            moveTo(8.5f, 5.5f)
            curveTo(8.5f, 5.224f, 8.276f, 5f, 8f, 5f)
            reflectiveCurveTo(7.5f, 5.224f, 7.5f, 5.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2f)
            curveTo(5.224f, 7.5f, 5f, 7.724f, 5f, 8f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            curveTo(7.5f, 10.776f, 7.724f, 11f, 8f, 11f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            curveTo(10.776f, 8.5f, 11f, 8.276f, 11f, 8f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}
