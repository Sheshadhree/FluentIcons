package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PanelLeft28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelLeft28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.004f, 7.75f)
            curveTo(2.004f, 5.679f, 3.683f, 4f, 5.754f, 4f)
            horizontalLineTo(22.25f)
            curveTo(24.32f, 4f, 26f, 5.679f, 26f, 7.75f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 2.071f, -1.68f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(5.753f)
            curveToRelative(-2.071f, 0f, -3.75f, -1.679f, -3.75f, -3.75f)
            verticalLineTo(7.75f)
            close()
            moveTo(22.25f, 21.5f)
            curveToRelative(1.242f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(7.75f)
            curveToRelative(0f, -1.243f, -1.008f, -2.25f, -2.25f, -2.25f)
            horizontalLineTo(10.5f)
            verticalLineToRelative(16f)
            horizontalLineToRelative(11.75f)
            close()
        }
    }.build()
}
