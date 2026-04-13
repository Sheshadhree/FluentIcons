package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TriangleDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TriangleDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.312f, 14.223f)
            curveToRelative(-0.57f, 1.036f, -2.059f, 1.036f, -2.629f, 0f)
            lineToRelative(-5.5f, -10f)
            curveTo(0.635f, 3.225f, 1.358f, 2.002f, 2.499f, 2.002f)
            horizontalLineToRelative(10.999f)
            curveToRelative(1.14f, 0f, 1.864f, 1.223f, 1.314f, 2.223f)
            lineToRelative(-5.5f, 9.999f)
            close()
        }
    }.build()
}
