package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Bluetooth16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Bluetooth16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.415f, 1.08f)
            curveTo(7.669f, 0.951f, 7.973f, 0.98f, 8.2f, 1.15f)
            lineToRelative(4f, 3f)
            curveToRelative(0.185f, 0.139f, 0.295f, 0.354f, 0.3f, 0.585f)
            curveToRelative(0.004f, 0.231f, -0.098f, 0.451f, -0.277f, 0.597f)
            lineTo(8.939f, 8f)
            lineToRelative(3.284f, 2.668f)
            curveToRelative(0.18f, 0.146f, 0.281f, 0.366f, 0.277f, 0.597f)
            curveToRelative(-0.005f, 0.23f, -0.115f, 0.446f, -0.3f, 0.585f)
            lineToRelative(-4f, 3f)
            curveToRelative(-0.227f, 0.17f, -0.531f, 0.198f, -0.785f, 0.07f)
            curveTo(7.16f, 14.795f, 7f, 14.535f, 7f, 14.25f)
            verticalLineTo(9.576f)
            lineToRelative(-2.777f, 2.256f)
            curveToRelative(-0.321f, 0.261f, -0.794f, 0.212f, -1.055f, -0.11f)
            curveToRelative(-0.261f, -0.32f, -0.212f, -0.793f, 0.11f, -1.054f)
            lineTo(6.56f, 8f)
            lineTo(3.277f, 5.332f)
            curveToRelative(-0.321f, -0.261f, -0.37f, -0.734f, -0.11f, -1.055f)
            curveToRelative(0.262f, -0.321f, 0.735f, -0.37f, 1.056f, -0.11f)
            lineTo(7f, 6.425f)
            verticalLineTo(1.75f)
            curveToRelative(0f, -0.284f, 0.16f, -0.544f, 0.415f, -0.67f)
            close()
            moveTo(8.5f, 9.575f)
            verticalLineToRelative(3.174f)
            lineToRelative(2.032f, -1.524f)
            lineTo(8.5f, 9.576f)
            close()
            moveToRelative(0f, -3.152f)
            lineToRelative(2.032f, -1.65f)
            lineTo(8.5f, 3.25f)
            verticalLineToRelative(3.174f)
            close()
        }
    }.build()
}
