package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Directions16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Directions16",
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
            moveToRelative(7.122f, -5.123f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineTo(8.793f, 6f)
            horizontalLineTo(7.5f)
            curveTo(6.672f, 6f, 6f, 6.672f, 6f, 7.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(7f, 10.276f, 7f, 10f)
            verticalLineTo(7.5f)
            curveTo(7f, 7.224f, 7.224f, 7f, 7.5f, 7f)
            horizontalLineToRelative(1.293f)
            lineTo(8.147f, 7.646f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-1.5f, -1.5f)
            close()
        }
    }.build()
}
