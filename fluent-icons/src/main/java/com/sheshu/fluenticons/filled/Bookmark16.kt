package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Bookmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Bookmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.78f, 13.918f)
            curveToRelative(-0.333f, 0.222f, -0.778f, -0.016f, -0.778f, -0.416f)
            verticalLineTo(4.01f)
            curveToRelative(0f, -1.103f, 0.893f, -1.998f, 1.996f, -2f)
            lineToRelative(6f, -0.011f)
            curveTo(12.103f, 1.998f, 13f, 2.892f, 13.002f, 3.996f)
            verticalLineToRelative(9.506f)
            curveToRelative(0f, 0.4f, -0.445f, 0.638f, -0.778f, 0.416f)
            lineToRelative(-4.222f, -2.82f)
            lineToRelative(-4.222f, 2.82f)
            close()
        }
    }.build()
}
