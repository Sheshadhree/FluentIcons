package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Book28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Book28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.75f, 2f)
            curveTo(6.679f, 2f, 5f, 3.679f, 5f, 5.75f)
            verticalLineToRelative(16.5f)
            curveTo(5f, 24.32f, 6.679f, 26f, 8.75f, 26f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            curveToRelative(0f, -0.415f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(8.75f)
            curveToRelative(-1.158f, 0f, -2.112f, -0.875f, -2.236f, -2f)
            horizontalLineTo(21.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(5.75f)
            curveTo(23f, 3.679f, 21.321f, 2f, 19.25f, 2f)
            horizontalLineTo(8.75f)
            close()
            moveTo(8.5f, 6.75f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-8.5f)
            curveTo(9.06f, 9.5f, 8.5f, 8.94f, 8.5f, 8.25f)
            verticalLineToRelative(-1.5f)
            close()
        }
    }.build()
}
