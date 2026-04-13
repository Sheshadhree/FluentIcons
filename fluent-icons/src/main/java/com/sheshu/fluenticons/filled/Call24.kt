package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Call24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Call24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.772f, 2.439f)
            lineTo(8.85f, 2.095f)
            curveToRelative(1.008f, -0.322f, 2.086f, 0.199f, 2.518f, 1.217f)
            lineToRelative(0.86f, 2.028f)
            curveToRelative(0.375f, 0.883f, 0.167f, 1.922f, -0.514f, 2.568f)
            lineTo(9.82f, 9.706f)
            curveToRelative(0.117f, 1.076f, 0.478f, 2.135f, 1.084f, 3.177f)
            curveToRelative(0.606f, 1.043f, 1.364f, 1.908f, 2.271f, 2.595f)
            lineToRelative(2.276f, -0.76f)
            curveToRelative(0.862f, -0.287f, 1.801f, 0.044f, 2.33f, 0.821f)
            lineToRelative(1.232f, 1.81f)
            curveToRelative(0.616f, 0.904f, 0.505f, 2.15f, -0.258f, 2.916f)
            lineToRelative(-0.818f, 0.821f)
            curveToRelative(-0.814f, 0.817f, -1.976f, 1.114f, -3.052f, 0.778f)
            curveToRelative(-2.539f, -0.792f, -4.873f, -3.143f, -7.003f, -7.053f)
            curveToRelative(-2.133f, -3.916f, -2.885f, -7.24f, -2.258f, -9.968f)
            curveToRelative(0.264f, -1.148f, 1.082f, -2.063f, 2.15f, -2.404f)
            close()
        }
    }.build()
}
