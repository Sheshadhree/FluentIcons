package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PuzzleCube32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PuzzleCube32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 22f)
            verticalLineToRelative(6.987f)
            lineTo(10.001f, 29f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(22f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(10f, 0f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(-8.001f)
            lineTo(12f, 28.987f)
            verticalLineTo(22f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(9f, 0f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineTo(22f)
            verticalLineToRelative(-7f)
            horizontalLineToRelative(7f)
            close()
            moveTo(10f, 12f)
            verticalLineToRelative(8f)
            horizontalLineTo(3f)
            verticalLineToRelative(-8f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(10f, 0f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(-8f)
            verticalLineToRelative(-8f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(9f, 0f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(-8f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(-9f, -9f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(-8f)
            verticalLineTo(3f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(4.5f, 0f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(-7f)
            verticalLineTo(3f)
            horizontalLineToRelative(2.5f)
            close()
        }
    }.build()
}
