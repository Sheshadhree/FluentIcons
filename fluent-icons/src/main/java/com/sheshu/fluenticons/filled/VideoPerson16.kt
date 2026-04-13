package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoPerson16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoPerson16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 7f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveTo(6f, 8.105f, 6f, 7f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveTo(1f, 4.75f)
            curveTo(1f, 3.784f, 1.784f, 3f, 2.75f, 3f)
            horizontalLineToRelative(10.5f)
            curveTo(14.216f, 3f, 15f, 3.784f, 15f, 4.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(2.75f)
            curveTo(1.784f, 13f, 1f, 12.216f, 1f, 11.25f)
            verticalLineToRelative(-6.5f)
            close()
            moveTo(11f, 12f)
            horizontalLineToRelative(2.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-6.5f)
            curveTo(14f, 4.336f, 13.664f, 4f, 13.25f, 4f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 4f, 2f, 4.336f, 2f, 4.75f)
            verticalLineToRelative(6.5f)
            curveTo(2f, 11.664f, 2.336f, 12f, 2.75f, 12f)
            horizontalLineTo(5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(1f)
            close()
        }
    }.build()
}
