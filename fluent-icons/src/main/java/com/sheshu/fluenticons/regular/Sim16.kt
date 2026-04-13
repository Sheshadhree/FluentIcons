package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Sim16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Sim16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 9.5f)
            curveTo(5f, 8.672f, 5.672f, 8f, 6.5f, 8f)
            horizontalLineToRelative(3f)
            curveTo(10.328f, 8f, 11f, 8.672f, 11f, 9.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveTo(5.672f, 13f, 5f, 12.328f, 5f, 11.5f)
            verticalLineToRelative(-2f)
            close()
            moveTo(6.5f, 9f)
            curveTo(6.224f, 9f, 6f, 9.224f, 6f, 9.5f)
            verticalLineToRelative(2f)
            curveTo(6f, 11.776f, 6.224f, 12f, 6.5f, 12f)
            horizontalLineTo(8f)
            verticalLineTo(9f)
            horizontalLineTo(6.5f)
            close()
            moveTo(9f, 9f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-2f)
            curveTo(10f, 9.224f, 9.776f, 9f, 9.5f, 9f)
            horizontalLineTo(9f)
            close()
            moveTo(3f, 3.5f)
            curveTo(3f, 2.12f, 4.12f, 1f, 5.5f, 1f)
            horizontalLineToRelative(3.172f)
            curveToRelative(0.663f, 0f, 1.298f, 0.263f, 1.767f, 0.732f)
            lineToRelative(1.829f, 1.829f)
            curveTo(12.737f, 4.029f, 13f, 4.665f, 13f, 5.328f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5f)
            curveTo(4.12f, 15f, 3f, 13.88f, 3f, 12.5f)
            verticalLineToRelative(-9f)
            close()
            moveTo(5.5f, 2f)
            curveTo(4.672f, 2f, 4f, 2.672f, 4f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(4f, 13.328f, 4.672f, 14f, 5.5f, 14f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(5.328f)
            curveToRelative(0f, -0.397f, -0.158f, -0.779f, -0.44f, -1.06f)
            lineTo(9.733f, 2.439f)
            curveTo(9.451f, 2.158f, 9.07f, 2f, 8.672f, 2f)
            horizontalLineTo(5.5f)
            close()
        }
    }.build()
}
