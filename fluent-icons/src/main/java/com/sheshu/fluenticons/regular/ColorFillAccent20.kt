package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ColorFillAccent20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColorFillAccent20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.836f, 12.5f)
            horizontalLineTo(4f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(12f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.295f, -0.085f, -0.57f, -0.232f, -0.802f)
            curveTo(16.888f, 14.167f, 16.042f, 15f, 14.75f, 15f)
            curveToRelative(-1.597f, 0f, -2.512f, -1.273f, -2.71f, -2.5f)
            horizontalLineToRelative(-1.062f)
            lineToRelative(-0.95f, 0.95f)
            curveToRelative(-1.171f, 1.171f, -3.071f, 1.171f, -4.243f, 0f)
            lineToRelative(-0.95f, -0.95f)
            close()
        }
    }.build()
}
