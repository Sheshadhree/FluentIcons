package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChatDismiss16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatDismiss16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            curveToRelative(-1.094f, 0f, -2.12f, -0.293f, -3.004f, -0.805f)
            lineToRelative(-2.338f, 0.78f)
            curveToRelative(-0.176f, 0.058f, -0.37f, 0.014f, -0.504f, -0.114f)
            reflectiveCurveToRelative(-0.186f, -0.32f, -0.135f, -0.498f)
            lineToRelative(0.712f, -2.491f)
            curveTo(2.265f, 10.019f, 2f, 9.04f, 2f, 8f)
            close()
            moveToRelative(3.896f, -2.104f)
            lineTo(5.84f, 5.966f)
            curveTo(5.704f, 6.16f, 5.723f, 6.43f, 5.896f, 6.604f)
            lineTo(7.293f, 8f)
            lineTo(5.896f, 9.396f)
            lineTo(5.84f, 9.466f)
            curveTo(5.704f, 9.66f, 5.723f, 9.93f, 5.896f, 10.104f)
            lineToRelative(0.07f, 0.057f)
            curveToRelative(0.195f, 0.135f, 0.464f, 0.116f, 0.638f, -0.057f)
            lineTo(8f, 8.707f)
            lineToRelative(1.396f, 1.397f)
            lineToRelative(0.07f, 0.057f)
            curveToRelative(0.195f, 0.135f, 0.464f, 0.116f, 0.638f, -0.057f)
            lineToRelative(0.057f, -0.07f)
            curveToRelative(0.135f, -0.195f, 0.116f, -0.464f, -0.057f, -0.638f)
            lineTo(8.707f, 8f)
            lineToRelative(1.397f, -1.396f)
            lineToRelative(0.057f, -0.07f)
            curveToRelative(0.135f, -0.195f, 0.116f, -0.464f, -0.057f, -0.638f)
            lineToRelative(-0.07f, -0.057f)
            curveTo(9.84f, 5.704f, 9.57f, 5.723f, 9.396f, 5.896f)
            lineTo(8f, 7.293f)
            lineTo(6.604f, 5.896f)
            lineTo(6.534f, 5.84f)
            curveTo(6.34f, 5.704f, 6.07f, 5.723f, 5.896f, 5.896f)
            close()
        }
    }.build()
}
