package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DocumentText20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DocumentText20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF4894FE)
                ),
                start = Offset(12.4f, 2f),
                end = Offset(13.782f, 15.4789f)
            )
        ) {
            moveTo(10f, 2f)
            lineToRelative(2f, 4f)
            lineToRelative(4f, 2f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 18f, 4f, 17.328f, 4f, 16.5f)
            verticalLineToRelative(-13f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineTo(10f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.362364f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(16.5f, 2.5f),
                radius = 9.75567f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(10f, 2f)
            lineToRelative(2f, 4f)
            lineToRelative(4f, 2f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 18f, 4f, 17.328f, 4f, 16.5f)
            verticalLineToRelative(-13f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineTo(10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(13f, 4.5f),
                end = Offset(11.5f, 7f)
            )
        ) {
            moveTo(10.01f, 6.5f)
            verticalLineTo(2f)
            lineToRelative(6f, 6f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color.White
                ),
                start = Offset(14f, 17f),
                end = Offset(9.40251f, 6.50892f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(6.5f, 10f)
            curveTo(6.224f, 10f, 6f, 10.224f, 6f, 10.5f)
            reflectiveCurveTo(6.224f, 11f, 6.5f, 11f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 10f, 13.5f, 10f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(0f, 2f)
            curveTo(6.224f, 12f, 6f, 12.224f, 6f, 12.5f)
            reflectiveCurveTo(6.224f, 13f, 6.5f, 13f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 12f, 13.5f, 12f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(0f, 2f)
            curveTo(6.224f, 14f, 6f, 14.224f, 6f, 14.5f)
            reflectiveCurveTo(6.224f, 15f, 6.5f, 15f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 14f, 13.5f, 14f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
