package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.InprivateAccount16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.InprivateAccount16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 8f)
            curveTo(12.328f, 8f, 13f, 8.672f, 13f, 9.5f)
            horizontalLineTo(8f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(4.96f)
            curveToRelative(-0.053f, 0.34f, -0.161f, 0.678f, -0.32f, 1f)
            horizontalLineTo(8f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(3.929f)
            curveTo(11.073f, 13.383f, 9.731f, 14f, 8f, 14f)
            curveToRelative(-3.14f, 0f, -5f, -2.029f, -5f, -4f)
            verticalLineTo(9.5f)
            curveTo(3f, 8.672f, 3.672f, 8f, 4.5f, 8f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(-0.795f, -4.25f)
            curveToRelative(0.03f, 0.162f, 0.045f, 0.33f, 0.045f, 0.5f)
            curveToRelative(0f, 0.17f, -0.016f, 0.338f, -0.045f, 0.5f)
            horizontalLineTo(8f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(2.305f)
            curveTo(9.815f, 6.503f, 8.965f, 7f, 8f, 7f)
            curveTo(6.481f, 7f, 5.25f, 5.769f, 5.25f, 4.25f)
            reflectiveCurveTo(6.481f, 1.5f, 8f, 1.5f)
            curveToRelative(0.965f, 0f, 1.815f, 0.497f, 2.305f, 1.25f)
            horizontalLineTo(8f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(2.705f)
            close()
        }
    }.build()
}
