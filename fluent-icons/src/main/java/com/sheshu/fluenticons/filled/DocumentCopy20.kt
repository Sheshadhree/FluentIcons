package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentCopy20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentCopy20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 6.5f)
            verticalLineTo(2f)
            horizontalLineTo(7.5f)
            curveTo(6.672f, 2f, 6f, 2.672f, 6f, 3.5f)
            verticalLineToRelative(11f)
            curveTo(6f, 15.328f, 6.672f, 16f, 7.5f, 16f)
            horizontalLineToRelative(8f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(-4.5f)
            curveTo(11.672f, 8f, 11f, 7.328f, 11f, 6.5f)
            close()
            moveToRelative(1f, 0f)
            verticalLineTo(2.25f)
            lineTo(16.75f, 7f)
            horizontalLineTo(12.5f)
            curveTo(12.224f, 7f, 12f, 6.776f, 12f, 6.5f)
            close()
            moveTo(4f, 5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            verticalLineToRelative(10.5f)
            curveTo(5f, 15.88f, 6.12f, 17f, 7.5f, 17f)
            horizontalLineTo(15f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(7.548f)
            curveTo(5.588f, 18f, 4f, 16.411f, 4f, 14.452f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}
