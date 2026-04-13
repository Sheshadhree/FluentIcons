package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ClockLock16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ClockLock16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 15f)
            verticalLineToRelative(-1f)
            curveToRelative(3.313f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.687f, -6f, -6f, -6f)
            curveTo(5.287f, 2f, 2.995f, 3.8f, 2.252f, 6.27f)
            curveTo(1.761f, 6.497f, 1.341f, 6.85f, 1.035f, 7.29f)
            curveTo(1.392f, 3.757f, 4.374f, 1f, 8f, 1f)
            curveToRelative(3.865f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.135f, 7f, -7f, 7f)
            close()
            moveTo(8f, 4.5f)
            curveTo(8f, 4.224f, 7.776f, 4f, 7.5f, 4f)
            curveTo(7.223f, 4f, 7f, 4.224f, 7f, 4.5f)
            verticalLineToRelative(4f)
            curveTo(7f, 8.776f, 7.223f, 9f, 7.5f, 9f)
            horizontalLineToRelative(3f)
            curveTo(10.775f, 9f, 11f, 8.776f, 11f, 8.5f)
            reflectiveCurveTo(10.775f, 8f, 10.5f, 8f)
            horizontalLineTo(8f)
            verticalLineTo(4.5f)
            close()
            moveTo(1.5f, 9f)
            verticalLineToRelative(1f)
            horizontalLineTo(1f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(5.5f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            close()
            moveToRelative(1f, 1f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(1f, 2.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(2.75f, 13.414f, 2.75f, 13f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            close()
        }
    }.build()
}
