package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Highlight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Highlight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 1f)
            curveTo(2.448f, 1f, 2f, 1.448f, 2f, 2f)
            verticalLineToRelative(2.5f)
            curveTo(2f, 5.328f, 2.672f, 6f, 3.5f, 6f)
            curveTo(3.483f, 6f, 3.467f, 6f, 3.45f, 6.003f)
            horizontalLineToRelative(0.102f)
            curveTo(3.535f, 6f, 3.517f, 6f, 3.5f, 6f)
            horizontalLineToRelative(0.246f)
            verticalLineToRelative(0.003f)
            horizontalLineToRelative(8.545f)
            verticalLineTo(6f)
            horizontalLineToRelative(0.21f)
            curveToRelative(-0.017f, 0f, -0.034f, 0f, -0.051f, 0.003f)
            horizontalLineToRelative(0.102f)
            lineTo(12.5f, 6f)
            horizontalLineToRelative(0.001f)
            curveToRelative(0.829f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(2f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(3f)
            close()
            moveToRelative(0.001f, 6.003f)
            curveTo(3.002f, 8.106f, 3.897f, 9f, 5.001f, 9f)
            horizontalLineToRelative(6f)
            curveToRelative(1.104f, 0f, 1.999f, -0.894f, 2f, -1.997f)
            horizontalLineToRelative(-10f)
            close()
            moveTo(5.003f, 14.5f)
            verticalLineTo(10f)
            horizontalLineTo(11f)
            lineToRelative(0.002f, 0.74f)
            curveToRelative(0f, 0.511f, -0.26f, 0.988f, -0.69f, 1.265f)
            lineToRelative(-4.54f, 2.916f)
            curveToRelative(-0.154f, 0.099f, -0.35f, 0.106f, -0.51f, 0.018f)
            curveToRelative(-0.16f, -0.088f, -0.26f, -0.256f, -0.26f, -0.439f)
            close()
        }
    }.build()
}
