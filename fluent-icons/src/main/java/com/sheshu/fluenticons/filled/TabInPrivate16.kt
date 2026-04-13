package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabInPrivate16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabInPrivate16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 2f)
            curveTo(2.895f, 2f, 2f, 2.895f, 2f, 4f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            close()
            moveTo(3.5f, 4f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1.793f)
            lineTo(3.5f, 5.793f)
            verticalLineTo(4f)
            close()
            moveToRelative(0f, 3.207f)
            lineTo(7.207f, 3.5f)
            horizontalLineToRelative(2.586f)
            lineTo(3.5f, 9.793f)
            verticalLineTo(7.207f)
            close()
            moveTo(11.207f, 3.5f)
            horizontalLineTo(12f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(0.793f)
            lineTo(4.793f, 12.5f)
            horizontalLineTo(4f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-0.793f)
            lineTo(11.207f, 3.5f)
            close()
            moveTo(12.5f, 6.207f)
            verticalLineToRelative(2.586f)
            lineTo(8.793f, 12.5f)
            horizontalLineTo(6.207f)
            lineTo(12.5f, 6.207f)
            close()
            moveToRelative(0f, 4f)
            verticalLineTo(12f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-1.793f)
            lineToRelative(2.293f, -2.293f)
            close()
        }
    }.build()
}
