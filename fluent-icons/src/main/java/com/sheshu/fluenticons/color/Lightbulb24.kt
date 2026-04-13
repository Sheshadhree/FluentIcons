package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Lightbulb24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Lightbulb24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    0.376456f to Color(0xFFFFA43D),
                    1f to Color(0xFFE67505)
                ),
                center = Offset(7.41892f, 7.57078f),
                radius = 14.468f
            )
        ) {
            moveTo(15.247f, 20.258f)
            curveToRelative(-0.223f, 0.963f, -1.046f, 1.66f, -2.019f, 1.736f)
            lineTo(13.055f, 22f)
            horizontalLineToRelative(-2.111f)
            curveToRelative(-0.99f, 0f, -1.856f, -0.645f, -2.147f, -1.576f)
            lineTo(8.75f, 20.256f)
            lineTo(8.346f, 18.5f)
            horizontalLineToRelative(7.308f)
            lineToRelative(-0.407f, 1.758f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD34719),
                    1f to Color(0x00D34719)
                ),
                start = Offset(11.9993f, 18.5f),
                end = Offset(11.9995f, 22.0001f)
            )
        ) {
            moveTo(15.247f, 20.258f)
            curveToRelative(-0.223f, 0.963f, -1.046f, 1.66f, -2.019f, 1.736f)
            lineTo(13.055f, 22f)
            horizontalLineToRelative(-2.111f)
            curveToRelative(-0.99f, 0f, -1.856f, -0.645f, -2.147f, -1.576f)
            lineTo(8.75f, 20.256f)
            lineTo(8.346f, 18.5f)
            horizontalLineToRelative(7.308f)
            lineToRelative(-0.407f, 1.758f)
            close()
            moveTo(8.23f, 18f)
            horizontalLineToRelative(7.54f)
            lineToRelative(0.644f, -2.783f)
            curveToRelative(0.01f, -0.048f, 0.035f, -0.091f, 0.07f, -0.125f)
            curveToRelative(1.83f, -1.747f, 2.766f, -3.704f, 2.766f, -5.84f)
            curveToRelative(0f, -4.005f, -3.246f, -7.25f, -7.25f, -7.25f)
            reflectiveCurveToRelative(-7.25f, 3.245f, -7.25f, 7.25f)
            curveToRelative(0f, 2.136f, 0.936f, 4.093f, 2.767f, 5.84f)
            curveToRelative(0.035f, 0.034f, 0.06f, 0.077f, 0.071f, 0.125f)
            lineTo(8.23f, 18f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC7A3),
                    1f to Color(0xFFFF9C70)
                ),
                start = Offset(11.385f, 18.0953f),
                end = Offset(12.7254f, 20.8743f)
            )
        ) {
            moveTo(8.46f, 19f)
            lineToRelative(-0.346f, -1.5f)
            horizontalLineToRelative(7.772f)
            lineTo(15.538f, 19f)
            horizontalLineTo(8.46f)
            close()
        }
    }.build()
}
