package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SoundWaveCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SoundWaveCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveTo(4.134f, 1f, 1f, 4.134f, 1f, 8f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
            moveTo(6.5f, 5.5f)
            curveTo(6.776f, 5.5f, 7f, 5.724f, 7f, 6f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(6f, 10.276f, 6f, 10f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
            moveTo(12f, 6f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(11f, 10.276f, 11f, 10f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveTo(12f, 5.724f, 12f, 6f)
            close()
            moveTo(9f, 6.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(8.5f, 9.276f, 8.5f, 9f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
            moveToRelative(-4.5f, 1f)
            verticalLineToRelative(1f)
            curveTo(4.5f, 8.776f, 4.276f, 9f, 4f, 9f)
            reflectiveCurveTo(3.5f, 8.776f, 3.5f, 8.5f)
            verticalLineToRelative(-1f)
            curveTo(3.5f, 7.224f, 3.724f, 7f, 4f, 7f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            close()
        }
    }.build()
}
