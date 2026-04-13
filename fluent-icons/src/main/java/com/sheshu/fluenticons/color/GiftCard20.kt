package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.GiftCard20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.GiftCard20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFBB45EA),
                    0.468144f to Color(0xFF8B57ED),
                    1f to Color(0xFF5B2AB5)
                ),
                start = Offset(2f, 0.25f),
                end = Offset(11.9282f, 20.2927f)
            )
        ) {
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineToRelative(10.5f)
            curveTo(16.769f, 4f, 18f, 5.231f, 18f, 6.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 16f, 2f, 14.769f, 2f, 13.25f)
            verticalLineToRelative(-6.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB5937),
                    0.378049f to Color(0xFFFFCD0F)
                ),
                center = Offset(8f, 10f),
                radius = 20.5f
            )
        ) {
            moveTo(7f, 9f)
            verticalLineTo(4f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(5f)
            horizontalLineTo(18f)
            verticalLineToRelative(1.5f)
            horizontalLineTo(8.5f)
            verticalLineTo(16f)
            horizontalLineTo(7f)
            verticalLineToRelative(-5.5f)
            horizontalLineTo(2f)
            verticalLineTo(9f)
            horizontalLineToRelative(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    0.80352f to Color(0xFFFFCD0F)
                ),
                start = Offset(8f, -14.5f),
                end = Offset(7.5f, 20.5f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.542f, 10.481f)
            curveToRelative(0.474f, -0.062f, 0.934f, -0.275f, 1.299f, -0.64f)
            curveToRelative(0.879f, -0.879f, 0.879f, -2.303f, 0f, -3.182f)
            curveTo(9.992f, 5.81f, 8.633f, 5.781f, 7.75f, 6.573f)
            curveTo(6.867f, 5.78f, 5.508f, 5.81f, 4.659f, 6.659f)
            curveToRelative(-0.879f, 0.879f, -0.879f, 2.303f, 0f, 3.182f)
            curveToRelative(0.365f, 0.365f, 0.825f, 0.578f, 1.3f, 0.64f)
            lineToRelative(-1.24f, 1.239f)
            curveToRelative(-0.292f, 0.293f, -0.292f, 0.768f, 0f, 1.06f)
            curveToRelative(0.294f, 0.293f, 0.768f, 0.293f, 1.061f, 0f)
            lineToRelative(1.97f, -1.97f)
            lineToRelative(1.97f, 1.97f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-1.238f, -1.24f)
            close()
            moveTo(9.78f, 7.72f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveTo(8.573f, 7.866f, 8.5f, 8.057f, 8.5f, 8.25f)
            verticalLineTo(9f)
            horizontalLineToRelative(0.75f)
            curveToRelative(0.193f, 0f, 0.384f, -0.073f, 0.53f, -0.22f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            close()
            moveTo(7f, 8.25f)
            curveToRelative(0f, -0.193f, -0.073f, -0.384f, -0.22f, -0.53f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveTo(5.866f, 8.927f, 6.057f, 9f, 6.25f, 9f)
            horizontalLineTo(7f)
            verticalLineTo(8.25f)
            close()
        }
    }.build()
}
