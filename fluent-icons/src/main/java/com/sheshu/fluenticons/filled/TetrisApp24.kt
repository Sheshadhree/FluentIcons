package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TetrisApp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TetrisApp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(5f)
            horizontalLineTo(8f)
            verticalLineTo(3f)
            close()
            moveTo(3f, 8f)
            curveTo(2.448f, 8f, 2f, 8.448f, 2f, 9f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            close()
            moveToRelative(10f, 0f)
            horizontalLineTo(8f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(8f)
            close()
            moveToRelative(5f, -6f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveTo(4f, 17f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(5f)
            horizontalLineTo(5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-3f)
            close()
            moveToRelative(11f, -1f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(1f, 0f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(1f, -6f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
