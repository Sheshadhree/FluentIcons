package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TriangleRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TriangleRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.222f, 6.687f)
            curveToRelative(1.036f, 0.57f, 1.036f, 2.059f, 0f, 2.629f)
            lineToRelative(-10f, 5.499f)
            curveTo(3.224f, 15.365f, 2f, 14.64f, 2f, 13.5f)
            verticalLineTo(2.502f)
            curveToRelative(0f, -1.14f, 1.223f, -1.864f, 2.223f, -1.314f)
            lineToRelative(9.999f, 5.499f)
            close()
        }
    }.build()
}
