package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 8f)
            curveToRelative(0f, 1.481f, -0.537f, 2.837f, -1.427f, 3.884f)
            lineToRelative(-3.52f, -3.466f)
            curveToRelative(-0.585f, -0.574f, -1.521f, -0.574f, -2.105f, 0f)
            lineToRelative(-3.521f, 3.466f)
            curveTo(2.537f, 10.837f, 2f, 9.481f, 2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            close()
            moveTo(8.35f, 9.131f)
            lineToRelative(3.515f, 3.459f)
            curveTo(10.82f, 13.47f, 9.472f, 14f, 8f, 14f)
            curveToRelative(-1.472f, 0f, -2.82f, -0.53f, -3.865f, -1.41f)
            lineTo(7.65f, 9.13f)
            curveToRelative(0.195f, -0.191f, 0.507f, -0.191f, 0.702f, 0f)
            close()
            moveTo(10f, 7f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
