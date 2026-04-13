package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SlideEraser20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideEraser20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4f)
            curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(0f, -0.343f, 0.078f, -0.686f, 0.234f, -1f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(12f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(4.235f)
            curveToRelative(0.213f, 0.106f, 0.413f, 0.248f, 0.59f, 0.425f)
            lineTo(18f, 11.07f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            close()
            moveToRelative(11.116f, 7.366f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.767f, 0f)
            lineToRelative(1.75f, 1.75f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(-2.575f, 2.575f)
            lineToRelative(-3.518f, -3.517f)
            lineToRelative(2.576f, -2.576f)
            close()
            moveTo(11.94f, 14.54f)
            lineToRelative(-0.575f, 0.576f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(1.75f, 1.749f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.767f, 0f)
            lineToRelative(0.577f, -0.576f)
            lineToRelative(-3.519f, -3.517f)
            close()
        }
    }.build()
}
