package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Call16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Call16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.756f, 7.024f)
            lineTo(7.83f, 6.04f)
            curveToRelative(0.6f, -0.551f, 0.807f, -1.412f, 0.52f, -2.176f)
            lineTo(7.892f, 2.641f)
            curveTo(7.537f, 1.693f, 6.505f, 1.185f, 5.537f, 1.48f)
            curveTo(3.821f, 2.005f, 2.502f, 3.6f, 2.908f, 5.495f)
            curveToRelative(0.267f, 1.246f, 0.778f, 2.81f, 1.746f, 4.474f)
            curveToRelative(0.97f, 1.668f, 2.078f, 2.9f, 3.028f, 3.766f)
            curveToRelative(1.434f, 1.305f, 3.484f, 0.979f, 4.803f, -0.251f)
            curveToRelative(0.734f, -0.684f, 0.809f, -1.821f, 0.171f, -2.596f)
            lineToRelative(-0.84f, -1.02f)
            curveToRelative(-0.519f, -0.63f, -1.367f, -0.882f, -2.145f, -0.637f)
            lineTo(8.283f, 9.668f)
            curveTo(8.229f, 9.613f, 8.168f, 9.548f, 8.1f, 9.472f)
            curveToRelative(-0.228f, -0.254f, -0.513f, -0.61f, -0.753f, -1.027f)
            curveTo(7.107f, 8.03f, 6.94f, 7.605f, 6.834f, 7.28f)
            curveTo(6.803f, 7.184f, 6.777f, 7.097f, 6.756f, 7.024f)
            close()
        }
    }.build()
}
