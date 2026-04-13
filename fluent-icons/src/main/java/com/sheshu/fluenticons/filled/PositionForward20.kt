package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PositionForward20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PositionForward20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 14f)
            verticalLineToRelative(1.5f)
            curveTo(7f, 16.88f, 8.12f, 18f, 9.5f, 18f)
            horizontalLineToRelative(6f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-6f)
            curveTo(18f, 8.12f, 16.88f, 7f, 15.5f, 7f)
            horizontalLineTo(14f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1.5f)
            curveTo(16.328f, 8f, 17f, 8.672f, 17f, 9.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-6f)
            curveTo(8.672f, 17f, 8f, 16.328f, 8f, 15.5f)
            verticalLineTo(14f)
            horizontalLineTo(7f)
            close()
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(6f)
            curveTo(11.88f, 2f, 13f, 3.12f, 13f, 4.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-6f)
            curveTo(3.12f, 13f, 2f, 11.88f, 2f, 10.5f)
            verticalLineToRelative(-6f)
            close()
        }
    }.build()
}
