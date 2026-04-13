package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowReply48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowReply48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.56f, 10.56f)
            curveToRelative(0.586f, -0.585f, 0.586f, -1.535f, 0f, -2.12f)
            curveToRelative(-0.585f, -0.586f, -1.535f, -0.586f, -2.12f, 0f)
            lineToRelative(-11f, 11f)
            curveToRelative(-0.587f, 0.585f, -0.587f, 1.535f, 0f, 2.12f)
            lineToRelative(11f, 11f)
            curveToRelative(0.585f, 0.586f, 1.535f, 0.586f, 2.12f, 0f)
            curveToRelative(0.586f, -0.585f, 0.586f, -1.535f, 0f, -2.12f)
            lineTo(9.122f, 22f)
            horizontalLineTo(24.5f)
            curveTo(33.613f, 22f, 41f, 29.387f, 41f, 38.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            curveTo(44f, 27.73f, 35.27f, 19f, 24.5f, 19f)
            horizontalLineTo(9.121f)
            lineToRelative(8.44f, -8.44f)
            close()
        }
    }.build()
}
