package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ColorLine24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ColorLine24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.382f, 14f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(16f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-6.454f)
            lineToRelative(-1.316f, 1.314f)
            curveToRelative(-0.38f, 0.38f, -0.848f, 0.659f, -1.362f, 0.813f)
            lineToRelative(-4.293f, 1.288f)
            curveToRelative(-1.058f, 0.318f, -2.173f, -0.282f, -2.49f, -1.34f)
            curveToRelative(-0.117f, -0.388f, -0.113f, -0.802f, 0.011f, -1.188f)
            lineTo(4.382f, 14f)
            close()
            moveTo(18.648f, 2.944f)
            curveToRelative(1.256f, 1.257f, 1.256f, 3.295f, -0.002f, 4.551f)
            lineToRelative(-7.123f, 7.111f)
            curveToRelative(-0.263f, 0.263f, -0.587f, 0.456f, -0.942f, 0.563f)
            lineToRelative(-4.293f, 1.289f)
            curveToRelative(-0.53f, 0.158f, -1.087f, -0.142f, -1.246f, -0.67f)
            curveToRelative(-0.058f, -0.195f, -0.056f, -0.402f, 0.006f, -0.595f)
            lineToRelative(1.362f, -4.228f)
            curveToRelative(0.11f, -0.34f, 0.298f, -0.65f, 0.552f, -0.902f)
            lineToRelative(7.132f, -7.122f)
            curveToRelative(1.259f, -1.256f, 3.297f, -1.255f, 4.554f, 0.003f)
            close()
        }
    }.build()
}
