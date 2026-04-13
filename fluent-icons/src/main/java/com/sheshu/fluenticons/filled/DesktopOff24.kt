package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DesktopOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DesktopOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(0.409f, 0.41f)
            curveTo(2.239f, 4.093f, 2f, 4.643f, 2f, 5.25f)
            verticalLineToRelative(10.502f)
            lineToRelative(0.005f, 0.154f)
            curveToRelative(0.08f, 1.17f, 1.054f, 2.096f, 2.245f, 2.096f)
            horizontalLineToRelative(4.249f)
            verticalLineTo(20.5f)
            horizontalLineTo(6.75f)
            lineToRelative(-0.102f, 0.007f)
            curveTo(6.282f, 20.557f, 6f, 20.87f, 6f, 21.25f)
            curveTo(6f, 21.664f, 6.336f, 22f, 6.75f, 22f)
            horizontalLineToRelative(10.5f)
            lineToRelative(0.102f, -0.007f)
            curveTo(17.718f, 21.943f, 18f, 21.63f, 18f, 21.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-1.751f)
            verticalLineToRelative(-2.498f)
            horizontalLineToRelative(1.442f)
            lineToRelative(3.778f, 3.779f)
            curveToRelative(0.293f, 0.292f, 0.768f, 0.292f, 1.061f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.061f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(22f, 15.752f)
            curveToRelative(0f, 0.83f, -0.45f, 1.556f, -1.12f, 1.946f)
            lineTo(6.181f, 3f)
            horizontalLineTo(19.75f)
            curveToRelative(1.19f, 0f, 2.166f, 0.925f, 2.245f, 2.096f)
            lineTo(22f, 5.25f)
            verticalLineToRelative(10.502f)
            close()
            moveToRelative(-8.001f, 2.25f)
            lineTo(14f, 20.5f)
            horizontalLineToRelative(-4f)
            lineToRelative(-0.001f, -2.498f)
            horizontalLineToRelative(4f)
            close()
        }
    }.build()
}
