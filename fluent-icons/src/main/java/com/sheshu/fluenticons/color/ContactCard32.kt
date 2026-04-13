package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ContactCard32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ContactCard32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(12f, 4f),
                end = Offset(20.1875f, 27.5878f)
            )
        ) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineToRelative(21.5f)
            curveTo(28.545f, 4f, 30f, 5.455f, 30f, 7.25f)
            verticalLineToRelative(17.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 28f, 2f, 26.545f, 2f, 24.75f)
            verticalLineTo(7.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.446512f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(20.3333f, 6.94737f),
                end = Offset(27.3488f, 41.0054f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineToRelative(21.5f)
            curveTo(28.545f, 4f, 30f, 5.455f, 30f, 7.25f)
            verticalLineToRelative(17.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 28f, 2f, 26.545f, 2f, 24.75f)
            verticalLineTo(7.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(21.2729f, 11.1923f),
                end = Offset(24.4081f, 24.8052f)
            )
        ) {
            moveTo(18f, 13f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.553f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.447f, 1f, -1f, 1f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(1f, 4f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.553f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.447f, -1f, -1f, -1f)
            horizontalLineToRelative(-6f)
            close()
            moveTo(7f, 17.5f)
            curveTo(7f, 16.672f, 7.672f, 16f, 8.5f, 16f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            curveToRelative(0f, 0f, 0f, 3.5f, -4f, 3.5f)
            reflectiveCurveToRelative(-4f, -3.5f, -4f, -3.5f)
            close()
            moveToRelative(6f, -4.5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
        }
    }.build()
}
