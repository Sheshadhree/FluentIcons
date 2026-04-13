package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Table32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Table32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 4f)
            horizontalLineToRelative(-8f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(8f)
            verticalLineTo(4f)
            close()
            moveToRelative(0f, 8f)
            horizontalLineToRelative(-8f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(-8f)
            close()
            moveToRelative(2f, 8f)
            verticalLineToRelative(-8f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(-6f)
            close()
            moveToRelative(-2f, 2f)
            horizontalLineToRelative(-8f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(-6f)
            close()
            moveToRelative(2f, 6f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            horizontalLineToRelative(-1f)
            close()
            moveToRelative(0f, -18f)
            verticalLineTo(4f)
            horizontalLineToRelative(1f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-6f)
            close()
            moveTo(9f, 4f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(6f)
            horizontalLineTo(4f)
            verticalLineTo(9f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            close()
            moveToRelative(-5f, 8f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(8f)
            horizontalLineTo(4f)
            verticalLineToRelative(-8f)
            close()
            moveToRelative(0f, 10f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(6f)
            horizontalLineTo(9f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            verticalLineToRelative(-1f)
            close()
        }
    }.build()
}
