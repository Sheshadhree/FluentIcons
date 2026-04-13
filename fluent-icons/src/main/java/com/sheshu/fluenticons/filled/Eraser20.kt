package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Eraser20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Eraser20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.197f, 2.44f)
            curveToRelative(0.586f, -0.587f, 1.536f, -0.587f, 2.121f, 0f)
            lineToRelative(4.243f, 4.242f)
            curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0f, 2.121f)
            lineTo(9.364f, 17f)
            horizontalLineTo(14.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(14.776f, 18f, 14.5f, 18f)
            horizontalLineTo(7.82f)
            curveToRelative(-0.41f, 0.022f, -0.827f, -0.124f, -1.14f, -0.437f)
            lineTo(2.437f, 13.32f)
            curveToRelative(-0.585f, -0.585f, -0.585f, -1.535f, 0f, -2.121f)
            lineToRelative(8.76f, -8.76f)
            close()
            moveTo(9.781f, 15.168f)
            lineToRelative(-4.95f, -4.95f)
            lineToRelative(-1.687f, 1.687f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(4.243f, 4.243f)
            curveToRelative(0.195f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            lineToRelative(1.687f, -1.687f)
            close()
        }
    }.build()
}
