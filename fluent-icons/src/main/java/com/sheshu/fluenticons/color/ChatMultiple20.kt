package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ChatMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ChatMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.63f to Color(0xFF3D35B1),
                    0.85f to Color(0xFF6553C9),
                    1f to Color(0xFF7660D3)
                ),
                center = Offset(8.50006f, 8.5f),
                radius = 9.21955f
            )
        ) {
            moveTo(11.5f, 5f)
            curveToRelative(3.59f, 0f, 6.5f, 2.91f, 6.5f, 6.5f)
            curveToRelative(0f, 1.151f, -0.3f, 2.233f, -0.825f, 3.172f)
            lineToRelative(0.796f, 2.082f)
            curveToRelative(0.293f, 0.768f, -0.413f, 1.542f, -1.204f, 1.32f)
            lineToRelative(-2.488f, -0.697f)
            curveTo(13.436f, 17.777f, 12.493f, 18f, 11.5f, 18f)
            curveTo(7.91f, 18f, 5f, 15.09f, 5f, 11.5f)
            reflectiveCurveTo(7.91f, 5f, 11.5f, 5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(2f, 2f),
                end = Offset(15.1124f, 15.0381f)
            )
        ) {
            moveTo(8.538f, 2f)
            curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
            curveToRelative(0f, 1.151f, 0.3f, 2.233f, 0.826f, 3.172f)
            lineToRelative(-0.796f, 2.082f)
            curveToRelative(-0.294f, 0.768f, 0.413f, 1.542f, 1.204f, 1.32f)
            lineToRelative(2.487f, -0.697f)
            curveTo(6.602f, 14.777f, 7.545f, 15f, 8.539f, 15f)
            curveToRelative(3.59f, 0f, 6.5f, -2.91f, 6.5f, -6.5f)
            reflectiveCurveTo(12.128f, 2f, 8.538f, 2f)
            close()
        }
    }.build()
}
