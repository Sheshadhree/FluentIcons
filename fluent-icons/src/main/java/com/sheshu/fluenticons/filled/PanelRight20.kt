package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PanelRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 3f)
            curveToRelative(1.656f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.657f, -1.344f, 3f, -3f, 3f)
            horizontalLineTo(5f)
            curveToRelative(-1.656f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, 1.344f, -3f, 3f, -3f)
            horizontalLineToRelative(10f)
            close()
            moveTo(5f, 4f)
            curveTo(3.894f, 4f, 3f, 4.895f, 3f, 6f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.105f, 0.894f, 2f, 2f, 2f)
            horizontalLineToRelative(6.5f)
            verticalLineTo(4f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
