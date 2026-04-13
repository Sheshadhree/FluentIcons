package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlashOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlashOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.436f, 15.497f)
            lineToRelative(6.283f, 6.284f)
            curveToRelative(0.293f, 0.292f, 0.768f, 0.292f, 1.061f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.061f)
            lineTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineTo(5.939f, 7f)
            lineToRelative(-1.836f, 5.153f)
            curveToRelative(-0.405f, 1.137f, 0.435f, 2.333f, 1.642f, 2.337f)
            lineToRelative(1.568f, 0.006f)
            lineToRelative(-1.269f, 5.668f)
            curveToRelative(-0.33f, 1.478f, 1.487f, 2.46f, 2.541f, 1.372f)
            lineToRelative(5.851f, -6.039f)
            close()
            moveToRelative(5.21f, -5.377f)
            lineToRelative(-3.122f, 3.222f)
            lineToRelative(-9.47f, -9.47f)
            lineToRelative(0.37f, -1.042f)
            curveTo(7.601f, 2.332f, 8.073f, 2f, 8.602f, 2f)
            horizontalLineToRelative(6.453f)
            curveToRelative(0.853f, 0f, 1.456f, 0.836f, 1.186f, 1.645f)
            lineTo(14.79f, 8f)
            horizontalLineToRelative(3.958f)
            curveToRelative(1.104f, 0f, 1.666f, 1.327f, 0.898f, 2.12f)
            close()
        }
    }.build()
}
