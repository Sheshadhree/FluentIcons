package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnDownUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnDownUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.566f, 3.004f)
            curveToRelative(0.038f, 0.005f, 0.076f, 0.015f, 0.113f, 0.029f)
            curveToRelative(0.13f, 0.05f, 0.234f, 0.152f, 0.286f, 0.281f)
            lineToRelative(2f, 5f)
            curveToRelative(0.102f, 0.257f, -0.023f, 0.548f, -0.28f, 0.65f)
            curveToRelative(-0.256f, 0.103f, -0.547f, -0.022f, -0.65f, -0.278f)
            lineToRelative(-1.534f, -3.838f)
            lineToRelative(-4.59f, 11.524f)
            curveToRelative(-0.329f, 0.828f, -1.495f, 0.844f, -1.847f, 0.025f)
            lineTo(4.04f, 4.697f)
            curveTo(3.93f, 4.444f, 4.049f, 4.15f, 4.303f, 4.04f)
            curveTo(4.557f, 3.932f, 4.85f, 4.05f, 4.96f, 4.303f)
            lineToRelative(5.023f, 11.7f)
            lineTo(14.55f, 4.534f)
            lineToRelative(-3.826f, 1.912f)
            curveToRelative(-0.247f, 0.124f, -0.548f, 0.024f, -0.671f, -0.223f)
            curveToRelative(-0.124f, -0.247f, -0.023f, -0.548f, 0.224f, -0.671f)
            lineToRelative(4.982f, -2.49f)
            curveToRelative(0.092f, -0.051f, 0.2f, -0.073f, 0.307f, -0.059f)
            close()
        }
    }.build()
}
