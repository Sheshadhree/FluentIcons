package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShapeUnion20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShapeUnion20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(6f)
            curveTo(2f, 11.88f, 3.12f, 13f, 4.5f, 13f)
            horizontalLineTo(7f)
            verticalLineToRelative(2.5f)
            curveTo(7f, 16.88f, 8.12f, 18f, 9.5f, 18f)
            horizontalLineToRelative(6f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-6f)
            curveTo(18f, 8.12f, 16.88f, 7f, 15.5f, 7f)
            horizontalLineTo(13f)
            verticalLineTo(4.5f)
            curveTo(13f, 3.12f, 11.88f, 2f, 10.5f, 2f)
            horizontalLineToRelative(-6f)
            close()
        }
    }.build()
}
