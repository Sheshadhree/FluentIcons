package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Save20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Save20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(3.5f)
            curveTo(6f, 7.328f, 6.672f, 8f, 7.5f, 8f)
            horizontalLineToRelative(4f)
            curveTo(12.328f, 8f, 13f, 7.328f, 13f, 6.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(0.379f)
            curveToRelative(0.53f, 0f, 1.039f, 0.21f, 1.414f, 0.586f)
            lineToRelative(1.621f, 1.621f)
            curveTo(16.79f, 5.582f, 17f, 6.091f, 17f, 6.621f)
            verticalLineTo(15f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            curveTo(5.672f, 10f, 5f, 10.672f, 5f, 11.5f)
            verticalLineTo(17f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            close()
            moveToRelative(9f, -2f)
            horizontalLineTo(7f)
            verticalLineToRelative(3.5f)
            curveTo(7f, 6.776f, 7.224f, 7f, 7.5f, 7f)
            horizontalLineToRelative(4f)
            curveTo(11.776f, 7f, 12f, 6.776f, 12f, 6.5f)
            verticalLineTo(3f)
            close()
            moveToRelative(2f, 8.5f)
            verticalLineTo(17f)
            horizontalLineTo(6f)
            verticalLineToRelative(-5.5f)
            curveTo(6f, 11.224f, 6.224f, 11f, 6.5f, 11f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            close()
        }
    }.build()
}
