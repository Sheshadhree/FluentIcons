package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pulse20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pulse20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.01f, 3f)
            curveToRelative(0.332f, 0.004f, 0.623f, 0.227f, 0.712f, 0.548f)
            lineToRelative(2.821f, 10.075f)
            lineToRelative(2.242f, -7.099f)
            curveToRelative(0.094f, -0.299f, 0.365f, -0.508f, 0.678f, -0.523f)
            curveToRelative(0.313f, -0.016f, 0.603f, 0.165f, 0.726f, 0.454f)
            lineTo(15.495f, 9.5f)
            horizontalLineToRelative(1.755f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(17.664f, 11f, 17.25f, 11f)
            horizontalLineTo(15f)
            curveToRelative(-0.3f, 0f, -0.571f, -0.179f, -0.69f, -0.455f)
            lineToRelative(-0.703f, -1.642f)
            lineToRelative(-2.392f, 7.573f)
            curveToRelative(-0.1f, 0.316f, -0.396f, 0.53f, -0.727f, 0.524f)
            curveToRelative(-0.332f, -0.006f, -0.62f, -0.228f, -0.71f, -0.548f)
            lineTo(6.966f, 6.41f)
            lineToRelative(-1.25f, 4.06f)
            curveTo(5.62f, 10.786f, 5.33f, 11f, 5f, 11f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 11f, 2f, 10.664f, 2f, 10.25f)
            reflectiveCurveTo(2.336f, 9.5f, 2.75f, 9.5f)
            horizontalLineToRelative(1.696f)
            lineToRelative(1.837f, -5.97f)
            curveTo(6.381f, 3.21f, 6.677f, 2.995f, 7.01f, 3f)
            close()
        }
    }.build()
}
