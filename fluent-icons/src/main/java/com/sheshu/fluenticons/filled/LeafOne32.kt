package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LeafOne32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LeafOne32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.05f, 3.808f)
            curveToRelative(1.077f, -1.077f, 2.823f, -1.077f, 3.9f, 0f)
            lineToRelative(5.121f, 5.12f)
            curveToRelative(0.488f, 0.489f, 0.915f, 1.015f, 1.281f, 1.57f)
            curveToRelative(2.563f, 3.881f, 2.136f, 9.156f, -1.28f, 12.573f)
            lineToRelative(-0.08f, 0.079f)
            curveToRelative(-0.188f, 0.183f, -0.38f, 0.358f, -0.578f, 0.523f)
            curveToRelative(-1.581f, 1.324f, -3.475f, 2.083f, -5.414f, 2.277f)
            verticalLineTo(29f)
            curveToRelative(0f, 0.553f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.447f, -1f, -1f)
            verticalLineToRelative(-3.05f)
            curveToRelative(-1.662f, -0.166f, -3.291f, -0.747f, -4.718f, -1.744f)
            curveToRelative(-0.475f, -0.332f, -0.929f, -0.71f, -1.353f, -1.135f)
            curveTo(6.967f, 21.109f, 5.99f, 18.536f, 6f, 15.965f)
            curveToRelative(0.002f, -0.628f, 0.063f, -1.256f, 0.183f, -1.875f)
            curveToRelative(0.169f, -0.87f, 0.454f, -1.723f, 0.855f, -2.533f)
            curveToRelative(0.47f, -0.948f, 1.1f, -1.838f, 1.89f, -2.628f)
            lineToRelative(5.122f, -5.121f)
            close()
            moveTo(15f, 23.938f)
            curveToRelative(0.664f, 0.083f, 1.336f, 0.083f, 2f, 0f)
            verticalLineTo(15f)
            curveToRelative(0f, -0.553f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.447f, -1f, 1f)
            verticalLineToRelative(8.937f)
            close()
        }
    }.build()
}
