package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PanelLeftHeader20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelLeftHeader20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 3f)
            curveTo(3.344f, 3f, 2f, 4.343f, 2f, 6f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.657f, 1.344f, 3f, 3f, 3f)
            horizontalLineToRelative(10f)
            curveToRelative(1.656f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.344f, -3f, -3f, -3f)
            horizontalLineTo(5f)
            close()
            moveToRelative(12f, 3f)
            verticalLineToRelative(1f)
            horizontalLineTo(8.5f)
            verticalLineTo(4f)
            horizontalLineTo(15f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(-2f, 9f)
            horizontalLineTo(8.5f)
            verticalLineTo(8f)
            horizontalLineTo(17f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            close()
        }
    }.build()
}
