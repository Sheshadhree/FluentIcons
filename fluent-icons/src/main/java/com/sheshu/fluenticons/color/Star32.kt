package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Star32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Star32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(28.999f, 28.5572f),
                end = Offset(2.15658f, 3.34042f)
            )
        ) {
            moveTo(14.655f, 3.84f)
            curveToRelative(0.549f, -1.12f, 2.144f, -1.12f, 2.693f, 0f)
            lineToRelative(3.199f, 6.52f)
            lineToRelative(7.17f, 1.05f)
            curveToRelative(1.228f, 0.179f, 1.72f, 1.686f, 0.834f, 2.555f)
            lineToRelative(-5.195f, 5.096f)
            lineToRelative(1.224f, 7.183f)
            curveToRelative(0.21f, 1.227f, -1.08f, 2.16f, -2.18f, 1.578f)
            lineToRelative(-6.399f, -3.385f)
            lineToRelative(-6.399f, 3.385f)
            curveToRelative(-1.1f, 0.582f, -2.389f, -0.351f, -2.18f, -1.578f)
            lineToRelative(1.225f, -7.183f)
            lineToRelative(-5.196f, -5.096f)
            curveToRelative(-0.885f, -0.87f, -0.394f, -2.376f, 0.834f, -2.556f)
            lineToRelative(7.17f, -1.048f)
            lineToRelative(3.2f, -6.522f)
            close()
        }
    }.build()
}
