package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.MailMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.MailMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26f, 20f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineTo(7f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineTo(9f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(15f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(11f)
            close()
            moveTo(7f, 6f)
            curveTo(5.343f, 6f, 4f, 7.343f, 4f, 9f)
            verticalLineToRelative(0.715f)
            lineToRelative(10.5f, 6.204f)
            lineTo(25f, 9.715f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(7f)
            close()
            moveToRelative(18f, 4.876f)
            lineTo(14.754f, 16.93f)
            curveToRelative(-0.156f, 0.093f, -0.351f, 0.093f, -0.508f, 0f)
            lineTo(4f, 10.876f)
            verticalLineTo(20f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(15f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineToRelative(-9.124f)
            close()
            moveTo(7.354f, 26f)
            curveToRelative(0.705f, 0.622f, 1.631f, 1f, 2.646f, 1f)
            horizontalLineToRelative(12f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.014f, -0.378f, -1.94f, -1f, -2.646f)
            verticalLineTo(20f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            horizontalLineTo(7.354f)
            close()
        }
    }.build()
}
