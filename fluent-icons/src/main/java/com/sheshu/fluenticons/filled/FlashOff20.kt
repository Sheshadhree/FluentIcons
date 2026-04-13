package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlashOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlashOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.858f, 12.565f)
            lineToRelative(5.288f, 5.289f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(5.274f, 5.98f)
            lineTo(3.94f, 10.644f)
            curveToRelative(-0.194f, 0.679f, 0.316f, 1.354f, 1.022f, 1.354f)
            horizontalLineToRelative(1.267f)
            lineToRelative(-1.17f, 4.68f)
            curveToRelative(-0.264f, 1.055f, 1.04f, 1.777f, 1.795f, 0.995f)
            lineToRelative(5.004f, -5.108f)
            close()
            moveToRelative(3.673f, -3.75f)
            lineToRelative(-2.274f, 2.321f)
            lineTo(5.901f, 3.78f)
            lineTo(6.19f, 2.77f)
            curveTo(6.32f, 2.315f, 6.737f, 2f, 7.21f, 2f)
            horizontalLineToRelative(5.25f)
            curveToRelative(0.724f, 0f, 1.236f, 0.71f, 1.007f, 1.398f)
            lineToRelative(-0.002f, 0.008f)
            lineTo(12.204f, 7f)
            horizontalLineToRelative(2.564f)
            curveToRelative(0.946f, 0f, 1.407f, 1.144f, 0.766f, 1.811f)
            lineToRelative(-0.003f, 0.004f)
            close()
        }
    }.build()
}
