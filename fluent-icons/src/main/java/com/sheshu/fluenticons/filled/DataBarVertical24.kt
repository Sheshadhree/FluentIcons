package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataBarVertical24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataBarVertical24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.75f, 3f)
            curveToRelative(1.24f, 0f, 2.247f, 1.007f, 2.247f, 2.25f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.249f, 2.25f)
            curveTo(4.507f, 21f, 3.5f, 19.993f, 3.5f, 18.75f)
            verticalLineTo(5.25f)
            curveTo(3.5f, 4.006f, 4.507f, 3f, 5.75f, 3f)
            close()
            moveToRelative(6.5f, 4f)
            curveToRelative(1.241f, 0f, 2.248f, 1.007f, 2.248f, 2.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.249f, 2.25f)
            curveTo(11.007f, 21f, 10f, 19.993f, 10f, 18.75f)
            verticalLineToRelative(-9.5f)
            curveTo(10f, 8.006f, 11.007f, 7f, 12.25f, 7f)
            close()
            moveToRelative(6.5f, 4f)
            curveToRelative(1.241f, 0f, 2.248f, 1.007f, 2.248f, 2.25f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.249f, 2.25f)
            curveToRelative(-1.242f, 0f, -2.249f, -1.007f, -2.249f, -2.25f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            close()
        }
    }.build()
}
