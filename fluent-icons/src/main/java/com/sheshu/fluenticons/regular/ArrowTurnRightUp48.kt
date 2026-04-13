package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnRightUp48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnRightUp48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.25f, 35.5f)
            curveTo(6.56f, 35.5f, 6f, 36.06f, 6f, 36.75f)
            reflectiveCurveTo(6.56f, 38f, 7.25f, 38f)
            horizontalLineToRelative(18.5f)
            curveToRelative(4.004f, 0f, 7.25f, -3.246f, 7.25f, -7.25f)
            verticalLineTo(12.582f)
            lineToRelative(6.854f, 7.04f)
            curveToRelative(0.482f, 0.495f, 1.273f, 0.505f, 1.768f, 0.024f)
            curveToRelative(0.495f, -0.482f, 0.505f, -1.273f, 0.024f, -1.768f)
            lineToRelative(-9.25f, -9.5f)
            curveTo(32.16f, 8.136f, 31.837f, 8f, 31.5f, 8f)
            curveToRelative(-0.337f, 0f, -0.66f, 0.136f, -0.896f, 0.378f)
            lineToRelative(-9.25f, 9.5f)
            curveToRelative(-0.481f, 0.495f, -0.47f, 1.286f, 0.024f, 1.768f)
            curveToRelative(0.495f, 0.481f, 1.286f, 0.47f, 1.768f, -0.024f)
            lineToRelative(7.354f, -7.553f)
            verticalLineTo(30.75f)
            curveToRelative(0f, 2.623f, -2.127f, 4.75f, -4.75f, 4.75f)
            horizontalLineTo(7.25f)
            close()
        }
    }.build()
}
