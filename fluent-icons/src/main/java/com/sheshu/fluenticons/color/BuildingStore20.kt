package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.BuildingStore20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.BuildingStore20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.312325f to Color(0xFF29C3FF),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(6.5f, 8f),
                end = Offset(8.5f, 18.5f)
            )
        ) {
            moveTo(3f, 7f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 18f, 3f, 17.776f, 3f, 17.5f)
            verticalLineTo(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0067BF),
                    1f to Color(0xFF003580)
                ),
                start = Offset(5.17857f, 12.3125f),
                end = Offset(9.80562f, 15.7463f)
            ),
            fillAlpha = 0.8f
        ) {
            moveTo(5f, 11.5f)
            curveTo(5f, 11.224f, 5.224f, 11f, 5.5f, 11f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-4f)
            curveTo(5.224f, 18f, 5f, 17.776f, 5f, 17.5f)
            verticalLineToRelative(-6f)
            close()
            moveToRelative(6f, 0f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB6F7B),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(5f, 2f),
                end = Offset(5f, 5.5f)
            )
        ) {
            moveTo(4.6f, 2.18f)
            lineTo(2.128f, 5.146f)
            curveTo(2.045f, 5.246f, 2f, 5.371f, 2f, 5.5f)
            verticalLineTo(7f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            verticalLineTo(5.5f)
            horizontalLineTo(7.5f)
            lineToRelative(1f, -3.5f)
            horizontalLineTo(4.984f)
            curveTo(4.836f, 2f, 4.695f, 2.066f, 4.6f, 2.18f)
            close()
            moveTo(11.5f, 2f)
            lineToRelative(1f, 3.5f)
            horizontalLineTo(12f)
            verticalLineTo(7f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            verticalLineTo(5.5f)
            curveToRelative(0f, -0.13f, -0.045f, -0.254f, -0.128f, -0.354f)
            lineTo(15.4f, 2.18f)
            curveTo(15.305f, 2.066f, 15.164f, 2f, 15.016f, 2f)
            horizontalLineTo(11.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.303571f to Color(0xFFFF9FB2),
                    1f to Color(0xFFF97DBD)
                ),
                start = Offset(10f, 2f),
                end = Offset(10f, 5.5f)
            )
        ) {
            moveTo(8.09f, 2f)
            lineTo(7f, 5.5f)
            verticalLineToRelative(1.75f)
            curveTo(7f, 8.769f, 8.343f, 10f, 10f, 10f)
            reflectiveCurveToRelative(3f, -1.231f, 3f, -2.75f)
            verticalLineTo(5.5f)
            lineTo(11.91f, 2f)
            horizontalLineTo(8.09f)
            close()
        }
    }.build()
}
