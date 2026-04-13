package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Cloud24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Cloud24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF367AF2)
                ),
                start = Offset(2.71429f, 6.625f),
                end = Offset(11.6752f, 19.9251f)
            )
        ) {
            moveTo(6.08f, 9.02f)
            curveTo(6.548f, 6.171f, 9.02f, 4f, 12f, 4f)
            reflectiveCurveToRelative(5.452f, 2.172f, 5.92f, 5.02f)
            curveTo(20.208f, 9.23f, 22f, 11.155f, 22f, 13.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-11f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveToRelative(0f, -2.344f, 1.792f, -4.269f, 4.08f, -4.48f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0x00FCFCFC)
                ),
                start = Offset(2f, 10.5417f),
                end = Offset(8.06717f, 15.9116f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(11f, 13.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(2f, 15.985f, 2f, 13.5f)
            reflectiveCurveTo(4.015f, 9f, 6.5f, 9f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0x00FCFCFC)
                ),
                start = Offset(8.1461f, 4.675f),
                end = Offset(9.73851f, 12.9464f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(12f, 16f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            curveTo(9.02f, 4f, 6.548f, 6.172f, 6.08f, 9.02f)
            curveTo(6.218f, 9.006f, 6.358f, 9f, 6.5f, 9f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            curveToRelative(0f, 0.832f, -0.226f, 1.61f, -0.619f, 2.279f)
            curveTo(10.896f, 15.923f, 11.439f, 16f, 12f, 16f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.412409f to Color(0xFF2C87F5),
                    1f to Color(0x002C87F5)
                ),
                center = Offset(6.54637f, 13.825f),
                radius = 7.29834f
            )
        ) {
            moveTo(12f, 16f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            curveTo(9.02f, 4f, 6.548f, 6.172f, 6.08f, 9.02f)
            curveTo(6.218f, 9.006f, 6.358f, 9f, 6.5f, 9f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            curveToRelative(0f, 0.832f, -0.226f, 1.61f, -0.619f, 2.279f)
            curveTo(10.896f, 15.923f, 11.439f, 16f, 12f, 16f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                center = Offset(11.1667f, 3.125f),
                radius = 17.3211f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(6.08f, 9.02f)
            curveTo(6.548f, 6.171f, 9.02f, 4f, 12f, 4f)
            reflectiveCurveToRelative(5.452f, 2.172f, 5.92f, 5.02f)
            curveTo(20.208f, 9.23f, 22f, 11.155f, 22f, 13.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-11f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveToRelative(0f, -2.344f, 1.792f, -4.269f, 4.08f, -4.48f)
            close()
        }
    }.build()
}
