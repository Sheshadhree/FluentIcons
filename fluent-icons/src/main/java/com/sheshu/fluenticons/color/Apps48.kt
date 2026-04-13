package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Apps48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Apps48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF889096)
                ),
                start = Offset(6f, 6.18402f),
                end = Offset(23.9737f, 25.1563f)
            )
        ) {
            moveTo(6f, 10f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(11f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(7f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF63686E),
                    1f to Color(0xFF889096)
                ),
                start = Offset(42f, 40.6429f),
                end = Offset(24.3571f, 23f)
            )
        ) {
            moveTo(38f, 23f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineTo(24f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(24f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(14f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF55595E),
                    1f to Color(0xFF383B3D)
                ),
                start = Offset(6f, 23f),
                end = Offset(25f, 35.2143f)
            )
        ) {
            moveTo(25f, 41f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(10f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineTo(24f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(17f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(17f)
            close()
            moveToRelative(5.254f, -35.755f)
            curveToRelative(1.666f, -1.654f, 4.357f, -1.645f, 6.01f, 0.02f)
            lineToRelative(6.463f, 6.508f)
            curveToRelative(1.654f, 1.666f, 1.645f, 4.357f, -0.02f, 6.01f)
            lineToRelative(-6.496f, 6.45f)
            curveToRelative(-1.666f, 1.655f, -4.356f, 1.645f, -6.01f, -0.02f)
            lineToRelative(-6.463f, -6.508f)
            curveToRelative(-1.654f, -1.665f, -1.644f, -4.356f, 0.021f, -6.01f)
            lineToRelative(6.495f, -6.45f)
            close()
        }
    }.build()
}
