package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SoundWaveCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SoundWaveCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            close()
            moveTo(1f, 8f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            close()
            moveToRelative(5.5f, -2.5f)
            curveTo(6.776f, 5.5f, 7f, 5.724f, 7f, 6f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(6f, 10.276f, 6f, 10f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
            moveTo(12f, 6f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(11f, 5.724f, 11f, 6f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(12f, 10.276f, 12f, 10f)
            verticalLineTo(6f)
            close()
            moveTo(4f, 7f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(1f)
            curveTo(4.5f, 8.776f, 4.276f, 9f, 4f, 9f)
            reflectiveCurveTo(3.5f, 8.776f, 3.5f, 8.5f)
            verticalLineToRelative(-1f)
            curveTo(3.5f, 7.224f, 3.724f, 7f, 4f, 7f)
            close()
            moveToRelative(5.5f, 0f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(8.5f, 6.724f, 8.5f, 7f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(9.5f, 9.276f, 9.5f, 9f)
            verticalLineTo(7f)
            close()
        }
    }.build()
}
