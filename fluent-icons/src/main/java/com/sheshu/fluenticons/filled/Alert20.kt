package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Alert20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Alert20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.45f, 16.002f)
            curveTo(12.217f, 17.142f, 11.209f, 18f, 10f, 18f)
            reflectiveCurveToRelative(-2.218f, -0.858f, -2.45f, -1.998f)
            horizontalLineToRelative(4.9f)
            close()
            moveTo(9.998f, 2f)
            curveToRelative(3.149f, 0f, 5.744f, 2.335f, 5.984f, 5.355f)
            lineToRelative(0.013f, 0.223f)
            lineTo(16f, 7.802f)
            lineToRelative(-0.001f, 3.606f)
            lineToRelative(0.954f, 2.587f)
            lineToRelative(0.025f, 0.085f)
            lineToRelative(0.016f, 0.086f)
            lineToRelative(0.005f, 0.089f)
            curveToRelative(0f, 0.315f, -0.196f, 0.59f, -0.522f, 0.707f)
            lineToRelative(-0.114f, 0.033f)
            lineToRelative(-0.114f, 0.01f)
            horizontalLineTo(3.751f)
            curveToRelative(-0.088f, 0f, -0.176f, -0.016f, -0.259f, -0.047f)
            curveToRelative(-0.287f, -0.105f, -0.476f, -0.372f, -0.482f, -0.716f)
            lineToRelative(0.004f, -0.117f)
            lineToRelative(0.034f, -0.13f)
            lineToRelative(0.951f, -2.584f)
            lineTo(4f, 7.793f)
            lineToRelative(0.004f, -0.225f)
            curveTo(4.127f, 4.451f, 6.771f, 2f, 9.998f, 2f)
            close()
        }
    }.build()
}
