package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PaintBrush32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PaintBrush32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0853737f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                start = Offset(12f, -2.062f),
                end = Offset(18.9024f, 20.0283f)
            )
        ) {
            moveTo(6f, 3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(18f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(12f)
            horizontalLineTo(6f)
            verticalLineTo(3f)
            close()
            moveToRelative(20f, 12.5f)
            horizontalLineTo(6f)
            verticalLineToRelative(3.25f)
            curveTo(6f, 20.545f, 7.455f, 22f, 9.25f, 22f)
            horizontalLineTo(13f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(3.75f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(15.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF5750E2)
                ),
                start = Offset(10.7561f, 14.2659f),
                end = Offset(10.8974f, 16.5229f)
            )
        ) {
            moveTo(6f, 15f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(18f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(1f)
            horizontalLineTo(6f)
            verticalLineToRelative(-1f)
            close()
            moveTo(17f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(2f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(6f, 7f)
            verticalLineTo(2f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            close()
        }
    }.build()
}
