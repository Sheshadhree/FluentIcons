package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Bookmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Bookmark16",
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
            moveTo(12.002f, 4f)
            lineToRelative(-0.007f, -0.118f)
            curveTo(11.936f, 3.384f, 11.513f, 2.999f, 11f, 3f)
            lineTo(5f, 3.01f)
            curveToRelative(-0.551f, 0.002f, -0.998f, 0.45f, -0.998f, 1f)
            verticalLineToRelative(8.557f)
            lineToRelative(3.722f, -2.486f)
            curveToRelative(0.168f, -0.112f, 0.387f, -0.112f, 0.556f, 0f)
            lineToRelative(3.722f, 2.486f)
            verticalLineTo(4f)
            close()
        }
    }.build()
}
