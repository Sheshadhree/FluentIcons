package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Hexagon32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Hexagon32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.617f, 3f)
            curveTo(9.572f, 3f, 8.603f, 3.543f, 8.058f, 4.433f)
            lineToRelative(-6.123f, 10f)
            curveToRelative(-0.589f, 0.962f, -0.589f, 2.172f, 0f, 3.134f)
            lineToRelative(6.123f, 10f)
            curveTo(8.603f, 28.457f, 9.572f, 29f, 10.617f, 29f)
            horizontalLineToRelative(10.758f)
            curveToRelative(1.045f, 0f, 2.014f, -0.543f, 2.56f, -1.434f)
            lineToRelative(6.119f, -10f)
            curveToRelative(0.588f, -0.961f, 0.588f, -2.17f, 0f, -3.132f)
            lineToRelative(-6.12f, -10f)
            curveTo(23.39f, 3.544f, 22.42f, 3f, 21.375f, 3f)
            horizontalLineTo(10.617f)
            close()
        }
    }.build()
}
