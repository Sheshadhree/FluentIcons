package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LockShield24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LockShield24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC205),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(9.71429f, 0.949254f),
                end = Offset(15.8349f, 11.0566f)
            )
        ) {
            moveTo(12f, 2f)
            curveTo(9.79f, 2f, 8f, 3.79f, 8f, 6f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(1.5f)
            horizontalLineTo(16f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(21.1429f, 21.875f),
                end = Offset(6.54201f, 8.2778f)
            )
        ) {
            moveTo(20f, 10.25f)
            curveTo(20f, 8.455f, 18.545f, 7f, 16.75f, 7f)
            horizontalLineToRelative(-9.5f)
            curveTo(5.455f, 7f, 4f, 8.455f, 4f, 10.25f)
            verticalLineToRelative(7.5f)
            curveTo(4f, 19.545f, 5.455f, 21f, 7.25f, 21f)
            horizontalLineToRelative(9.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-7.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF944600),
                    1f to Color(0xFFCD8E02)
                ),
                center = Offset(12.75f, 15.5f),
                radius = 5.46008f
            )
        ) {
            moveTo(12f, 15.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    0.989901f to Color(0x00EB4824)
                ),
                center = Offset(17.1429f, 18.0833f),
                radius = 6.46446f
            )
        ) {
            moveTo(20f, 10.25f)
            curveTo(20f, 8.455f, 18.545f, 7f, 16.75f, 7f)
            horizontalLineToRelative(-9.5f)
            curveTo(5.455f, 7f, 4f, 8.455f, 4f, 10.25f)
            verticalLineToRelative(7.5f)
            curveTo(4f, 19.545f, 5.455f, 21f, 7.25f, 21f)
            horizontalLineToRelative(9.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-7.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF62BE55),
                    1f to Color(0xFF1E794A)
                ),
                start = Offset(14.6875f, 12f),
                end = Offset(23.0074f, 21.7668f)
            )
        ) {
            moveTo(17.99f, 12.194f)
            curveToRelative(0.652f, 0.651f, 1.907f, 1.686f, 3.449f, 1.899f)
            curveTo(21.747f, 14.135f, 22f, 14.378f, 22f, 14.682f)
            verticalLineToRelative(2.838f)
            curveToRelative(0f, 3.816f, -3.58f, 5.201f, -4.353f, 5.456f)
            curveToRelative(-0.097f, 0.032f, -0.196f, 0.032f, -0.293f, 0f)
            curveTo(16.58f, 22.721f, 13f, 21.336f, 13f, 17.52f)
            verticalLineToRelative(-2.838f)
            curveToRelative(0f, -0.304f, 0.253f, -0.547f, 0.561f, -0.59f)
            curveToRelative(1.542f, -0.212f, 2.797f, -1.247f, 3.45f, -1.898f)
            curveToRelative(0.26f, -0.259f, 0.719f, -0.259f, 0.979f, 0f)
            close()
        }
    }.build()
}
