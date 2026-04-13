package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CallEnd12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CallEnd12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2.999f)
            curveToRelative(-1.292f, 0f, -2.568f, 0.26f, -3.503f, 0.742f)
            curveToRelative(-0.911f, 0.47f, -1.67f, 1.261f, -1.462f, 2.34f)
            lineToRelative(0.101f, 0.65f)
            curveTo(1.26f, 7.52f, 1.976f, 8.074f, 2.768f, 7.995f)
            lineToRelative(0.774f, -0.078f)
            curveToRelative(0.68f, -0.068f, 1.227f, -0.587f, 1.332f, -1.262f)
            lineTo(4.957f, 6.12f)
            curveTo(5.164f, 6.064f, 5.512f, 6f, 6f, 6f)
            curveToRelative(0.49f, 0f, 0.837f, 0.064f, 1.044f, 0.12f)
            lineToRelative(0.083f, 0.534f)
            curveTo(7.232f, 7.329f, 7.78f, 7.848f, 8.459f, 7.916f)
            lineToRelative(0.774f, 0.077f)
            curveToRelative(0.792f, 0.08f, 1.509f, -0.474f, 1.631f, -1.262f)
            lineToRelative(0.102f, -0.65f)
            curveToRelative(0.208f, -1.079f, -0.551f, -1.87f, -1.462f, -2.34f)
            curveTo(8.57f, 3.258f, 7.292f, 2.999f, 6f, 2.999f)
            close()
        }
    }.build()
}
