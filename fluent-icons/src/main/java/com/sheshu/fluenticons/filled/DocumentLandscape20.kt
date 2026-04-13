package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentLandscape20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentLandscape20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 10f)
            horizontalLineToRelative(-4.5f)
            curveTo(12.672f, 10f, 12f, 9.328f, 12f, 8.5f)
            verticalLineTo(4f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 4f, 2f, 4.672f, 2f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(2f, 15.328f, 2.672f, 16f, 3.5f, 16f)
            horizontalLineToRelative(13f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(10f)
            close()
            moveToRelative(-0.25f, -1f)
            horizontalLineTo(13.5f)
            curveTo(13.224f, 9f, 13f, 8.776f, 13f, 8.5f)
            verticalLineTo(4.25f)
            lineTo(17.75f, 9f)
            close()
        }
    }.build()
}
