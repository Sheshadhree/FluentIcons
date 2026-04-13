package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PanelRight28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PanelRight28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.246f, 4f)
            curveToRelative(2.071f, 0f, 3.75f, 1.679f, 3.75f, 3.75f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(5.75f)
            curveTo(3.678f, 23f, 2f, 21.321f, 2f, 19.25f)
            verticalLineTo(7.75f)
            curveTo(2f, 5.679f, 3.679f, 4f, 5.75f, 4f)
            horizontalLineToRelative(16.496f)
            close()
            moveToRelative(2.25f, 3.75f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineTo(19f)
            verticalLineToRelative(16f)
            horizontalLineToRelative(3.246f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(7.75f)
            close()
            moveTo(17.5f, 21.5f)
            verticalLineToRelative(-16f)
            horizontalLineTo(5.75f)
            curveTo(4.507f, 5.5f, 3.5f, 6.507f, 3.5f, 7.75f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineTo(17.5f)
            close()
        }
    }.build()
}
