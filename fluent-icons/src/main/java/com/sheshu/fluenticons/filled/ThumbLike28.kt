package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ThumbLike28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ThumbLike28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.124f, 1.115f)
            curveToRelative(-0.884f, -0.246f, -1.58f, 0.38f, -1.82f, 0.989f)
            lineToRelative(-0.26f, 0.66f)
            curveToRelative(-2.006f, 5.09f, -3.837f, 9.74f, -8.612f, 12.157f)
            curveToRelative(-1.101f, 0.558f, -1.868f, 1.765f, -1.648f, 3.086f)
            lineTo(4.2f, 20.503f)
            curveToRelative(0.238f, 1.428f, 1.277f, 2.592f, 2.669f, 2.99f)
            lineToRelative(7.69f, 2.196f)
            curveToRelative(3.783f, 1.081f, 7.685f, -1.29f, 8.469f, -5.146f)
            lineToRelative(1.228f, -6.046f)
            curveTo(24.728f, 12.173f, 22.952f, 10f, 20.58f, 10f)
            horizontalLineToRelative(-2.167f)
            curveToRelative(0.345f, -1.503f, 0.504f, -3.217f, 0.346f, -4.73f)
            curveToRelative(-0.184f, -1.77f, -0.858f, -3.659f, -2.636f, -4.154f)
            close()
        }
    }.build()
}
