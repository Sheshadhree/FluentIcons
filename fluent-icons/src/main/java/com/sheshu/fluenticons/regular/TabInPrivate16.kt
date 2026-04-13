package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TabInPrivate16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TabInPrivate16",
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
            moveTo(3f, 4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(2.293f)
            lineTo(3f, 6.293f)
            verticalLineTo(4f)
            close()
            moveToRelative(0f, 3.707f)
            lineTo(7.707f, 3f)
            horizontalLineToRelative(2.586f)
            lineTo(3f, 10.293f)
            verticalLineTo(7.707f)
            close()
            moveTo(11.707f, 3f)
            horizontalLineTo(12f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(0.293f)
            lineTo(4.293f, 13f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-0.293f)
            lineTo(11.707f, 3f)
            close()
            moveTo(13f, 5.707f)
            verticalLineToRelative(2.586f)
            lineTo(8.293f, 13f)
            horizontalLineTo(5.707f)
            lineTo(13f, 5.707f)
            close()
            moveToRelative(0f, 4f)
            verticalLineTo(12f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(9.707f)
            lineTo(13f, 9.707f)
            close()
        }
    }.build()
}
