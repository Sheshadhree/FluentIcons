package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnLeftRight20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnLeftRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.996f, 14.566f)
            curveToRelative(-0.005f, 0.038f, -0.014f, 0.076f, -0.028f, 0.113f)
            curveToRelative(-0.05f, 0.13f, -0.152f, 0.234f, -0.282f, 0.286f)
            lineToRelative(-5f, 2f)
            curveToRelative(-0.256f, 0.102f, -0.547f, -0.023f, -0.65f, -0.28f)
            curveToRelative(-0.102f, -0.256f, 0.022f, -0.547f, 0.279f, -0.65f)
            lineToRelative(3.837f, -1.534f)
            lineToRelative(-11.524f, -4.59f)
            curveTo(1.8f, 9.583f, 1.784f, 8.417f, 2.603f, 8.065f)
            lineToRelative(11.7f, -5.023f)
            curveToRelative(0.254f, -0.11f, 0.548f, 0.008f, 0.657f, 0.262f)
            curveToRelative(0.109f, 0.254f, -0.009f, 0.548f, -0.262f, 0.657f)
            lineToRelative(-11.7f, 5.023f)
            lineToRelative(11.468f, 4.567f)
            lineToRelative(-1.913f, -3.826f)
            curveToRelative(-0.123f, -0.247f, -0.023f, -0.548f, 0.224f, -0.671f)
            curveToRelative(0.247f, -0.124f, 0.547f, -0.023f, 0.67f, 0.224f)
            lineToRelative(2.491f, 4.982f)
            curveToRelative(0.05f, 0.092f, 0.072f, 0.2f, 0.058f, 0.307f)
            close()
        }
    }.build()
}
