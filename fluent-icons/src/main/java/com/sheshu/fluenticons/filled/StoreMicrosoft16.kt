package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StoreMicrosoft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StoreMicrosoft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 3.5f)
            verticalLineTo(5f)
            horizontalLineTo(2.5f)
            curveTo(2.367f, 5f, 2.24f, 5.053f, 2.147f, 5.146f)
            curveTo(2.053f, 5.24f, 2f, 5.367f, 2f, 5.5f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5.5f)
            curveTo(14f, 5.224f, 13.776f, 5f, 13.5f, 5f)
            horizontalLineTo(11f)
            verticalLineTo(3.5f)
            curveTo(11f, 2.672f, 10.328f, 2f, 9.5f, 2f)
            horizontalLineToRelative(-3f)
            curveTo(5.672f, 2f, 5f, 2.672f, 5f, 3.5f)
            close()
            moveTo(6.5f, 3f)
            horizontalLineToRelative(3f)
            curveTo(9.776f, 3f, 10f, 3.224f, 10f, 3.5f)
            verticalLineTo(5f)
            horizontalLineTo(6f)
            verticalLineTo(3.5f)
            curveTo(6f, 3.224f, 6.224f, 3f, 6.5f, 3f)
            close()
            moveToRelative(-1f, 6f)
            verticalLineTo(7f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(0f, 3f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(5f, -3f)
            horizontalLineToRelative(-2f)
            verticalLineTo(7f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            close()
            moveToRelative(-2f, 3f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}
