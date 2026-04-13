package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FullScreenMaximize16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FullScreenMaximize16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 3f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            verticalLineTo(5.5f)
            curveTo(3f, 5.776f, 2.776f, 6f, 2.5f, 6f)
            reflectiveCurveTo(2f, 5.776f, 2f, 5.5f)
            verticalLineTo(3.75f)
            curveTo(2f, 2.784f, 2.784f, 2f, 3.75f, 2f)
            horizontalLineTo(5.5f)
            curveTo(5.776f, 2f, 6f, 2.224f, 6f, 2.5f)
            reflectiveCurveTo(5.776f, 3f, 5.5f, 3f)
            horizontalLineTo(3.75f)
            close()
            moveTo(10f, 2.5f)
            curveTo(10f, 2.224f, 10.224f, 2f, 10.5f, 2f)
            horizontalLineToRelative(1.75f)
            curveTo(13.216f, 2f, 14f, 2.784f, 14f, 3.75f)
            verticalLineTo(5.5f)
            curveTo(14f, 5.776f, 13.776f, 6f, 13.5f, 6f)
            reflectiveCurveTo(13f, 5.776f, 13f, 5.5f)
            verticalLineTo(3.75f)
            curveTo(13f, 3.336f, 12.664f, 3f, 12.25f, 3f)
            horizontalLineTo(10.5f)
            curveTo(10.224f, 3f, 10f, 2.776f, 10f, 2.5f)
            close()
            moveTo(2.5f, 10f)
            curveTo(2.776f, 10f, 3f, 10.224f, 3f, 10.5f)
            verticalLineToRelative(1.75f)
            curveTo(3f, 12.664f, 3.336f, 13f, 3.75f, 13f)
            horizontalLineTo(5.5f)
            curveTo(5.776f, 13f, 6f, 13.224f, 6f, 13.5f)
            reflectiveCurveTo(5.776f, 14f, 5.5f, 14f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 14f, 2f, 13.216f, 2f, 12.25f)
            verticalLineTo(10.5f)
            curveTo(2f, 10.224f, 2.224f, 10f, 2.5f, 10f)
            close()
            moveToRelative(11f, 0f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(1.75f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(10.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(10.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
