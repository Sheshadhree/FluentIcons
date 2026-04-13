package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.BookOpen16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.BookOpen16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(3.69552f, 4.24526f),
                end = Offset(5.94148f, 17.0389f)
            )
        ) {
            moveTo(1f, 3.75f)
            curveTo(1f, 2.784f, 1.784f, 2f, 2.75f, 2f)
            horizontalLineTo(6f)
            curveToRelative(0.788f, 0f, 1.499f, 0.331f, 2f, 0.862f)
            lineTo(8.813f, 8f)
            lineTo(8f, 13.137f)
            curveTo(7.499f, 13.67f, 6.788f, 14f, 6f, 14f)
            horizontalLineTo(2.75f)
            curveTo(1.784f, 14f, 1f, 13.216f, 1f, 12.25f)
            verticalLineToRelative(-8.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    0.908213f to Color(0xFF2052CB)
                ),
                start = Offset(13.5352f, 2.42857f),
                end = Offset(11.0714f, 17.1517f)
            )
        ) {
            moveTo(15f, 3.75f)
            curveTo(15f, 2.784f, 14.216f, 2f, 13.25f, 2f)
            horizontalLineTo(10f)
            curveTo(9.212f, 2f, 8.501f, 2.331f, 8f, 2.862f)
            lineTo(7.187f, 8f)
            lineTo(8f, 13.137f)
            curveTo(8.501f, 13.67f, 9.212f, 14f, 10f, 14f)
            horizontalLineToRelative(3.25f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-8.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB6EFFF),
                    0.851323f to Color(0xFF58AAFE)
                ),
                start = Offset(1.14286f, 1.57692f),
                end = Offset(19.4889f, 9.49603f)
            )
        ) {
            moveTo(2f, 2.5f)
            curveTo(2f, 2.224f, 2.224f, 2f, 2.5f, 2f)
            horizontalLineTo(7f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            lineToRelative(0.266f, 4f)
            lineTo(8f, 11f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 13f, 2f, 12.776f, 2f, 12.5f)
            verticalLineToRelative(-10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.12337f to Color(0xFF9DEAFF),
                    0.61551f to Color(0xFF4894FE)
                ),
                start = Offset(13.625f, 2.6875f),
                end = Offset(-0.387561f, 5.44246f)
            )
        ) {
            moveTo(14f, 2.5f)
            curveTo(14f, 2.224f, 13.776f, 2f, 13.5f, 2f)
            horizontalLineTo(9f)
            curveTo(8.448f, 2f, 8f, 2.448f, 8f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-10f)
            close()
        }
    }.build()
}
