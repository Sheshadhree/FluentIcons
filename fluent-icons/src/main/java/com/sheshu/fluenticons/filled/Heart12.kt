package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Heart12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Heart12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.656f, 2.737f)
            curveTo(4.702f, 1.758f, 3.159f, 1.753f, 2.209f, 2.728f)
            curveTo(1.26f, 3.702f, 1.264f, 5.286f, 2.22f, 6.264f)
            lineToRelative(3.53f, 3.623f)
            curveToRelative(0.146f, 0.15f, 0.384f, 0.15f, 0.53f, 0f)
            lineToRelative(3.513f, -3.602f)
            curveToRelative(0.947f, -0.977f, 0.944f, -2.556f, -0.01f, -3.535f)
            curveToRelative(-0.955f, -0.98f, -2.5f, -0.985f, -3.45f, -0.009f)
            lineTo(5.995f, 3.086f)
            lineToRelative(-0.34f, -0.35f)
            close()
        }
    }.build()
}
