package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneVerticalScroll24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneVerticalScroll24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.75f, 2f)
            curveTo(16.993f, 2f, 18f, 3.007f, 18f, 4.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-7.5f)
            curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(6f, 3.007f, 7.007f, 2f, 8.25f, 2f)
            horizontalLineToRelative(7.5f)
            close()
            moveToRelative(-2.036f, 11.475f)
            lineTo(12f, 15.225f)
            lineToRelative(-1.718f, -1.75f)
            curveToRelative(-0.29f, -0.296f, -0.765f, -0.3f, -1.06f, -0.01f)
            curveToRelative(-0.296f, 0.29f, -0.3f, 0.765f, -0.01f, 1.06f)
            lineToRelative(2.253f, 2.296f)
            curveToRelative(0.294f, 0.3f, 0.777f, 0.3f, 1.07f, 0f)
            lineToRelative(2.25f, -2.296f)
            curveToRelative(0.29f, -0.296f, 0.286f, -0.77f, -0.01f, -1.06f)
            curveToRelative(-0.296f, -0.29f, -0.77f, -0.286f, -1.06f, 0.01f)
            close()
            moveToRelative(1.072f, -3.954f)
            lineToRelative(-2.25f, -2.296f)
            curveToRelative(-0.268f, -0.273f, -0.69f, -0.297f, -0.987f, -0.075f)
            lineToRelative(-0.084f, 0.075f)
            lineTo(9.212f, 9.52f)
            curveToRelative(-0.29f, 0.295f, -0.286f, 0.77f, 0.01f, 1.06f)
            curveToRelative(0.269f, 0.264f, 0.685f, 0.284f, 0.977f, 0.064f)
            lineToRelative(0.083f, -0.074f)
            lineTo(12f, 8.821f)
            lineToRelative(1.714f, 1.75f)
            curveToRelative(0.29f, 0.296f, 0.765f, 0.3f, 1.061f, 0.01f)
            curveToRelative(0.269f, -0.263f, 0.297f, -0.68f, 0.082f, -0.975f)
            lineTo(14.786f, 9.52f)
            lineToRelative(-2.25f, -2.296f)
            lineToRelative(2.25f, 2.296f)
            close()
        }
    }.build()
}
