package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 6.5f)
            verticalLineTo(2f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 2f, 4f, 2.672f, 4f, 3.5f)
            verticalLineToRelative(11f)
            curveTo(4f, 15.328f, 4.672f, 16f, 5.5f, 16f)
            horizontalLineToRelative(8f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(-4.5f)
            curveTo(9.672f, 8f, 9f, 7.328f, 9f, 6.5f)
            close()
            moveToRelative(1f, 0f)
            verticalLineTo(2.25f)
            lineTo(14.75f, 7f)
            horizontalLineTo(10.5f)
            curveTo(10.224f, 7f, 10f, 6.776f, 10f, 6.5f)
            close()
            moveTo(17f, 9f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(6.06f)
            curveToRelative(2.176f, 0f, 3.94f, -1.764f, 3.94f, -3.94f)
            verticalLineTo(9f)
            close()
        }
    }.build()
}
