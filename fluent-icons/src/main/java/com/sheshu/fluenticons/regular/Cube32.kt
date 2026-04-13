package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Cube32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cube32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.394f, 10.081f)
            curveTo(8.886f, 9.864f, 8.298f, 10.1f, 8.08f, 10.606f)
            curveToRelative(-0.218f, 0.508f, 0.017f, 1.096f, 0.525f, 1.313f)
            lineTo(15f, 14.66f)
            verticalLineTo(21f)
            curveToRelative(0f, 0.552f, 0.447f, 1f, 1f, 1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-6.34f)
            lineToRelative(6.394f, -2.74f)
            curveToRelative(0.507f, -0.218f, 0.743f, -0.806f, 0.525f, -1.314f)
            curveToRelative(-0.218f, -0.507f, -0.806f, -0.742f, -1.313f, -0.525f)
            lineTo(16f, 12.912f)
            lineToRelative(-6.606f, -2.83f)
            close()
            moveToRelative(8.76f, -7.324f)
            curveToRelative(-1.387f, -0.533f, -2.921f, -0.533f, -4.308f, 0f)
            lineTo(3.923f, 6.574f)
            curveTo(2.764f, 7.02f, 2f, 8.133f, 2f, 9.374f)
            verticalLineToRelative(13.253f)
            curveToRelative(0f, 1.241f, 0.764f, 2.354f, 1.923f, 2.8f)
            lineToRelative(9.923f, 3.816f)
            curveToRelative(1.386f, 0.534f, 2.921f, 0.534f, 4.308f, 0f)
            lineToRelative(9.923f, -3.816f)
            curveTo(29.235f, 24.98f, 30f, 23.868f, 30f, 22.627f)
            verticalLineTo(9.374f)
            curveToRelative(0f, -1.241f, -0.765f, -2.355f, -1.923f, -2.8f)
            lineToRelative(-9.923f, -3.817f)
            close()
            moveToRelative(-3.59f, 1.867f)
            curveToRelative(0.924f, -0.355f, 1.948f, -0.355f, 2.872f, 0f)
            lineToRelative(9.923f, 3.817f)
            curveTo(27.745f, 8.589f, 28f, 8.96f, 28f, 9.374f)
            verticalLineToRelative(13.253f)
            curveToRelative(0f, 0.414f, -0.255f, 0.785f, -0.641f, 0.933f)
            lineToRelative(-9.923f, 3.817f)
            curveToRelative(-0.924f, 0.355f, -1.948f, 0.355f, -2.872f, 0f)
            lineTo(4.641f, 23.56f)
            curveTo(4.255f, 23.412f, 4f, 23.04f, 4f, 22.627f)
            verticalLineTo(9.374f)
            curveTo(4f, 8.96f, 4.255f, 8.589f, 4.641f, 8.441f)
            lineToRelative(9.923f, -3.817f)
            close()
        }
    }.build()
}
