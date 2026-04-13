package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TriangleDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TriangleDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.253f, 3f)
            curveTo(2.524f, 3f, 1.441f, 4.87f, 2.302f, 6.37f)
            lineToRelative(7.744f, 13.502f)
            curveToRelative(0.865f, 1.507f, 3.039f, 1.507f, 3.904f, 0f)
            lineTo(21.694f, 6.37f)
            curveTo(22.554f, 4.87f, 21.472f, 3f, 19.742f, 3f)
            horizontalLineTo(4.253f)
            close()
        }
    }.build()
}
