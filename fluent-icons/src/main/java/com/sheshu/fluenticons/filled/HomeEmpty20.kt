package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HomeEmpty20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HomeEmpty20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.996f, 2.385f)
            curveToRelative(0.571f, -0.513f, 1.437f, -0.513f, 2.007f, 0f)
            lineToRelative(5.5f, 4.95f)
            curveTo(16.82f, 7.62f, 17f, 8.025f, 17f, 8.45f)
            verticalLineToRelative(7.055f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-11f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineTo(8.45f)
            curveToRelative(0f, -0.425f, 0.18f, -0.83f, 0.497f, -1.115f)
            lineToRelative(5.5f, -4.95f)
            close()
        }
    }.build()
}
