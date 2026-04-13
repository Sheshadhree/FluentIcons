package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PaintBrush28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PaintBrush28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0853737f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                start = Offset(10.8f, -1.74954f),
                end = Offset(17.9412f, 18.0577f)
            )
        ) {
            moveTo(6f, 2.75f)
            curveTo(6f, 2.336f, 6.336f, 2f, 6.75f, 2f)
            horizontalLineToRelative(14.5f)
            curveTo(21.664f, 2f, 22f, 2.336f, 22f, 2.75f)
            verticalLineTo(14f)
            horizontalLineTo(6f)
            verticalLineTo(2.75f)
            close()
            moveTo(6f, 14f)
            verticalLineToRelative(2.25f)
            curveTo(6f, 17.768f, 7.231f, 19f, 8.75f, 19f)
            horizontalLineToRelative(2.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(19f)
            horizontalLineToRelative(2.75f)
            curveToRelative(1.52f, 0f, 2.75f, -1.232f, 2.75f, -2.75f)
            verticalLineTo(14f)
            horizontalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF5750E2)
                ),
                start = Offset(9.80486f, 13.1994f),
                end = Offset(9.90429f, 14.893f)
            )
        ) {
            moveTo(6f, 14f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(14f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(0.5f)
            horizontalLineTo(6f)
            verticalLineTo(14f)
            close()
            moveToRelative(10.25f, -7f)
            curveTo(16.664f, 7f, 17f, 6.664f, 17f, 6.25f)
            verticalLineTo(2f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(4.25f)
            curveTo(15.5f, 6.664f, 15.836f, 7f, 16.25f, 7f)
            close()
            moveTo(20f, 8.25f)
            verticalLineTo(2f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(6.25f)
            curveTo(18.5f, 8.664f, 18.836f, 9f, 19.25f, 9f)
            reflectiveCurveTo(20f, 8.664f, 20f, 8.25f)
            close()
        }
    }.build()
}
