package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.EraserSegment20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EraserSegment20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.318f, 2.44f)
            curveToRelative(-0.585f, -0.587f, -1.535f, -0.587f, -2.121f, 0f)
            lineToRelative(-8.76f, 8.759f)
            curveToRelative(-0.585f, 0.586f, -0.585f, 1.536f, 0f, 2.121f)
            lineToRelative(4.243f, 4.243f)
            curveTo(6.993f, 17.876f, 7.41f, 18.022f, 7.82f, 18f)
            horizontalLineToRelative(6.265f)
            curveToRelative(0.206f, 0.583f, 0.762f, 1f, 1.415f, 1f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(16.328f, 16f, 15.5f, 16f)
            curveToRelative(-0.653f, 0f, -1.209f, 0.418f, -1.415f, 1f)
            horizontalLineToRelative(-4.72f)
            lineToRelative(8.196f, -8.197f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0f, -2.121f)
            lineToRelative(-4.243f, -4.243f)
            close()
            moveToRelative(-1.414f, 0.707f)
            curveToRelative(0.195f, -0.196f, 0.512f, -0.196f, 0.707f, 0f)
            lineToRelative(4.243f, 4.242f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(-6.366f, 6.366f)
            lineToRelative(-4.95f, -4.95f)
            lineToRelative(6.366f, -6.366f)
            close()
            moveToRelative(-7.073f, 7.072f)
            lineToRelative(4.95f, 4.95f)
            lineToRelative(-1.687f, 1.687f)
            curveToRelative(-0.195f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineToRelative(-4.242f, -4.243f)
            curveToRelative(-0.196f, -0.195f, -0.196f, -0.512f, 0f, -0.707f)
            lineTo(4.83f, 10.22f)
            close()
        }
    }.build()
}
