package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlipHorizontal16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlipHorizontal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.884f, 12.651f)
            curveToRelative(-0.138f, 0.217f, -0.377f, 0.35f, -0.634f, 0.35f)
            horizontalLineToRelative(-4.5f)
            curveTo(9.336f, 13f, 9f, 12.663f, 9f, 12.25f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -0.352f, 0.243f, -0.656f, 0.585f, -0.733f)
            curveToRelative(0.343f, -0.077f, 0.693f, 0.094f, 0.843f, 0.411f)
            lineToRelative(4.5f, 9.5f)
            curveToRelative(0.11f, 0.232f, 0.093f, 0.505f, -0.044f, 0.722f)
            close()
            moveTo(10.5f, 6.085f)
            verticalLineTo(11.5f)
            horizontalLineToRelative(2.565f)
            lineTo(10.5f, 6.085f)
            close()
            moveTo(1.5f, 13f)
            curveToRelative(-0.173f, 0f, -0.334f, -0.09f, -0.425f, -0.237f)
            curveToRelative(-0.091f, -0.147f, -0.1f, -0.332f, -0.022f, -0.487f)
            lineToRelative(5f, -10f)
            curveTo(6.157f, 2.07f, 6.389f, 1.96f, 6.615f, 2.013f)
            curveTo(6.84f, 2.067f, 7f, 2.268f, 7f, 2.5f)
            verticalLineToRelative(10f)
            curveTo(7f, 12.776f, 6.776f, 13f, 6.5f, 13f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
