package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Speaker120: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Speaker120",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 3.006f)
            curveToRelative(0f, -0.873f, -1.04f, -1.327f, -1.68f, -0.733f)
            lineTo(6.448f, 5.866f)
            curveTo(6.355f, 5.952f, 6.234f, 6f, 6.108f, 6f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 6f, 2f, 6.67f, 2f, 7.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 13.328f, 2.672f, 14f, 3.5f, 14f)
            horizontalLineToRelative(2.607f)
            curveToRelative(0.127f, 0f, 0.248f, 0.047f, 0.34f, 0.133f)
            lineToRelative(3.873f, 3.594f)
            curveToRelative(0.64f, 0.593f, 1.68f, 0.14f, 1.68f, -0.733f)
            verticalLineTo(3.006f)
            close()
            moveToRelative(2.079f, 9.927f)
            curveToRelative(-0.24f, -0.138f, -0.322f, -0.444f, -0.184f, -0.683f)
            curveToRelative(0.776f, -1.347f, 0.832f, -3.059f, 0f, -4.5f)
            curveToRelative(-0.139f, -0.24f, -0.057f, -0.545f, 0.182f, -0.683f)
            curveToRelative(0.24f, -0.138f, 0.545f, -0.056f, 0.683f, 0.183f)
            curveToRelative(1.018f, 1.763f, 0.948f, 3.855f, 0.001f, 5.5f)
            curveToRelative(-0.137f, 0.239f, -0.443f, 0.32f, -0.682f, 0.183f)
            close()
        }
    }.build()
}
