package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SyncOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SyncOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 8f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            curveToRelative(0f, -0.34f, 0.028f, -0.675f, 0.083f, -1f)
            curveTo(2.559f, 4.162f, 5.027f, 2f, 8f, 2f)
            reflectiveCurveToRelative(5.441f, 2.162f, 5.917f, 5f)
            lineToRelative(0.002f, 0.012f)
            curveTo(13.972f, 7.333f, 14f, 7.663f, 14f, 8f)
            close()
            moveToRelative(-1f, 0f)
            horizontalLineTo(9.941f)
            lineTo(8.97f, 10.67f)
            curveToRelative(-0.094f, 0.26f, -0.381f, 0.394f, -0.64f, 0.3f)
            curveToRelative(-0.26f, -0.095f, -0.394f, -0.381f, -0.3f, -0.64f)
            lineToRelative(2f, -5.5f)
            curveToRelative(0.095f, -0.26f, 0.382f, -0.394f, 0.641f, -0.3f)
            curveToRelative(0.26f, 0.095f, 0.393f, 0.381f, 0.299f, 0.64f)
            lineTo(10.305f, 7f)
            horizontalLineTo(12.9f)
            curveTo(12.437f, 4.718f, 10.419f, 3f, 8f, 3f)
            curveTo(5.581f, 3f, 3.563f, 4.718f, 3.1f, 7f)
            horizontalLineToRelative(3.14f)
            lineToRelative(0.79f, -2.17f)
            curveToRelative(0.095f, -0.26f, 0.381f, -0.394f, 0.641f, -0.3f)
            curveToRelative(0.26f, 0.095f, 0.393f, 0.381f, 0.299f, 0.64f)
            lineToRelative(-2f, 5.5f)
            curveToRelative(-0.094f, 0.26f, -0.381f, 0.394f, -0.64f, 0.3f)
            curveToRelative(-0.26f, -0.095f, -0.394f, -0.381f, -0.3f, -0.64f)
            lineTo(5.877f, 8f)
            horizontalLineTo(3f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            close()
        }
    }.build()
}
