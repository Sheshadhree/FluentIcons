package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HourglassHalf16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HourglassHalf16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.025f, 13f)
            horizontalLineToRelative(5.946f)
            curveToRelative(-0.054f, -0.52f, -0.179f, -0.868f, -0.31f, -1.114f)
            curveToRelative(-0.164f, -0.31f, -0.386f, -0.55f, -0.681f, -0.806f)
            curveToRelative(-0.11f, -0.095f, -0.209f, -0.174f, -0.323f, -0.267f)
            lineToRelative(-0.186f, -0.151f)
            curveToRelative(-0.181f, -0.149f, -0.405f, -0.338f, -0.613f, -0.56f)
            curveTo(8.401f, 9.614f, 8f, 8.937f, 8f, 8f)
            curveToRelative(0f, 0.938f, -0.402f, 1.614f, -0.86f, 2.103f)
            curveToRelative(-0.208f, 0.222f, -0.431f, 0.41f, -0.613f, 0.56f)
            lineToRelative(-0.186f, 0.15f)
            curveToRelative(-0.115f, 0.093f, -0.213f, 0.173f, -0.323f, 0.268f)
            curveToRelative(-0.296f, 0.256f, -0.518f, 0.495f, -0.683f, 0.805f)
            curveToRelative(-0.13f, 0.247f, -0.256f, 0.595f, -0.31f, 1.114f)
            close()
        }
    }.build()
}
