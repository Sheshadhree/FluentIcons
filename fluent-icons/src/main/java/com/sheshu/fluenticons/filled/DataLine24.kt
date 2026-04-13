package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataLine24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataLine24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            curveToRelative(-0.162f, 0f, -0.321f, -0.013f, -0.476f, -0.037f)
            lineToRelative(-2.038f, 3.357f)
            curveTo(16.811f, 12.8f, 17f, 13.378f, 17f, 14f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            curveToRelative(-0.903f, 0f, -1.713f, -0.399f, -2.262f, -1.03f)
            lineToRelative(-3.742f, 1.87f)
            curveTo(7.999f, 17.894f, 8f, 17.948f, 8f, 18f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            curveToRelative(1.066f, 0f, 2.003f, 0.556f, 2.535f, 1.394f)
            lineToRelative(3.531f, -1.765f)
            curveTo(11.023f, 14.426f, 11f, 14.216f, 11f, 14f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            curveToRelative(0.482f, 0f, 0.938f, 0.114f, 1.341f, 0.316f)
            lineToRelative(1.798f, -2.963f)
            curveTo(16.445f, 7.803f, 16f, 6.953f, 16f, 6f)
            close()
        }
    }.build()
}
