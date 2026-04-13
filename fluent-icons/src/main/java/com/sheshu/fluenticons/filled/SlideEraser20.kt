package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideEraser20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideEraser20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(12f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(5.07f)
            lineToRelative(-0.41f, -0.41f)
            curveToRelative(-0.878f, -0.879f, -2.303f, -0.879f, -3.182f, 0f)
            lineToRelative(-3.749f, 3.75f)
            curveTo(10.219f, 14.848f, 10f, 15.423f, 10f, 16f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            close()
            moveToRelative(13.116f, 5.366f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.767f, 0f)
            lineToRelative(1.75f, 1.75f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(-2.576f, 2.575f)
            lineToRelative(-3.518f, -3.516f)
            lineToRelative(2.577f, -2.577f)
            close()
            moveToRelative(-3.175f, 3.175f)
            lineToRelative(-0.575f, 0.575f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(1.75f, 1.749f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.767f, 0f)
            lineToRelative(0.576f, -0.575f)
            lineToRelative(-3.518f, -3.517f)
            close()
        }
    }.build()
}
