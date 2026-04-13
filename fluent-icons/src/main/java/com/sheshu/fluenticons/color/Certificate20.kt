package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Certificate20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Certificate20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(2.57143f, 5.25f),
                end = Offset(10.4375f, 16.1467f)
            )
        ) {
            moveTo(2f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(12f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-0.173f, 0f, -0.34f, -0.022f, -0.5f, -0.063f)
            verticalLineToRelative(-1.2f)
            curveToRelative(-0.614f, -0.55f, -1f, -1.348f, -1f, -2.237f)
            horizontalLineTo(2f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color.White
                ),
                start = Offset(19.5f, 17.5f),
                end = Offset(14.0281f, 1.00508f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(5f, 6.5f)
            curveTo(5f, 6.224f, 5.224f, 6f, 5.5f, 6f)
            horizontalLineToRelative(9f)
            curveTo(14.776f, 6f, 15f, 6.224f, 15f, 6.5f)
            reflectiveCurveTo(14.776f, 7f, 14.5f, 7f)
            horizontalLineToRelative(-9f)
            curveTo(5.224f, 7f, 5f, 6.776f, 5f, 6.5f)
            close()
            moveToRelative(5.5f, 3.5f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 10f, 14.5f, 10f)
            horizontalLineToRelative(-4f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF163697),
                    1f to Color(0xFF29C3FF)
                ),
                center = Offset(5.5f, 13f),
                radius = 7.5f
            )
        ) {
            moveTo(3f, 13.742f)
            curveTo(3.715f, 14.221f, 4.575f, 14.5f, 5.5f, 14.5f)
            reflectiveCurveToRelative(1.785f, -0.28f, 2.5f, -0.758f)
            verticalLineTo(18f)
            curveToRelative(0f, 0.412f, -0.47f, 0.647f, -0.8f, 0.4f)
            lineToRelative(-1.4f, -1.05f)
            curveToRelative(-0.178f, -0.133f, -0.422f, -0.133f, -0.6f, 0f)
            lineTo(3.8f, 18.4f)
            curveTo(3.47f, 18.647f, 3f, 18.412f, 3f, 18f)
            verticalLineToRelative(-4.258f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.771547f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                center = Offset(-13.125f, -16.5f),
                radius = 39.0722f
            )
        ) {
            moveTo(5.5f, 15f)
            curveTo(3.567f, 15f, 2f, 13.433f, 2f, 11.5f)
            reflectiveCurveTo(3.567f, 8f, 5.5f, 8f)
            reflectiveCurveTo(9f, 9.567f, 9f, 11.5f)
            reflectiveCurveTo(7.433f, 15f, 5.5f, 15f)
            close()
        }
    }.build()
}
