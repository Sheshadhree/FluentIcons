package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Headphones20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Headphones20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(-3.71429f, 2f),
                end = Offset(-1.2923f, 11.1783f)
            )
        ) {
            moveTo(3f, 13f)
            lineToRelative(-1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            verticalLineToRelative(2f)
            lineToRelative(-1f, 1f)
            lineToRelative(-1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.686f, -6f, 6f)
            verticalLineToRelative(2f)
            lineToRelative(-1f, 1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(16.5f, 11f),
                end = Offset(16.5f, 18f)
            )
        ) {
            moveTo(4.5f, 11f)
            horizontalLineTo(2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-6.5f)
            curveTo(5f, 11.224f, 4.776f, 11f, 4.5f, 11f)
            close()
            moveToRelative(13f, 0f)
            horizontalLineTo(15f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(1f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(14.25f, 11f),
                end = Offset(14.25f, 18f)
            )
        ) {
            moveTo(7f, 11f)
            horizontalLineTo(4f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(6f, 0f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
