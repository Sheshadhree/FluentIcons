package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Receipt20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Receipt20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    0.644682f to Color(0xFFFFB357),
                    1f to Color(0xFFFF921F)
                ),
                start = Offset(5f, 3.5f),
                end = Offset(9.5f, 17f)
            )
        ) {
            moveTo(5f, 3f)
            curveTo(3.895f, 3f, 3f, 3.895f, 3f, 5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFCA6407)
                ),
                start = Offset(5f, 6f),
                end = Offset(12f, 12f)
            )
        ) {
            moveTo(6f, 6.5f)
            curveTo(6f, 6.224f, 6.224f, 6f, 6.5f, 6f)
            horizontalLineToRelative(4f)
            curveTo(10.776f, 6f, 11f, 6.224f, 11f, 6.5f)
            reflectiveCurveTo(10.776f, 7f, 10.5f, 7f)
            horizontalLineToRelative(-4f)
            curveTo(6.224f, 7f, 6f, 6.776f, 6f, 6.5f)
            close()
            moveToRelative(0f, 3f)
            curveTo(6f, 9.224f, 6.224f, 9f, 6.5f, 9f)
            horizontalLineToRelative(4f)
            curveTo(10.776f, 9f, 11f, 9.224f, 11f, 9.5f)
            reflectiveCurveTo(10.776f, 10f, 10.5f, 10f)
            horizontalLineToRelative(-4f)
            curveTo(6.224f, 10f, 6f, 9.776f, 6f, 9.5f)
            close()
            moveToRelative(0f, 3f)
            curveTo(6f, 12.224f, 6.224f, 12f, 6.5f, 12f)
            horizontalLineToRelative(2f)
            curveTo(8.776f, 12f, 9f, 12.224f, 9f, 12.5f)
            reflectiveCurveTo(8.776f, 13f, 8.5f, 13f)
            horizontalLineToRelative(-2f)
            curveTo(6.224f, 13f, 6f, 12.776f, 6f, 12.5f)
            close()
            moveToRelative(8f, -0.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            verticalLineToRelative(-5f)
            close()
        }
    }.build()
}
