package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CaretLeft12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CaretLeft12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.299f, 3.282f)
            curveTo(6.93f, 2.659f, 8f, 3.107f, 8f, 3.994f)
            verticalLineToRelative(4.012f)
            curveTo(8f, 8.893f, 6.93f, 9.341f, 6.3f, 8.72f)
            lineTo(4.26f, 6.713f)
            curveToRelative(-0.398f, -0.392f, -0.398f, -1.034f, 0f, -1.425f)
            lineTo(6.3f, 3.282f)
            close()
        }
    }.build()
}
