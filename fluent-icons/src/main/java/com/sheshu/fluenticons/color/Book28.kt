package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Book28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Book28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    0.715705f to Color(0xFF58AAFE)
                ),
                start = Offset(13.6522f, 24.4f),
                end = Offset(13.6522f, 22f)
            )
        ) {
            moveTo(6f, 21.5f)
            horizontalLineToRelative(16.758f)
            reflectiveCurveToRelative(-0.258f, 0.813f, -0.258f, 2f)
            curveToRelative(0f, 1.188f, 0.258f, 2f, 0.258f, 2f)
            horizontalLineTo(8.75f)
            curveTo(7.231f, 25.5f, 6f, 24.269f, 6f, 22.75f)
            verticalLineTo(21.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(11.2105f, 6.49047f),
                end = Offset(15.1385f, 32.2673f)
            )
        ) {
            moveTo(8.75f, 2f)
            curveTo(6.679f, 2f, 5f, 3.679f, 5f, 5.75f)
            verticalLineToRelative(16.5f)
            curveTo(5f, 24.32f, 6.679f, 26f, 8.75f, 26f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            curveToRelative(0f, -0.415f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(8.75f)
            curveToRelative(-1.158f, 0f, -2.112f, -0.875f, -2.236f, -2f)
            horizontalLineTo(21.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(5.75f)
            curveTo(23f, 3.679f, 21.321f, 2f, 19.25f, 2f)
            horizontalLineTo(8.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(12.2936f, 4.64219f),
                end = Offset(18.321f, 12.8942f)
            )
        ) {
            moveTo(9.75f, 5.5f)
            curveTo(9.06f, 5.5f, 8.5f, 6.06f, 8.5f, 6.75f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
