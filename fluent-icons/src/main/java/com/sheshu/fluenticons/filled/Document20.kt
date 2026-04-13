package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Document20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Document20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            verticalLineToRelative(4.5f)
            curveTo(10f, 7.328f, 10.672f, 8f, 11.5f, 8f)
            horizontalLineTo(16f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 18f, 4f, 17.328f, 4f, 16.5f)
            verticalLineToRelative(-13f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineTo(10f)
            close()
            moveToRelative(1f, 0.25f)
            verticalLineTo(6.5f)
            curveTo(11f, 6.776f, 11.224f, 7f, 11.5f, 7f)
            horizontalLineToRelative(4.25f)
            lineTo(11f, 2.25f)
            close()
        }
    }.build()
}
