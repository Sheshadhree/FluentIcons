package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Battery032: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Battery032",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 8f)
            curveTo(4.015f, 8f, 2f, 10.015f, 2f, 12.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 21.985f, 4.015f, 24f, 6.5f, 24f)
            horizontalLineToRelative(17f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineTo(19f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineTo(28f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            horizontalLineToRelative(-17f)
            close()
        }
    }.build()
}
