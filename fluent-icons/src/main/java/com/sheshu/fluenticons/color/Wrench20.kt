package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Wrench20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Wrench20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF2BDABE),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(8.5f, 3f),
                end = Offset(11.3556f, 18.5765f)
            )
        ) {
            moveTo(13.5f, 2f)
            curveTo(11.015f, 2f, 9f, 4.015f, 9f, 6.5f)
            curveToRelative(0f, 0.293f, 0.028f, 0.58f, 0.082f, 0.86f)
            lineToRelative(-6.425f, 6.658f)
            curveToRelative(-0.965f, 1f, -0.86f, 2.612f, 0.225f, 3.479f)
            curveToRelative(0.942f, 0.753f, 2.301f, 0.673f, 3.149f, -0.186f)
            lineToRelative(6.364f, -6.448f)
            curveTo(12.75f, 10.953f, 13.12f, 11f, 13.5f, 11f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            curveToRelative(0f, -0.347f, -0.04f, -0.685f, -0.114f, -1.01f)
            curveToRelative(-0.04f, -0.178f, -0.174f, -0.32f, -0.35f, -0.37f)
            curveToRelative(-0.174f, -0.05f, -0.362f, -0.001f, -0.491f, 0.127f)
            lineTo(14.5f, 7.793f)
            lineTo(12.207f, 5.5f)
            lineToRelative(2.545f, -2.545f)
            curveToRelative(0.13f, -0.129f, 0.178f, -0.317f, 0.127f, -0.492f)
            curveToRelative(-0.05f, -0.175f, -0.19f, -0.308f, -0.368f, -0.349f)
            curveTo(14.185f, 2.04f, 13.847f, 2f, 13.5f, 2f)
            close()
        }
    }.build()
}
