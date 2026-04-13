package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Ribbon16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Ribbon16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveTo(5.239f, 1f, 3f, 3.239f, 3f, 6f)
            curveToRelative(0f, 1.636f, 0.786f, 3.088f, 2f, 4f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.18f, 0.097f, 0.346f, 0.254f, 0.435f)
            curveToRelative(0.156f, 0.089f, 0.349f, 0.086f, 0.503f, -0.006f)
            lineTo(8f, 13.583f)
            lineToRelative(2.243f, 1.346f)
            curveToRelative(0.154f, 0.092f, 0.347f, 0.095f, 0.503f, 0.006f)
            curveTo(10.903f, 14.846f, 11f, 14.68f, 11f, 14.5f)
            verticalLineTo(10f)
            curveToRelative(1.214f, -0.912f, 2f, -2.364f, 2f, -4f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            close()
            moveTo(4f, 6f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            close()
            moveToRelative(6f, 4.584f)
            verticalLineToRelative(3.033f)
            lineTo(8.257f, 12.57f)
            curveToRelative(-0.158f, -0.095f, -0.356f, -0.095f, -0.514f, 0f)
            lineTo(6f, 13.617f)
            verticalLineToRelative(-3.033f)
            curveTo(6.612f, 10.852f, 7.289f, 11f, 8f, 11f)
            curveToRelative(0.711f, 0f, 1.387f, -0.148f, 2f, -0.416f)
            close()
        }
    }.build()
}
