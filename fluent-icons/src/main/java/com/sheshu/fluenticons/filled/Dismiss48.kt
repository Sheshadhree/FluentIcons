package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Dismiss48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Dismiss48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.56f, 6.44f)
            curveToRelative(-0.585f, -0.587f, -1.535f, -0.587f, -2.12f, 0f)
            curveToRelative(-0.587f, 0.585f, -0.587f, 1.535f, 0f, 2.12f)
            lineTo(21.878f, 24f)
            lineTo(6.439f, 39.44f)
            curveToRelative(-0.585f, 0.585f, -0.585f, 1.535f, 0f, 2.12f)
            curveToRelative(0.587f, 0.586f, 1.536f, 0.586f, 2.122f, 0f)
            lineTo(24f, 26.121f)
            lineTo(39.439f, 41.56f)
            curveToRelative(0.585f, 0.586f, 1.535f, 0.586f, 2.12f, 0f)
            curveToRelative(0.587f, -0.586f, 0.587f, -1.536f, 0f, -2.121f)
            lineTo(26.122f, 24f)
            lineToRelative(15.44f, -15.439f)
            curveToRelative(0.585f, -0.586f, 0.585f, -1.535f, 0f, -2.121f)
            curveToRelative(-0.587f, -0.586f, -1.536f, -0.586f, -2.122f, 0f)
            lineTo(24f, 21.879f)
            lineTo(8.56f, 6.439f)
            close()
        }
    }.build()
}
