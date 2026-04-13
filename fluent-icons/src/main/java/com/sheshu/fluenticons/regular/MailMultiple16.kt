package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 10f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            close()
            moveToRelative(10f, -7f)
            horizontalLineTo(3f)
            curveTo(2.448f, 3f, 2f, 3.448f, 2f, 4f)
            verticalLineToRelative(0.74f)
            lineToRelative(5f, 2.692f)
            lineToRelative(5f, -2.692f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveTo(6.763f, 8.44f)
            lineTo(2f, 5.876f)
            verticalLineTo(10f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(5.876f)
            lineTo(7.237f, 8.44f)
            curveToRelative(-0.148f, 0.08f, -0.326f, 0.08f, -0.474f, 0f)
            close()
            moveTo(5f, 14f)
            curveToRelative(-0.74f, 0f, -1.387f, -0.402f, -1.732f, -1f)
            horizontalLineTo(11f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(4.268f)
            curveTo(14.598f, 4.613f, 15f, 5.26f, 15f, 6f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
