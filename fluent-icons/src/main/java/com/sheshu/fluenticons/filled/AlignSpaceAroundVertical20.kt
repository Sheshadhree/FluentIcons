package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignSpaceAroundVertical20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignSpaceAroundVertical20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 16f)
            curveTo(8.328f, 16f, 9f, 15.328f, 9f, 14.5f)
            verticalLineToRelative(-9f)
            curveTo(9f, 4.672f, 8.328f, 4f, 7.5f, 4f)
            horizontalLineToRelative(-2f)
            curveTo(4.672f, 4f, 4f, 4.672f, 4f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(4f, 15.328f, 4.672f, 16f, 5.5f, 16f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(7f, 0f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-9f)
            curveTo(16f, 4.672f, 15.328f, 4f, 14.5f, 4f)
            horizontalLineToRelative(-2f)
            curveTo(11.672f, 4f, 11f, 4.672f, 11f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            close()
        }
    }.build()
}
