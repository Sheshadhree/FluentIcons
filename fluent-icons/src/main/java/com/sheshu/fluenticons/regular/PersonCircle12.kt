package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonCircle12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonCircle12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.217f, 6.264f)
            curveTo(4.347f, 6.119f, 4.543f, 6f, 4.775f, 6f)
            horizontalLineToRelative(2.45f)
            curveToRelative(0.232f, 0f, 0.428f, 0.118f, 0.558f, 0.264f)
            curveTo(7.913f, 6.41f, 8f, 6.609f, 8f, 6.81f)
            verticalLineToRelative(0.16f)
            curveTo(8f, 7.787f, 7.183f, 8.5f, 6f, 8.5f)
            reflectiveCurveTo(4f, 7.787f, 4f, 6.97f)
            verticalLineTo(6.81f)
            curveToRelative(0f, -0.202f, 0.087f, -0.4f, 0.217f, -0.545f)
            close()
            moveTo(6f, 5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveTo(6.552f, 3f, 6f, 3f)
            reflectiveCurveTo(5f, 3.448f, 5f, 4f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveToRelative(0f, 6f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            reflectiveCurveTo(8.761f, 1f, 6f, 1f)
            reflectiveCurveTo(1f, 3.239f, 1f, 6f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            close()
            moveToRelative(0f, -1f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            close()
        }
    }.build()
}
