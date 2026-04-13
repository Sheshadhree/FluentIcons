package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CursorHover24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CursorHover24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 4f)
            curveTo(3.12f, 4f, 2f, 5.12f, 2f, 6.5f)
            verticalLineToRelative(9f)
            curveTo(2f, 16.88f, 3.12f, 18f, 4.5f, 18f)
            horizontalLineTo(9f)
            verticalLineToRelative(-7.25f)
            curveToRelative(0f, -0.66f, 0.37f, -1.263f, 0.959f, -1.561f)
            curveToRelative(0.588f, -0.298f, 1.294f, -0.24f, 1.826f, 0.15f)
            lineToRelative(7.5f, 7.5f)
            curveToRelative(0.375f, 0.275f, 0.615f, 0.679f, 0.69f, 1.116f)
            curveTo(21.128f, 17.733f, 22f, 16.718f, 22f, 15.5f)
            verticalLineToRelative(-9f)
            curveTo(22f, 5.12f, 20.88f, 4f, 19.5f, 4f)
            horizontalLineToRelative(-15f)
            close()
            moveToRelative(6.78f, 6.22f)
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
        }
    }.build()
}
