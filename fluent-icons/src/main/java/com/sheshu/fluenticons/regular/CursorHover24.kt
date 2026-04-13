package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CursorHover24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CursorHover24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 5.5f)
            horizontalLineToRelative(-15f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineTo(9f)
            verticalLineTo(18f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 18f, 2f, 16.88f, 2f, 15.5f)
            verticalLineToRelative(-9f)
            curveTo(2f, 5.12f, 3.12f, 4f, 4.5f, 4f)
            horizontalLineToRelative(15f)
            curveTo(20.88f, 4f, 22f, 5.12f, 22f, 6.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.218f, -0.872f, 2.233f, -2.025f, 2.455f)
            curveToRelative(-0.075f, -0.437f, -0.315f, -0.841f, -0.69f, -1.116f)
            lineTo(18.946f, 16.5f)
            horizontalLineTo(19.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(-8.22f, 4.72f)
            curveToRelative(-0.214f, -0.215f, -0.537f, -0.279f, -0.817f, -0.163f)
            curveTo(10.183f, 10.173f, 10f, 10.447f, 10f, 10.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.328f, 0.214f, 0.619f, 0.527f, 0.716f)
            curveToRelative(0.314f, 0.098f, 0.655f, -0.02f, 0.841f, -0.291f)
            lineToRelative(2.467f, -3.588f)
            lineToRelative(4.26f, 0.897f)
            curveToRelative(0.325f, 0.068f, 0.656f, -0.085f, 0.815f, -0.377f)
            curveToRelative(0.157f, -0.292f, 0.105f, -0.653f, -0.13f, -0.887f)
            lineToRelative(-7.5f, -7.5f)
            close()
            moveToRelative(0.22f, 8.615f)
            verticalLineToRelative(-6.274f)
            lineToRelative(4.436f, 4.435f)
            lineToRelative(-2.281f, -0.48f)
            curveToRelative(-0.297f, -0.062f, -0.601f, 0.06f, -0.773f, 0.31f)
            lineToRelative(-1.382f, 2.01f)
            close()
        }
    }.build()
}
