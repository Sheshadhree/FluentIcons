package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pin28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pin28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.039f, 3.478f)
            curveToRelative(-1.59f, -1.59f, -4.274f, -1.124f, -5.236f, 0.907f)
            lineToRelative(-2.553f, 5.39f)
            curveToRelative(-0.192f, 0.406f, -0.534f, 0.723f, -0.953f, 0.884f)
            lineToRelative(-4.13f, 1.588f)
            curveToRelative(-1.182f, 0.455f, -1.505f, 1.976f, -0.61f, 2.871f)
            lineTo(8.69f, 18.25f)
            lineTo(3f, 23.94f)
            verticalLineTo(25f)
            horizontalLineToRelative(1.06f)
            lineToRelative(5.69f, -5.69f)
            lineToRelative(3.132f, 3.132f)
            curveToRelative(0.895f, 0.895f, 2.416f, 0.573f, 2.87f, -0.61f)
            lineToRelative(1.589f, -4.13f)
            curveToRelative(0.161f, -0.419f, 0.478f, -0.76f, 0.884f, -0.953f)
            lineToRelative(5.39f, -2.553f)
            curveToRelative(2.031f, -0.962f, 2.496f, -3.646f, 0.907f, -5.235f)
            lineToRelative(-5.483f, -5.483f)
            close()
        }
    }.build()
}
