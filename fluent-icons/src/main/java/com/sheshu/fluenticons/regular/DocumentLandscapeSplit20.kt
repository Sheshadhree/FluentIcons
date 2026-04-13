package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DocumentLandscapeSplit20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentLandscapeSplit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 16f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(9.414f)
            curveToRelative(0f, -0.398f, -0.158f, -0.78f, -0.44f, -1.06f)
            lineToRelative(-3.914f, -3.915f)
            curveTo(13.366f, 4.158f, 12.984f, 4f, 12.586f, 4f)
            horizontalLineTo(4f)
            curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(12f)
            close()
            moveToRelative(1f, -2f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-6f)
            verticalLineTo(5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineTo(17f)
            verticalLineToRelative(4f)
            close()
            moveTo(9f, 5f)
            verticalLineToRelative(10f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(5f)
            close()
            moveToRelative(4f, 3.5f)
            verticalLineTo(5.207f)
            lineTo(16.793f, 9f)
            horizontalLineTo(13.5f)
            curveTo(13.224f, 9f, 13f, 8.776f, 13f, 8.5f)
            close()
        }
    }.build()
}
