package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Play32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Play32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.225f, 4.462f)
            curveTo(9.89f, 3.142f, 7f, 4.827f, 7f, 7.508f)
            verticalLineTo(24.5f)
            curveToRelative(0f, 2.682f, 2.892f, 4.367f, 5.226f, 3.045f)
            lineToRelative(14.997f, -8.498f)
            curveToRelative(2.367f, -1.341f, 2.366f, -4.751f, 0f, -6.091f)
            lineTo(12.224f, 4.462f)
            close()
        }
    }.build()
}
