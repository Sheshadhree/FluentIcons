package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnLeftDown48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnLeftDown48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(40.75f, 12.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(41.44f, 10f, 40.75f, 10f)
            horizontalLineToRelative(-18.5f)
            curveTo(18.246f, 10f, 15f, 13.246f, 15f, 17.25f)
            verticalLineToRelative(18.168f)
            lineToRelative(-6.854f, -7.04f)
            curveToRelative(-0.482f, -0.495f, -1.273f, -0.505f, -1.768f, -0.024f)
            curveToRelative(-0.495f, 0.482f, -0.505f, 1.273f, -0.024f, 1.768f)
            lineToRelative(9.25f, 9.5f)
            curveTo(15.84f, 39.864f, 16.163f, 40f, 16.5f, 40f)
            curveToRelative(0.337f, 0f, 0.66f, -0.136f, 0.896f, -0.378f)
            lineToRelative(9.25f, -9.5f)
            curveToRelative(0.481f, -0.495f, 0.47f, -1.286f, -0.024f, -1.768f)
            curveToRelative(-0.495f, -0.481f, -1.286f, -0.47f, -1.768f, 0.024f)
            lineTo(17.5f, 35.931f)
            verticalLineTo(17.25f)
            curveToRelative(0f, -2.623f, 2.127f, -4.75f, 4.75f, -4.75f)
            horizontalLineToRelative(18.5f)
            close()
        }
    }.build()
}
