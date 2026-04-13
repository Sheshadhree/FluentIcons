package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonCircle12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonCircle12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 6f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            reflectiveCurveTo(1f, 8.761f, 1f, 6f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            close()
            moveTo(4.217f, 6.264f)
            curveTo(4.087f, 6.41f, 4f, 6.609f, 4f, 6.81f)
            verticalLineToRelative(0.16f)
            curveTo(4f, 7.787f, 4.817f, 8.5f, 6f, 8.5f)
            reflectiveCurveToRelative(2f, -0.713f, 2f, -1.53f)
            verticalLineTo(6.81f)
            curveToRelative(0f, -0.202f, -0.087f, -0.4f, -0.217f, -0.545f)
            curveTo(7.653f, 6.117f, 7.457f, 6f, 7.225f, 6f)
            horizontalLineToRelative(-2.45f)
            curveTo(4.543f, 6f, 4.347f, 6.118f, 4.217f, 6.264f)
            close()
            moveTo(6f, 5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveTo(6.552f, 3f, 6f, 3f)
            reflectiveCurveTo(5f, 3.448f, 5f, 4f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
