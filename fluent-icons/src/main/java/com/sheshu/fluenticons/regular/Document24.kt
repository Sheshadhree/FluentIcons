package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Document24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Document24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(12f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(9.828f)
            curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.586f, -1.414f)
            lineToRelative(-5.828f, -5.828f)
            curveTo(13.211f, 2.21f, 12.703f, 2f, 12.172f, 2f)
            horizontalLineTo(6f)
            close()
            moveTo(5.5f, 4f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(6f)
            verticalLineTo(8f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(4.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(6f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(4f)
            close()
            moveToRelative(11.88f, 4.5f)
            horizontalLineTo(14f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(4.62f)
            lineToRelative(3.88f, 3.88f)
            close()
        }
    }.build()
}
