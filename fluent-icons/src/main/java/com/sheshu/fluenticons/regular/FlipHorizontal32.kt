package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlipHorizontal32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlipHorizontal32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(29.842f, 27.54f)
            curveTo(29.658f, 27.827f, 29.34f, 28f, 29f, 28f)
            horizontalLineTo(18f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.47f, 0.328f, -0.877f, 0.787f, -0.977f)
            curveToRelative(0.46f, -0.1f, 0.926f, 0.133f, 1.122f, 0.56f)
            lineToRelative(11f, 24f)
            curveToRelative(0.142f, 0.31f, 0.117f, 0.67f, -0.067f, 0.957f)
            close()
            moveTo(19f, 7.582f)
            verticalLineTo(26f)
            horizontalLineToRelative(8.442f)
            lineTo(19f, 7.582f)
            close()
            moveTo(3f, 28f)
            curveToRelative(-0.34f, 0f, -0.658f, -0.173f, -0.842f, -0.46f)
            curveToRelative(-0.183f, -0.287f, -0.209f, -0.647f, -0.067f, -0.957f)
            lineToRelative(11f, -24f)
            curveToRelative(0.196f, -0.427f, 0.663f, -0.66f, 1.122f, -0.56f)
            curveTo(14.673f, 2.123f, 15f, 2.53f, 15f, 3f)
            verticalLineToRelative(24f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
