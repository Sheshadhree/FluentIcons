package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.BookOpen32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.BookOpen32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(7.17541f, 8.49053f),
                end = Offset(11.8426f, 34.0128f)
            )
        ) {
            moveTo(2f, 6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineToRelative(8f)
            curveToRelative(1.524f, 0f, 2.88f, 0.718f, 3.75f, 1.834f)
            lineTo(17f, 16f)
            lineToRelative(-1f, 10.166f)
            curveTo(15.13f, 27.282f, 13.774f, 28f, 12.25f, 28f)
            horizontalLineToRelative(-8f)
            curveTo(3.007f, 28f, 2f, 26.993f, 2f, 25.75f)
            verticalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(24.8246f, 8.49053f),
                end = Offset(20.1574f, 34.0128f)
            )
        ) {
            moveTo(30f, 6.25f)
            curveTo(30f, 5.007f, 28.993f, 4f, 27.75f, 4f)
            horizontalLineToRelative(-8f)
            curveTo(18.226f, 4f, 16.87f, 4.718f, 16f, 5.834f)
            lineTo(15f, 16f)
            lineToRelative(1f, 10.166f)
            curveTo(16.87f, 27.282f, 18.226f, 28f, 19.75f, 28f)
            horizontalLineToRelative(8f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB6EFFF),
                    0.851323f to Color(0xFF58AAFE)
                ),
                start = Offset(2.28571f, 3.15385f),
                end = Offset(38.9779f, 18.9921f)
            )
        ) {
            moveTo(4f, 5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(9.5f)
            curveTo(15.328f, 4f, 16f, 4.672f, 16f, 5.5f)
            lineToRelative(0.5f, 8.5f)
            lineToRelative(-0.5f, 8.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineTo(5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.12337f to Color(0xFF9DEAFF),
                    0.61551f to Color(0xFF4894FE)
                ),
                start = Offset(27.25f, 5.375f),
                end = Offset(-0.775123f, 10.8849f)
            )
        ) {
            moveTo(28f, 5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-9.5f)
            curveTo(16.672f, 4f, 16f, 4.672f, 16f, 5.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            horizontalLineTo(27f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}
