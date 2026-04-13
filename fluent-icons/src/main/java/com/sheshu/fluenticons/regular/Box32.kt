package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Box32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Box32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.615f, 2.55f)
            curveToRelative(-1.04f, -0.4f, -2.19f, -0.4f, -3.23f, 0f)
            lineTo(4.083f, 6.512f)
            curveTo(2.828f, 6.995f, 2f, 8.201f, 2f, 9.545f)
            verticalLineToRelative(12.91f)
            curveToRelative(0f, 1.345f, 0.828f, 2.55f, 2.083f, 3.033f)
            lineToRelative(10.302f, 3.962f)
            curveToRelative(1.04f, 0.4f, 2.19f, 0.4f, 3.23f, 0f)
            lineToRelative(10.302f, -3.962f)
            curveTo(29.172f, 25.005f, 30f, 23.8f, 30f, 22.455f)
            verticalLineTo(9.545f)
            curveToRelative(0f, -1.344f, -0.828f, -2.55f, -2.083f, -3.033f)
            lineTo(17.615f, 2.55f)
            close()
            moveToRelative(-2.512f, 1.867f)
            curveToRelative(0.577f, -0.223f, 1.217f, -0.223f, 1.794f, 0f)
            lineTo(26.214f, 8f)
            lineTo(22.5f, 9.429f)
            lineTo(12.286f, 5.5f)
            lineToRelative(2.817f, -1.083f)
            close()
            moveTo(9.5f, 6.572f)
            lineTo(19.714f, 10.5f)
            lineTo(16f, 11.929f)
            lineTo(5.786f, 8f)
            lineTo(9.5f, 6.572f)
            close()
            moveTo(4.003f, 9.457f)
            lineTo(15f, 13.687f)
            verticalLineToRelative(13.857f)
            lineTo(4.801f, 23.621f)
            curveTo(4.32f, 23.436f, 4f, 22.972f, 4f, 22.455f)
            verticalLineTo(9.545f)
            curveToRelative(0f, -0.03f, 0.001f, -0.059f, 0.003f, -0.088f)
            close()
            moveTo(17f, 27.544f)
            verticalLineTo(13.687f)
            lineToRelative(10.997f, -4.23f)
            lineTo(28f, 9.545f)
            verticalLineToRelative(12.91f)
            curveToRelative(0f, 0.517f, -0.319f, 0.98f, -0.801f, 1.166f)
            lineTo(17f, 27.544f)
            close()
        }
    }.build()
}
