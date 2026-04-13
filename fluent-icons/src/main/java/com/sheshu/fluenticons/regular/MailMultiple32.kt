package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 7f)
            curveTo(6.146f, 7f, 5.043f, 8.076f, 5.001f, 9.42f)
            lineToRelative(9.499f, 5.428f)
            lineToRelative(9.499f, -5.428f)
            curveTo(23.957f, 8.076f, 22.854f, 7f, 21.5f, 7f)
            horizontalLineToRelative(-14f)
            close()
            moveTo(3f, 9.5f)
            curveTo(3f, 7.015f, 5.015f, 5f, 7.5f, 5f)
            horizontalLineToRelative(14f)
            curveTo(23.985f, 5f, 26f, 7.015f, 26f, 9.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-14f)
            curveTo(5.015f, 24f, 3f, 21.985f, 3f, 19.5f)
            verticalLineToRelative(-10f)
            close()
            moveToRelative(21f, 10f)
            verticalLineToRelative(-7.777f)
            lineToRelative(-9.004f, 5.145f)
            curveToRelative(-0.307f, 0.176f, -0.685f, 0.176f, -0.992f, 0f)
            lineTo(5f, 11.723f)
            verticalLineTo(19.5f)
            curveTo(5f, 20.88f, 6.12f, 22f, 7.5f, 22f)
            horizontalLineToRelative(14f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
            moveToRelative(-13f, 8f)
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
