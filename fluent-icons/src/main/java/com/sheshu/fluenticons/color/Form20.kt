package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Form20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Form20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(8f, 3f),
                end = Offset(13.3638f, 16.2452f)
            )
        ) {
            moveTo(6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(4.5f, 4.5f),
                end = Offset(16.658f, 6.6578f)
            )
        ) {
            moveTo(5f, 5.5f)
            curveTo(5f, 5.224f, 5.224f, 5f, 5.5f, 5f)
            horizontalLineToRelative(9f)
            curveTo(14.776f, 5f, 15f, 5.224f, 15f, 5.5f)
            reflectiveCurveTo(14.776f, 6f, 14.5f, 6f)
            horizontalLineToRelative(-9f)
            curveTo(5.224f, 6f, 5f, 5.776f, 5f, 5.5f)
            close()
            moveTo(6.5f, 11f)
            curveTo(7.328f, 11f, 8f, 10.328f, 8f, 9.5f)
            reflectiveCurveTo(7.328f, 8f, 6.5f, 8f)
            reflectiveCurveTo(5f, 8.672f, 5f, 9.5f)
            reflectiveCurveTo(5.672f, 11f, 6.5f, 11f)
            close()
            moveTo(8f, 13.5f)
            curveTo(8f, 14.328f, 7.328f, 15f, 6.5f, 15f)
            reflectiveCurveTo(5f, 14.328f, 5f, 13.5f)
            reflectiveCurveTo(5.672f, 12f, 6.5f, 12f)
            reflectiveCurveTo(8f, 12.672f, 8f, 13.5f)
            close()
            moveToRelative(1f, -4f)
            curveTo(9f, 9.224f, 9.224f, 9f, 9.5f, 9f)
            horizontalLineToRelative(5f)
            curveTo(14.776f, 9f, 15f, 9.224f, 15f, 9.5f)
            reflectiveCurveTo(14.776f, 10f, 14.5f, 10f)
            horizontalLineToRelative(-5f)
            curveTo(9.224f, 10f, 9f, 9.776f, 9f, 9.5f)
            close()
            moveTo(9.5f, 13f)
            curveTo(9.224f, 13f, 9f, 13.224f, 9f, 13.5f)
            reflectiveCurveTo(9.224f, 14f, 9.5f, 14f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 13f, 14.5f, 13f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
