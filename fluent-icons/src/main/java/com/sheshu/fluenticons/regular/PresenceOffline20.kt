package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceOffline20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceOffline20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.707f, 6.293f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineTo(11.414f, 10f)
            lineToRelative(2.293f, 2.293f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineTo(10f, 11.414f)
            lineToRelative(-2.293f, 2.293f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineTo(8.586f, 10f)
            lineTo(6.293f, 7.707f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineTo(10f, 8.586f)
            lineToRelative(2.293f, -2.293f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            close()
            moveTo(0f, 10f)
            curveTo(0f, 4.477f, 4.477f, 0f, 10f, 0f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(0f, 15.523f, 0f, 10f)
            close()
            moveToRelative(10f, -8f)
            curveToRelative(-4.418f, 0f, -8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            close()
        }
    }.build()
}
