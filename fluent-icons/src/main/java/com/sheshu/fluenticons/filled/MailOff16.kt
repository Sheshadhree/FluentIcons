package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.274f, 12.981f)
            lineToRelative(1.872f, 1.873f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(2.74f, 3.446f)
            curveTo(2.288f, 3.814f, 2f, 4.373f, 2f, 5f)
            verticalLineToRelative(0.201f)
            lineToRelative(5.404f, 2.91f)
            lineTo(8.56f, 9.267f)
            lineTo(8.238f, 9.44f)
            curveToRelative(-0.148f, 0.08f, -0.326f, 0.08f, -0.474f, 0f)
            lineTo(2f, 6.337f)
            verticalLineTo(11f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(0.093f, 0f, 0.185f, -0.006f, 0.274f, -0.019f)
            close()
            moveToRelative(-1.876f, -4.704f)
            lineToRelative(3.461f, 3.461f)
            curveTo(13.95f, 11.51f, 14f, 11.261f, 14f, 11f)
            verticalLineTo(6.337f)
            lineToRelative(-3.602f, 1.94f)
            close()
            moveTo(5.121f, 3f)
            lineTo(9.66f, 7.538f)
            lineTo(14f, 5.201f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(5.121f)
            close()
        }
    }.build()
}
