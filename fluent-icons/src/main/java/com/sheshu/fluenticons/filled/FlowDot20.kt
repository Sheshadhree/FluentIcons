package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlowDot20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlowDot20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 2.75f)
            curveToRelative(0.84f, 0f, 1.557f, 0.517f, 1.854f, 1.25f)
            horizontalLineToRelative(6.896f)
            curveTo(15.545f, 4f, 17f, 5.455f, 17f, 7.25f)
            reflectiveCurveToRelative(-1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-7.5f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            reflectiveCurveTo(5.284f, 14f, 6.25f, 14f)
            horizontalLineToRelative(6.896f)
            curveToRelative(0.297f, -0.733f, 1.015f, -1.25f, 1.854f, -1.25f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            curveToRelative(-0.84f, 0f, -1.557f, -0.517f, -1.854f, -1.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 15.5f, 3f, 14.045f, 3f, 12.25f)
            reflectiveCurveTo(4.455f, 9f, 6.25f, 9f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveTo(14.716f, 5.5f, 13.75f, 5.5f)
            horizontalLineTo(6.854f)
            curveTo(6.557f, 6.233f, 5.839f, 6.75f, 5f, 6.75f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            close()
        }
    }.build()
}
