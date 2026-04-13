package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TriangleLeft12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TriangleLeft12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.459f, 5.214f)
            curveToRelative(-0.612f, 0.349f, -0.612f, 1.223f, 0f, 1.572f)
            lineToRelative(7.169f, 4.092f)
            curveTo(9.238f, 11.226f, 10f, 10.789f, 10f, 10.09f)
            verticalLineTo(1.908f)
            curveToRelative(0f, -0.697f, -0.762f, -1.134f, -1.372f, -0.786f)
            lineToRelative(-7.17f, 4.092f)
            close()
        }
    }.build()
}
