package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataBarVerticalAscending24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataBarVerticalAscending24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.251f, 3f)
            curveToRelative(-1.242f, 0f, -2.249f, 1.007f, -2.249f, 2.25f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.249f, 2.25f)
            curveToRelative(1.242f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(5.25f)
            curveTo(20.5f, 4.006f, 19.492f, 3f, 18.25f, 3f)
            close()
            moveToRelative(-6.5f, 4f)
            curveToRelative(-1.242f, 0f, -2.249f, 1.007f, -2.249f, 2.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.249f, 2.25f)
            curveToRelative(1.242f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-9.5f)
            curveTo(14f, 8.006f, 12.992f, 7f, 11.75f, 7f)
            close()
            moveToRelative(-6.5f, 4f)
            curveToRelative(-1.242f, 0f, -2.249f, 1.007f, -2.249f, 2.25f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.249f, 2.25f)
            curveToRelative(1.242f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-5.5f)
            curveTo(7.5f, 12.006f, 6.492f, 11f, 5.25f, 11f)
            close()
        }
    }.build()
}
