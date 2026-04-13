package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnDownLeft48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnDownLeft48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(35.5f, 7.25f)
            curveTo(35.5f, 6.56f, 36.06f, 6f, 36.75f, 6f)
            reflectiveCurveTo(38f, 6.56f, 38f, 7.25f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 4.004f, -3.246f, 7.25f, -7.25f, 7.25f)
            horizontalLineTo(12.582f)
            lineToRelative(7.04f, 6.854f)
            curveToRelative(0.495f, 0.482f, 0.505f, 1.273f, 0.024f, 1.768f)
            curveToRelative(-0.482f, 0.495f, -1.273f, 0.505f, -1.768f, 0.024f)
            lineToRelative(-9.5f, -9.25f)
            curveTo(8.136f, 32.16f, 8f, 31.837f, 8f, 31.5f)
            curveToRelative(0f, -0.337f, 0.136f, -0.66f, 0.378f, -0.896f)
            lineToRelative(9.5f, -9.25f)
            curveToRelative(0.495f, -0.481f, 1.286f, -0.47f, 1.768f, 0.024f)
            curveToRelative(0.481f, 0.495f, 0.47f, 1.286f, -0.024f, 1.768f)
            lineTo(12.069f, 30.5f)
            horizontalLineTo(30.75f)
            curveToRelative(2.623f, 0f, 4.75f, -2.127f, 4.75f, -4.75f)
            verticalLineTo(7.25f)
            close()
        }
    }.build()
}
