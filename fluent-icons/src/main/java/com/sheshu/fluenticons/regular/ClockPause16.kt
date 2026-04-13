package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ClockPause16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ClockPause16",
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
            curveToRelative(0.168f, -0.33f, 0.304f, -0.68f, 0.403f, -1.044f)
            curveTo(12.739f, 12.55f, 15f, 10.04f, 15f, 7f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            curveToRelative(-3.04f, 0f, -5.55f, 2.26f, -5.944f, 5.192f)
            curveToRelative(-0.365f, 0.1f, -0.714f, 0.235f, -1.044f, 0.403f)
            curveTo(2.222f, 2.917f, 5.27f, 0f, 9f, 0f)
            close()
            moveTo(8.5f, 3f)
            curveTo(8.776f, 3f, 9f, 3.224f, 9f, 3.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(2.5f)
            curveTo(11.776f, 7f, 12f, 7.224f, 12f, 7.5f)
            reflectiveCurveTo(11.776f, 8f, 11.5f, 8f)
            horizontalLineTo(8.742f)
            curveTo(8.52f, 7.73f, 8.27f, 7.48f, 8f, 7.257f)
            verticalLineTo(3.5f)
            curveTo(8f, 3.224f, 8.224f, 3f, 8.5f, 3f)
            close()
        }
    }.build()
}
