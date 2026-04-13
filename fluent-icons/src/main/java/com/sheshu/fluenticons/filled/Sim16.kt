package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Sim16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Sim16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 1f)
            curveTo(4.12f, 1f, 3f, 2.12f, 3f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(3f, 13.88f, 4.12f, 15f, 5.5f, 15f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(5.328f)
            curveToRelative(0f, -0.663f, -0.263f, -1.299f, -0.732f, -1.767f)
            lineToRelative(-1.829f, -1.829f)
            curveTo(9.97f, 1.263f, 9.335f, 1f, 8.672f, 1f)
            horizontalLineTo(5.5f)
            close()
            moveToRelative(1f, 7f)
            horizontalLineTo(8f)
            verticalLineToRelative(5f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 13f, 5f, 12.328f, 5f, 11.5f)
            verticalLineToRelative(-2f)
            curveTo(5f, 8.672f, 5.672f, 8f, 6.5f, 8f)
            close()
            moveTo(9f, 8f)
            horizontalLineToRelative(0.5f)
            curveTo(10.328f, 8f, 11f, 8.672f, 11f, 9.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(9f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}
