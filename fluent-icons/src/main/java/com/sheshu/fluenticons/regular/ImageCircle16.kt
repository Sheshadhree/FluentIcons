package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ImageCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3f)
            curveTo(5.239f, 3f, 3f, 5.239f, 3f, 8f)
            curveToRelative(0f, 1.208f, 0.429f, 2.316f, 1.142f, 3.18f)
            lineToRelative(2.806f, -2.76f)
            curveToRelative(0.584f, -0.575f, 1.52f, -0.575f, 2.105f, 0f)
            lineToRelative(2.805f, 2.761f)
            curveTo(12.572f, 10.316f, 13f, 9.208f, 13f, 8f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            close()
            moveToRelative(0f, 10f)
            curveToRelative(1.193f, 0f, 2.289f, -0.418f, 3.149f, -1.116f)
            lineTo(8.35f, 9.131f)
            curveToRelative(-0.195f, -0.191f, -0.507f, -0.191f, -0.701f, 0f)
            lineToRelative(-2.798f, 2.754f)
            curveTo(5.712f, 12.582f, 6.807f, 13f, 8f, 13f)
            close()
            moveTo(2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            close()
            moveToRelative(8f, -1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
