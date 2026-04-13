package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.BookOpen48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.BookOpen48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(11.2456f, 13.9874f),
                end = Offset(17.19f, 48.1198f)
            )
        ) {
            moveTo(24f, 9.725f)
            curveTo(22.997f, 8.663f, 21.576f, 8f, 20f, 8f)
            horizontalLineTo(7f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(26f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(13f)
            curveToRelative(1.576f, 0f, 2.997f, -0.663f, 4f, -1.725f)
            lineTo(25f, 23f)
            lineTo(24f, 9.725f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(36.7544f, 13.9874f),
                end = Offset(30.81f, 48.1198f)
            )
        ) {
            moveTo(24f, 9.725f)
            curveTo(25.003f, 8.663f, 26.424f, 8f, 28f, 8f)
            horizontalLineToRelative(13f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(26f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(28f)
            curveToRelative(-1.576f, 0f, -2.997f, -0.663f, -4f, -1.725f)
            lineTo(23f, 23f)
            lineToRelative(1f, -13.275f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB6EFFF),
                    0.851323f to Color(0xFF58AAFE)
                ),
                start = Offset(4f, 6.86538f),
                end = Offset(56.0159f, 31.2843f)
            )
        ) {
            moveTo(6.5f, 9f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(15f)
            curveTo(23.328f, 8f, 24f, 8.672f, 24f, 9.5f)
            lineToRelative(0.5f, 15f)
            lineTo(24f, 34f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.12337f to Color(0xFF9DEAFF),
                    0.61551f to Color(0xFF4894FE)
                ),
                start = Offset(35.25f, 9.375f),
                end = Offset(7.22488f, 14.8849f)
            )
        ) {
            moveTo(41.5f, 9f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-15f)
            curveTo(24.672f, 8f, 24f, 8.672f, 24f, 9.5f)
            verticalLineTo(34f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(13f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(9f)
            close()
        }
    }.build()
}
