package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Shapes16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Shapes16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 5.5f)
            curveTo(1f, 3.015f, 3.015f, 1f, 5.5f, 1f)
            curveToRelative(2.316f, 0f, 4.224f, 1.75f, 4.473f, 4f)
            horizontalLineTo(8.5f)
            curveTo(6.567f, 5f, 5f, 6.567f, 5f, 8.5f)
            verticalLineToRelative(1.473f)
            curveTo(2.75f, 9.723f, 1f, 7.816f, 1f, 5.5f)
            close()
            moveTo(8.5f, 6f)
            curveTo(7.12f, 6f, 6f, 7.12f, 6f, 8.5f)
            verticalLineToRelative(4f)
            curveTo(6f, 13.88f, 7.12f, 15f, 8.5f, 15f)
            horizontalLineToRelative(4f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-4f)
            curveTo(15f, 7.12f, 13.88f, 6f, 12.5f, 6f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
