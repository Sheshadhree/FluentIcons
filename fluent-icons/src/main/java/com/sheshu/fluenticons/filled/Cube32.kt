package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cube32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cube32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.846f, 2.757f)
            curveToRelative(1.386f, -0.533f, 2.921f, -0.533f, 4.308f, 0f)
            lineToRelative(9.923f, 3.817f)
            curveTo(29.235f, 7.02f, 30f, 8.133f, 30f, 9.374f)
            verticalLineToRelative(13.253f)
            curveToRelative(0f, 1.241f, -0.765f, 2.354f, -1.923f, 2.8f)
            lineToRelative(-9.923f, 3.816f)
            curveToRelative(-1.387f, 0.534f, -2.921f, 0.534f, -4.308f, 0f)
            lineToRelative(-9.923f, -3.816f)
            curveTo(2.764f, 24.98f, 2f, 23.868f, 2f, 22.627f)
            verticalLineTo(9.374f)
            curveToRelative(0f, -1.241f, 0.764f, -2.355f, 1.923f, -2.8f)
            lineToRelative(9.923f, -3.817f)
            close()
            moveToRelative(-4.452f, 7.324f)
            curveTo(8.886f, 9.864f, 8.3f, 10.1f, 8.081f, 10.606f)
            curveTo(7.864f, 11.114f, 8.1f, 11.702f, 8.606f, 11.92f)
            lineTo(15f, 14.66f)
            verticalLineTo(21f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-6.34f)
            lineToRelative(6.394f, -2.74f)
            curveToRelative(0.508f, -0.218f, 0.743f, -0.806f, 0.525f, -1.314f)
            curveToRelative(-0.217f, -0.507f, -0.805f, -0.742f, -1.313f, -0.525f)
            lineTo(16f, 12.912f)
            lineToRelative(-6.606f, -2.83f)
            close()
        }
    }.build()
}
