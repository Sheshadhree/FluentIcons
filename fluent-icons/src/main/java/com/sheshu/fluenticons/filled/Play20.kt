package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Play20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Play20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.222f, 8.685f)
            curveToRelative(1.037f, 0.57f, 1.037f, 2.059f, 0f, 2.628f)
            lineToRelative(-10f, 5.498f)
            curveTo(6.223f, 17.36f, 5f, 16.637f, 5f, 15.496f)
            verticalLineTo(4.502f)
            curveToRelative(0f, -1.14f, 1.223f, -1.864f, 2.223f, -1.314f)
            lineToRelative(10f, 5.497f)
            close()
        }
    }.build()
}
