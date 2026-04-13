package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LockShield16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LockShield16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC205),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(6.28571f, -0.264179f),
                end = Offset(10.6724f, 7.20627f)
            )
        ) {
            moveTo(11f, 3.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            verticalLineToRelative(1f)
            horizontalLineTo(5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(14.8571f, 14.625f),
                end = Offset(4.40414f, 4.4038f)
            )
        ) {
            moveTo(14f, 6.5f)
            curveTo(14f, 5.12f, 12.88f, 4f, 11.5f, 4f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 4f, 2f, 5.12f, 2f, 6.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF944600),
                    1f to Color(0xFFCD8E02)
                ),
                center = Offset(8.5f, 10f),
                radius = 3.64005f
            )
        ) {
            moveTo(9f, 9f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveTo(7f, 9.552f, 7f, 9f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    0.989901f to Color(0x00EB4824)
                ),
                center = Offset(11.8571f, 11.9167f),
                radius = 5.54881f
            )
        ) {
            moveTo(14f, 6.5f)
            curveTo(14f, 5.12f, 12.88f, 4f, 11.5f, 4f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 4f, 2f, 5.12f, 2f, 6.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF62BE55),
                    1f to Color(0xFF1E794A)
                ),
                start = Offset(10.3125f, 7f),
                end = Offset(17.1661f, 14.6482f)
            )
        ) {
            moveTo(12.88f, 7.16f)
            curveToRelative(0.508f, 0.532f, 1.484f, 1.379f, 2.684f, 1.552f)
            curveTo(15.803f, 8.747f, 16f, 8.946f, 16f, 9.194f)
            verticalLineToRelative(2.323f)
            curveToRelative(0f, 3.122f, -2.784f, 4.255f, -3.386f, 4.463f)
            curveToRelative(-0.075f, 0.026f, -0.152f, 0.026f, -0.228f, 0f)
            curveTo(11.785f, 15.772f, 9f, 14.64f, 9f, 11.517f)
            verticalLineTo(9.194f)
            curveToRelative(0f, -0.248f, 0.197f, -0.447f, 0.436f, -0.482f)
            curveToRelative(1.2f, -0.173f, 2.175f, -1.02f, 2.683f, -1.553f)
            curveToRelative(0.202f, -0.212f, 0.56f, -0.212f, 0.762f, 0f)
            close()
        }
    }.build()
}
