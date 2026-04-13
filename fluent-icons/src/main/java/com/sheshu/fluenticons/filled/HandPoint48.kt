package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HandPoint48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HandPoint48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 9.002f)
            curveToRelative(0f, -2.762f, 2.24f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5.004f, 2.238f, 5.004f, 5f)
            verticalLineToRelative(8.012f)
            lineToRelative(6.201f, 0.988f)
            curveToRelative(5.352f, 0.853f, 8.826f, 6.105f, 7.52f, 11.366f)
            lineToRelative(-2.375f, 9.555f)
            curveToRelative(-0.51f, 2.053f, -2.202f, 3.6f, -4.292f, 3.922f)
            lineToRelative(-7.07f, 1.09f)
            curveToRelative(-2.74f, 0.424f, -5.06f, -1.376f, -6.1f, -3.598f)
            curveToRelative(-1.564f, -3.338f, -5.32f, -7.831f, -16.585f, -12.785f)
            curveToRelative(-1.198f, -0.527f, -1.697f, -2.025f, -0.952f, -3.165f)
            curveToRelative(2.524f, -3.867f, 7.483f, -5.326f, 11.698f, -3.441f)
            lineTo(18f, 21.822f)
            verticalLineTo(9.002f)
            close()
        }
    }.build()
}
