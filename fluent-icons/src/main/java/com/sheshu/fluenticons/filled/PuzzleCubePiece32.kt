package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PuzzleCubePiece32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PuzzleCubePiece32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 29f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(23f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(6f)
            close()
            moveToRelative(9f, 0f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(6f)
            close()
            moveToRelative(8f, -4.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineTo(20f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(1.5f)
            close()
            moveTo(9f, 21f)
            horizontalLineTo(3f)
            verticalLineToRelative(-7f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(7f)
            close()
            moveToRelative(9f, 0f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(-7f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(7f)
            close()
            moveToRelative(8f, 0f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(-7f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(7f)
            close()
            moveTo(9f, 12f)
            horizontalLineTo(3f)
            verticalLineToRelative(-1.5f)
            curveTo(3f, 8.015f, 5.015f, 6f, 7.5f, 6f)
            horizontalLineTo(9f)
            verticalLineToRelative(6f)
            close()
            moveToRelative(9f, 0f)
            horizontalLineToRelative(-7f)
            verticalLineTo(6f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(6f)
            close()
            moveToRelative(6.943f, -10.558f)
            curveToRelative(0.586f, -0.586f, 1.537f, -0.586f, 2.122f, 0f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.586f, 0.585f, 0.586f, 1.535f, 0f, 2.12f)
            lineToRelative(-3.5f, 3.5f)
            curveToRelative(-0.585f, 0.586f, -1.535f, 0.586f, -2.12f, 0f)
            lineToRelative(-3.502f, -3.5f)
            curveToRelative(-0.585f, -0.585f, -0.585f, -1.535f, 0f, -2.12f)
            lineToRelative(3.5f, -3.5f)
            close()
        }
    }.build()
}
