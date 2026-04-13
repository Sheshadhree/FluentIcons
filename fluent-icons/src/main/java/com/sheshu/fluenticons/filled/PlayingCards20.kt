package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PlayingCards20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PlayingCards20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.068f, 13.01f)
            curveToRelative(-0.285f, 1.066f, 0.35f, 2.164f, 1.416f, 2.451f)
            lineToRelative(5.46f, 1.47f)
            curveToRelative(1.067f, 0.287f, 2.163f, -0.346f, 2.447f, -1.413f)
            lineToRelative(2.54f, -9.523f)
            curveToRelative(0.285f, -1.067f, -0.348f, -2.165f, -1.415f, -2.452f)
            lineToRelative(-5.46f, -1.47f)
            curveTo(8.989f, 1.788f, 7.893f, 2.42f, 7.609f, 3.487f)
            lineToRelative(-2.54f, 9.523f)
            close()
            moveTo(5f, 4.001f)
            verticalLineToRelative(5.382f)
            lineToRelative(1.772f, -6.64f)
            curveToRelative(0.072f, -0.272f, 0.186f, -0.52f, 0.334f, -0.742f)
            horizontalLineTo(7f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            close()
            moveTo(2.67f, 5.506f)
            lineTo(4f, 10.469f)
            verticalLineTo(4.002f)
            curveToRelative(0f, -0.338f, 0.056f, -0.663f, 0.16f, -0.965f)
            lineToRelative(-0.075f, 0.02f)
            curveToRelative(-1.066f, 0.285f, -1.7f, 1.382f, -1.414f, 2.449f)
            close()
            moveTo(13f, 6f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(-3f, 8f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            close()
        }
    }.build()
}
