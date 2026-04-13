package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Home16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Home16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.687f, 1.262f)
            curveToRelative(-0.385f, -0.365f, -0.988f, -0.365f, -1.374f, 0f)
            lineTo(2.47f, 5.84f)
            curveTo(2.17f, 6.124f, 2f, 6.519f, 2f, 6.931f)
            verticalLineToRelative(5.57f)
            curveTo(2f, 13.328f, 2.672f, 14f, 3.5f, 14f)
            horizontalLineTo(5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(10f)
            curveToRelative(0f, -0.277f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.223f, 0.5f, 0.5f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(6.93f)
            curveToRelative(0f, -0.412f, -0.17f, -0.807f, -0.47f, -1.09f)
            lineTo(8.687f, 1.26f)
            close()
        }
    }.build()
}
