package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailUnread16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailUnread16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.64f, 5.396f)
            curveTo(14.43f, 5.129f, 15f, 4.38f, 15f, 3.5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            curveToRelative(-0.932f, 0f, -1.715f, 0.637f, -1.937f, 1.5f)
            curveTo(11.022f, 3.16f, 11f, 3.327f, 11f, 3.5f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            curveToRelative(0.223f, 0f, 0.438f, -0.037f, 0.64f, -0.104f)
            close()
            moveTo(4f, 3f)
            horizontalLineToRelative(6.041f)
            curveTo(10.014f, 3.163f, 10f, 3.33f, 10f, 3.5f)
            curveToRelative(0f, 1.285f, 0.808f, 2.381f, 1.944f, 2.809f)
            lineTo(8f, 8.432f)
            lineToRelative(-6f, -3.23f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
            moveToRelative(10f, 3.337f)
            lineTo(8.237f, 9.44f)
            curveToRelative(-0.148f, 0.08f, -0.326f, 0.08f, -0.474f, 0f)
            lineTo(2f, 6.337f)
            verticalLineTo(11f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6.337f)
            close()
        }
    }.build()
}
