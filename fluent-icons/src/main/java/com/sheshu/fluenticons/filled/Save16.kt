package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Save16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Save16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 2f)
            verticalLineToRelative(2.5f)
            curveTo(5f, 5.328f, 5.672f, 6f, 6.5f, 6f)
            horizontalLineToRelative(2f)
            curveTo(9.328f, 6f, 10f, 5.328f, 10f, 4.5f)
            verticalLineTo(2f)
            horizontalLineToRelative(0.379f)
            curveToRelative(0.53f, 0f, 1.039f, 0.21f, 1.414f, 0.586f)
            lineToRelative(1.621f, 1.621f)
            curveTo(13.79f, 4.582f, 14f, 5.091f, 14f, 5.621f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            verticalLineTo(9.5f)
            curveTo(12f, 8.672f, 11.328f, 8f, 10.5f, 8f)
            horizontalLineToRelative(-5f)
            curveTo(4.673f, 8f, 4f, 8.669f, 4f, 9.498f)
            verticalLineTo(14f)
            curveToRelative(-1.104f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(1f)
            close()
            moveToRelative(1f, 0f)
            verticalLineToRelative(2.5f)
            curveTo(6f, 4.776f, 6.224f, 5f, 6.5f, 5f)
            horizontalLineToRelative(2f)
            curveTo(8.776f, 5f, 9f, 4.776f, 9f, 4.5f)
            verticalLineTo(2f)
            horizontalLineTo(6f)
            close()
            moveTo(5f, 14f)
            horizontalLineToRelative(6f)
            verticalLineTo(9.5f)
            curveTo(11f, 9.224f, 10.776f, 9f, 10.5f, 9f)
            horizontalLineToRelative(-5f)
            curveTo(5.223f, 9f, 5f, 9.223f, 5f, 9.498f)
            verticalLineTo(14f)
            close()
        }
    }.build()
}
