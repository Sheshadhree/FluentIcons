package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TagCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TagCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 7f)
            curveTo(6.672f, 7f, 6f, 7.672f, 6f, 8.5f)
            verticalLineToRelative(3f)
            curveTo(6f, 12.328f, 6.672f, 13f, 7.5f, 13f)
            horizontalLineToRelative(4.058f)
            curveToRelative(0.4f, 0f, 0.789f, -0.137f, 1.1f, -0.39f)
            lineToRelative(1.786f, -1.444f)
            curveToRelative(0.742f, -0.6f, 0.742f, -1.732f, 0f, -2.332f)
            lineTo(12.658f, 7.39f)
            curveToRelative(-0.311f, -0.252f, -0.7f, -0.39f, -1.1f, -0.39f)
            horizontalLineTo(7.5f)
            close()
            moveTo(7f, 8.5f)
            curveTo(7f, 8.224f, 7.224f, 8f, 7.5f, 8f)
            horizontalLineToRelative(4.058f)
            curveToRelative(0.171f, 0f, 0.338f, 0.059f, 0.471f, 0.167f)
            lineToRelative(1.786f, 1.444f)
            curveToRelative(0.247f, 0.2f, 0.247f, 0.578f, 0f, 0.778f)
            lineToRelative(-1.786f, 1.444f)
            curveTo(11.896f, 11.941f, 11.73f, 12f, 11.558f, 12f)
            horizontalLineTo(7.5f)
            curveTo(7.224f, 12f, 7f, 11.776f, 7f, 11.5f)
            verticalLineToRelative(-3f)
            close()
            moveTo(10f, 2f)
            curveToRelative(-4.418f, 0f, -8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            close()
            moveToRelative(-7f, 8f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            close()
        }
    }.build()
}
