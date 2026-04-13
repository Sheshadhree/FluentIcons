package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.History32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.History32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 5f)
            curveToRelative(6.075f, 0f, 11f, 4.925f, 11f, 11f)
            reflectiveCurveToRelative(-4.925f, 11f, -11f, 11f)
            reflectiveCurveTo(5f, 22.075f, 5f, 16f)
            curveToRelative(0f, -0.31f, 0.013f, -0.615f, 0.038f, -0.918f)
            curveToRelative(0.045f, -0.55f, -0.364f, -1.033f, -0.915f, -1.079f)
            curveToRelative(-0.55f, -0.045f, -1.033f, 0.364f, -1.079f, 0.915f)
            curveTo(3.016f, 15.275f, 3f, 15.636f, 3f, 16f)
            curveToRelative(0f, 7.18f, 5.82f, 13f, 13f, 13f)
            reflectiveCurveToRelative(13f, -5.82f, 13f, -13f)
            reflectiveCurveTo(23.18f, 3f, 16f, 3f)
            curveToRelative(-3.493f, 0f, -6.665f, 1.379f, -9f, 3.62f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(5f, 3.448f, 5f, 4f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(8.45f)
            curveToRelative(1.97f, -1.86f, 4.627f, -3f, 7.55f, -3f)
            close()
            moveToRelative(1f, 4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-4f)
            verticalLineTo(9f)
            close()
        }
    }.build()
}
