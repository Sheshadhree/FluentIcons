package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Window28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Window28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 3f)
            horizontalLineToRelative(14.5f)
            curveTo(23.321f, 3f, 25f, 4.679f, 25f, 6.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(6.75f)
            curveTo(4.679f, 25f, 3f, 23.321f, 3f, 21.25f)
            verticalLineTo(6.75f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            close()
            moveTo(4.5f, 9.5f)
            verticalLineToRelative(11.75f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(-19f)
            close()
            moveToRelative(19f, -1.5f)
            verticalLineTo(6.75f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineTo(6.75f)
            curveTo(5.507f, 4.5f, 4.5f, 5.507f, 4.5f, 6.75f)
            verticalLineTo(8f)
            horizontalLineToRelative(19f)
            close()
        }
    }.build()
}
