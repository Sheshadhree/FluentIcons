package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentLightning20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentLightning20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            verticalLineToRelative(4.5f)
            curveTo(10f, 7.328f, 10.673f, 8f, 11.5f, 8f)
            horizontalLineTo(16f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(6.86f)
            lineToRelative(3.183f, -2.97f)
            curveToRelative(1.09f, -1.018f, 0.482f, -2.794f, -0.91f, -3.009f)
            lineToRelative(0.348f, -1.047f)
            curveTo(9.805f, 10.003f, 9.082f, 9f, 8.058f, 9f)
            horizontalLineTo(4.585f)
            curveTo(4.38f, 9f, 4.182f, 9.042f, 4f, 9.119f)
            verticalLineTo(3.5f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineTo(10f)
            close()
            moveToRelative(1f, 0.25f)
            verticalLineTo(6.5f)
            curveTo(11f, 6.776f, 11.225f, 7f, 11.5f, 7f)
            horizontalLineToRelative(4.25f)
            lineTo(11f, 2.25f)
            close()
            moveTo(2.503f, 16f)
            horizontalLineToRelative(1.75f)
            lineToRelative(-0.59f, 2.36f)
            curveToRelative(-0.12f, 0.482f, 0.463f, 0.826f, 0.827f, 0.486f)
            lineToRelative(4.872f, -4.548f)
            curveTo(9.86f, 13.834f, 9.531f, 13f, 8.85f, 13f)
            horizontalLineTo(7.753f)
            lineToRelative(0.78f, -2.342f)
            curveTo(8.641f, 10.334f, 8.4f, 10f, 8.06f, 10f)
            horizontalLineTo(4.586f)
            curveToRelative(-0.202f, 0f, -0.384f, 0.121f, -0.462f, 0.308f)
            lineToRelative(-2.083f, 5f)
            curveTo(1.904f, 15.637f, 2.146f, 16f, 2.503f, 16f)
            close()
        }
    }.build()
}
