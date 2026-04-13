package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HatGraduation32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HatGraduation32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.386f, 4.685f)
            curveToRelative(-1.46f, -0.913f, -3.312f, -0.913f, -4.772f, 0f)
            lineTo(2.518f, 11.623f)
            curveTo(2.21f, 11.793f, 2f, 12.123f, 2f, 12.5f)
            verticalLineTo(21f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-6.694f)
            lineToRelative(9.614f, 6.013f)
            curveToRelative(1.46f, 0.913f, 3.312f, 0.913f, 4.772f, 0f)
            lineToRelative(11.144f, -6.97f)
            curveToRelative(0.293f, -0.182f, 0.47f, -0.503f, 0.47f, -0.847f)
            curveToRelative(0f, -0.345f, -0.177f, -0.665f, -0.47f, -0.848f)
            lineToRelative(-11.144f, -6.97f)
            close()
            moveToRelative(0.795f, 16.905f)
            lineTo(25f, 17.953f)
            verticalLineToRelative(5.598f)
            curveToRelative(0f, 0.255f, -0.098f, 0.5f, -0.273f, 0.686f)
            curveTo(22.541f, 26.552f, 19.44f, 28f, 16f, 28f)
            curveToRelative(-3.438f, 0f, -6.54f, -1.448f, -8.727f, -3.764f)
            curveTo(7.098f, 24.051f, 7f, 23.805f, 7f, 23.55f)
            verticalLineToRelative(-5.598f)
            lineToRelative(5.819f, 3.638f)
            curveToRelative(1.946f, 1.218f, 4.416f, 1.218f, 6.362f, 0f)
            close()
        }
    }.build()
}
