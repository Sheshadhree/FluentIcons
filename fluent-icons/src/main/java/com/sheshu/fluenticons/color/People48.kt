package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.People48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.People48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(28.4744f, 28.5952f),
                end = Offset(32.7834f, 40.6503f)
            )
        ) {
            moveTo(27.225f, 27f)
            curveToRelative(-2.072f, 0f, -3.75f, 1.679f, -3.75f, 3.75f)
            verticalLineTo(31f)
            reflectiveCurveToRelative(0f, 8f, 10.5f, 8f)
            horizontalLineToRelative(0.024f)
            curveToRelative(10.5f, 0f, 10.5f, -8f, 10.5f, -8f)
            verticalLineToRelative(-0.25f)
            curveToRelative(0f, -2.071f, -1.679f, -3.75f, -3.75f, -3.75f)
            horizontalLineTo(27.225f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.392122f to Color(0xFF3B148A),
                    1f to Color(0x003B148A)
                ),
                center = Offset(20.8076f, 33f),
                radius = 13.9466f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(27.225f, 27f)
            curveToRelative(-2.072f, 0f, -3.75f, 1.679f, -3.75f, 3.75f)
            verticalLineTo(31f)
            reflectiveCurveToRelative(0f, 8f, 10.5f, 8f)
            horizontalLineToRelative(0.024f)
            curveToRelative(10.5f, 0f, 10.5f, -8f, 10.5f, -8f)
            verticalLineToRelative(-0.25f)
            curveToRelative(0f, -2.071f, -1.679f, -3.75f, -3.75f, -3.75f)
            horizontalLineTo(27.225f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFBD96FF),
                    1f to Color(0xFF9C6CFE)
                ),
                start = Offset(9.1829f, 28.8611f),
                end = Offset(13.9855f, 43.1028f)
            )
        ) {
            moveTo(6.75f, 27f)
            curveTo(4.679f, 27f, 3f, 28.679f, 3f, 30.75f)
            verticalLineTo(32f)
            reflectiveCurveToRelative(0f, 9f, 13f, 9f)
            reflectiveCurveToRelative(13f, -9f, 13f, -9f)
            verticalLineToRelative(-1.25f)
            curveToRelative(0f, -2.071f, -1.679f, -3.75f, -3.75f, -3.75f)
            horizontalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(16f, 25.3333f),
                end = Offset(22.7485f, 48.75f)
            )
        ) {
            moveTo(6.75f, 27f)
            curveTo(4.679f, 27f, 3f, 28.679f, 3f, 30.75f)
            verticalLineTo(32f)
            reflectiveCurveToRelative(0f, 9f, 13f, 9f)
            reflectiveCurveToRelative(13f, -9f, 13f, -9f)
            verticalLineToRelative(-1.25f)
            curveToRelative(0f, -2.071f, -1.679f, -3.75f, -3.75f, -3.75f)
            horizontalLineTo(6.75f)
            close()
            moveTo(34f, 24f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.686f, -6f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            close()
            moveToRelative(-18f, 0f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            close()
        }
    }.build()
}
