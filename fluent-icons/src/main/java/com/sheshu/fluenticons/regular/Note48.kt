package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Note48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Note48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.25f, 6f)
            curveTo(8.798f, 6f, 6f, 8.798f, 6f, 12.25f)
            verticalLineToRelative(23.5f)
            curveTo(6f, 39.202f, 8.798f, 42f, 12.25f, 42f)
            horizontalLineToRelative(13.679f)
            curveToRelative(1.658f, 0f, 3.247f, -0.658f, 4.42f, -1.83f)
            lineToRelative(9.82f, -9.822f)
            curveTo(41.342f, 29.176f, 42f, 27.587f, 42f, 25.928f)
            verticalLineTo(12.25f)
            curveTo(42f, 8.798f, 39.202f, 6f, 35.75f, 6f)
            horizontalLineToRelative(-23.5f)
            close()
            moveTo(8.5f, 12.25f)
            curveToRelative(0f, -2.071f, 1.679f, -3.75f, 3.75f, -3.75f)
            horizontalLineToRelative(23.5f)
            curveToRelative(2.071f, 0f, 3.75f, 1.679f, 3.75f, 3.75f)
            verticalLineTo(26f)
            horizontalLineToRelative(-7.25f)
            curveTo(28.798f, 26f, 26f, 28.798f, 26f, 32.25f)
            verticalLineToRelative(7.25f)
            horizontalLineTo(12.25f)
            curveToRelative(-2.071f, 0f, -3.75f, -1.679f, -3.75f, -3.75f)
            verticalLineToRelative(-23.5f)
            close()
            moveToRelative(20f, 26.23f)
            verticalLineToRelative(-6.23f)
            curveToRelative(0f, -2.071f, 1.679f, -3.75f, 3.75f, -3.75f)
            horizontalLineToRelative(6.23f)
            lineToRelative(-0.078f, 0.08f)
            lineToRelative(-9.821f, 9.822f)
            lineTo(28.5f, 38.48f)
            close()
        }
    }.build()
}
