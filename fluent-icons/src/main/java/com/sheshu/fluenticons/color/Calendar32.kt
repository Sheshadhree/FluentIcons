package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Calendar32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Calendar32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(20.6944f, 31.4561f),
                end = Offset(13.4922f, 9.92516f)
            )
        ) {
            moveTo(29f, 24.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(10f)
            lineToRelative(13f, -1f)
            lineToRelative(13f, 1f)
            verticalLineToRelative(14.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00DCF8FF),
                    1f to Color(0xB2FF6CE8)
                ),
                start = Offset(18.7857f, 17.1818f),
                end = Offset(22.3528f, 33.5775f)
            )
        ) {
            moveTo(29f, 24.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(10f)
            lineToRelative(13f, -1f)
            lineToRelative(13f, 1f)
            verticalLineToRelative(14.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(14.7273f, 14.0769f),
                end = Offset(17.137f, 30.0973f)
            )
        ) {
            moveTo(10.5f, 18f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(11.328f, 15f, 10.5f, 15f)
            reflectiveCurveTo(9f, 15.672f, 9f, 16.5f)
            reflectiveCurveTo(9.672f, 18f, 10.5f, 18f)
            close()
            moveToRelative(1.5f, 3.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(9f, 22.328f, 9f, 21.5f)
            reflectiveCurveTo(9.672f, 20f, 10.5f, 20f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            close()
            moveToRelative(4f, 1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(16.828f, 20f, 16f, 20f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveTo(15.172f, 23f, 16f, 23f)
            close()
            moveToRelative(1.5f, -6.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveTo(15.172f, 15f, 16f, 15f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            close()
            moveToRelative(4f, 1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(22.328f, 15f, 21.5f, 15f)
            reflectiveCurveTo(20f, 15.672f, 20f, 16.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(10f)
            horizontalLineTo(3f)
            verticalLineTo(7.5f)
            close()
        }
    }.build()
}
