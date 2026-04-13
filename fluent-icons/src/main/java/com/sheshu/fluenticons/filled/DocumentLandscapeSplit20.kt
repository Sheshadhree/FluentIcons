package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentLandscapeSplit20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentLandscapeSplit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 8.5f)
            verticalLineTo(4f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(-4.5f)
            curveTo(12.672f, 10f, 12f, 9.328f, 12f, 8.5f)
            close()
            moveTo(9f, 16f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(12f)
            close()
            moveToRelative(4f, -7.5f)
            verticalLineTo(4.058f)
            curveToRelative(0.242f, 0.07f, 0.465f, 0.2f, 0.646f, 0.381f)
            lineToRelative(3.915f, 3.915f)
            curveToRelative(0.181f, 0.18f, 0.311f, 0.404f, 0.38f, 0.646f)
            horizontalLineTo(13.5f)
            curveTo(13.224f, 9f, 13f, 8.776f, 13f, 8.5f)
            close()
        }
    }.build()
}
