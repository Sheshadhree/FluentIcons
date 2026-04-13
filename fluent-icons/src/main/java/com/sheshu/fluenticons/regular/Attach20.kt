package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Attach20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Attach20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.828f, 10.485f)
            lineToRelative(5.657f, -5.657f)
            curveToRelative(1.172f, -1.172f, 3.071f, -1.172f, 4.243f, 0f)
            curveToRelative(1.171f, 1.171f, 1.171f, 3.071f, 0f, 4.242f)
            lineTo(8.01f, 15.788f)
            curveToRelative(-0.586f, 0.586f, -1.535f, 0.586f, -2.121f, 0f)
            curveToRelative(-0.586f, -0.586f, -0.586f, -1.536f, 0f, -2.121f)
            lineToRelative(6.01f, -6.01f)
            curveToRelative(0.196f, -0.196f, 0.196f, -0.513f, 0f, -0.708f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineToRelative(-6.01f, 6.01f)
            curveToRelative(-0.977f, 0.977f, -0.977f, 2.56f, 0f, 3.536f)
            curveToRelative(0.976f, 0.976f, 2.559f, 0.976f, 3.535f, 0f)
            lineToRelative(6.718f, -6.717f)
            curveToRelative(1.562f, -1.562f, 1.562f, -4.095f, 0f, -5.657f)
            curveToRelative(-1.562f, -1.562f, -4.095f, -1.562f, -5.657f, 0f)
            lineTo(4.12f, 9.778f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            curveToRelative(0.195f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            close()
        }
    }.build()
}
