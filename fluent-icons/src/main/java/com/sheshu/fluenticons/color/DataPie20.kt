package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DataPie20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DataPie20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6D37CD),
                    0.640625f to Color(0xFFEA71EF)
                ),
                start = Offset(15.9383f, 18f),
                end = Offset(-6.36296f, -4.30119f)
            )
        ) {
            moveTo(8.003f, 4.07f)
            curveTo(8.55f, 3.993f, 9f, 4.449f, 9f, 5f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1.008f, 0.45f, 0.93f, 0.997f)
            curveTo(15.446f, 15.391f, 12.527f, 18f, 9f, 18f)
            curveToRelative(-3.866f, 0f, -7f, -3.134f, -7f, -7f)
            curveToRelative(0f, -3.527f, 2.61f, -6.446f, 6.003f, -6.93f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE23CB4),
                    1f to Color(0xFFEA71EF)
                ),
                start = Offset(17.3333f, 8.53333f),
                end = Offset(11.6f, 2f)
            )
        ) {
            moveTo(17.062f, 10f)
            curveToRelative(0.498f, 0f, 0.927f, -0.366f, 0.937f, -0.864f)
            lineTo(18f, 9f)
            curveToRelative(0f, -3.866f, -3.134f, -7f, -7f, -7f)
            lineToRelative(-0.136f, 0.001f)
            curveTo(10.366f, 2.011f, 10f, 2.441f, 10f, 2.938f)
            verticalLineTo(9f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(6.062f)
            close()
        }
    }.build()
}
