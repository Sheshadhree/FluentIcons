package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUpLeft48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUpLeft48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.5f, 6f)
            curveTo(26.328f, 6f, 27f, 6.672f, 27f, 7.5f)
            reflectiveCurveTo(26.328f, 9f, 25.5f, 9f)
            horizontalLineTo(11.121f)
            lineToRelative(30.44f, 30.44f)
            curveToRelative(0.585f, 0.585f, 0.585f, 1.535f, 0f, 2.12f)
            curveToRelative(-0.586f, 0.587f, -1.536f, 0.587f, -2.122f, 0f)
            lineTo(9f, 11.122f)
            verticalLineTo(25.5f)
            curveTo(9f, 26.328f, 8.328f, 27f, 7.5f, 27f)
            reflectiveCurveTo(6f, 26.328f, 6f, 25.5f)
            verticalLineToRelative(-18f)
            curveTo(6f, 6.672f, 6.672f, 6f, 7.5f, 6f)
            horizontalLineToRelative(18f)
            close()
        }
    }.build()
}
