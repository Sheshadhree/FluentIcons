package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ApprovalsApp28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ApprovalsApp28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(3.36108f, 3.3013f),
                end = Offset(10.6708f, 30.1344f)
            )
        ) {
            moveTo(13.369f, 2.13f)
            curveToRelative(-0.342f, -0.341f, -0.896f, -0.341f, -1.238f, 0f)
            curveToRelative(-0.341f, 0.342f, -0.341f, 0.896f, 0f, 1.238f)
            lineToRelative(1.5f, 1.5f)
            curveTo(7.928f, 5.063f, 3.362f, 9.749f, 3.362f, 15.5f)
            curveToRelative(0f, 5.875f, 4.763f, 10.638f, 10.638f, 10.638f)
            curveToRelative(5.784f, 0f, 10.49f, -4.616f, 10.634f, -10.366f)
            curveToRelative(0.012f, -0.483f, -0.37f, -0.884f, -0.853f, -0.896f)
            curveToRelative(-0.483f, -0.012f, -0.885f, 0.37f, -0.897f, 0.852f)
            curveToRelative(-0.12f, 4.803f, -4.052f, 8.66f, -8.884f, 8.66f)
            curveToRelative(-4.909f, 0f, -8.888f, -3.98f, -8.888f, -8.888f)
            curveToRelative(0f, -4.79f, 3.788f, -8.694f, 8.532f, -8.88f)
            lineToRelative(-1.512f, 1.512f)
            curveToRelative(-0.341f, 0.341f, -0.341f, 0.895f, 0f, 1.237f)
            curveToRelative(0.342f, 0.342f, 0.896f, 0.342f, 1.238f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.341f, -0.342f, 0.341f, -0.896f, 0f, -1.237f)
            lineToRelative(-3f, -3.002f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    1f to Color(0xFF309C61)
                ),
                start = Offset(18.3359f, 12.2249f),
                end = Offset(6.74314f, 17.7657f)
            )
        ) {
            moveTo(18.369f, 12.131f)
            curveToRelative(-0.342f, -0.341f, -0.896f, -0.341f, -1.238f, 0f)
            lineToRelative(-4.631f, 4.63f)
            lineToRelative(-1.634f, -1.63f)
            curveToRelative(-0.341f, -0.342f, -0.896f, -0.342f, -1.237f, 0f)
            curveToRelative(-0.341f, 0.342f, -0.341f, 0.896f, 0f, 1.237f)
            lineToRelative(2.253f, 2.25f)
            curveToRelative(0.341f, 0.341f, 0.895f, 0.341f, 1.237f, 0f)
            lineToRelative(5.25f, -5.25f)
            curveToRelative(0.341f, -0.34f, 0.341f, -0.895f, 0f, -1.237f)
            close()
        }
    }.build()
}
