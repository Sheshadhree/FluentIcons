package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Ribbon16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Ribbon16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveTo(5.239f, 1f, 3f, 3.239f, 3f, 6f)
            curveToRelative(0f, 1.636f, 0.786f, 3.088f, 2f, 4f)
            curveToRelative(0.067f, 0.05f, 0.135f, 0.1f, 0.205f, 0.146f)
            curveTo(6.003f, 10.686f, 6.965f, 11f, 8f, 11f)
            curveToRelative(1.126f, 0f, 2.164f, -0.372f, 3f, -1f)
            curveToRelative(1.214f, -0.912f, 2f, -2.364f, 2f, -4f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            close()
            moveTo(5f, 14.5f)
            verticalLineToRelative(-3.303f)
            curveTo(5.883f, 11.707f, 6.907f, 12f, 8f, 12f)
            reflectiveCurveToRelative(2.117f, -0.292f, 3f, -0.803f)
            verticalLineTo(14.5f)
            curveToRelative(0f, 0.18f, -0.097f, 0.346f, -0.254f, 0.435f)
            curveToRelative(-0.156f, 0.089f, -0.349f, 0.086f, -0.503f, -0.006f)
            lineTo(8f, 13.583f)
            lineTo(5.757f, 14.93f)
            curveToRelative(-0.154f, 0.092f, -0.347f, 0.095f, -0.503f, 0.006f)
            curveTo(5.097f, 14.846f, 5f, 14.68f, 5f, 14.5f)
            close()
        }
    }.build()
}
