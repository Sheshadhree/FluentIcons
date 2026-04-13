package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleLeft12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleLeft12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.459f, 6.786f)
            curveToRelative(-0.612f, -0.349f, -0.612f, -1.223f, 0f, -1.572f)
            lineToRelative(7.169f, -4.092f)
            curveTo(9.238f, 0.774f, 10f, 1.211f, 10f, 1.91f)
            verticalLineToRelative(8.182f)
            curveToRelative(0f, 0.698f, -0.762f, 1.135f, -1.372f, 0.787f)
            lineToRelative(-7.17f, -4.092f)
            close()
            moveTo(2.119f, 6f)
            lineToRelative(6.864f, 3.917f)
            verticalLineTo(2.083f)
            lineTo(2.119f, 6f)
            close()
        }
    }.build()
}
