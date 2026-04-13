package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Library24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Library24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(-1.74996f, 3f),
                end = Offset(2.70037f, 26.492f)
            )
        ) {
            moveTo(5.5f, 3f)
            curveTo(6.328f, 3f, 7f, 3.672f, 7f, 4.5f)
            verticalLineToRelative(15f)
            curveTo(7f, 20.328f, 6.328f, 21f, 5.5f, 21f)
            horizontalLineToRelative(-2f)
            curveTo(2.672f, 21f, 2f, 20.328f, 2f, 19.5f)
            verticalLineToRelative(-15f)
            curveTo(2f, 3.672f, 2.672f, 3f, 3.5f, 3f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(6f, 0f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            curveTo(8.672f, 21f, 8f, 20.328f, 8f, 19.5f)
            verticalLineToRelative(-15f)
            curveTo(8f, 3.672f, 8.672f, 3f, 9.5f, 3f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(10.495f, 15.643f)
            lineToRelative(-3.214f, -12.52f)
            curveToRelative(-0.206f, -0.8f, -1.023f, -1.284f, -1.826f, -1.08f)
            lineTo(15.08f, 5.528f)
            curveTo(14.276f, 5.733f, 13.793f, 6.55f, 14f, 7.353f)
            lineToRelative(3.214f, 12.517f)
            curveToRelative(0.206f, 0.803f, 1.023f, 1.286f, 1.826f, 1.08f)
            lineToRelative(1.876f, -0.481f)
            curveToRelative(0.803f, -0.206f, 1.286f, -1.024f, 1.08f, -1.826f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(8f, 2.17773f),
                end = Offset(13.9695f, 4.42667f)
            )
        ) {
            moveTo(2f, 6f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(2f)
            horizontalLineTo(2f)
            verticalLineTo(6f)
            close()
            moveToRelative(12.982f, 5.18f)
            lineToRelative(4.785f, -1.218f)
            lineToRelative(-0.498f, -1.937f)
            lineToRelative(-4.785f, 1.218f)
            lineToRelative(0.498f, 1.937f)
            close()
            moveTo(13f, 6f)
            horizontalLineTo(8f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(5f)
            verticalLineTo(6f)
            close()
        }
    }.build()
}
