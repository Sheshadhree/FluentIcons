package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TriangleLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TriangleLeft16",
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
        }
    }.build()
}
