package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Book48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Book48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    0.715705f to Color(0xFF58AAFE)
                ),
                start = Offset(23.8696f, 41.8f),
                end = Offset(23.8696f, 37f)
            )
        ) {
            moveTo(10f, 37f)
            horizontalLineToRelative(29.5f)
            reflectiveCurveTo(39f, 37.6f, 39f, 40f)
            reflectiveCurveToRelative(0.5f, 3f, 0.5f, 3f)
            horizontalLineTo(15f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            verticalLineToRelative(-1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(19.0409f, 11.4842f),
                end = Offset(25.1955f, 54.5645f)
            )
        ) {
            moveTo(14.25f, 4f)
            curveTo(10.798f, 4f, 8f, 6.798f, 8f, 10.25f)
            verticalLineToRelative(27.5f)
            curveTo(8f, 41.202f, 10.798f, 44f, 14.25f, 44f)
            horizontalLineToRelative(24.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineToRelative(-24.5f)
            curveToRelative(-1.814f, 0f, -3.328f, -1.288f, -3.675f, -3f)
            horizontalLineTo(37.75f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-26f)
            curveTo(40f, 6.798f, 37.202f, 4f, 33.75f, 4f)
            horizontalLineToRelative(-19.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(20.8975f, 8.45594f),
                end = Offset(31.7132f, 23.4131f)
            )
        ) {
            moveTo(16.25f, 10f)
            curveTo(15.007f, 10f, 14f, 11.007f, 14f, 12.25f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(15.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-15.5f)
            close()
        }
    }.build()
}
