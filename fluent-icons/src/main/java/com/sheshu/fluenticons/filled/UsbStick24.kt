package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.UsbStick24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.UsbStick24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.267f, 1.997f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineToRelative(0.007f, 0.102f)
            verticalLineToRelative(4.386f)
            curveToRelative(0.817f, 0.294f, 1.413f, 1.046f, 1.48f, 1.946f)
            lineToRelative(0.007f, 0.17f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 1.192f, -0.925f, 2.166f, -2.096f, 2.246f)
            lineTo(15.254f, 22f)
            horizontalLineToRelative(-6.5f)
            curveToRelative(-1.19f, 0f, -2.165f, -0.925f, -2.245f, -2.096f)
            lineTo(6.504f, 19.75f)
            verticalLineTo(9.25f)
            curveToRelative(0f, -0.985f, 0.632f, -1.822f, 1.513f, -2.127f)
            verticalLineTo(2.747f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.648f, -0.743f)
            lineToRelative(0.102f, -0.007f)
            horizontalLineToRelative(6.5f)
            close()
            moveToRelative(-0.75f, 1.5f)
            horizontalLineTo(9.516f)
            verticalLineToRelative(3.502f)
            horizontalLineToRelative(5.001f)
            verticalLineTo(3.497f)
            close()
        }
    }.build()
}
