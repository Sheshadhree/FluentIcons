package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Battery620: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Battery620",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.834f, 6.949f)
            curveTo(4.373f, 6.949f, 4f, 7.323f, 4f, 7.784f)
            verticalLineToRelative(4.327f)
            curveToRelative(0f, 0.461f, 0.374f, 0.835f, 0.835f, 0.835f)
            horizontalLineToRelative(4.33f)
            curveToRelative(0.462f, 0f, 0.836f, -0.374f, 0.836f, -0.835f)
            verticalLineTo(7.784f)
            curveToRelative(0f, -0.461f, -0.374f, -0.835f, -0.835f, -0.835f)
            horizontalLineToRelative(-4.33f)
            close()
            moveTo(2f, 7.5f)
            curveTo(2f, 6.12f, 3.12f, 5f, 4.5f, 5f)
            horizontalLineToRelative(9f)
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
            close()
        }
    }.build()
}
