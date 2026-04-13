package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Send24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Send24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.694f, 12f)
            lineTo(2.299f, 3.27f)
            curveTo(2.063f, 2.664f, 2.655f, 2.083f, 3.241f, 2.29f)
            lineToRelative(0.093f, 0.039f)
            lineToRelative(18f, 9f)
            curveToRelative(0.518f, 0.259f, 0.55f, 0.968f, 0.097f, 1.284f)
            lineToRelative(-0.097f, 0.058f)
            lineToRelative(-18f, 9f)
            curveToRelative(-0.583f, 0.291f, -1.216f, -0.245f, -1.065f, -0.848f)
            lineToRelative(0.03f, -0.095f)
            lineTo(5.694f, 12f)
            lineTo(2.299f, 3.27f)
            lineTo(5.694f, 12f)
            close()
            moveTo(4.402f, 4.54f)
            lineToRelative(2.61f, 6.71f)
            horizontalLineToRelative(6.627f)
            curveToRelative(0.38f, 0f, 0.693f, 0.282f, 0.743f, 0.648f)
            lineTo(14.389f, 12f)
            curveToRelative(0f, 0.38f, -0.282f, 0.693f, -0.649f, 0.743f)
            lineToRelative(-0.1f, 0.007f)
            horizontalLineTo(7.01f)
            lineToRelative(-2.609f, 6.71f)
            lineTo(19.322f, 12f)
            lineTo(4.401f, 4.54f)
            close()
        }
    }.build()
}
