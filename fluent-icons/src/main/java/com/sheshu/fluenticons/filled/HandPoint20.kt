package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HandPoint20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HandPoint20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 1.998f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(5.675f)
            lineTo(6.688f, 8.985f)
            curveToRelative(-1.57f, -0.825f, -3.51f, -0.356f, -4.53f, 1.095f)
            curveToRelative(-0.329f, 0.466f, -0.128f, 1.1f, 0.375f, 1.319f)
            curveToRelative(4.331f, 1.873f, 5.952f, 3.583f, 6.663f, 4.894f)
            curveToRelative(0.546f, 1.003f, 1.617f, 1.86f, 2.906f, 1.681f)
            lineToRelative(2.866f, -0.397f)
            curveToRelative(1.008f, -0.14f, 1.83f, -0.877f, 2.08f, -1.863f)
            lineToRelative(0.823f, -3.253f)
            curveToRelative(0.58f, -2.295f, -0.947f, -4.589f, -3.288f, -4.938f)
            lineTo(12f, 7.138f)
            verticalLineToRelative(-3.14f)
            curveToRelative(0f, -1.105f, -0.896f, -2f, -2f, -2f)
            close()
        }
    }.build()
}
