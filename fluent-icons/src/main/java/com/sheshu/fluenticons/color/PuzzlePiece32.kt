package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PuzzlePiece32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PuzzlePiece32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1EC8B0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(7f, 0.444444f),
                end = Offset(22.397f, 29.7721f)
            )
        ) {
            moveTo(17f, 2f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(1f)
            horizontalLineTo(9.75f)
            curveTo(8.231f, 6f, 7f, 7.231f, 7f, 8.75f)
            verticalLineTo(13f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(4.25f)
            curveTo(7f, 24.769f, 8.231f, 26f, 9.75f, 26f)
            horizontalLineTo(14f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(4.25f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineTo(19f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(2f)
            verticalLineTo(8.75f)
            curveTo(27f, 7.231f, 25.769f, 6f, 24.25f, 6f)
            horizontalLineTo(20f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.53288f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(18.7143f, 5.4386f),
                end = Offset(25.0985f, 32.6292f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(17f, 2f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(1f)
            horizontalLineTo(9.75f)
            curveTo(8.231f, 6f, 7f, 7.231f, 7f, 8.75f)
            verticalLineTo(13f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(4.25f)
            curveTo(7f, 24.769f, 8.231f, 26f, 9.75f, 26f)
            horizontalLineTo(14f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(4.25f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineTo(19f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(2f)
            verticalLineTo(8.75f)
            curveTo(27f, 7.231f, 25.769f, 6f, 24.25f, 6f)
            horizontalLineTo(20f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
        }
    }.build()
}
