package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Note16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Note16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(-3.5f)
            curveTo(9.12f, 8f, 8f, 9.12f, 8f, 10.5f)
            verticalLineTo(14f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveToRelative(7f, 9.359f)
            curveToRelative(0.35f, -0.123f, 0.672f, -0.324f, 0.94f, -0.591f)
            lineToRelative(3.328f, -3.329f)
            curveTo(13.535f, 9.672f, 13.736f, 9.35f, 13.858f, 9f)
            horizontalLineTo(10.5f)
            curveTo(9.672f, 9f, 9f, 9.672f, 9f, 10.5f)
            verticalLineToRelative(3.359f)
            close()
        }
    }.build()
}
