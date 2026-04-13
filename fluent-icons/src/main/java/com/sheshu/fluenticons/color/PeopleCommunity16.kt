package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PeopleCommunity16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PeopleCommunity16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF004695)
                ),
                center = Offset(10.8128f, 9.43989f),
                radius = 4.64914f
            )
        ) {
            moveTo(10.99f, 7.714f)
            curveToRelative(-0.8f, -0.214f, -1.623f, 0.26f, -1.838f, 1.061f)
            lineToRelative(-0.388f, 1.449f)
            curveToRelative(-0.429f, 1.6f, 0.521f, 3.245f, 2.121f, 3.674f)
            curveToRelative(1.6f, 0.429f, 3.246f, -0.52f, 3.675f, -2.121f)
            lineToRelative(0.388f, -1.45f)
            curveToRelative(0.214f, -0.8f, -0.26f, -1.622f, -1.06f, -1.836f)
            lineToRelative(-2.899f, -0.777f)
            close()
            moveToRelative(-5.98f, 0f)
            curveToRelative(0.8f, -0.214f, 1.623f, 0.26f, 1.837f, 1.061f)
            lineToRelative(0.388f, 1.449f)
            curveToRelative(0.43f, 1.6f, -0.52f, 3.245f, -2.121f, 3.674f)
            curveToRelative(-1.6f, 0.429f, -3.245f, -0.52f, -3.674f, -2.121f)
            lineToRelative(-0.388f, -1.45f)
            curveToRelative(-0.215f, -0.8f, 0.26f, -1.622f, 1.06f, -1.836f)
            lineTo(5.01f, 7.714f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.338691f to Color(0xFF3DCBFF),
                    1f to Color(0xFF14B1FF)
                ),
                center = Offset(7.42221f, 9.45783f),
                radius = 4.22417f
            )
        ) {
            moveTo(6.5f, 7f)
            curveTo(5.672f, 7f, 5f, 7.672f, 5f, 8.5f)
            verticalLineTo(11f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            verticalLineTo(8.5f)
            curveTo(11f, 7.672f, 10.328f, 7f, 9.5f, 7f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(8f, 1f)
            curveTo(6.62f, 1f, 5.5f, 2.12f, 5.5f, 3.5f)
            reflectiveCurveTo(6.62f, 6f, 8f, 6f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(9.38f, 1f, 8f, 1f)
            close()
            moveTo(3f, 3f)
            curveTo(1.895f, 3f, 1f, 3.895f, 1f, 5f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            close()
            moveToRelative(10f, 0f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            close()
        }
    }.build()
}
