package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnUpLeft48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnUpLeft48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(35.5f, 40.75f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveTo(38f, 41.44f, 38f, 40.75f)
            verticalLineToRelative(-18.5f)
            curveToRelative(0f, -4.004f, -3.246f, -7.25f, -7.25f, -7.25f)
            horizontalLineTo(12.582f)
            lineToRelative(7.04f, -6.854f)
            curveToRelative(0.495f, -0.482f, 0.505f, -1.273f, 0.024f, -1.768f)
            curveToRelative(-0.482f, -0.495f, -1.273f, -0.505f, -1.768f, -0.024f)
            lineToRelative(-9.5f, 9.25f)
            curveTo(8.136f, 15.84f, 8f, 16.163f, 8f, 16.5f)
            curveToRelative(0f, 0.337f, 0.136f, 0.66f, 0.378f, 0.896f)
            lineToRelative(9.5f, 9.25f)
            curveToRelative(0.495f, 0.481f, 1.286f, 0.47f, 1.768f, -0.024f)
            curveToRelative(0.481f, -0.495f, 0.47f, -1.286f, -0.024f, -1.768f)
            lineTo(12.069f, 17.5f)
            horizontalLineTo(30.75f)
            curveToRelative(2.623f, 0f, 4.75f, 2.127f, 4.75f, 4.75f)
            verticalLineToRelative(18.5f)
            close()
        }
    }.build()
}
