package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DiamondDismiss16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DiamondDismiss16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.732f, 9.769f)
            curveToRelative(-0.976f, -0.977f, -0.976f, -2.56f, 0f, -3.536f)
            lineToRelative(4.501f, -4.5f)
            curveToRelative(0.977f, -0.977f, 2.56f, -0.977f, 3.536f, 0f)
            lineToRelative(4.5f, 4.5f)
            curveToRelative(0.977f, 0.977f, 0.977f, 2.56f, 0f, 3.536f)
            lineToRelative(-4.5f, 4.5f)
            curveToRelative(-0.977f, 0.977f, -2.56f, 0.977f, -3.536f, 0f)
            lineToRelative(-4.5f, -4.5f)
            close()
            moveToRelative(4.622f, -4.123f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(7.293f, 8f)
            lineTo(5.646f, 9.646f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineTo(8f, 8.707f)
            lineToRelative(1.646f, 1.647f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            lineTo(8.707f, 8f)
            lineToRelative(1.647f, -1.646f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(8f, 7.293f)
            lineTo(6.354f, 5.646f)
            close()
        }
    }.build()
}
