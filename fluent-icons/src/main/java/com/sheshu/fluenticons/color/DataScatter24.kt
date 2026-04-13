package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DataScatter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DataScatter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0078D4)
                ),
                start = Offset(6.75f, 6.25f),
                end = Offset(13.2038f, 13.8844f)
            )
        ) {
            moveTo(9f, 6f)
            curveTo(7.343f, 6f, 6f, 7.343f, 6f, 9f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(6f, 6f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(-1f, -5f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF70777D),
                    1f to Color(0xFFB9C0C7)
                ),
                start = Offset(19.3125f, 4.125f),
                end = Offset(3.56041f, 27.5804f)
            )
        ) {
            moveTo(5f, 4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(3f, 3.448f, 3f, 4f)
            verticalLineToRelative(13.5f)
            curveTo(3f, 19.433f, 4.567f, 21f, 6.5f, 21f)
            horizontalLineTo(20f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 19f, 5f, 18.328f, 5f, 17.5f)
            verticalLineTo(4f)
            close()
        }
    }.build()
}
