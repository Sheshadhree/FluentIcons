package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoPersonClock16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoPersonClock16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveTo(5f, 6.105f, 5f, 5f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveTo(1.75f, 1f)
            curveTo(0.783f, 1f, 0f, 1.784f, 0f, 2.75f)
            verticalLineToRelative(6.5f)
            curveTo(0f, 10.216f, 0.783f, 11f, 1.75f, 11f)
            horizontalLineToRelative(4.272f)
            curveToRelative(0.103f, -1.134f, 0.55f, -2.17f, 1.235f, -3f)
            horizontalLineTo(5f)
            curveTo(4.448f, 8f, 4f, 8.448f, 4f, 9f)
            verticalLineToRelative(1f)
            horizontalLineTo(1.75f)
            curveTo(1.336f, 10f, 1f, 9.664f, 1f, 9.25f)
            verticalLineToRelative(-6.5f)
            curveTo(1f, 2.336f, 1.336f, 2f, 1.75f, 2f)
            horizontalLineToRelative(10.5f)
            curveTo(12.664f, 2f, 13f, 2.336f, 13f, 2.75f)
            verticalLineToRelative(3.457f)
            curveToRelative(0.349f, 0.099f, 0.683f, 0.23f, 1f, 0.393f)
            verticalLineTo(2.75f)
            curveTo(14f, 1.784f, 13.216f, 1f, 12.25f, 1f)
            horizontalLineTo(1.75f)
            close()
            moveTo(16f, 11.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(7f, 13.985f, 7f, 11.5f)
            reflectiveCurveTo(9.015f, 7f, 11.5f, 7f)
            reflectiveCurveTo(16f, 9.015f, 16f, 11.5f)
            close()
            moveTo(11.5f, 9f)
            curveTo(11.224f, 9f, 11f, 9.224f, 11f, 9.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineTo(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.276f, 11f, 13f, 11f)
            horizontalLineToRelative(-1f)
            verticalLineTo(9.5f)
            curveTo(12f, 9.224f, 11.776f, 9f, 11.5f, 9f)
            close()
        }
    }.build()
}
