package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 5f)
            curveTo(5.403f, 5f, 3.64f, 6.435f, 3.142f, 8.376f)
            lineToRelative(11.357f, 6.473f)
            lineToRelative(11.354f, -6.496f)
            curveTo(25.345f, 6.423f, 23.589f, 5f, 21.5f, 5f)
            horizontalLineToRelative(-14f)
            close()
            moveTo(3f, 19.5f)
            verticalLineToRelative(-8.903f)
            lineToRelative(11.005f, 6.272f)
            curveToRelative(0.307f, 0.175f, 0.684f, 0.175f, 0.992f, 0f)
            lineTo(26f, 10.572f)
            verticalLineTo(19.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-14f)
            curveTo(5.015f, 24f, 3f, 21.985f, 3f, 19.5f)
            close()
            moveToRelative(8f, 8f)
            curveToRelative(-1.56f, 0f, -2.935f, -0.794f, -3.742f, -2f)
            horizontalLineTo(22f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            verticalLineTo(9.258f)
            curveToRelative(1.206f, 0.807f, 2f, 2.182f, 2f, 3.742f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            horizontalLineTo(11f)
            close()
        }
    }.build()
}
