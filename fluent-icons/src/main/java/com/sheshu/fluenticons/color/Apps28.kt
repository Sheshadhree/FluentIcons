package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Apps28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Apps28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF889096)
                ),
                start = Offset(2f, 4f),
                end = Offset(12.9891f, 15.4886f)
            )
        ) {
            moveTo(2f, 6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineToRelative(7f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineTo(14f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF63686E),
                    1f to Color(0xFF889096)
                ),
                start = Offset(24f, 25.1786f),
                end = Offset(13.3214f, 14.5f)
            )
        ) {
            moveTo(21.75f, 14.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(13.5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(8.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF55595E),
                    1f to Color(0xFF383B3D)
                ),
                start = Offset(2f, 14.5f),
                end = Offset(13.5f, 21.8929f)
            )
        ) {
            moveTo(13.5f, 25f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 26f, 2f, 25.216f, 2f, 24.25f)
            verticalLineTo(15.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineTo(25f)
            close()
            moveToRelative(4.16f, -22.342f)
            curveToRelative(0.879f, -0.88f, 2.303f, -0.88f, 3.182f, 0f)
            lineToRelative(4.5f, 4.5f)
            curveToRelative(0.88f, 0.879f, 0.88f, 2.303f, 0f, 3.182f)
            lineToRelative(-4.499f, 4.502f)
            curveToRelative(-0.878f, 0.88f, -2.303f, 0.88f, -3.181f, 0f)
            lineToRelative(-4.5f, -4.5f)
            curveToRelative(-0.88f, -0.879f, -0.88f, -2.303f, -0.001f, -3.182f)
            lineToRelative(4.5f, -4.502f)
            close()
        }
    }.build()
}
