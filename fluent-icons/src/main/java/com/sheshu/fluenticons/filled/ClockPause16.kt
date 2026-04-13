package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ClockPause16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClockPause16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 7f)
            curveTo(6.985f, 7f, 9f, 9.015f, 9f, 11.5f)
            reflectiveCurveTo(6.985f, 16f, 4.5f, 16f)
            reflectiveCurveTo(0f, 13.985f, 0f, 11.5f)
            reflectiveCurveTo(2.015f, 7f, 4.5f, 7f)
            close()
            moveTo(3f, 9f)
            curveTo(2.724f, 9f, 2.5f, 9.224f, 2.5f, 9.5f)
            verticalLineToRelative(4f)
            curveTo(2.5f, 13.776f, 2.724f, 14f, 3f, 14f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-4f)
            curveTo(3.5f, 9.224f, 3.276f, 9f, 3f, 9f)
            close()
            moveToRelative(3f, 0f)
            curveTo(5.724f, 9f, 5.5f, 9.224f, 5.5f, 9.5f)
            verticalLineToRelative(4f)
            curveTo(5.5f, 13.776f, 5.724f, 14f, 6f, 14f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-4f)
            curveTo(6.5f, 9.224f, 6.276f, 9f, 6f, 9f)
            close()
            moveToRelative(3f, -9f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            curveToRelative(0f, 3.73f, -2.918f, 6.778f, -6.596f, 6.987f)
            curveTo(9.784f, 13.24f, 10f, 12.396f, 10f, 11.5f)
            curveToRelative(0f, -1.33f, -0.472f, -2.549f, -1.258f, -3.5f)
            horizontalLineTo(11.5f)
            curveTo(11.776f, 8f, 12f, 7.776f, 12f, 7.5f)
            reflectiveCurveTo(11.776f, 7f, 11.5f, 7f)
            horizontalLineTo(9f)
            verticalLineTo(3.5f)
            curveTo(9f, 3.224f, 8.776f, 3f, 8.5f, 3f)
            reflectiveCurveTo(8f, 3.224f, 8f, 3.5f)
            verticalLineToRelative(3.757f)
            curveTo(7.05f, 6.472f, 5.83f, 6f, 4.5f, 6f)
            curveTo(3.604f, 6f, 2.759f, 6.215f, 2.012f, 6.595f)
            curveTo(2.222f, 2.917f, 5.27f, 0f, 9f, 0f)
            close()
        }
    }.build()
}
