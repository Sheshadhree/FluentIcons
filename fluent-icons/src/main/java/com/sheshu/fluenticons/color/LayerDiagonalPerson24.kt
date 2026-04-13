package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LayerDiagonalPerson24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LayerDiagonalPerson24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF1B44B1)
                ),
                start = Offset(2.42857f, 4.61652f),
                end = Offset(12.0495f, 13.1674f)
            )
        ) {
            moveTo(14f, 4.238f)
            curveToRelative(0f, -1.56f, -1.549f, -2.646f, -3.016f, -2.115f)
            lineToRelative(-6.84f, 2.475f)
            curveTo(2.857f, 5.064f, 2f, 6.286f, 2f, 7.654f)
            verticalLineToRelative(6.108f)
            curveToRelative(0f, 1.56f, 1.549f, 2.647f, 3.016f, 2.116f)
            lineToRelative(7.83f, -2.834f)
            curveTo(13.537f, 12.794f, 14f, 12.135f, 14f, 11.4f)
            verticalLineTo(4.24f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(6.42857f, 7.61652f),
                end = Offset(16.0495f, 16.1674f)
            )
        ) {
            moveTo(18f, 7.238f)
            curveToRelative(0f, -1.56f, -1.549f, -2.646f, -3.016f, -2.115f)
            lineToRelative(-6.84f, 2.475f)
            curveTo(6.857f, 8.064f, 6f, 9.286f, 6f, 10.654f)
            verticalLineToRelative(6.108f)
            curveToRelative(0f, 1.56f, 1.549f, 2.647f, 3.016f, 2.116f)
            lineToRelative(7.83f, -2.834f)
            curveTo(17.538f, 15.794f, 18f, 15.135f, 18f, 14.4f)
            verticalLineTo(7.24f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF58AAFE)
                ),
                start = Offset(10.4286f, 10.6165f),
                end = Offset(20.0495f, 19.1674f)
            )
        ) {
            moveTo(22f, 10.238f)
            curveToRelative(0f, -1.56f, -1.549f, -2.646f, -3.016f, -2.115f)
            lineToRelative(-6.84f, 2.475f)
            curveTo(10.857f, 11.064f, 10f, 12.286f, 10f, 13.654f)
            verticalLineToRelative(6.108f)
            curveToRelative(0f, 1.56f, 1.549f, 2.647f, 3.016f, 2.116f)
            lineToRelative(7.83f, -2.834f)
            curveTo(21.538f, 18.794f, 22f, 18.135f, 22f, 17.4f)
            verticalLineToRelative(-7.16f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(16.1402f, 18.6647f),
                end = Offset(17.8983f, 23.7177f)
            )
        ) {
            moveTo(23f, 19.875f)
            curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
            reflectiveCurveTo(14f, 21.437f, 14f, 19.875f)
            verticalLineToRelative(-0.103f)
            curveTo(14f, 18.792f, 14.794f, 18f, 15.773f, 18f)
            horizontalLineToRelative(5.454f)
            curveTo(22.207f, 18f, 23f, 18.793f, 23f, 19.772f)
            verticalLineToRelative(0.103f)
            close()
            moveTo(21f, 14.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(16f, 15.88f, 16f, 14.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
        }
    }.build()
}
