package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LockClosed28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LockClosed28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC205),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(10.9286f, 0.758209f),
                end = Offset(18.3219f, 12.3803f)
            )
        ) {
            moveTo(13.5f, 2f)
            curveTo(11.015f, 2f, 9f, 4.015f, 9f, 6.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            verticalLineToRelative(2f)
            horizontalLineTo(18f)
            verticalLineToRelative(-2f)
            curveTo(18f, 4.015f, 15.985f, 2f, 13.5f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(24.3571f, 26.0625f),
                end = Offset(6.66001f, 9.9454f)
            )
        ) {
            moveTo(23f, 11.75f)
            curveTo(23f, 9.679f, 21.321f, 8f, 19.25f, 8f)
            horizontalLineTo(7.75f)
            curveTo(5.679f, 8f, 4f, 9.679f, 4f, 11.75f)
            verticalLineToRelative(9.5f)
            curveTo(4f, 23.321f, 5.679f, 25f, 7.75f, 25f)
            horizontalLineToRelative(11.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineToRelative(-9.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF944600),
                    1f to Color(0xFFCD8E02)
                ),
                center = Offset(14.25f, 18f),
                radius = 5.46008f
            )
        ) {
            moveTo(13.5f, 18f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(14.328f, 15f, 13.5f, 15f)
            reflectiveCurveTo(12f, 15.672f, 12f, 16.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
