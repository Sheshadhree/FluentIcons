package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Code16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Code16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFC76EFB),
                    1f to Color(0xFF8B52F4)
                ),
                start = Offset(1.64706f, 2.04993f),
                end = Offset(13.4974f, 15.0982f)
            )
        ) {
            moveTo(9.905f, 2.815f)
            curveToRelative(0.378f, 0.168f, 0.549f, 0.611f, 0.38f, 0.99f)
            lineToRelative(-4f, 9f)
            curveToRelative(-0.168f, 0.378f, -0.611f, 0.549f, -0.99f, 0.38f)
            curveToRelative(-0.378f, -0.168f, -0.549f, -0.611f, -0.38f, -0.99f)
            lineToRelative(4f, -9f)
            curveToRelative(0.168f, -0.378f, 0.611f, -0.549f, 0.99f, -0.38f)
            close()
            moveTo(4.498f, 5.189f)
            curveToRelative(0.31f, 0.276f, 0.338f, 0.75f, 0.063f, 1.06f)
            lineToRelative(-1.558f, 1.75f)
            lineToRelative(1.558f, 1.753f)
            curveToRelative(0.275f, 0.31f, 0.247f, 0.783f, -0.063f, 1.058f)
            curveToRelative(-0.31f, 0.276f, -0.783f, 0.248f, -1.059f, -0.062f)
            lineToRelative(-2f, -2.25f)
            curveToRelative(-0.252f, -0.284f, -0.252f, -0.712f, 0f, -0.996f)
            lineToRelative(2f, -2.25f)
            curveToRelative(0.276f, -0.31f, 0.75f, -0.338f, 1.06f, -0.063f)
            close()
            moveToRelative(7.004f, 0f)
            curveToRelative(0.31f, -0.275f, 0.783f, -0.247f, 1.059f, 0.063f)
            lineToRelative(2f, 2.25f)
            curveToRelative(0.252f, 0.284f, 0.252f, 0.712f, 0f, 0.996f)
            lineToRelative(-2f, 2.25f)
            curveToRelative(-0.276f, 0.31f, -0.75f, 0.338f, -1.06f, 0.063f)
            curveToRelative(-0.309f, -0.276f, -0.337f, -0.75f, -0.062f, -1.06f)
            lineTo(12.996f, 8f)
            lineTo(11.44f, 6.248f)
            curveToRelative(-0.275f, -0.31f, -0.247f, -0.783f, 0.063f, -1.059f)
            close()
        }
    }.build()
}
