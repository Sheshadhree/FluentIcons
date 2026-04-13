package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonAvailable24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonAvailable24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 12f)
            curveToRelative(3.038f, 0f, 5.5f, 2.463f, 5.5f, 5.5f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            curveToRelative(-3.037f, 0f, -5.5f, -2.462f, -5.5f, -5.5f)
            curveToRelative(0f, -3.037f, 2.463f, -5.5f, 5.5f, -5.5f)
            close()
            moveToRelative(-5.477f, 2f)
            curveTo(11.376f, 15.01f, 11f, 16.21f, 11f, 17.5f)
            curveToRelative(0f, 1.63f, 0.6f, 3.12f, 1.592f, 4.262f)
            curveToRelative(-0.795f, 0.16f, -1.66f, 0.24f, -2.592f, 0.24f)
            curveToRelative(-3.42f, 0f, -5.944f, -1.073f, -7.486f, -3.237f)
            curveToRelative(-0.332f, -0.466f, -0.51f, -1.024f, -0.51f, -1.596f)
            verticalLineToRelative(-0.92f)
            curveTo(2.004f, 15.007f, 3.01f, 14f, 4.253f, 14f)
            horizontalLineToRelative(7.77f)
            close()
            moveToRelative(2.83f, 3.147f)
            curveToRelative(-0.194f, -0.196f, -0.51f, -0.196f, -0.706f, 0f)
            curveToRelative(-0.196f, 0.195f, -0.196f, 0.512f, 0f, 0.707f)
            lineToRelative(2f, 2f)
            curveToRelative(0.195f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            lineToRelative(4f, -4f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.195f, -0.196f, -0.512f, -0.196f, -0.707f, 0f)
            lineTo(16.5f, 18.793f)
            lineToRelative(-1.646f, -1.646f)
            close()
            moveTo(10f, 2.005f)
            curveToRelative(2.762f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.238f, 5f, -5f, 5f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            close()
        }
    }.build()
}
