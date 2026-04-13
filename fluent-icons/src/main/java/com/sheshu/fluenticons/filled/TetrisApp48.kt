package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TetrisApp48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TetrisApp48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(10f)
            horizontalLineTo(16f)
            verticalLineTo(6f)
            close()
            moveTo(6f, 16f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            verticalLineTo(16f)
            horizontalLineTo(6f)
            close()
            moveToRelative(20f, 0f)
            horizontalLineTo(16f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-8f)
            close()
            moveTo(36f, 4f)
            horizontalLineToRelative(-8f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
            moveTo(10f, 35f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(-8f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-6f)
            close()
            moveToRelative(22f, -2f)
            horizontalLineTo(22f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(10f)
            verticalLineTo(33f)
            close()
            moveToRelative(2f, 0f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-8f)
            verticalLineTo(33f)
            close()
            moveToRelative(2f, -12f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-6f)
            close()
        }
    }.build()
}
