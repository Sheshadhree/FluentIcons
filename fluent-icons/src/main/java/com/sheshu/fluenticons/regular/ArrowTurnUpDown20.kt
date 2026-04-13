package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnUpDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnUpDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.566f, 16.996f)
            curveToRelative(0.038f, -0.005f, 0.076f, -0.014f, 0.113f, -0.028f)
            curveToRelative(0.13f, -0.05f, 0.234f, -0.152f, 0.286f, -0.282f)
            lineToRelative(2f, -5f)
            curveToRelative(0.102f, -0.256f, -0.023f, -0.547f, -0.28f, -0.65f)
            curveToRelative(-0.256f, -0.102f, -0.547f, 0.022f, -0.65f, 0.279f)
            lineToRelative(-1.534f, 3.837f)
            lineToRelative(-4.59f, -11.524f)
            curveTo(10.583f, 2.8f, 9.417f, 2.784f, 9.065f, 3.603f)
            lineToRelative(-5.023f, 11.7f)
            curveToRelative(-0.11f, 0.254f, 0.008f, 0.548f, 0.262f, 0.657f)
            curveToRelative(0.254f, 0.109f, 0.548f, -0.009f, 0.657f, -0.262f)
            lineToRelative(5.023f, -11.7f)
            lineToRelative(4.567f, 11.468f)
            lineToRelative(-3.826f, -1.913f)
            curveToRelative(-0.247f, -0.123f, -0.548f, -0.023f, -0.671f, 0.224f)
            curveToRelative(-0.124f, 0.247f, -0.023f, 0.547f, 0.224f, 0.67f)
            lineToRelative(4.982f, 2.491f)
            curveToRelative(0.092f, 0.05f, 0.2f, 0.072f, 0.307f, 0.058f)
            close()
        }
    }.build()
}
