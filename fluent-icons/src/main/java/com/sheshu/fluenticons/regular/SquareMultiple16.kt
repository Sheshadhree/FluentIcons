package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SquareMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SquareMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.085f, 4f)
            curveTo(5.291f, 3.417f, 5.846f, 3f, 6.5f, 3f)
            horizontalLineTo(10f)
            curveToRelative(1.656f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.653f, -0.418f, 1.209f, -1f, 1.415f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.896f, -2f, -2f, -2f)
            horizontalLineTo(5.085f)
            close()
            moveTo(4.5f, 5f)
            horizontalLineToRelative(5f)
            curveTo(10.328f, 5f, 11f, 5.672f, 11f, 6.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineToRelative(-5f)
            curveTo(3f, 5.672f, 3.672f, 5f, 4.5f, 5f)
            close()
            moveToRelative(0f, 1f)
            curveTo(4.224f, 6f, 4f, 6.224f, 4f, 6.5f)
            verticalLineToRelative(5f)
            curveTo(4f, 11.776f, 4.224f, 12f, 4.5f, 12f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveTo(10f, 6.224f, 9.776f, 6f, 9.5f, 6f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
