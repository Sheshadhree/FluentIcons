package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PuzzleCube32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PuzzleCube32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24.5f, 3f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-4.502f)
            lineTo(12f, 28.987f)
            lineToRelative(-4.493f, 0.007f)
            curveTo(5.019f, 28.998f, 3f, 26.982f, 3f, 24.494f)
            verticalLineTo(11f)
            horizontalLineToRelative(8f)
            verticalLineTo(3f)
            horizontalLineToRelative(13.5f)
            close()
            moveTo(21f, 21f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(21f)
            horizontalLineToRelative(-6f)
            close()
            moveToRelative(-8f, 0f)
            verticalLineToRelative(5.988f)
            lineToRelative(6f, 0.01f)
            verticalLineTo(21f)
            horizontalLineToRelative(-6f)
            close()
            moveToRelative(-8f, 0f)
            verticalLineToRelative(3.494f)
            curveToRelative(0f, 1.382f, 1.122f, 2.502f, 2.504f, 2.5f)
            lineTo(11f, 26.988f)
            verticalLineTo(21f)
            horizontalLineTo(5f)
            close()
            moveToRelative(0f, -8f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-6f)
            horizontalLineTo(5f)
            close()
            moveToRelative(8f, 0f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(-6f)
            close()
            moveToRelative(8f, 0f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(-6f)
            close()
            moveToRelative(-8f, -8f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(6f)
            verticalLineTo(5f)
            horizontalLineToRelative(-6f)
            close()
            moveToRelative(8f, 0f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(6f)
            verticalLineTo(7.5f)
            curveTo(27f, 6.12f, 25.88f, 5f, 24.5f, 5f)
            horizontalLineTo(21f)
            close()
        }
    }.build()
}
