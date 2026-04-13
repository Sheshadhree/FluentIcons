package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnRightLeft20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnRightLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.004f, 14.566f)
            curveToRelative(0.005f, 0.038f, 0.015f, 0.076f, 0.029f, 0.113f)
            curveToRelative(0.05f, 0.13f, 0.152f, 0.234f, 0.281f, 0.286f)
            lineToRelative(5f, 2f)
            curveToRelative(0.257f, 0.102f, 0.548f, -0.023f, 0.65f, -0.28f)
            curveToRelative(0.103f, -0.256f, -0.022f, -0.547f, -0.278f, -0.65f)
            lineToRelative(-3.838f, -1.534f)
            lineToRelative(11.524f, -4.59f)
            curveToRelative(0.828f, -0.329f, 0.844f, -1.495f, 0.025f, -1.847f)
            lineTo(5.697f, 3.04f)
            curveTo(5.444f, 2.93f, 5.15f, 3.049f, 5.04f, 3.303f)
            curveTo(4.933f, 3.557f, 5.05f, 3.85f, 5.303f, 3.96f)
            lineToRelative(11.7f, 5.023f)
            lineTo(5.534f, 13.55f)
            lineToRelative(1.912f, -3.826f)
            curveTo(7.57f, 9.477f, 7.47f, 9.176f, 7.223f, 9.053f)
            curveTo(6.977f, 8.929f, 6.676f, 9.03f, 6.553f, 9.277f)
            lineToRelative(-2.49f, 4.982f)
            curveToRelative(-0.051f, 0.092f, -0.073f, 0.2f, -0.059f, 0.307f)
            close()
        }
    }.build()
}
