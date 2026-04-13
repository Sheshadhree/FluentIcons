package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataHistogram20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataHistogram20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 4.5f)
            curveTo(12f, 3.672f, 11.328f, 3f, 10.5f, 3f)
            horizontalLineToRelative(-1f)
            curveTo(8.672f, 3f, 8f, 3.672f, 8f, 4.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(4f)
            verticalLineTo(4.5f)
            close()
            moveTo(13f, 6f)
            verticalLineToRelative(11f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(5f, 9f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(8f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 17f, 3f, 16.776f, 3f, 16.5f)
            verticalLineTo(11f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
        }
    }.build()
}
