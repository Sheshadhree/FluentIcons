package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Directions32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Directions32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.318f, 19.182f)
            curveToRelative(-1.757f, -1.758f, -1.757f, -4.607f, 0f, -6.364f)
            lineToRelative(9.5f, -9.5f)
            curveToRelative(1.757f, -1.757f, 4.606f, -1.757f, 6.364f, 0f)
            lineToRelative(9.5f, 9.5f)
            curveToRelative(1.757f, 1.757f, 1.757f, 4.606f, 0f, 6.364f)
            lineToRelative(-9.5f, 9.5f)
            curveToRelative(-1.758f, 1.757f, -4.607f, 1.757f, -6.364f, 0f)
            lineToRelative(-9.5f, -9.5f)
            close()
            moveToRelative(15.39f, -9.89f)
            curveToRelative(-0.391f, -0.39f, -1.025f, -0.39f, -1.415f, 0f)
            curveToRelative(-0.39f, 0.391f, -0.39f, 1.025f, 0f, 1.415f)
            lineTo(18.586f, 12f)
            horizontalLineTo(16f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2.586f)
            lineToRelative(-1.293f, 1.293f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-3f, -3f)
            close()
        }
    }.build()
}
