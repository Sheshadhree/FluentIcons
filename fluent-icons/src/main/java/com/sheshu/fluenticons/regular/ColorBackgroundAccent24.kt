package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ColorBackgroundAccent24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColorBackgroundAccent24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 17.5f)
            verticalLineToRelative(-4.088f)
            lineTo(4.488f, 14.9f)
            curveToRelative(1.172f, 1.171f, 3.071f, 1.171f, 4.243f, 0f)
            lineToRelative(1.37f, -1.37f)
            curveTo(10.039f, 13.795f, 10f, 14.08f, 10f, 14.375f)
            curveTo(10f, 16.232f, 11.394f, 18f, 13.5f, 18f)
            reflectiveCurveToRelative(3.5f, -1.768f, 3.5f, -3.625f)
            curveToRelative(0f, -0.693f, -0.214f, -1.32f, -0.433f, -1.798f)
            curveToRelative(-0.226f, -0.493f, -0.512f, -0.94f, -0.77f, -1.3f)
            curveToRelative(-0.263f, -0.366f, -0.52f, -0.675f, -0.713f, -0.891f)
            lineToRelative(-0.008f, -0.01f)
            lineToRelative(-0.325f, -0.35f)
            lineToRelative(-0.014f, -0.013f)
            curveToRelative(-0.293f, -0.294f, -0.664f, -0.461f, -1.047f, -0.503f)
            curveToRelative(0.36f, -1.05f, 0.12f, -2.258f, -0.717f, -3.096f)
            lineTo(11.56f, 5f)
            horizontalLineToRelative(7.94f)
            curveTo(20.328f, 5f, 21f, 5.672f, 21f, 6.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-15f)
            curveTo(3.672f, 19f, 3f, 18.328f, 3f, 17.5f)
            close()
        }
    }.build()
}
