package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Bookmark32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Bookmark32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.2f, 3f)
            curveTo(7.88f, 3f, 6f, 4.88f, 6f, 7.2f)
            verticalLineTo(28f)
            curveToRelative(0f, 0.375f, 0.21f, 0.72f, 0.545f, 0.89f)
            curveToRelative(0.334f, 0.171f, 0.736f, 0.14f, 1.04f, -0.08f)
            lineTo(16f, 22.735f)
            lineToRelative(8.415f, 6.077f)
            curveToRelative(0.304f, 0.22f, 0.706f, 0.25f, 1.04f, 0.08f)
            curveTo(25.79f, 28.718f, 26f, 28.375f, 26f, 28f)
            verticalLineTo(7.2f)
            curveTo(26f, 4.88f, 24.12f, 3f, 21.8f, 3f)
            horizontalLineTo(10.2f)
            close()
        }
    }.build()
}
