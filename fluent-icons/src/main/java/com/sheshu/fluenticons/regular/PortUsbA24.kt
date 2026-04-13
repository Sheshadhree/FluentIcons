package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PortUsbA24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PortUsbA24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 8f)
            horizontalLineTo(6f)
            curveTo(5.47f, 8.002f, 4.962f, 8.213f, 4.588f, 8.588f)
            curveTo(4.213f, 8.962f, 4.002f, 9.47f, 4f, 10f)
            verticalLineToRelative(4f)
            curveToRelative(0.002f, 0.53f, 0.213f, 1.038f, 0.588f, 1.412f)
            curveTo(4.962f, 15.787f, 5.47f, 15.998f, 6f, 16f)
            horizontalLineToRelative(12f)
            curveToRelative(0.53f, -0.002f, 1.038f, -0.213f, 1.413f, -0.588f)
            curveTo(19.787f, 15.038f, 19.998f, 14.53f, 20f, 14f)
            verticalLineToRelative(-4f)
            curveToRelative(-0.002f, -0.53f, -0.213f, -1.038f, -0.587f, -1.412f)
            curveTo(19.038f, 8.213f, 18.53f, 8.002f, 18f, 8f)
            close()
            moveTo(5.5f, 10f)
            curveToRelative(0f, -0.066f, 0.012f, -0.131f, 0.037f, -0.192f)
            curveToRelative(0.025f, -0.061f, 0.061f, -0.116f, 0.108f, -0.163f)
            curveToRelative(0.046f, -0.047f, 0.102f, -0.083f, 0.163f, -0.108f)
            curveTo(5.868f, 9.512f, 5.934f, 9.499f, 6f, 9.5f)
            horizontalLineToRelative(12f)
            curveToRelative(0.066f, 0f, 0.131f, 0.012f, 0.192f, 0.037f)
            curveToRelative(0.061f, 0.025f, 0.116f, 0.061f, 0.163f, 0.108f)
            reflectiveCurveToRelative(0.083f, 0.102f, 0.108f, 0.163f)
            curveTo(18.488f, 9.868f, 18.501f, 9.934f, 18.5f, 10f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-13f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}
