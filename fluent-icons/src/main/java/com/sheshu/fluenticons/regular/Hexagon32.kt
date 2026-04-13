package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Hexagon32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Hexagon32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.619f, 5f)
            curveTo(10.27f, 5f, 9.948f, 5.181f, 9.766f, 5.478f)
            lineToRelative(-6.124f, 10f)
            curveToRelative(-0.196f, 0.32f, -0.196f, 0.724f, 0f, 1.044f)
            lineToRelative(6.124f, 10f)
            curveTo(9.947f, 26.82f, 10.27f, 27f, 10.619f, 27f)
            horizontalLineToRelative(10.758f)
            curveToRelative(0.348f, 0f, 0.671f, -0.181f, 0.853f, -0.478f)
            lineToRelative(6.12f, -10f)
            curveToRelative(0.196f, -0.32f, 0.196f, -0.724f, 0f, -1.044f)
            lineToRelative(-6.12f, -10f)
            curveTo(22.048f, 5.181f, 21.725f, 5f, 21.377f, 5f)
            horizontalLineTo(10.62f)
            close()
            moveTo(8.06f, 4.433f)
            curveTo(8.605f, 3.543f, 9.574f, 3f, 10.62f, 3f)
            horizontalLineToRelative(10.758f)
            curveToRelative(1.045f, 0f, 2.014f, 0.543f, 2.56f, 1.434f)
            lineToRelative(6.119f, 10f)
            curveToRelative(0.588f, 0.961f, 0.588f, 2.17f, 0f, 3.132f)
            lineToRelative(-6.12f, 10f)
            curveTo(23.391f, 28.456f, 22.422f, 29f, 21.377f, 29f)
            horizontalLineTo(10.62f)
            curveToRelative(-1.045f, 0f, -2.014f, -0.543f, -2.559f, -1.433f)
            lineToRelative(-6.123f, -10f)
            curveToRelative(-0.59f, -0.962f, -0.59f, -2.172f, 0f, -3.134f)
            lineToRelative(6.123f, -10f)
            close()
        }
    }.build()
}
