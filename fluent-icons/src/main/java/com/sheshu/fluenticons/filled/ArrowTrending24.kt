package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTrending24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTrending24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.003f, 5.5f)
            horizontalLineTo(21f)
            curveToRelative(0.513f, 0f, 0.935f, 0.386f, 0.993f, 0.883f)
            lineTo(22f, 6.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            curveToRelative(-0.513f, 0f, -0.936f, -0.386f, -0.994f, -0.883f)
            lineTo(20f, 13.5f)
            lineToRelative(-0.001f, -4.586f)
            lineToRelative(-7.292f, 7.293f)
            curveToRelative(-0.36f, 0.36f, -0.927f, 0.388f, -1.32f, 0.084f)
            lineToRelative(-0.094f, -0.083f)
            lineToRelative(-2.296f, -2.292f)
            lineToRelative(-5.288f, 5.29f)
            curveToRelative(-0.39f, 0.39f, -1.023f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.36f, -0.36f, -0.388f, -0.928f, -0.083f, -1.32f)
            lineToRelative(0.083f, -0.095f)
            lineToRelative(5.994f, -5.996f)
            curveToRelative(0.36f, -0.36f, 0.927f, -0.388f, 1.32f, -0.084f)
            lineToRelative(0.094f, 0.083f)
            lineToRelative(2.296f, 2.292f)
            lineTo(18.584f, 7.5f)
            horizontalLineToRelative(-4.581f)
            curveToRelative(-0.513f, 0f, -0.935f, -0.386f, -0.993f, -0.883f)
            lineTo(13.003f, 6.5f)
            curveToRelative(0f, -0.513f, 0.386f, -0.936f, 0.883f, -0.993f)
            lineTo(14.003f, 5.5f)
            horizontalLineTo(21f)
            horizontalLineToRelative(-6.997f)
            close()
        }
    }.build()
}
