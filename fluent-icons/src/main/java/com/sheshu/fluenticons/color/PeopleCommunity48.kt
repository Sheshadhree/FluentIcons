package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PeopleCommunity48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PeopleCommunity48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.338691f to Color(0xFF3DCBFF),
                    1f to Color(0xFF14B1FF)
                ),
                center = Offset(22.7481f, 9.56453f),
                radius = 8.11995f
            )
        ) {
            moveTo(24f, 5f)
            curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
            reflectiveCurveTo(20.41f, 18f, 24f, 18f)
            reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
            reflectiveCurveTo(27.59f, 5f, 24f, 5f)
            close()
            moveTo(9.5f, 9f)
            curveTo(6.462f, 9f, 4f, 11.462f, 4f, 14.5f)
            reflectiveCurveTo(6.462f, 20f, 9.5f, 20f)
            reflectiveCurveToRelative(5.5f, -2.462f, 5.5f, -5.5f)
            reflectiveCurveTo(12.538f, 9f, 9.5f, 9f)
            close()
            moveToRelative(29f, 0f)
            curveToRelative(-3.038f, 0f, -5.5f, 2.462f, -5.5f, 5.5f)
            reflectiveCurveToRelative(2.462f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.462f, 5.5f, -5.5f)
            reflectiveCurveTo(41.538f, 9f, 38.5f, 9f)
            close()
            moveToRelative(-8.022f, 12.818f)
            curveToRelative(-1.734f, -0.465f, -3.516f, 0.564f, -3.98f, 2.298f)
            lineToRelative(-1.489f, 5.554f)
            curveToRelative(-1.286f, 4.801f, 1.563f, 9.736f, 6.364f, 11.023f)
            curveToRelative(4.801f, 1.286f, 9.736f, -1.563f, 11.023f, -6.364f)
            lineToRelative(1.488f, -5.554f)
            curveToRelative(0.465f, -1.734f, -0.564f, -3.516f, -2.298f, -3.98f)
            lineToRelative(-11.108f, -2.977f)
            close()
            moveToRelative(-12.956f, 0f)
            curveToRelative(1.734f, -0.465f, 3.516f, 0.564f, 3.98f, 2.298f)
            lineToRelative(1.488f, 5.554f)
            curveToRelative(1.287f, 4.801f, -1.562f, 9.736f, -6.364f, 11.023f)
            curveToRelative(-4.8f, 1.286f, -9.736f, -1.563f, -11.022f, -6.364f)
            lineToRelative(-1.489f, -5.554f)
            curveToRelative(-0.464f, -1.734f, 0.565f, -3.516f, 2.298f, -3.98f)
            lineToRelative(11.109f, -2.977f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.338691f to Color(0xFF3DCBFF),
                    1f to Color(0xFF14B1FF)
                ),
                center = Offset(22.2666f, 28.0224f),
                radius = 12.1907f
            )
        ) {
            moveTo(18.25f, 21f)
            curveTo(16.455f, 21f, 15f, 22.455f, 15f, 24.25f)
            verticalLineTo(32f)
            curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
            verticalLineToRelative(-7.75f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            horizontalLineToRelative(-11.5f)
            close()
        }
    }.build()
}
