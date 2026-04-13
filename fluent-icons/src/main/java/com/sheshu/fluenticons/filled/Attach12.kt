package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Attach12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Attach12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.977f, 2.806f)
            curveTo(8.307f, 2.225f, 7.3f, 2.26f, 6.673f, 2.888f)
            lineTo(3.28f, 6.28f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(3.392f, -3.393f)
            curveTo(6.796f, 0.643f, 8.694f, 0.576f, 9.96f, 1.672f)
            curveToRelative(1.423f, 1.234f, 1.474f, 3.426f, 0.11f, 4.725f)
            lineToRelative(-4.724f, 4.496f)
            curveToRelative(-0.756f, 0.719f, -1.947f, 0.704f, -2.685f, -0.034f)
            curveToRelative(-0.75f, -0.75f, -0.75f, -1.968f, 0f, -2.719f)
            lineToRelative(4.243f, -4.243f)
            curveToRelative(0.293f, -0.292f, 0.768f, -0.292f, 1.06f, 0f)
            curveToRelative(0.294f, 0.293f, 0.294f, 0.768f, 0f, 1.061f)
            lineTo(3.723f, 9.201f)
            curveToRelative(-0.165f, 0.165f, -0.165f, 0.433f, 0f, 0.598f)
            curveToRelative(0.162f, 0.162f, 0.424f, 0.165f, 0.59f, 0.007f)
            lineTo(9.035f, 5.31f)
            curveTo(9.76f, 4.622f, 9.732f, 3.46f, 8.977f, 2.806f)
            close()
        }
    }.build()
}
