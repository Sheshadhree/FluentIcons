package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DiamondDismiss32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DiamondDismiss32",
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
            moveToRelative(9.39f, -7.89f)
            curveToRelative(-0.391f, -0.39f, -1.025f, -0.39f, -1.415f, 0f)
            curveToRelative(-0.39f, 0.391f, -0.39f, 1.025f, 0f, 1.415f)
            lineTo(14.586f, 16f)
            lineToRelative(-3.293f, 3.293f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineTo(16f, 17.414f)
            lineToRelative(3.293f, 3.293f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineTo(17.414f, 16f)
            lineToRelative(3.293f, -3.293f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineTo(16f, 14.586f)
            lineToRelative(-3.293f, -3.293f)
            close()
        }
    }.build()
}
