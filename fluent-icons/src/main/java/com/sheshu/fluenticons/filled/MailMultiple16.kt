package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(0.201f)
            lineTo(7f, 7.432f)
            lineToRelative(-6f, -3.23f)
            verticalLineTo(4f)
            close()
            moveToRelative(6.237f, 4.44f)
            lineTo(13f, 5.337f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5.337f)
            lineTo(6.763f, 8.44f)
            curveToRelative(0.148f, 0.08f, 0.326f, 0.08f, 0.474f, 0f)
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
