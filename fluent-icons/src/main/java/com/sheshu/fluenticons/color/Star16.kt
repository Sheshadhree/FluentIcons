package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Star16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Star16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(14.5002f, 14.3316f),
                end = Offset(1.12543f, 1.71967f)
            )
        ) {
            moveTo(7.194f, 2.102f)
            curveToRelative(0.33f, -0.67f, 1.284f, -0.67f, 1.614f, 0f)
            lineToRelative(1.521f, 3.082f)
            lineToRelative(3.401f, 0.494f)
            curveToRelative(0.739f, 0.107f, 1.033f, 1.014f, 0.5f, 1.535f)
            lineToRelative(-2.462f, 2.4f)
            lineTo(12.349f, 13f)
            curveToRelative(0.126f, 0.735f, -0.646f, 1.296f, -1.306f, 0.948f)
            lineTo(8.001f, 12.35f)
            lineToRelative(-3.042f, 1.6f)
            curveToRelative(-0.66f, 0.347f, -1.432f, -0.214f, -1.306f, -0.95f)
            lineToRelative(0.58f, -3.387f)
            lineToRelative(-2.46f, -2.399f)
            curveToRelative(-0.534f, -0.52f, -0.24f, -1.428f, 0.499f, -1.535f)
            lineToRelative(3.4f, -0.494f)
            lineToRelative(1.522f, -3.082f)
            close()
        }
    }.build()
}
