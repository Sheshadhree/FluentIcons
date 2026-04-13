package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonAlert32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonAlert32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 16f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            close()
            moveToRelative(-8.5f, 2f)
            curveTo(4.567f, 18f, 3f, 19.567f, 3f, 21.5f)
            verticalLineTo(22f)
            curveToRelative(0f, 2.393f, 1.523f, 4.417f, 3.685f, 5.793f)
            curveTo(8.859f, 29.177f, 11.802f, 30f, 15f, 30f)
            curveToRelative(1.69f, 0f, 3.31f, -0.23f, 4.782f, -0.651f)
            curveToRelative(-0.011f, -0.081f, -0.02f, -0.163f, -0.025f, -0.246f)
            lineTo(19.749f, 29f)
            horizontalLineToRelative(-3.098f)
            lineToRelative(-0.048f, -0.003f)
            curveToRelative(-1.845f, -0.118f, -2.791f, -2.325f, -1.534f, -3.74f)
            lineTo(17f, 23.085f)
            verticalLineTo(21f)
            curveToRelative(0f, -1.082f, 0.264f, -2.102f, 0.732f, -3f)
            horizontalLineTo(6.5f)
            close()
            moveToRelative(17f, -2f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            verticalLineToRelative(2.656f)
            lineToRelative(-2.31f, 2.597f)
            curveToRelative(-0.418f, 0.471f, -0.104f, 1.208f, 0.51f, 1.247f)
            horizontalLineToRelative(13.599f)
            curveToRelative(0.614f, -0.04f, 0.927f, -0.776f, 0.509f, -1.247f)
            lineTo(28.5f, 23.657f)
            verticalLineTo(21f)
            curveToRelative(0f, -2.761f, -2.238f, -5f, -5f, -5f)
            close()
            moveToRelative(0f, 15f)
            curveToRelative(-1.192f, 0f, -2.168f, -0.883f, -2.245f, -2f)
            horizontalLineToRelative(4.49f)
            curveToRelative(-0.077f, 1.117f, -1.053f, 2f, -2.245f, 2f)
            close()
        }
    }.build()
}
