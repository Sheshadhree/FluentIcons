package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PersonFeedback32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PersonFeedback32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(6.04123f, 21.3294f),
                end = Offset(9.71579f, 31.3053f)
            )
        ) {
            moveTo(10.5f, 29.99f)
            curveToRelative(-2.9f, 0f, -5.12f, -0.8f, -6.62f, -2.368f)
            curveToRelative(-1.931f, -2.015f, -1.886f, -4.585f, -1.881f, -4.838f)
            verticalLineToRelative(-0.017f)
            curveTo(2f, 21.26f, 3.26f, 20f, 4.82f, 20f)
            horizontalLineToRelative(11.36f)
            curveToRelative(1.55f, 0f, 2.82f, 1.259f, 2.82f, 2.817f)
            verticalLineToRelative(0.01f)
            curveToRelative(0.004f, 0.182f, 0.06f, 2.77f, -1.88f, 4.805f)
            curveTo(15.62f, 29.201f, 13.4f, 30f, 10.5f, 30f)
            verticalLineToRelative(-0.01f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(10.4991f, 18.8095f),
                end = Offset(15.6875f, 35.2916f)
            )
        ) {
            moveTo(10.5f, 29.99f)
            curveToRelative(-2.9f, 0f, -5.12f, -0.8f, -6.62f, -2.368f)
            curveToRelative(-1.931f, -2.015f, -1.886f, -4.585f, -1.881f, -4.838f)
            verticalLineToRelative(-0.017f)
            curveTo(2f, 21.26f, 3.26f, 20f, 4.82f, 20f)
            horizontalLineToRelative(11.36f)
            curveToRelative(1.55f, 0f, 2.82f, 1.259f, 2.82f, 2.817f)
            verticalLineToRelative(0.01f)
            curveToRelative(0.004f, 0.182f, 0.06f, 2.77f, -1.88f, 4.805f)
            curveTo(15.62f, 29.201f, 13.4f, 30f, 10.5f, 30f)
            verticalLineToRelative(-0.01f)
            close()
            moveToRelative(0f, -11.99f)
            curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
            reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
            reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
            close()
            moveToRelative(9.45f, -2.11f)
            curveTo(20.13f, 15.97f, 20.32f, 16f, 20.5f, 16f)
            curveToRelative(0.41f, 0f, 0.81f, -0.17f, 1.1f, -0.48f)
            lineTo(23.94f, 13f)
            horizontalLineTo(27f)
            curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            horizontalLineToRelative(-8f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            verticalLineToRelative(4.99f)
            curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.63f, 0.37f, 1.17f, 0.95f, 1.4f)
            close()
        }
    }.build()
}
