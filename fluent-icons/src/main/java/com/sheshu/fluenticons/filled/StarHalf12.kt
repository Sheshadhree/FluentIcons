package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarHalf12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarHalf12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1.1f)
            curveToRelative(-0.285f, 0f, -0.57f, 0.149f, -0.716f, 0.446f)
            lineTo(4.171f, 3.798f)
            lineTo(1.686f, 4.16f)
            curveTo(1.03f, 4.255f, 0.768f, 5.061f, 1.242f, 5.524f)
            lineToRelative(1.8f, 1.753f)
            lineToRelative(-0.425f, 2.476f)
            curveToRelative(-0.112f, 0.654f, 0.574f, 1.152f, 1.16f, 0.844f)
            lineTo(6f, 9.428f)
            verticalLineTo(1.1f)
            close()
        }
    }.build()
}
