package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Notebook24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Notebook24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD373FC),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(18.5f, 0.501139f),
                end = Offset(27.0522f, 20.7891f)
            )
        ) {
            moveTo(18.5f, 15f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(21f, 15.75f)
            verticalLineToRelative(1.498f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineToRelative(-0.102f, 0.007f)
            horizontalLineTo(18.5f)
            verticalLineTo(15f)
            horizontalLineToRelative(1.75f)
            horizontalLineToRelative(-1.75f)
            close()
            moveToRelative(0f, -4f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(21f, 11.75f)
            verticalLineToRelative(1.498f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineToRelative(-0.102f, 0.007f)
            horizontalLineTo(18.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(1.75f)
            horizontalLineToRelative(-1.75f)
            close()
            moveToRelative(0f, -4f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(21f, 7.75f)
            verticalLineToRelative(1.498f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(20.25f, 9.998f)
            horizontalLineTo(18.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(1.75f)
            horizontalLineToRelative(-1.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE587F2),
                    1f to Color(0xFF816CDE)
                ),
                start = Offset(2.12515f, 2f),
                end = Offset(1.00599f, 24.3815f)
            )
        ) {
            moveTo(16.749f, 2f)
            curveToRelative(1.242f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.243f, -1.008f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineToRelative(10.499f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                center = Offset(10.8745f, 0.75f),
                radius = 22.9007f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(16.749f, 2f)
            curveToRelative(1.242f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.243f, -1.008f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineToRelative(10.499f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDD3FF),
                    1f to Color(0xFFF3D8FF)
                ),
                start = Offset(8.68728f, 5f),
                end = Offset(17.1338f, 10.1278f)
            )
        ) {
            moveTo(15.249f, 5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(2.498f)
            curveToRelative(0f, 0.415f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 8.998f, 7f, 8.663f, 7f, 8.248f)
            verticalLineTo(5.75f)
            curveTo(7f, 5.336f, 7.336f, 5f, 7.75f, 5f)
            horizontalLineToRelative(7.499f)
            close()
        }
    }.build()
}
