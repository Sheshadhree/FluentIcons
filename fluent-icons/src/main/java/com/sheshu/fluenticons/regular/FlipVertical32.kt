package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlipVertical32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlipVertical32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(27.54f, 2.158f)
            curveTo(27.827f, 2.342f, 28f, 2.66f, 28f, 3f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(3f)
            curveToRelative(-0.47f, 0f, -0.877f, -0.328f, -0.977f, -0.787f)
            curveToRelative(-0.1f, -0.46f, 0.133f, -0.926f, 0.56f, -1.122f)
            lineToRelative(24f, -11f)
            curveToRelative(0.31f, -0.142f, 0.67f, -0.117f, 0.957f, 0.067f)
            close()
            moveTo(7.582f, 13f)
            horizontalLineTo(26f)
            verticalLineTo(4.558f)
            lineTo(7.582f, 13f)
            close()
            moveTo(28f, 29f)
            curveToRelative(0f, 0.34f, -0.173f, 0.658f, -0.46f, 0.842f)
            curveToRelative(-0.287f, 0.184f, -0.647f, 0.209f, -0.957f, 0.067f)
            lineToRelative(-24f, -11f)
            curveToRelative(-0.427f, -0.196f, -0.66f, -0.663f, -0.56f, -1.122f)
            curveTo(2.123f, 17.327f, 2.53f, 17f, 3f, 17f)
            horizontalLineToRelative(24f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(11f)
            close()
        }
    }.build()
}
