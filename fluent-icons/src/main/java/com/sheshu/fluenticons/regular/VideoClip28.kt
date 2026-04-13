package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.VideoClip28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.VideoClip28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.754f, 4f)
            curveToRelative(-2.071f, 0f, -3.75f, 1.679f, -3.75f, 3.75f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineTo(22.25f)
            curveToRelative(2.07f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(7.75f)
            curveTo(26f, 5.679f, 24.32f, 4f, 22.25f, 4f)
            horizontalLineTo(5.753f)
            close()
            moveToRelative(-2.25f, 3.75f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineTo(22.25f)
            curveToRelative(1.242f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 1.243f, -1.008f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(5.753f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineTo(7.75f)
            close()
            moveTo(10f, 10.251f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.755f, 0.806f, 1.238f, 1.472f, 0.881f)
            lineToRelative(7f, -3.75f)
            curveToRelative(0.703f, -0.376f, 0.703f, -1.385f, 0f, -1.762f)
            lineToRelative(-7f, -3.75f)
            curveTo(10.806f, 9.013f, 10f, 9.496f, 10f, 10.25f)
            close()
        }
    }.build()
}
