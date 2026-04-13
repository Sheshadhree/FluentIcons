package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PaintBrush24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PaintBrush24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0853737f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                start = Offset(9.2f, -1.28085f),
                end = Offset(15.4485f, 16.0505f)
            )
        ) {
            moveTo(19f, 2.75f)
            curveTo(19f, 2.336f, 18.664f, 2f, 18.25f, 2f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 2f, 5f, 2.336f, 5f, 2.75f)
            verticalLineToRelative(9.75f)
            horizontalLineToRelative(14f)
            verticalLineTo(2.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFAC80FF),
                    1f to Color(0xFF5750E2)
                ),
                start = Offset(5f, 8.47089f),
                end = Offset(5.85741f, 24.5893f)
            )
        ) {
            moveTo(5f, 12f)
            verticalLineToRelative(2.252f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineTo(10f)
            verticalLineTo(20f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            curveToRelative(1.104f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-3.498f)
            horizontalLineToRelative(2.75f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(12f)
            horizontalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF5750E2)
                ),
                start = Offset(8.32925f, 11.1994f),
                end = Offset(8.44277f, 12.8912f)
            )
        ) {
            moveTo(5f, 12f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(12f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(0.5f)
            horizontalLineTo(5f)
            verticalLineTo(12f)
            close()
            moveToRelative(7.5f, -6.748f)
            verticalLineTo(2f)
            horizontalLineTo(14f)
            verticalLineToRelative(3.252f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            close()
            moveTo(15f, 6.251f)
            verticalLineTo(2f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(4.251f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(15f, 6.665f, 15f, 6.251f)
            close()
        }
    }.build()
}
