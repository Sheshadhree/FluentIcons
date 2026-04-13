package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TetrisApp32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TetrisApp32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 4.75f)
            curveTo(11.5f, 4.336f, 11.836f, 4f, 12.25f, 4f)
            horizontalLineToRelative(5.25f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-6f)
            verticalLineTo(4.75f)
            close()
            moveTo(4.75f, 11.5f)
            curveTo(4.336f, 11.5f, 4f, 11.836f, 4f, 12.25f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineTo(10f)
            verticalLineToRelative(-6f)
            horizontalLineTo(4.75f)
            close()
            moveToRelative(12.75f, 0f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(5.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(11.5f)
            close()
            moveTo(24.25f, 4f)
            horizontalLineTo(19f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(5.25f)
            curveTo(24.664f, 10f, 25f, 9.664f, 25f, 9.25f)
            verticalLineToRelative(-4.5f)
            curveTo(25f, 4.336f, 24.664f, 4f, 24.25f, 4f)
            close()
            moveTo(7f, 23.125f)
            curveTo(7f, 22.504f, 7.504f, 22f, 8.125f, 22f)
            horizontalLineTo(13f)
            verticalLineToRelative(6f)
            horizontalLineTo(8.125f)
            curveTo(7.504f, 28f, 7f, 27.496f, 7f, 26.875f)
            verticalLineToRelative(-3.75f)
            close()
            moveTo(20.5f, 28f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(6f)
            close()
            moveToRelative(1.5f, -6f)
            horizontalLineToRelative(4.875f)
            curveTo(27.496f, 22f, 28f, 22.504f, 28f, 23.125f)
            verticalLineToRelative(3.75f)
            curveTo(28f, 27.496f, 27.496f, 28f, 26.875f, 28f)
            horizontalLineTo(22f)
            verticalLineToRelative(-6f)
            close()
            moveToRelative(1.125f, -7.5f)
            curveTo(22.504f, 14.5f, 22f, 15.004f, 22f, 15.625f)
            verticalLineTo(20.5f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-4.875f)
            curveToRelative(0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
            horizontalLineToRelative(-3.75f)
            close()
        }
    }.build()
}
