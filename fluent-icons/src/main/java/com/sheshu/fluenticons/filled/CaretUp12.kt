package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CaretUp12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CaretUp12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.076f, 7.383f)
            curveTo(3.231f, 7.756f, 3.596f, 8f, 4f, 8f)
            horizontalLineToRelative(4f)
            curveToRelative(0.405f, 0f, 0.77f, -0.244f, 0.924f, -0.617f)
            curveToRelative(0.155f, -0.374f, 0.07f, -0.804f, -0.217f, -1.09f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.39f, -0.39f, -1.023f, -0.39f, -1.414f, 0f)
            lineToRelative(-2f, 2f)
            curveTo(3.007f, 6.579f, 2.92f, 7.009f, 3.076f, 7.383f)
            close()
        }
    }.build()
}
