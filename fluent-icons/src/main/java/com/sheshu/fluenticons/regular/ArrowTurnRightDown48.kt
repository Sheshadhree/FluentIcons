package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnRightDown48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnRightDown48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.25f, 12.5f)
            curveTo(6.56f, 12.5f, 6f, 11.94f, 6f, 11.25f)
            reflectiveCurveTo(6.56f, 10f, 7.25f, 10f)
            horizontalLineToRelative(18.5f)
            curveToRelative(4.004f, 0f, 7.25f, 3.246f, 7.25f, 7.25f)
            verticalLineToRelative(18.168f)
            lineToRelative(6.854f, -7.04f)
            curveToRelative(0.482f, -0.495f, 1.273f, -0.505f, 1.768f, -0.024f)
            curveToRelative(0.495f, 0.482f, 0.505f, 1.273f, 0.024f, 1.768f)
            lineToRelative(-9.25f, 9.5f)
            curveTo(32.16f, 39.864f, 31.837f, 40f, 31.5f, 40f)
            curveToRelative(-0.337f, 0f, -0.66f, -0.136f, -0.896f, -0.378f)
            lineToRelative(-9.25f, -9.5f)
            curveToRelative(-0.481f, -0.495f, -0.47f, -1.286f, 0.024f, -1.768f)
            curveToRelative(0.495f, -0.481f, 1.286f, -0.47f, 1.768f, 0.024f)
            lineToRelative(7.354f, 7.553f)
            verticalLineTo(17.25f)
            curveToRelative(0f, -2.623f, -2.127f, -4.75f, -4.75f, -4.75f)
            horizontalLineTo(7.25f)
            close()
        }
    }.build()
}
