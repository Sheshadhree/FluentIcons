package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Cloud28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Cloud28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF367AF2)
                ),
                start = Offset(2.85714f, 8.1875f),
                end = Offset(13.7861f, 24.2177f)
            )
        ) {
            moveTo(14f, 5f)
            curveToRelative(-3.532f, 0f, -6.453f, 2.616f, -6.931f, 6.017f)
            curveTo(4.233f, 11.237f, 2f, 13.607f, 2f, 16.5f)
            curveTo(2f, 19.538f, 4.462f, 22f, 7.5f, 22f)
            horizontalLineToRelative(13f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            curveToRelative(0f, -2.892f, -2.233f, -5.263f, -5.069f, -5.483f)
            curveTo(20.453f, 7.616f, 17.532f, 5f, 14f, 5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0x00FCFCFC)
                ),
                start = Offset(2f, 12.8843f),
                end = Offset(9.41543f, 19.4475f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(13f, 16.5f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            reflectiveCurveTo(2f, 19.538f, 2f, 16.5f)
            reflectiveCurveTo(4.462f, 11f, 7.5f, 11f)
            reflectiveCurveToRelative(5.5f, 2.462f, 5.5f, 5.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0x00FCFCFC)
                ),
                start = Offset(9.48358f, 5.7875f),
                end = Offset(11.3384f, 15.4386f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(14f, 19f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            curveToRelative(-3.532f, 0f, -6.453f, 2.616f, -6.931f, 6.017f)
            curveTo(7.21f, 11.006f, 7.354f, 11f, 7.5f, 11f)
            curveToRelative(3.038f, 0f, 5.5f, 2.462f, 5.5f, 5.5f)
            curveToRelative(0f, 0.835f, -0.186f, 1.626f, -0.519f, 2.335f)
            curveTo(12.971f, 18.943f, 13.48f, 19f, 14f, 19f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.412409f to Color(0xFF2C87F5),
                    1f to Color(0x002C87F5)
                ),
                center = Offset(7.61394f, 16.4625f),
                radius = 8.52745f
            )
        ) {
            moveTo(14f, 19f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            curveToRelative(-3.532f, 0f, -6.453f, 2.616f, -6.931f, 6.017f)
            curveTo(7.21f, 11.006f, 7.354f, 11f, 7.5f, 11f)
            curveToRelative(3.038f, 0f, 5.5f, 2.462f, 5.5f, 5.5f)
            curveToRelative(0f, 0.835f, -0.186f, 1.626f, -0.519f, 2.335f)
            curveTo(12.971f, 18.943f, 13.48f, 19f, 14f, 19f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                center = Offset(13f, 3.9375f),
                radius = 20.984f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(14f, 5f)
            curveToRelative(-3.532f, 0f, -6.453f, 2.616f, -6.931f, 6.017f)
            curveTo(4.233f, 11.237f, 2f, 13.607f, 2f, 16.5f)
            curveTo(2f, 19.538f, 4.462f, 22f, 7.5f, 22f)
            horizontalLineToRelative(13f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            curveToRelative(0f, -2.892f, -2.233f, -5.263f, -5.069f, -5.483f)
            curveTo(20.453f, 7.616f, 17.532f, 5f, 14f, 5f)
            close()
        }
    }.build()
}
