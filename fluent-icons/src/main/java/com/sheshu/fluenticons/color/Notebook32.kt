package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Notebook32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Notebook32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD373FC),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(26f, -1.45455f),
                end = Offset(40.0853f, 26.1068f)
            )
        ) {
            moveTo(26f, 8f)
            horizontalLineToRelative(2.25f)
            curveTo(28.664f, 8f, 29f, 8.336f, 29f, 8.75f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(26f)
            verticalLineTo(8f)
            close()
            moveToRelative(2.25f, 6f)
            horizontalLineTo(26f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(2.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            close()
            moveTo(26f, 20f)
            horizontalLineToRelative(2.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(26f)
            verticalLineToRelative(-4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE587F2),
                    1f to Color(0xFF816CDE)
                ),
                start = Offset(1.125f, 2f),
                end = Offset(-0.306052f, 33.3472f)
            )
        ) {
            moveTo(7.25f, 2f)
            curveTo(5.455f, 2f, 4f, 3.455f, 4f, 5.25f)
            verticalLineToRelative(21.5f)
            curveTo(4f, 28.545f, 5.455f, 30f, 7.25f, 30f)
            horizontalLineToRelative(16.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(5.25f)
            curveTo(27f, 3.455f, 25.545f, 2f, 23.75f, 2f)
            horizontalLineTo(7.25f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                center = Offset(14.5417f, 0.250001f),
                radius = 32.2644f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(7.25f, 2f)
            curveTo(5.455f, 2f, 4f, 3.455f, 4f, 5.25f)
            verticalLineToRelative(21.5f)
            curveTo(4f, 28.545f, 5.455f, 30f, 7.25f, 30f)
            horizontalLineToRelative(16.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(5.25f)
            curveTo(27f, 3.455f, 25.545f, 2f, 23.75f, 2f)
            horizontalLineTo(7.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDD3FF),
                    1f to Color(0xFFF3D8FF)
                ),
                start = Offset(11.4375f, 7f),
                end = Offset(20.8797f, 15.2778f)
            )
        ) {
            moveTo(10f, 7f)
            horizontalLineToRelative(11f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(10f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
