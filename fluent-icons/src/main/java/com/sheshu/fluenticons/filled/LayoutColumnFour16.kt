package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayoutColumnFour16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayoutColumnFour16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 14f)
            horizontalLineTo(11f)
            verticalLineTo(2f)
            horizontalLineTo(8.5f)
            verticalLineToRelative(12f)
            close()
            moveToRelative(-1f, -12f)
            horizontalLineTo(5f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(2f)
            close()
            moveToRelative(6.5f, 9.5f)
            curveToRelative(0f, 1.21f, -0.859f, 2.218f, -2f, 2.45f)
            verticalLineTo(2.05f)
            curveToRelative(1.141f, 0.232f, 2f, 1.24f, 2f, 2.45f)
            verticalLineToRelative(7f)
            close()
            moveTo(4f, 2.05f)
            curveTo(2.859f, 2.282f, 2f, 3.29f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.21f, 0.859f, 2.218f, 2f, 2.45f)
            verticalLineTo(2.05f)
            close()
        }
    }.build()
}
