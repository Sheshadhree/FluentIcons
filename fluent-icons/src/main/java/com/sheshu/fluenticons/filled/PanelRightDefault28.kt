package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PanelRightDefault28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelRightDefault28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.251f, 4f)
            curveToRelative(2.07f, 0f, 3.75f, 1.68f, 3.75f, 3.75f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 2.07f, -1.68f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(5.754f)
            curveToRelative(-2.071f, 0f, -3.75f, -1.679f, -3.75f, -3.75f)
            verticalLineTo(7.75f)
            curveTo(2.004f, 5.679f, 3.683f, 4f, 5.754f, 4f)
            horizontalLineTo(22.25f)
            close()
            moveTo(5.754f, 5.5f)
            curveToRelative(-1.243f, 0f, -2.25f, 1.007f, -2.25f, 2.25f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(11.25f)
            verticalLineToRelative(-17f)
            horizontalLineTo(5.755f)
            close()
        }
    }.build()
}
