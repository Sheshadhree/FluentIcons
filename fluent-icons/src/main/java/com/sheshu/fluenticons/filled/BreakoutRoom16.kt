package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BreakoutRoom16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BreakoutRoom16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 7f)
            curveTo(7.88f, 7f, 9f, 8.12f, 9f, 9.5f)
            verticalLineToRelative(2f)
            curveTo(9f, 12.88f, 7.88f, 14f, 6.5f, 14f)
            horizontalLineToRelative(-2f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-2f)
            curveTo(2f, 8.12f, 3.12f, 7f, 4.5f, 7f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(5f, -5f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(8.948f)
            curveTo(9.597f, 13.365f, 10f, 12.48f, 10f, 11.5f)
            verticalLineToRelative(-2f)
            curveTo(10f, 7.567f, 8.433f, 6f, 6.5f, 6f)
            horizontalLineToRelative(-2f)
            curveTo(3.52f, 6f, 2.635f, 6.403f, 2f, 7.052f)
            verticalLineTo(4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            close()
        }
    }.build()
}
