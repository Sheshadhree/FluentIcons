package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Battery720: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Battery720",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 5f)
            curveTo(14.88f, 5f, 16f, 6.12f, 16f, 7.5f)
            verticalLineToRelative(0.833f)
            lineToRelative(1.167f, 0.003f)
            curveToRelative(0.151f, 0f, 0.294f, 0.04f, 0.416f, 0.111f)
            curveTo(17.833f, 8.591f, 18f, 8.861f, 18f, 9.17f)
            verticalLineToRelative(1.667f)
            curveToRelative(0f, 0.308f, -0.168f, 0.577f, -0.417f, 0.721f)
            curveToRelative(-0.122f, 0.071f, -0.265f, 0.112f, -0.416f, 0.112f)
            lineTo(16f, 11.667f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(3.12f, 15f, 2f, 13.88f, 2f, 12.5f)
            verticalLineToRelative(-5f)
            curveTo(2f, 6.12f, 3.12f, 5f, 4.5f, 5f)
            horizontalLineToRelative(9f)
            close()
            moveToRelative(0.25f, 0.946f)
            horizontalLineTo(4.5f)
            curveToRelative(-0.65f, 0f, -1.405f, 0.496f, -1.492f, 1.13f)
            lineTo(3f, 7.196f)
            verticalLineToRelative(5.495f)
            curveToRelative(0f, 0.647f, 0.492f, 1.18f, 1.122f, 1.244f)
            lineTo(4.25f, 13.94f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.647f, 0f, 1.18f, -0.492f, 1.243f, -1.122f)
            lineTo(15f, 12.691f)
            verticalLineTo(7.196f)
            curveToRelative(0f, -0.647f, -0.492f, -1.18f, -1.122f, -1.244f)
            lineTo(13.75f, 5.946f)
            close()
            moveTo(4.834f, 6.949f)
            horizontalLineToRelative(5.33f)
            curveToRelative(0.427f, 0f, 0.778f, 0.318f, 0.83f, 0.73f)
            lineTo(11f, 7.784f)
            verticalLineToRelative(4.327f)
            curveToRelative(0f, 0.426f, -0.319f, 0.777f, -0.73f, 0.829f)
            lineToRelative(-0.105f, 0.006f)
            horizontalLineToRelative(-5.33f)
            curveToRelative(-0.426f, 0f, -0.778f, -0.319f, -0.83f, -0.73f)
            lineTo(4f, 12.11f)
            verticalLineTo(7.784f)
            curveToRelative(0f, -0.426f, 0.319f, -0.777f, 0.73f, -0.829f)
            lineTo(4.835f, 6.95f)
            horizontalLineToRelative(5.33f)
            horizontalLineToRelative(-5.33f)
            close()
        }
    }.build()
}
