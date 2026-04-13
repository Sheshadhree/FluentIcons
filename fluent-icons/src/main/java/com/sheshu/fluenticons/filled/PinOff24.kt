package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PinOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PinOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.292f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(5.905f, 5.905f)
            lineTo(4.81f, 10.33f)
            curveToRelative(-0.873f, 0.302f, -1.129f, 1.413f, -0.476f, 2.065f)
            lineTo(7.439f, 15.5f)
            lineTo(3f, 19.94f)
            verticalLineTo(21f)
            horizontalLineToRelative(1.06f)
            lineToRelative(4.44f, -4.44f)
            lineToRelative(3.105f, 3.105f)
            curveToRelative(0.652f, 0.653f, 1.764f, 0.397f, 2.065f, -0.476f)
            lineToRelative(1.145f, -3.313f)
            lineToRelative(5.905f, 5.904f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            close()
            moveToRelative(17.074f, 9.942f)
            lineToRelative(-3.34f, 1.67f)
            lineToRelative(-6.846f, -6.846f)
            lineToRelative(1.67f, -3.34f)
            curveToRelative(0.84f, -1.678f, 3.077f, -2.041f, 4.405f, -0.714f)
            lineToRelative(4.825f, 4.825f)
            curveToRelative(1.328f, 1.328f, 0.965f, 3.565f, -0.714f, 4.405f)
            close()
        }
    }.build()
}
