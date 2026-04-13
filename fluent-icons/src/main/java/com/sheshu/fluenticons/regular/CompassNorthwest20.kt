package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CompassNorthwest20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CompassNorthwest20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 10f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            close()
            moveToRelative(7f, -8f)
            curveToRelative(-4.418f, 0f, -8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            close()
            moveTo(6.096f, 7.42f)
            curveTo(5.715f, 6.58f, 6.58f, 5.715f, 7.421f, 6.097f)
            lineToRelative(3.262f, 1.483f)
            curveToRelative(0.77f, 0.35f, 1.387f, 0.968f, 1.738f, 1.738f)
            lineToRelative(1.482f, 3.262f)
            curveToRelative(0.383f, 0.841f, -0.483f, 1.707f, -1.324f, 1.324f)
            lineToRelative(-3.262f, -1.482f)
            curveToRelative(-0.77f, -0.35f, -1.388f, -0.968f, -1.738f, -1.738f)
            lineTo(6.097f, 7.42f)
            close()
            moveToRelative(4.173f, 1.07f)
            lineTo(7.007f, 7.007f)
            lineToRelative(1.483f, 3.262f)
            curveToRelative(0.25f, 0.55f, 0.69f, 0.991f, 1.241f, 1.241f)
            lineToRelative(3.262f, 1.483f)
            lineToRelative(-1.483f, -3.262f)
            curveToRelative(-0.25f, -0.55f, -0.69f, -0.991f, -1.241f, -1.241f)
            close()
        }
    }.build()
}
