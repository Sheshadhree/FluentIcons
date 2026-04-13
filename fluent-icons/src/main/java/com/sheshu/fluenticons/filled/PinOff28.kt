package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PinOff28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PinOff28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(7.572f, 7.573f)
            lineToRelative(-3.625f, 1.394f)
            curveToRelative(-1.182f, 0.455f, -1.505f, 1.976f, -0.61f, 2.871f)
            lineTo(8.69f, 18.25f)
            lineTo(3f, 23.939f)
            verticalLineToRelative(1.06f)
            horizontalLineToRelative(1.06f)
            lineToRelative(5.69f, -5.689f)
            lineToRelative(3.132f, 3.132f)
            curveToRelative(0.895f, 0.895f, 2.416f, 0.573f, 2.87f, -0.61f)
            lineToRelative(1.395f, -3.625f)
            lineToRelative(7.572f, 7.573f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.061f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            close()
            moveToRelative(8.52f, 6.397f)
            lineToRelative(7.584f, 7.584f)
            lineToRelative(4.232f, -2.005f)
            curveToRelative(2.031f, -0.962f, 2.496f, -3.646f, 0.907f, -5.235f)
            lineTo(19.04f, 3.478f)
            curveToRelative(-1.59f, -1.59f, -4.274f, -1.125f, -5.236f, 0.907f)
            lineTo(11.8f, 8.617f)
            close()
        }
    }.build()
}
