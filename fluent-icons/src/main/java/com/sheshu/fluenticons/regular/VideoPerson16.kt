package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.VideoPerson16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.VideoPerson16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 9f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveTo(9.105f, 5f, 8f, 5f)
            reflectiveCurveTo(6f, 5.895f, 6f, 7f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
            moveToRelative(0f, -1f)
            curveTo(7.448f, 8f, 7f, 7.552f, 7f, 7f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
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
            moveTo(6f, 12f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-1f)
            horizontalLineTo(6f)
            verticalLineToRelative(1f)
            close()
            moveToRelative(5f, 0f)
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
