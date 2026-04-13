package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailRead16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailRead16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.237f, 1.56f)
            curveToRelative(-0.148f, -0.08f, -0.326f, -0.08f, -0.474f, 0f)
            lineTo(1.789f, 4.777f)
            curveTo(1.303f, 5.038f, 1f, 5.545f, 1f, 6.097f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6.097f)
            curveToRelative(0f, -0.552f, -0.303f, -1.059f, -0.789f, -1.32f)
            lineTo(8.237f, 1.56f)
            close()
            moveTo(2.263f, 5.657f)
            lineTo(8f, 2.567f)
            lineToRelative(5.737f, 3.09f)
            curveToRelative(0.062f, 0.034f, 0.115f, 0.079f, 0.157f, 0.133f)
            lineTo(8f, 8.933f)
            lineTo(2.106f, 5.79f)
            curveTo(2.148f, 5.736f, 2.2f, 5.69f, 2.263f, 5.657f)
            close()
            moveTo(2f, 6.867f)
            lineTo(7.765f, 9.94f)
            curveToRelative(0.147f, 0.079f, 0.323f, 0.079f, 0.47f, 0f)
            lineTo(14f, 6.867f)
            verticalLineTo(12f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(6.867f)
            close()
        }
    }.build()
}
