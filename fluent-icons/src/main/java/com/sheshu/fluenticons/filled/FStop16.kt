package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FStop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FStop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.055f, 4.105f)
            curveToRelative(0.194f, -1.18f, 1.408f, -1.895f, 2.534f, -1.494f)
            lineTo(12f, 2.757f)
            curveToRelative(0.39f, 0.139f, 0.819f, -0.065f, 0.958f, -0.455f)
            reflectiveCurveToRelative(-0.065f, -0.82f, -0.455f, -0.958f)
            lineToRelative(-0.41f, -0.146f)
            curveToRelative(-2.006f, -0.715f, -4.17f, 0.561f, -4.517f, 2.663f)
            lineTo(7.1f, 6.751f)
            horizontalLineTo(4.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.335f, -0.75f, 0.75f)
            curveToRelative(0f, 0.413f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.352f)
            lineToRelative(-0.434f, 2.632f)
            curveToRelative(-0.223f, 1.359f, -1.764f, 2.045f, -2.924f, 1.303f)
            lineToRelative(-0.34f, -0.218f)
            curveToRelative(-0.349f, -0.223f, -0.812f, -0.121f, -1.036f, 0.228f)
            curveToRelative(-0.223f, 0.349f, -0.121f, 0.813f, 0.228f, 1.036f)
            lineToRelative(0.34f, 0.217f)
            curveToRelative(2.067f, 1.323f, 4.814f, 0.1f, 5.213f, -2.322f)
            lineTo(8.372f, 8.25f)
            horizontalLineTo(10.5f)
            curveToRelative(0.415f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.335f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(8.62f)
            lineToRelative(0.435f, -2.645f)
            close()
        }
    }.build()
}
