package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Book32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Book32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    0.715705f to Color(0xFF58AAFE)
                ),
                start = Offset(15.5652f, 28.2f),
                end = Offset(15.5652f, 25f)
            )
        ) {
            moveTo(6f, 25f)
            horizontalLineToRelative(20.688f)
            reflectiveCurveTo(26f, 25.4f, 26f, 27f)
            reflectiveCurveToRelative(0.688f, 2f, 0.688f, 2f)
            horizontalLineTo(9f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineToRelative(-1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(12.5906f, 7.23895f),
                end = Offset(16.974f, 37.3731f)
            )
        ) {
            moveTo(9f, 28f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            horizontalLineToRelative(18.25f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineTo(9f)
            curveTo(6.79f, 2f, 5f, 3.79f, 5f, 6f)
            verticalLineToRelative(20f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(17f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(13.8282f, 4.97063f),
                end = Offset(20.9218f, 15.2709f)
            )
        ) {
            moveTo(10.75f, 6f)
            curveTo(9.784f, 6f, 9f, 6.784f, 9f, 7.75f)
            verticalLineToRelative(2.5f)
            curveTo(9f, 11.216f, 9.784f, 12f, 10.75f, 12f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-2.5f)
            curveTo(23f, 6.784f, 22.216f, 6f, 21.25f, 6f)
            horizontalLineToRelative(-10.5f)
            close()
        }
    }.build()
}
