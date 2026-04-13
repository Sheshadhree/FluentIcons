package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Heart48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Heart48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.262f, 10.179f)
            curveTo(17.57f, 7.389f, 12.508f, 7.27f, 8.688f, 9.883f)
            curveToRelative(-5.65f, 3.865f, -6.308f, 11.953f, -1.357f, 16.68f)
            lineToRelative(15.806f, 15.092f)
            curveToRelative(0.483f, 0.462f, 1.243f, 0.462f, 1.726f, 0f)
            lineToRelative(15.803f, -15.09f)
            curveToRelative(4.952f, -4.729f, 4.293f, -12.817f, -1.358f, -16.682f)
            curveToRelative(-3.82f, -2.613f, -8.884f, -2.493f, -12.577f, 0.299f)
            lineTo(24f, 12.246f)
            lineToRelative(-2.738f, -2.068f)
            close()
        }
    }.build()
}
