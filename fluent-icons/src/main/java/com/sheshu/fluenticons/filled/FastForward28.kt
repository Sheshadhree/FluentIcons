package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FastForward28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FastForward28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.636f, 4.857f)
            curveToRelative(-1.065f, -0.845f, -2.634f, -0.086f, -2.634f, 1.273f)
            verticalLineToRelative(4.57f)
            lineTo(5.636f, 4.858f)
            curveTo(4.571f, 4.014f, 3.002f, 4.773f, 3.002f, 6.132f)
            verticalLineTo(21.87f)
            curveToRelative(0f, 1.359f, 1.57f, 2.118f, 2.634f, 1.273f)
            lineToRelative(7.366f, -5.84f)
            verticalLineToRelative(4.565f)
            curveToRelative(0f, 1.359f, 1.57f, 2.118f, 2.634f, 1.273f)
            lineToRelative(9.637f, -7.64f)
            curveToRelative(0.968f, -0.767f, 0.968f, -2.236f, 0f, -3.004f)
            lineToRelative(-9.636f, -7.641f)
            close()
        }
    }.build()
}
