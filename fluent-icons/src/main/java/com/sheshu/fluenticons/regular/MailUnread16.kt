package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailUnread16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailUnread16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 5.232f)
            curveToRelative(0.598f, -0.345f, 1f, -0.992f, 1f, -1.732f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            curveToRelative(-0.932f, 0f, -1.715f, 0.637f, -1.937f, 1.5f)
            curveTo(11.022f, 3.16f, 11f, 3.327f, 11f, 3.5f)
            reflectiveCurveToRelative(0.022f, 0.34f, 0.063f, 0.5f)
            curveTo(11.285f, 4.863f, 12.068f, 5.5f, 13f, 5.5f)
            curveToRelative(0.364f, 0f, 0.706f, -0.097f, 1f, -0.268f)
            close()
            moveTo(4f, 3f)
            horizontalLineToRelative(6.041f)
            curveTo(10.014f, 3.163f, 10f, 3.33f, 10f, 3.5f)
            curveToRelative(0f, 0.17f, 0.014f, 0.337f, 0.041f, 0.5f)
            horizontalLineTo(4f)
            curveTo(3.448f, 4f, 3f, 4.448f, 3f, 5f)
            verticalLineToRelative(0.74f)
            lineToRelative(5f, 2.692f)
            lineToRelative(3.944f, -2.123f)
            curveTo(12.272f, 6.432f, 12.628f, 6.5f, 13f, 6.5f)
            curveToRelative(0.35f, 0f, 0.687f, -0.06f, 1f, -0.17f)
            verticalLineTo(11f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
            moveTo(3f, 6.875f)
            verticalLineTo(11f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(6.876f)
            lineTo(8.237f, 9.44f)
            curveToRelative(-0.148f, 0.08f, -0.326f, 0.08f, -0.474f, 0f)
            lineTo(3f, 6.876f)
            close()
        }
    }.build()
}
