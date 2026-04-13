package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretLeft12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretLeft12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3.994f)
            curveTo(8f, 3.107f, 6.93f, 2.66f, 6.3f, 3.282f)
            lineTo(4.26f, 5.288f)
            curveToRelative(-0.398f, 0.391f, -0.398f, 1.033f, 0f, 1.425f)
            lineTo(6.3f, 8.719f)
            curveTo(6.93f, 9.34f, 8f, 8.893f, 8f, 8.006f)
            verticalLineTo(3.994f)
            close()
            moveTo(4.963f, 6f)
            lineTo(7f, 3.994f)
            verticalLineToRelative(4.012f)
            lineTo(4.963f, 6f)
            close()
        }
    }.build()
}
