package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Cursor32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cursor32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 4.553f)
            verticalLineToRelative(22.6f)
            lineToRelative(5.484f, -7.508f)
            curveToRelative(0.753f, -1.031f, 1.953f, -1.64f, 3.23f, -1.64f)
            horizontalLineToRelative(8.499f)
            lineTo(9f, 4.552f)
            close()
            moveTo(7f, 3.486f)
            curveTo(7f, 2.253f, 8.42f, 1.56f, 9.391f, 2.32f)
            lineToRelative(18.991f, 14.84f)
            curveToRelative(1.192f, 0.931f, 0.534f, 2.844f, -0.979f, 2.844f)
            horizontalLineToRelative(-9.69f)
            curveToRelative(-0.638f, 0f, -1.238f, 0.305f, -1.614f, 0.82f)
            lineToRelative(-6.225f, 8.523f)
            curveTo(8.966f, 30.59f, 7f, 29.948f, 7f, 28.41f)
            verticalLineTo(3.486f)
            close()
        }
    }.build()
}
