package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTrendingDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTrendingDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.003f, 18.998f)
            horizontalLineTo(21f)
            curveToRelative(0.513f, 0f, 0.935f, -0.386f, 0.993f, -0.883f)
            lineTo(22f, 18f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.553f, -0.448f, -1f, -1f, -1f)
            curveToRelative(-0.513f, 0f, -0.936f, 0.385f, -0.994f, 0.883f)
            lineTo(20f, 10.999f)
            lineToRelative(-0.001f, 4.585f)
            lineToRelative(-7.292f, -7.293f)
            curveToRelative(-0.36f, -0.36f, -0.927f, -0.388f, -1.32f, -0.083f)
            lineTo(11.293f, 8.29f)
            lineToRelative(-2.296f, 2.292f)
            lineToRelative(-5.288f, -5.29f)
            curveToRelative(-0.39f, -0.39f, -1.023f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.36f, 0.36f, -0.388f, 0.927f, -0.083f, 1.32f)
            lineToRelative(0.083f, 0.094f)
            lineToRelative(5.994f, 5.997f)
            curveToRelative(0.36f, 0.36f, 0.927f, 0.388f, 1.32f, 0.083f)
            lineToRelative(0.094f, -0.083f)
            lineToRelative(2.296f, -2.292f)
            lineToRelative(6.585f, 6.586f)
            horizontalLineToRelative(-4.581f)
            curveToRelative(-0.513f, 0f, -0.935f, 0.386f, -0.993f, 0.884f)
            lineToRelative(-0.007f, 0.116f)
            curveToRelative(0f, 0.513f, 0.386f, 0.936f, 0.883f, 0.994f)
            lineToRelative(0.117f, 0.006f)
            close()
        }
    }.build()
}
