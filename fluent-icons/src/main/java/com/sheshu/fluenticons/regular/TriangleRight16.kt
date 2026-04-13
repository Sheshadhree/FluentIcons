package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleRight16",
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
            moveTo(13.74f, 8.44f)
            curveToRelative(0.345f, -0.19f, 0.345f, -0.687f, 0f, -0.877f)
            lineToRelative(-10f, -5.499f)
            curveTo(3.408f, 1.881f, 3f, 2.122f, 3f, 2.502f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 0.38f, 0.408f, 0.622f, 0.741f, 0.439f)
            lineToRelative(9.999f, -5.5f)
            close()
        }
    }.build()
}
