package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PeopleCommunity20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PeopleCommunity20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF004695)
                ),
                center = Offset(13.3474f, 11.8391f),
                radius = 6.28119f
            )
        ) {
            moveTo(13.062f, 9.49f)
            curveToRelative(-0.8f, -0.215f, -1.623f, 0.26f, -1.837f, 1.06f)
            lineToRelative(-0.647f, 2.415f)
            curveToRelative(-0.572f, 2.134f, 0.694f, 4.327f, 2.828f, 4.9f)
            curveToRelative(2.134f, 0.57f, 4.327f, -0.695f, 4.9f, -2.83f)
            lineToRelative(0.646f, -2.414f)
            curveToRelative(0.215f, -0.8f, -0.26f, -1.623f, -1.06f, -1.837f)
            lineToRelative(-4.83f, -1.294f)
            close()
            moveToRelative(-6.12f, 0f)
            curveToRelative(0.8f, -0.215f, 1.623f, 0.26f, 1.837f, 1.06f)
            lineToRelative(0.647f, 2.415f)
            curveToRelative(0.572f, 2.134f, -0.695f, 4.327f, -2.829f, 4.9f)
            curveToRelative(-2.133f, 0.57f, -4.327f, -0.695f, -4.899f, -2.83f)
            lineToRelative(-0.646f, -2.414f)
            curveToRelative(-0.215f, -0.8f, 0.26f, -1.623f, 1.06f, -1.837f)
            lineToRelative(4.83f, -1.294f)
            close()
            moveTo(10f, 2f)
            curveTo(8.343f, 2f, 7f, 3.343f, 7f, 5f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(6.5f, 2f)
            curveTo(15.12f, 4f, 14f, 5.12f, 14f, 6.5f)
            reflectiveCurveTo(15.12f, 9f, 16.5f, 9f)
            reflectiveCurveTo(19f, 7.88f, 19f, 6.5f)
            reflectiveCurveTo(17.88f, 4f, 16.5f, 4f)
            close()
            moveToRelative(-13f, 0f)
            curveTo(2.12f, 4f, 1f, 5.12f, 1f, 6.5f)
            reflectiveCurveTo(2.12f, 9f, 3.5f, 9f)
            reflectiveCurveTo(6f, 7.88f, 6f, 6.5f)
            reflectiveCurveTo(4.88f, 4f, 3.5f, 4f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.338691f to Color(0xFF3DCBFF),
                    1f to Color(0xFF14B1FF)
                ),
                center = Offset(9.22961f, 12.1601f),
                radius = 5.47141f
            )
        ) {
            moveTo(7.5f, 9f)
            curveTo(6.672f, 9f, 6f, 9.672f, 6f, 10.5f)
            verticalLineTo(14f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-3.5f)
            curveTo(14f, 9.672f, 13.328f, 9f, 12.5f, 9f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
