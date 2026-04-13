package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Stethoscope20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Stethoscope20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 2f)
            curveTo(2.224f, 2f, 2f, 2.224f, 2f, 2.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.316f, 1.75f, 4.224f, 4f, 4.473f)
            verticalLineTo(13f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            verticalLineToRelative(-1.05f)
            curveToRelative(1.141f, -0.232f, 2f, -1.24f, 2f, -2.45f)
            curveTo(18f, 8.12f, 16.88f, 7f, 15.5f, 7f)
            reflectiveCurveTo(13f, 8.12f, 13f, 9.5f)
            curveToRelative(0f, 1.21f, 0.859f, 2.218f, 2f, 2.45f)
            verticalLineTo(13f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            verticalLineToRelative(-1.027f)
            curveToRelative(2.25f, -0.25f, 4f, -2.157f, 4f, -4.473f)
            verticalLineToRelative(-5f)
            curveTo(11f, 2.224f, 10.776f, 2f, 10.5f, 2f)
            horizontalLineToRelative(-2f)
            curveTo(8.224f, 2f, 8f, 2.224f, 8f, 2.5f)
            reflectiveCurveTo(8.224f, 3f, 8.5f, 3f)
            horizontalLineTo(10f)
            verticalLineToRelative(4.5f)
            curveTo(10f, 9.433f, 8.433f, 11f, 6.5f, 11f)
            reflectiveCurveTo(3f, 9.433f, 3f, 7.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(1.5f)
            curveTo(4.776f, 3f, 5f, 2.776f, 5f, 2.5f)
            reflectiveCurveTo(4.776f, 2f, 4.5f, 2f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(13f, 6f)
            curveTo(16.328f, 8f, 17f, 8.672f, 17f, 9.5f)
            reflectiveCurveTo(16.328f, 11f, 15.5f, 11f)
            reflectiveCurveTo(14f, 10.328f, 14f, 9.5f)
            reflectiveCurveTo(14.672f, 8f, 15.5f, 8f)
            close()
        }
    }.build()
}
