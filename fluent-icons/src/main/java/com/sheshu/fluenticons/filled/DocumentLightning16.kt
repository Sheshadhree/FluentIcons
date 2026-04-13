package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentLightning16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentLightning16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 1f)
            verticalLineToRelative(3.5f)
            curveTo(9f, 5.328f, 9.673f, 6f, 10.5f, 6f)
            horizontalLineTo(14f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.207f, 0f, -0.405f, -0.042f, -0.584f, -0.118f)
            lineToRelative(4.127f, -3.853f)
            curveToRelative(1.09f, -1.017f, 0.482f, -2.793f, -0.91f, -3.008f)
            lineTo(8.48f, 6.974f)
            curveTo(8.805f, 6.003f, 8.082f, 5f, 7.058f, 5f)
            horizontalLineTo(4f)
            verticalLineTo(2.5f)
            curveTo(4f, 1.672f, 4.672f, 1f, 5.5f, 1f)
            horizontalLineTo(9f)
            close()
            moveToRelative(1f, 0.25f)
            verticalLineTo(4.5f)
            curveTo(10f, 4.776f, 10.225f, 5f, 10.5f, 5f)
            horizontalLineToRelative(3.25f)
            lineTo(10f, 1.25f)
            close()
            moveTo(1.503f, 12f)
            horizontalLineToRelative(1.75f)
            lineToRelative(-0.59f, 2.36f)
            curveToRelative(-0.12f, 0.482f, 0.463f, 0.826f, 0.827f, 0.486f)
            lineToRelative(4.872f, -4.548f)
            curveTo(8.86f, 9.834f, 8.531f, 9f, 7.85f, 9f)
            horizontalLineTo(6.753f)
            lineToRelative(0.78f, -2.342f)
            curveTo(7.641f, 6.334f, 7.4f, 6f, 7.06f, 6f)
            horizontalLineTo(3.586f)
            curveTo(3.384f, 6f, 3.202f, 6.121f, 3.124f, 6.308f)
            lineToRelative(-2.083f, 5f)
            curveTo(0.904f, 11.637f, 1.146f, 12f, 1.503f, 12f)
            close()
        }
    }.build()
}
