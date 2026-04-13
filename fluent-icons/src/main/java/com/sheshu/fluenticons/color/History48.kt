package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.History48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.History48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD373FC),
                    1f to Color(0xFF6D37CD)
                ),
                start = Offset(20.3125f, 37.8088f),
                end = Offset(44.734f, 28.2985f)
            )
        ) {
            moveTo(23.5f, 13f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineTo(23f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(31.328f, 26f, 30.5f, 26f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineToRelative(-10f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(6f, 8.11765f),
                end = Offset(15.6626f, 48.5766f)
            )
        ) {
            moveTo(24f, 9f)
            curveToRelative(8.284f, 0f, 15f, 6.716f, 15f, 15f)
            curveToRelative(0f, 8.284f, -6.716f, 15f, -15f, 15f)
            curveToRelative(-8.284f, 0f, -15f, -6.716f, -15f, -15f)
            curveToRelative(0f, -0.774f, 0.059f, -1.534f, 0.171f, -2.275f)
            curveToRelative(0.125f, -0.819f, -0.438f, -1.584f, -1.257f, -1.708f)
            curveToRelative(-0.82f, -0.125f, -1.584f, 0.439f, -1.709f, 1.258f)
            curveTo(6.07f, 22.165f, 6f, 23.075f, 6f, 24f)
            curveToRelative(0f, 9.941f, 8.059f, 18f, 18f, 18f)
            reflectiveCurveToRelative(18f, -8.059f, 18f, -18f)
            reflectiveCurveTo(33.941f, 6f, 24f, 6f)
            curveToRelative(-4.61f, 0f, -8.816f, 1.734f, -12f, 4.584f)
            verticalLineTo(7.5f)
            curveTo(12f, 6.672f, 11.328f, 6f, 10.5f, 6f)
            reflectiveCurveTo(9f, 6.672f, 9f, 7.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(18.328f, 13f, 17.5f, 13f)
            horizontalLineToRelative(-3.698f)
            curveToRelative(2.677f, -2.484f, 6.26f, -4f, 10.198f, -4f)
            close()
        }
    }.build()
}
