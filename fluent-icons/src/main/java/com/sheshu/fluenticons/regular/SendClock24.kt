package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SendClock24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SendClock24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.3f, 3.272f)
            lineTo(5.693f, 12f)
            lineToRelative(-3.395f, 8.728f)
            lineToRelative(-0.03f, 0.096f)
            curveToRelative(-0.151f, 0.602f, 0.482f, 1.138f, 1.065f, 0.847f)
            lineToRelative(7.674f, -3.838f)
            curveTo(11.003f, 17.723f, 11f, 17.612f, 11f, 17.5f)
            curveToRelative(0f, -0.487f, 0.053f, -0.96f, 0.155f, -1.417f)
            lineTo(4.402f, 19.46f)
            lineToRelative(2.61f, -6.71f)
            horizontalLineToRelative(6.051f)
            curveToRelative(0.391f, -0.366f, 0.828f, -0.684f, 1.3f, -0.944f)
            curveToRelative(-0.085f, -0.32f, -0.377f, -0.556f, -0.724f, -0.556f)
            horizontalLineTo(7.01f)
            lineTo(4.402f, 4.54f)
            lineToRelative(12.924f, 6.462f)
            lineTo(17.5f, 11f)
            curveToRelative(1.553f, 0f, 2.98f, 0.545f, 4.098f, 1.454f)
            curveToRelative(0.267f, -0.353f, 0.179f, -0.903f, -0.264f, -1.125f)
            lineToRelative(-18f, -9f)
            lineTo(3.24f, 2.29f)
            curveTo(2.655f, 2.084f, 2.063f, 2.665f, 2.3f, 3.273f)
            close()
            moveTo(23f, 17.5f)
            curveToRelative(0f, -3.038f, -2.462f, -5.5f, -5.5f, -5.5f)
            reflectiveCurveTo(12f, 14.462f, 12f, 17.5f)
            reflectiveCurveToRelative(2.462f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.462f, 5.5f, -5.5f)
            close()
            moveTo(17.5f, 14f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(20.276f, 18f, 20f, 18f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
