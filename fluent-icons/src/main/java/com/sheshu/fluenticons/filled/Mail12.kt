package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Mail12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mail12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 5.248f)
            verticalLineTo(7.5f)
            curveTo(2f, 8.328f, 2.672f, 9f, 3.5f, 9f)
            horizontalLineToRelative(5f)
            curveTo(9.328f, 9f, 10f, 8.328f, 10f, 7.5f)
            verticalLineTo(5.248f)
            lineTo(6.205f, 6.956f)
            curveToRelative(-0.13f, 0.059f, -0.28f, 0.059f, -0.41f, 0f)
            lineTo(2f, 5.248f)
            close()
            moveToRelative(0.037f, -1.08f)
            lineTo(6f, 5.952f)
            lineToRelative(3.963f, -1.784f)
            curveTo(9.813f, 3.5f, 9.214f, 3f, 8.5f, 3f)
            horizontalLineToRelative(-5f)
            curveTo(2.786f, 3f, 2.188f, 3.5f, 2.037f, 4.168f)
            close()
        }
    }.build()
}
