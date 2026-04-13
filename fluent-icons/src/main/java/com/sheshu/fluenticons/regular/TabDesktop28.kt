package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TabDesktop28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TabDesktop28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 3f)
            curveTo(4.679f, 3f, 3f, 4.679f, 3f, 6.75f)
            verticalLineToRelative(14.5f)
            curveTo(3f, 23.321f, 4.679f, 25f, 6.75f, 25f)
            horizontalLineToRelative(14.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(6.75f)
            curveTo(25f, 4.679f, 23.321f, 3f, 21.25f, 3f)
            horizontalLineTo(6.75f)
            close()
            moveTo(4.5f, 6.75f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineTo(13f)
            verticalLineToRelative(1.75f)
            curveTo(13f, 7.769f, 14.231f, 9f, 15.75f, 9f)
            horizontalLineToRelative(7.75f)
            verticalLineToRelative(12.25f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(6.75f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineTo(6.75f)
            close()
            moveToRelative(19f, 0.75f)
            horizontalLineToRelative(-7.75f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(4.5f)
            horizontalLineToRelative(6.75f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineTo(7.5f)
            close()
        }
    }.build()
}
