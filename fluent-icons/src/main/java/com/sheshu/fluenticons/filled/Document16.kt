package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Document16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Document16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            verticalLineToRelative(3.5f)
            curveTo(8f, 5.328f, 8.672f, 6f, 9.5f, 6f)
            horizontalLineTo(13f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 15f, 3f, 14.328f, 3f, 13.5f)
            verticalLineToRelative(-11f)
            curveTo(3f, 1.672f, 3.672f, 1f, 4.5f, 1f)
            horizontalLineTo(8f)
            close()
            moveToRelative(1f, 0.25f)
            verticalLineTo(4.5f)
            curveTo(9f, 4.776f, 9.224f, 5f, 9.5f, 5f)
            horizontalLineToRelative(3.25f)
            lineTo(9f, 1.25f)
            close()
        }
    }.build()
}
