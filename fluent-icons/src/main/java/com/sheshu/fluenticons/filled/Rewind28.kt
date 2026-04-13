package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Rewind28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Rewind28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.364f, 4.858f)
            curveTo(13.43f, 4.013f, 15f, 4.772f, 15f, 6.13f)
            verticalLineToRelative(4.57f)
            lineToRelative(7.365f, -5.841f)
            curveTo(23.43f, 4.015f, 25f, 4.774f, 25f, 6.133f)
            verticalLineToRelative(15.739f)
            curveToRelative(0f, 1.359f, -1.57f, 2.117f, -2.634f, 1.273f)
            lineTo(15f, 17.305f)
            verticalLineToRelative(4.565f)
            curveToRelative(0f, 1.359f, -1.57f, 2.118f, -2.634f, 1.273f)
            lineToRelative(-9.637f, -7.64f)
            curveToRelative(-0.968f, -0.767f, -0.968f, -2.236f, 0f, -3.004f)
            lineToRelative(9.636f, -7.641f)
            close()
        }
    }.build()
}
