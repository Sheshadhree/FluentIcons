package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TriangleRight12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TriangleRight12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.541f, 6.786f)
            curveToRelative(0.612f, -0.349f, 0.612f, -1.223f, 0f, -1.572f)
            lineTo(3.372f, 1.122f)
            curveTo(2.762f, 0.774f, 2f, 1.211f, 2f, 1.91f)
            verticalLineToRelative(8.18f)
            curveToRelative(0f, 0.698f, 0.762f, 1.135f, 1.372f, 0.787f)
            lineToRelative(7.17f, -4.092f)
            close()
        }
    }.build()
}
