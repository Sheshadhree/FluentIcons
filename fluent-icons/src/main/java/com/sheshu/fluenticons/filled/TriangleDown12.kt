package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TriangleDown12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TriangleDown12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.214f, 10.541f)
            curveToRelative(0.349f, 0.612f, 1.223f, 0.612f, 1.572f, 0f)
            lineToRelative(4.092f, -7.169f)
            curveTo(11.226f, 2.762f, 10.789f, 2f, 10.09f, 2f)
            horizontalLineTo(1.908f)
            curveTo(1.212f, 2f, 0.775f, 2.762f, 1.123f, 3.372f)
            lineToRelative(4.092f, 7.17f)
            close()
        }
    }.build()
}
