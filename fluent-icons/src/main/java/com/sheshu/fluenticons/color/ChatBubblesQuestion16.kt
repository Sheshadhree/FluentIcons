package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ChatBubblesQuestion16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ChatBubblesQuestion16",
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
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF)
                ),
                start = Offset(5.47415f, 4.10756f),
                end = Offset(7.09154f, 10.4166f)
            )
        ) {
            moveTo(6.379f, 9.501f)
            curveToRelative(0f, -0.345f, 0.28f, -0.624f, 0.624f, -0.624f)
            curveToRelative(0.345f, 0f, 0.625f, 0.28f, 0.625f, 0.624f)
            curveToRelative(0f, 0.345f, -0.28f, 0.625f, -0.625f, 0.625f)
            reflectiveCurveTo(6.38f, 9.846f, 6.38f, 9.5f)
            close()
            moveTo(5.15f, 5.954f)
            curveTo(5.14f, 4.817f, 5.955f, 4f, 7.003f, 4f)
            curveToRelative(1.031f, 0f, 1.854f, 0.846f, 1.854f, 1.95f)
            curveToRelative(0f, 0.585f, -0.214f, 0.907f, -0.728f, 1.318f)
            lineTo(7.852f, 7.482f)
            curveToRelative(-0.246f, 0.195f, -0.328f, 0.3f, -0.345f, 0.449f)
            lineTo(7.495f, 8.087f)
            curveTo(7.453f, 8.32f, 7.25f, 8.497f, 7.003f, 8.497f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            curveToRelative(0f, -0.571f, 0.21f, -0.884f, 0.716f, -1.289f)
            lineToRelative(0.278f, -0.215f)
            curveToRelative(0.289f, -0.229f, 0.36f, -0.342f, 0.36f, -0.544f)
            curveTo(7.857f, 5.392f, 7.476f, 5f, 7.003f, 5f)
            curveTo(6.51f, 5f, 6.144f, 5.366f, 6.15f, 5.945f)
            curveTo(6.153f, 6.22f, 5.93f, 6.447f, 5.655f, 6.449f)
            curveTo(5.379f, 6.452f, 5.153f, 6.23f, 5.15f, 5.954f)
            close()
        }
    }.build()
}
