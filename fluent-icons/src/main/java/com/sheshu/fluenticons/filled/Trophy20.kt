package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Trophy20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Trophy20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 4f)
            curveToRelative(0.002f, -1.104f, 0.897f, -1.998f, 2f, -1.998f)
            horizontalLineToRelative(5f)
            curveToRelative(1.105f, 0f, 2f, 0.894f, 2f, 1.998f)
            horizontalLineToRelative(0.996f)
            curveToRelative(0.829f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(1.505f)
            curveToRelative(0f, 1.52f, -1.133f, 2.776f, -2.601f, 2.97f)
            curveToRelative(-0.41f, 1.858f, -1.97f, 3.285f, -3.894f, 3.498f)
            verticalLineToRelative(1.495f)
            horizontalLineToRelative(2.003f)
            curveToRelative(1.105f, 0f, 2f, 0.896f, 2f, 2f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-8f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.104f, 0.896f, -2f, 2f, -2f)
            horizontalLineToRelative(1.997f)
            verticalLineToRelative(-1.495f)
            curveTo(7.575f, 13.26f, 6.015f, 11.83f, 5.606f, 9.972f)
            curveToRelative(-1.468f, -0.195f, -2.61f, -1.45f, -2.61f, -2.974f)
            verticalLineTo(5.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.005f)
            close()
            moveToRelative(9f, 4.937f)
            curveToRelative(0.86f, -0.222f, 1.496f, -1.003f, 1.496f, -1.932f)
            verticalLineTo(5.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-0.995f)
            verticalLineToRelative(3.937f)
            close()
            moveTo(5.5f, 5f)
            horizontalLineTo(4.497f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(1.498f)
            curveToRelative(0f, 0.93f, 0.64f, 1.713f, 1.505f, 1.936f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}
