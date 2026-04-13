package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Wallet16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Wallet16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.5f)
            curveTo(2f, 2.672f, 2.672f, 2f, 3.5f, 2f)
            horizontalLineTo(11f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(0.268f)
            curveTo(13.598f, 4.613f, 14f, 5.26f, 14f, 6f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-8f)
            close()
            moveToRelative(1f, 0f)
            curveTo(3f, 3.776f, 3.224f, 4f, 3.5f, 4f)
            horizontalLineTo(12f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 3f, 3f, 3.224f, 3f, 3.5f)
            close()
            moveTo(10.5f, 8f)
            curveTo(10.224f, 8f, 10f, 8.224f, 10f, 8.5f)
            reflectiveCurveTo(10.224f, 9f, 10.5f, 9f)
            horizontalLineToRelative(1f)
            curveTo(11.776f, 9f, 12f, 8.776f, 12f, 8.5f)
            reflectiveCurveTo(11.776f, 8f, 11.5f, 8f)
            horizontalLineToRelative(-1f)
            close()
        }
    }.build()
}
