package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DocumentSquare20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentSquare20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.379f, 3f)
            curveToRelative(0.53f, 0f, 1.039f, 0.21f, 1.414f, 0.586f)
            lineToRelative(3.621f, 3.621f)
            curveTo(16.79f, 7.582f, 17f, 8.091f, 17f, 8.621f)
            verticalLineTo(15f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6.379f)
            close()
            moveTo(5f, 4f)
            curveTo(4.448f, 4f, 4f, 4.448f, 4f, 5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(9f)
            horizontalLineToRelative(-3.5f)
            curveTo(11.672f, 9f, 11f, 8.328f, 11f, 7.5f)
            verticalLineTo(4f)
            horizontalLineTo(5f)
            close()
            moveToRelative(7f, 3.5f)
            curveTo(12f, 7.776f, 12.224f, 8f, 12.5f, 8f)
            horizontalLineToRelative(3.283f)
            curveToRelative(-0.024f, -0.03f, -0.049f, -0.059f, -0.076f, -0.086f)
            lineToRelative(-3.621f, -3.621f)
            curveTo(12.059f, 4.266f, 12.03f, 4.24f, 12f, 4.217f)
            verticalLineTo(7.5f)
            close()
        }
    }.build()
}
