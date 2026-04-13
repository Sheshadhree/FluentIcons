package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Lightbulb20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Lightbulb20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.073f, 15f)
            lineToRelative(-0.384f, 1.605f)
            curveToRelative(-0.184f, 0.771f, -0.865f, 1.33f, -1.67f, 1.39f)
            lineTo(10.874f, 18f)
            horizontalLineToRelative(-1.75f)
            curveToRelative(-0.818f, 0f, -1.535f, -0.516f, -1.776f, -1.262f)
            lineTo(7.31f, 16.605f)
            lineTo(6.928f, 15f)
            horizontalLineToRelative(6.145f)
            close()
            moveTo(10f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.597f, 6f, 5.8f)
            curveToRelative(0f, 1.677f, -0.745f, 3.216f, -2.204f, 4.594f)
            curveToRelative(-0.064f, 0.06f, -0.113f, 0.133f, -0.145f, 0.213f)
            lineToRelative(-0.026f, 0.081f)
            lineTo(13.311f, 14f)
            horizontalLineTo(6.689f)
            lineToRelative(-0.313f, -1.311f)
            curveToRelative(-0.027f, -0.112f, -0.086f, -0.214f, -0.17f, -0.295f)
            curveToRelative(-1.39f, -1.312f, -2.133f, -2.77f, -2.2f, -4.355f)
            lineTo(4f, 7.8f)
            lineToRelative(0.003f, -0.19f)
            curveTo(4.108f, 4.494f, 6.753f, 2f, 10f, 2f)
            close()
        }
    }.build()
}
