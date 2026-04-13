package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.777f, 9.313f)
            curveToRelative(-1.036f, -0.57f, -1.036f, -2.059f, 0f, -2.629f)
            lineToRelative(9.999f, -5.5f)
            curveToRelative(1f, -0.549f, 2.223f, 0.174f, 2.223f, 1.315f)
            verticalLineToRelative(10.999f)
            curveToRelative(0f, 1.14f, -1.223f, 1.864f, -2.223f, 1.314f)
            lineToRelative(-9.999f, -5.5f)
            close()
            moveTo(2.26f, 7.56f)
            curveToRelative(-0.345f, 0.19f, -0.345f, 0.687f, 0f, 0.877f)
            lineToRelative(9.999f, 5.499f)
            curveToRelative(0.333f, 0.183f, 0.74f, -0.058f, 0.74f, -0.438f)
            verticalLineTo(2.499f)
            curveToRelative(0f, -0.38f, -0.407f, -0.621f, -0.74f, -0.438f)
            lineToRelative(-9.999f, 5.5f)
            close()
        }
    }.build()
}
