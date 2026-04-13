package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Triangle12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Triangle12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.786f, 1.459f)
            curveToRelative(-0.349f, -0.612f, -1.223f, -0.612f, -1.572f, 0f)
            lineTo(1.122f, 8.628f)
            curveTo(0.774f, 9.238f, 1.211f, 10f, 1.91f, 10f)
            horizontalLineToRelative(8.18f)
            curveToRelative(0.698f, 0f, 1.135f, -0.762f, 0.787f, -1.372f)
            lineToRelative(-4.092f, -7.17f)
            close()
        }
    }.build()
}
