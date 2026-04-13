package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CompassNorthwest28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CompassNorthwest28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 14f)
            curveTo(3.5f, 8.201f, 8.201f, 3.5f, 14f, 3.5f)
            reflectiveCurveTo(24.5f, 8.201f, 24.5f, 14f)
            reflectiveCurveTo(19.799f, 24.5f, 14f, 24.5f)
            reflectiveCurveTo(3.5f, 19.799f, 3.5f, 14f)
            close()
            moveTo(14f, 2f)
            curveTo(7.373f, 2f, 2f, 7.373f, 2f, 14f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(20.627f, 2f, 14f, 2f)
            close()
            moveTo(8.083f, 9.698f)
            curveToRelative(-0.388f, -1.01f, 0.604f, -2.003f, 1.615f, -1.615f)
            lineToRelative(4.995f, 1.92f)
            curveToRelative(1.52f, 0.583f, 2.72f, 1.784f, 3.305f, 3.304f)
            lineToRelative(1.919f, 4.995f)
            curveToRelative(0.388f, 1.01f, -0.605f, 2.003f, -1.615f, 1.615f)
            lineToRelative(-4.995f, -1.92f)
            curveToRelative(-1.52f, -0.583f, -2.72f, -1.784f, -3.305f, -3.304f)
            lineTo(8.083f, 9.698f)
            close()
            moveToRelative(1.602f, -0.013f)
            lineToRelative(1.717f, 4.47f)
            curveToRelative(0.432f, 1.123f, 1.32f, 2.011f, 2.443f, 2.443f)
            lineToRelative(4.47f, 1.717f)
            lineToRelative(-1.717f, -4.47f)
            curveToRelative(-0.432f, -1.123f, -1.32f, -2.01f, -2.443f, -2.443f)
            lineToRelative(-4.47f, -1.717f)
            close()
        }
    }.build()
}
