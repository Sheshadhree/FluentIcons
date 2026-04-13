package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.HatGraduation32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HatGraduation32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.326f, 6.38f)
            curveToRelative(-0.811f, -0.507f, -1.84f, -0.507f, -2.652f, 0f)
            lineToRelative(-9.788f, 6.122f)
            lineToRelative(9.788f, 6.121f)
            curveToRelative(0.811f, 0.507f, 1.84f, 0.507f, 2.652f, 0f)
            lineToRelative(9.788f, -6.121f)
            lineToRelative(-9.788f, -6.122f)
            close()
            moveToRelative(-3.712f, -1.695f)
            curveToRelative(1.46f, -0.913f, 3.312f, -0.913f, 4.772f, 0f)
            lineToRelative(11.144f, 6.969f)
            curveToRelative(0.293f, 0.183f, 0.47f, 0.503f, 0.47f, 0.848f)
            curveToRelative(0f, 0.344f, -0.177f, 0.665f, -0.47f, 0.848f)
            lineTo(25f, 16.183f)
            verticalLineToRelative(7.367f)
            curveToRelative(0f, 0.255f, -0.098f, 0.5f, -0.273f, 0.686f)
            curveTo(22.541f, 26.552f, 19.44f, 28f, 16f, 28f)
            curveToRelative(-3.438f, 0f, -6.54f, -1.448f, -8.727f, -3.764f)
            curveTo(7.098f, 24.051f, 7f, 23.806f, 7f, 23.55f)
            verticalLineToRelative(-7.367f)
            lineToRelative(-3f, -1.877f)
            verticalLineTo(21f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-8.5f)
            curveToRelative(0f, -0.378f, 0.21f, -0.707f, 0.518f, -0.877f)
            lineToRelative(11.096f, -6.938f)
            close()
            moveToRelative(4.772f, 15.634f)
            curveToRelative(-1.46f, 0.913f, -3.312f, 0.913f, -4.772f, 0f)
            lineTo(9f, 17.433f)
            verticalLineToRelative(5.708f)
            curveTo(10.805f, 24.911f, 13.274f, 26f, 16f, 26f)
            reflectiveCurveToRelative(5.195f, -1.09f, 7f, -2.859f)
            verticalLineToRelative(-5.708f)
            lineToRelative(-4.614f, 2.886f)
            close()
        }
    }.build()
}
