package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Bookmark32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Bookmark32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 7.2f)
            curveTo(6f, 4.88f, 7.88f, 3f, 10.2f, 3f)
            horizontalLineToRelative(11.6f)
            curveTo(24.12f, 3f, 26f, 4.88f, 26f, 7.2f)
            verticalLineTo(28f)
            curveToRelative(0f, 0.375f, -0.21f, 0.72f, -0.545f, 0.89f)
            curveToRelative(-0.334f, 0.171f, -0.736f, 0.14f, -1.04f, -0.08f)
            lineTo(16f, 22.735f)
            lineTo(7.585f, 28.81f)
            curveToRelative(-0.304f, 0.22f, -0.706f, 0.25f, -1.04f, 0.08f)
            curveTo(6.21f, 28.718f, 6f, 28.375f, 6f, 28f)
            verticalLineTo(7.2f)
            close()
            moveTo(10.2f, 5f)
            curveTo(8.985f, 5f, 8f, 5.985f, 8f, 7.2f)
            verticalLineToRelative(18.844f)
            lineToRelative(7.415f, -5.355f)
            curveToRelative(0.349f, -0.252f, 0.82f, -0.252f, 1.17f, 0f)
            lineTo(24f, 26.044f)
            verticalLineTo(7.2f)
            curveTo(24f, 5.985f, 23.015f, 5f, 21.8f, 5f)
            horizontalLineTo(10.2f)
            close()
        }
    }.build()
}
