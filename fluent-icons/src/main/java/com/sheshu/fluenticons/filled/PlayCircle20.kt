package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PlayCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PlayCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(6f, -2.167f)
            verticalLineToRelative(4.334f)
            curveToRelative(0f, 0.577f, 0.625f, 0.938f, 1.125f, 0.65f)
            lineToRelative(4.125f, -2.384f)
            curveToRelative(0.155f, -0.09f, 0.25f, -0.255f, 0.25f, -0.433f)
            curveToRelative(0f, -0.179f, -0.095f, -0.344f, -0.25f, -0.433f)
            lineTo(9.125f, 7.184f)
            curveTo(8.625f, 6.894f, 8f, 7.256f, 8f, 7.834f)
            close()
        }
    }.build()
}
