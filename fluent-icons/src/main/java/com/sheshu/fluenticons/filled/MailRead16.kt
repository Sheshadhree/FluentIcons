package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailRead16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailRead16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.732f, 1.078f)
            curveToRelative(0.163f, -0.104f, 0.373f, -0.104f, 0.536f, 0f)
            lineToRelative(4.806f, 3.058f)
            curveToRelative(0.412f, 0.262f, 0.707f, 0.662f, 0.843f, 1.117f)
            lineTo(8f, 8.434f)
            lineTo(2.086f, 5.243f)
            curveToRelative(0.137f, -0.452f, 0.431f, -0.848f, 0.84f, -1.108f)
            lineToRelative(4.806f, -3.058f)
            close()
            moveTo(2f, 6.334f)
            verticalLineTo(11f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6.344f)
            lineTo(8.237f, 9.44f)
            curveToRelative(-0.148f, 0.08f, -0.326f, 0.08f, -0.474f, 0f)
            lineTo(2f, 6.334f)
            close()
        }
    }.build()
}
