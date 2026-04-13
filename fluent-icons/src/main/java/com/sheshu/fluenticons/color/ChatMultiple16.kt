package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ChatMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ChatMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.63f to Color(0xFF3D35B1),
                    0.85f to Color(0xFF6553C9),
                    1f to Color(0xFF7660D3)
                ),
                center = Offset(6.6844f, 6.6692f),
                radius = 7.04808f
            )
        ) {
            moveTo(9f, 4f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            curveToRelative(0f, 0.754f, -0.167f, 1.47f, -0.467f, 2.113f)
            lineToRelative(0.457f, 2.289f)
            curveToRelative(0.033f, 0.164f, -0.018f, 0.333f, -0.136f, 0.452f)
            curveToRelative(-0.119f, 0.118f, -0.288f, 0.17f, -0.452f, 0.136f)
            lineToRelative(-2.288f, -0.457f)
            curveTo(10.47f, 13.833f, 9.754f, 14f, 9f, 14f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(2f, 2f),
                end = Offset(12f, 12f)
            )
        ) {
            moveTo(7f, 2f)
            curveTo(4.239f, 2f, 2f, 4.239f, 2f, 7f)
            curveToRelative(0f, 0.754f, 0.167f, 1.47f, 0.467f, 2.113f)
            lineTo(2.01f, 11.402f)
            curveToRelative(-0.033f, 0.164f, 0.018f, 0.333f, 0.137f, 0.452f)
            curveToRelative(0.118f, 0.118f, 0.287f, 0.17f, 0.451f, 0.136f)
            lineToRelative(2.288f, -0.457f)
            curveTo(5.53f, 11.833f, 6.247f, 12f, 7f, 12f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            reflectiveCurveTo(9.761f, 2f, 7f, 2f)
            close()
        }
    }.build()
}
