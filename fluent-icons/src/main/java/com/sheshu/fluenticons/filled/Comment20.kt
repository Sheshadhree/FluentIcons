package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Comment20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Comment20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.799f, 17.803f)
            curveToRelative(-0.442f, 0.327f, -1.069f, 0.238f, -1.4f, -0.199f)
            curveToRelative(-0.13f, -0.17f, -0.199f, -0.378f, -0.199f, -0.59f)
            verticalLineToRelative(-2.172f)
            horizontalLineTo(4.6f)
            curveToRelative(-1.436f, 0f, -2.6f, -1.149f, -2.6f, -2.566f)
            verticalLineToRelative(-6.71f)
            curveTo(2f, 4.149f, 3.164f, 3f, 4.6f, 3f)
            horizontalLineToRelative(10.8f)
            curveTo(16.836f, 3f, 18f, 4.149f, 18f, 5.566f)
            verticalLineToRelative(6.71f)
            curveToRelative(0f, 1.418f, -1.164f, 2.566f, -2.6f, 2.566f)
            horizontalLineToRelative(-4.59f)
            lineToRelative(-4.011f, 2.961f)
            close()
        }
    }.build()
}
