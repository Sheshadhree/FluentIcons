package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.System24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.System24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.946f, 5f)
            horizontalLineToRelative(14.108f)
            curveTo(20.678f, 5f, 22f, 6.304f, 22f, 7.92f)
            verticalLineToRelative(8.16f)
            curveToRelative(0f, 1.616f, -1.322f, 2.92f, -2.946f, 2.92f)
            horizontalLineTo(4.946f)
            curveTo(3.322f, 19f, 2f, 17.696f, 2f, 16.08f)
            verticalLineTo(7.92f)
            curveTo(2f, 6.304f, 3.322f, 5f, 4.946f, 5f)
            close()
            moveToRelative(0f, 2f)
            curveTo(4.42f, 7f, 4f, 7.415f, 4f, 7.92f)
            verticalLineToRelative(8.16f)
            curveTo(4f, 16.585f, 4.42f, 17f, 4.946f, 17f)
            horizontalLineToRelative(14.108f)
            curveTo(19.58f, 17f, 20f, 16.585f, 20f, 16.08f)
            verticalLineTo(7.92f)
            curveTo(20f, 7.415f, 19.58f, 7f, 19.054f, 7f)
            horizontalLineTo(4.946f)
            close()
        }
    }.build()
}
