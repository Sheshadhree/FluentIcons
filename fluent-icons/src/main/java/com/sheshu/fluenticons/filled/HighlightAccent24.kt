package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HighlightAccent24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HighlightAccent24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.003f, 4f)
            lineTo(20f, 7.75f)
            lineToRelative(-0.007f, 0.102f)
            curveToRelative(-0.05f, 0.354f, -0.346f, 0.63f, -0.71f, 0.648f)
            horizontalLineTo(4.737f)
            lineTo(4.648f, 8.494f)
            curveTo(4.282f, 8.444f, 4f, 8.131f, 4f, 7.751f)
            verticalLineTo(4f)
            horizontalLineToRelative(16.003f)
            close()
            moveToRelative(-4.496f, 9.5f)
            horizontalLineTo(8.5f)
            verticalLineTo(21f)
            lineToRelative(6.576f, -3.106f)
            curveToRelative(0.23f, -0.108f, 0.388f, -0.324f, 0.424f, -0.572f)
            lineToRelative(0.008f, -0.107f)
            lineToRelative(-0.001f, -3.715f)
            close()
        }
    }.build()
}
