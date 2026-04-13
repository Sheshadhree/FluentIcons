package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarOneQuarter20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarOneQuarter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 5.137f)
            lineTo(7.174f, 6.81f)
            lineTo(2.857f, 7.438f)
            curveTo(2.037f, 7.557f, 1.71f, 8.565f, 2.303f, 9.143f)
            lineToRelative(3.124f, 3.045f)
            lineToRelative(-0.738f, 4.3f)
            curveToRelative(-0.114f, 0.665f, 0.434f, 1.202f, 1.037f, 1.17f)
            curveToRelative(0.138f, -0.008f, 0.279f, -0.045f, 0.415f, -0.117f)
            lineTo(8f, 16.564f)
            verticalLineTo(5.137f)
            close()
        }
    }.build()
}
