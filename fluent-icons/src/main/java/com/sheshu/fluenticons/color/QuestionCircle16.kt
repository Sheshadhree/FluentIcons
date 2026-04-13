package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.QuestionCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.QuestionCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(2f, 2f),
                end = Offset(14f, 14f)
            )
        ) {
            moveTo(2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF)
                ),
                start = Offset(6.34989f, 4.63169f),
                end = Offset(8.55747f, 12.2214f)
            )
        ) {
            moveTo(8f, 10.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(7.586f, 12f, 8f, 12f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(8.414f, 10.5f, 8f, 10.5f)
            close()
            moveToRelative(0f, -6f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            curveTo(6f, 6.776f, 6.224f, 7f, 6.5f, 7f)
            reflectiveCurveTo(7f, 6.776f, 7f, 6.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.37f, -0.083f, 0.58f, -0.366f, 0.898f)
            lineTo(8.518f, 7.523f)
            lineToRelative(-0.264f, 0.27f)
            curveTo(7.712f, 8.36f, 7.5f, 8.77f, 7.5f, 9.5f)
            curveTo(7.5f, 9.776f, 7.724f, 10f, 8f, 10f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            curveToRelative(0f, -0.37f, 0.083f, -0.58f, 0.366f, -0.898f)
            lineToRelative(0.116f, -0.125f)
            lineToRelative(0.264f, -0.27f)
            curveTo(9.788f, 7.64f, 10f, 7.23f, 10f, 6.5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
        }
    }.build()
}
