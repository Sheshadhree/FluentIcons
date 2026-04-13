package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleDown16",
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
            moveTo(7.559f, 13.74f)
            curveToRelative(0.19f, 0.345f, 0.687f, 0.345f, 0.876f, 0f)
            lineToRelative(5.5f, -10f)
            curveTo(14.118f, 3.408f, 13.877f, 3f, 13.497f, 3f)
            horizontalLineTo(2.498f)
            curveTo(2.118f, 3f, 1.877f, 3.408f, 2.06f, 3.74f)
            lineToRelative(5.5f, 10f)
            close()
        }
    }.build()
}
