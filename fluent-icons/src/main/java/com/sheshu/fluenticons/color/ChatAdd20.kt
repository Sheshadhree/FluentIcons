package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ChatAdd20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ChatAdd20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(2.57143f, 5.00009f),
                end = Offset(16.5399f, 28.815f)
            )
        ) {
            moveTo(10f, 2f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            curveToRelative(-1.273f, 0f, -2.504f, -0.298f, -3.613f, -0.86f)
            lineToRelative(-0.121f, -0.065f)
            lineToRelative(-3.645f, 0.91f)
            curveToRelative(-0.31f, 0.078f, -0.595f, -0.148f, -0.62f, -0.441f)
            verticalLineToRelative(-0.082f)
            lineToRelative(0.014f, -0.083f)
            lineToRelative(0.91f, -3.644f)
            lineToRelative(-0.063f, -0.12f)
            curveToRelative(-0.455f, -0.896f, -0.738f, -1.873f, -0.83f, -2.887f)
            lineToRelative(-0.025f, -0.382f)
            lineTo(2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            close()
            moveTo(6.5f, 9.5f)
            curveTo(6.224f, 9.5f, 6f, 9.724f, 6f, 10f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-3f)
            curveTo(10.5f, 6.224f, 10.276f, 6f, 10f, 6f)
            reflectiveCurveTo(9.5f, 6.224f, 9.5f, 6.5f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF)
                ),
                start = Offset(6.69977f, 6.14047f),
                end = Offset(8.02988f, 14.7147f)
            )
        ) {
            moveTo(6.5f, 9.5f)
            curveTo(6.224f, 9.5f, 6f, 9.724f, 6f, 10f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-3f)
            curveTo(10.5f, 6.224f, 10.276f, 6f, 10f, 6f)
            reflectiveCurveTo(9.5f, 6.224f, 9.5f, 6.5f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
