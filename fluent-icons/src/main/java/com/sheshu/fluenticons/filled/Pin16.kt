package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pin16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pin16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.059f, 2.445f)
            curveTo(9.347f, 1.731f, 8.147f, 1.91f, 7.673f, 2.8f)
            lineToRelative(-2.02f, 3.79f)
            lineToRelative(-2.811f, 0.937f)
            curveToRelative(-0.164f, 0.055f, -0.289f, 0.19f, -0.329f, 0.36f)
            curveToRelative(-0.04f, 0.168f, 0.01f, 0.345f, 0.134f, 0.468f)
            lineTo(4.793f, 10.5f)
            lineToRelative(-2.647f, 2.647f)
            lineTo(2f, 14f)
            lineToRelative(0.853f, -0.146f)
            lineTo(5.5f, 11.207f)
            lineToRelative(2.146f, 2.147f)
            curveToRelative(0.123f, 0.122f, 0.3f, 0.173f, 0.469f, 0.133f)
            curveToRelative(0.168f, -0.04f, 0.304f, -0.164f, 0.36f, -0.329f)
            lineToRelative(0.936f, -2.81f)
            lineToRelative(3.779f, -2.024f)
            curveToRelative(0.886f, -0.474f, 1.064f, -1.669f, 0.354f, -2.38f)
            lineToRelative(-3.484f, -3.5f)
            close()
        }
    }.build()
}
