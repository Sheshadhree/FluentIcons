package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RibbonStar20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RibbonStar20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 8f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            close()
            moveTo(9.847f, 5.102f)
            lineTo(9.13f, 6.655f)
            curveToRelative(-0.025f, 0.055f, -0.078f, 0.093f, -0.138f, 0.1f)
            lineTo(7.293f, 6.957f)
            curveToRelative(-0.148f, 0.017f, -0.207f, 0.2f, -0.098f, 0.302f)
            lineTo(8.451f, 8.42f)
            curveToRelative(0.045f, 0.041f, 0.065f, 0.103f, 0.053f, 0.163f)
            lineTo(8.17f, 10.26f)
            curveToRelative(-0.03f, 0.147f, 0.126f, 0.26f, 0.257f, 0.187f)
            lineTo(9.92f, 9.612f)
            curveToRelative(0.053f, -0.03f, 0.118f, -0.03f, 0.171f, 0f)
            lineToRelative(1.492f, 0.835f)
            curveToRelative(0.13f, 0.073f, 0.287f, -0.04f, 0.258f, -0.187f)
            lineToRelative(-0.334f, -1.677f)
            curveToRelative(-0.012f, -0.06f, 0.008f, -0.122f, 0.053f, -0.163f)
            lineToRelative(1.256f, -1.161f)
            curveToRelative(0.11f, -0.101f, 0.05f, -0.285f, -0.099f, -0.302f)
            lineTo(11.02f, 6.755f)
            curveToRelative(-0.06f, -0.007f, -0.113f, -0.045f, -0.138f, -0.1f)
            lineToRelative(-0.717f, -1.553f)
            curveToRelative(-0.062f, -0.136f, -0.255f, -0.136f, -0.317f, 0f)
            close()
            moveTo(10f, 15f)
            curveToRelative(1.487f, 0f, 2.866f, -0.464f, 4f, -1.255f)
            verticalLineTo(17.5f)
            curveToRelative(0f, 0.187f, -0.105f, 0.359f, -0.271f, 0.444f)
            curveToRelative(-0.167f, 0.086f, -0.367f, 0.072f, -0.52f, -0.037f)
            lineTo(10f, 16f)
            lineToRelative(-3.21f, 1.907f)
            curveToRelative(-0.152f, 0.108f, -0.352f, 0.123f, -0.519f, 0.037f)
            curveTo(6.105f, 17.86f, 6f, 17.687f, 6f, 17.5f)
            verticalLineToRelative(-3.755f)
            curveTo(7.134f, 14.536f, 8.513f, 15f, 10f, 15f)
            close()
        }
    }.build()
}
