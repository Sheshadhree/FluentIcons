package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DataTrending24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DataTrending24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    0.445478f to Color(0xFF9C6CFE),
                    0.956907f to Color(0xFFE656EB)
                ),
                start = Offset(5.42296f, 14.5f),
                end = Offset(24.4583f, 7.09661f)
            )
        ) {
            moveTo(15f, 6f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(2.086f)
            lineToRelative(-3.836f, 3.836f)
            lineToRelative(-1.793f, -1.793f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineToRelative(-3.25f, 3.25f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(2.543f, -2.543f)
            lineToRelative(1.793f, 1.793f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(4.544f, -4.543f)
            lineTo(18.5f, 11.5f)
            curveToRelative(0f, 0.552f, 0.447f, 1f, 1f, 1f)
            curveToRelative(0.552f, 0f, 1f, -0.447f, 1f, -1f)
            lineTo(20.502f, 7f)
            curveToRelative(0f, -0.265f, -0.106f, -0.52f, -0.293f, -0.707f)
            curveTo(20.02f, 6.105f, 19.767f, 6f, 19.502f, 6f)
            horizontalLineTo(15f)
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
