package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Wallet16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Wallet16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 8f)
            curveTo(10.224f, 8f, 10f, 8.224f, 10f, 8.5f)
            reflectiveCurveTo(10.224f, 9f, 10.5f, 9f)
            horizontalLineToRelative(1f)
            curveTo(11.776f, 9f, 12f, 8.776f, 12f, 8.5f)
            reflectiveCurveTo(11.776f, 8f, 11.5f, 8f)
            horizontalLineToRelative(-1f)
            close()
            moveToRelative(-7f, -6f)
            curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
            verticalLineToRelative(8f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineTo(12f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.74f, -0.402f, -1.387f, -1f, -1.732f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(3.5f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineTo(11f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 4f, 3f, 3.776f, 3f, 3.5f)
            reflectiveCurveTo(3.224f, 3f, 3.5f, 3f)
            close()
            moveToRelative(0f, 2f)
            horizontalLineTo(12f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineTo(4.915f)
            curveTo(3.156f, 4.97f, 3.325f, 5f, 3.5f, 5f)
            close()
        }
    }.build()
}
