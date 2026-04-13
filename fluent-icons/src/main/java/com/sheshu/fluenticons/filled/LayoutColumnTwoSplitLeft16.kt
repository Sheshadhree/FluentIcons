package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayoutColumnTwoSplitLeft16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayoutColumnTwoSplitLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 14f)
            horizontalLineToRelative(-3f)
            verticalLineTo(2f)
            horizontalLineToRelative(3f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveToRelative(-7f, -12f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(5.5f)
            horizontalLineTo(2f)
            verticalLineToRelative(-3f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            close()
            moveTo(2f, 8.5f)
            verticalLineToRelative(3f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(3f)
            verticalLineTo(8.5f)
            horizontalLineTo(2f)
            close()
        }
    }.build()
}
