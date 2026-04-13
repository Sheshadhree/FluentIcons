package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DataTrending16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DataTrending16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    0.445478f to Color(0xFF9C6CFE),
                    0.956907f to Color(0xFFE656EB)
                ),
                start = Offset(4.03846f, 9.43056f),
                end = Offset(16.5006f, 4.4186f)
            )
        ) {
            moveTo(9.75f, 4.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(0.94f)
            lineTo(9f, 7.94f)
            lineTo(7.53f, 6.47f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineTo(7f, 8.06f)
            lineToRelative(1.47f, 1.47f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(2.97f, -2.97f)
            verticalLineToRelative(1.017f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(14f, 7.99f, 14f, 7.577f)
            verticalLineTo(4.75f)
            curveTo(14f, 4.336f, 13.664f, 4f, 13.25f, 4f)
            horizontalLineTo(10.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF70777D),
                    1f to Color(0xFFB9C0C7)
                ),
                start = Offset(12.875f, 2.75f),
                end = Offset(2.37361f, 18.387f)
            )
        ) {
            moveTo(3.5f, 2.75f)
            curveTo(3.5f, 2.336f, 3.164f, 2f, 2.75f, 2f)
            reflectiveCurveTo(2f, 2.336f, 2f, 2.75f)
            verticalLineToRelative(8.5f)
            curveTo(2f, 12.769f, 3.231f, 14f, 4.75f, 14f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-8.5f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
