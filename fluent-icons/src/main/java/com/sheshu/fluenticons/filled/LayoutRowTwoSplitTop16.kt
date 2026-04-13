package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayoutRowTwoSplitTop16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayoutRowTwoSplitTop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 7.5f)
            verticalLineTo(2f)
            horizontalLineToRelative(-3f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(5.5f)
            close()
            moveToRelative(1f, 0f)
            horizontalLineTo(14f)
            verticalLineToRelative(-3f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(5.5f)
            close()
            moveToRelative(5.5f, 1f)
            horizontalLineTo(2f)
            verticalLineToRelative(3f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
