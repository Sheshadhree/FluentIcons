package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShareAndroid24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareAndroid24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 3.002f)
            curveToRelative(1.656f, 0f, 2.998f, 1.342f, 2.998f, 2.998f)
            curveToRelative(0f, 1.656f, -1.342f, 2.998f, -2.998f, 2.998f)
            curveToRelative(-0.842f, 0f, -1.603f, -0.347f, -2.148f, -0.906f)
            lineToRelative(-5.457f, 3.12f)
            curveTo(9.464f, 11.461f, 9.5f, 11.726f, 9.5f, 12f)
            reflectiveCurveToRelative(-0.036f, 0.537f, -0.105f, 0.789f)
            lineToRelative(5.458f, 3.119f)
            curveToRelative(0.545f, -0.56f, 1.305f, -0.906f, 2.147f, -0.906f)
            curveToRelative(1.656f, 0f, 2.998f, 1.342f, 2.998f, 2.998f)
            curveToRelative(0f, 1.656f, -1.342f, 2.998f, -2.998f, 2.998f)
            curveToRelative(-1.656f, 0f, -2.998f, -1.342f, -2.998f, -2.998f)
            curveToRelative(0f, -0.273f, 0.037f, -0.537f, 0.105f, -0.789f)
            lineToRelative(-5.457f, -3.12f)
            curveToRelative(-0.545f, 0.56f, -1.306f, 0.907f, -2.148f, 0.907f)
            curveToRelative(-1.656f, 0f, -2.998f, -1.342f, -2.998f, -2.998f)
            curveToRelative(0f, -1.656f, 1.342f, -2.998f, 2.998f, -2.998f)
            curveToRelative(0.842f, 0f, 1.603f, 0.347f, 2.147f, 0.906f)
            lineToRelative(5.458f, -3.12f)
            curveTo(14.039f, 6.539f, 14.002f, 6.274f, 14.002f, 6f)
            curveToRelative(0f, -1.656f, 1.342f, -2.998f, 2.998f, -2.998f)
            close()
        }
    }.build()
}
