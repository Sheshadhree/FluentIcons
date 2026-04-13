package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataUsage16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataUsage16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.75f)
            curveTo(2f, 2.784f, 2.784f, 2f, 3.75f, 2f)
            horizontalLineToRelative(8.5f)
            curveTo(13.216f, 2f, 14f, 2.784f, 14f, 3.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(2.784f, 14f, 2f, 13.216f, 2f, 12.25f)
            verticalLineToRelative(-8.5f)
            close()
            moveTo(6f, 6.5f)
            curveTo(6f, 6.224f, 5.776f, 6f, 5.5f, 6f)
            reflectiveCurveTo(5f, 6.224f, 5f, 6.5f)
            verticalLineToRelative(4f)
            curveTo(5f, 10.776f, 5.224f, 11f, 5.5f, 11f)
            reflectiveCurveTo(6f, 10.776f, 6f, 10.5f)
            verticalLineToRelative(-4f)
            close()
            moveTo(8f, 8f)
            curveTo(7.724f, 8f, 7.5f, 8.224f, 7.5f, 8.5f)
            verticalLineToRelative(2f)
            curveTo(7.5f, 10.776f, 7.724f, 11f, 8f, 11f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-2f)
            curveTo(8.5f, 8.224f, 8.276f, 8f, 8f, 8f)
            close()
            moveToRelative(3f, -2.5f)
            curveTo(11f, 5.224f, 10.776f, 5f, 10.5f, 5f)
            reflectiveCurveTo(10f, 5.224f, 10f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            close()
        }
    }.build()
}
