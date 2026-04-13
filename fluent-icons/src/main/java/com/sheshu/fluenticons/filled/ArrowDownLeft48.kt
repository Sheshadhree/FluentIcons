package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDownLeft48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownLeft48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.5f, 42f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(26.328f, 39f, 25.5f, 39f)
            horizontalLineTo(11.121f)
            lineToRelative(30.44f, -30.44f)
            curveToRelative(0.585f, -0.585f, 0.585f, -1.535f, 0f, -2.12f)
            curveToRelative(-0.586f, -0.587f, -1.536f, -0.587f, -2.122f, 0f)
            lineTo(9f, 36.878f)
            verticalLineTo(22.5f)
            curveTo(9f, 21.672f, 8.328f, 21f, 7.5f, 21f)
            reflectiveCurveTo(6f, 21.672f, 6f, 22.5f)
            verticalLineToRelative(18f)
            curveTo(6f, 41.328f, 6.672f, 42f, 7.5f, 42f)
            horizontalLineToRelative(18f)
            close()
        }
    }.build()
}
