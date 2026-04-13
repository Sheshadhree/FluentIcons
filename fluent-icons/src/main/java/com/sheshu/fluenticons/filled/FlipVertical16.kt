package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlipVertical16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlipVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.651f, 1.116f)
            curveToRelative(0.217f, 0.138f, 0.35f, 0.377f, 0.35f, 0.634f)
            verticalLineToRelative(4.5f)
            curveTo(13f, 6.664f, 12.663f, 7f, 12.25f, 7f)
            horizontalLineToRelative(-9.5f)
            curveTo(2.398f, 7f, 2.094f, 6.757f, 2.017f, 6.415f)
            curveTo(1.941f, 6.072f, 2.112f, 5.722f, 2.43f, 5.572f)
            lineToRelative(9.5f, -4.5f)
            curveToRelative(0.232f, -0.11f, 0.505f, -0.093f, 0.722f, 0.044f)
            close()
            moveTo(6.085f, 5.5f)
            horizontalLineTo(11.5f)
            verticalLineTo(2.935f)
            lineTo(6.085f, 5.5f)
            close()
            moveToRelative(6.915f, 9f)
            curveToRelative(0f, 0.173f, -0.09f, 0.334f, -0.237f, 0.425f)
            curveToRelative(-0.147f, 0.091f, -0.332f, 0.1f, -0.487f, 0.022f)
            lineToRelative(-10f, -5f)
            curveTo(2.07f, 9.844f, 1.96f, 9.611f, 2.013f, 9.385f)
            curveTo(2.067f, 9.16f, 2.268f, 9f, 2.5f, 9f)
            horizontalLineToRelative(10f)
            curveTo(12.776f, 9f, 13f, 9.224f, 13f, 9.5f)
            verticalLineToRelative(5f)
            close()
        }
    }.build()
}
