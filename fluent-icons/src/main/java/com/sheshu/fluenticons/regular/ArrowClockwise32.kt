package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowClockwise32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowClockwise32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 16f)
            curveTo(5f, 9.925f, 9.925f, 5f, 16f, 5f)
            curveToRelative(2.923f, 0f, 5.58f, 1.14f, 7.55f, 3f)
            horizontalLineTo(21f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineToRelative(2.62f)
            curveTo(22.665f, 4.378f, 19.494f, 3f, 16f, 3f)
            curveTo(8.82f, 3f, 3f, 8.82f, 3f, 16f)
            reflectiveCurveToRelative(5.82f, 13f, 13f, 13f)
            reflectiveCurveToRelative(13f, -5.82f, 13f, -13f)
            curveToRelative(0f, -0.364f, -0.015f, -0.725f, -0.044f, -1.082f)
            curveToRelative(-0.046f, -0.55f, -0.529f, -0.96f, -1.08f, -0.915f)
            curveToRelative(-0.55f, 0.046f, -0.96f, 0.529f, -0.914f, 1.08f)
            curveTo(26.987f, 15.384f, 27f, 15.69f, 27f, 16f)
            curveToRelative(0f, 6.075f, -4.925f, 11f, -11f, 11f)
            reflectiveCurveTo(5f, 22.075f, 5f, 16f)
            close()
        }
    }.build()
}
