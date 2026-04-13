package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AlignRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AlignRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 1.5f)
            curveTo(14f, 1.224f, 13.776f, 1f, 13.5f, 1f)
            reflectiveCurveTo(13f, 1.224f, 13f, 1.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-13f)
            close()
            moveTo(10.25f, 2f)
            curveTo(11.216f, 2f, 12f, 2.784f, 12f, 3.75f)
            verticalLineToRelative(1.5f)
            curveTo(12f, 6.216f, 11.216f, 7f, 10.25f, 7f)
            horizontalLineToRelative(-6.5f)
            curveTo(2.784f, 7f, 2f, 6.216f, 2f, 5.25f)
            verticalLineToRelative(-1.5f)
            curveTo(2f, 2.784f, 2.784f, 2f, 3.75f, 2f)
            horizontalLineToRelative(6.5f)
            close()
            moveTo(11f, 3.75f)
            curveTo(11f, 3.336f, 10.664f, 3f, 10.25f, 3f)
            horizontalLineToRelative(-6.5f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            verticalLineToRelative(1.5f)
            curveTo(3f, 5.664f, 3.336f, 6f, 3.75f, 6f)
            horizontalLineToRelative(6.5f)
            curveTo(10.664f, 6f, 11f, 5.664f, 11f, 5.25f)
            verticalLineToRelative(-1.5f)
            close()
            moveTo(10.25f, 9f)
            curveTo(11.216f, 9f, 12f, 9.784f, 12f, 10.75f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-4.5f)
            curveTo(4.784f, 14f, 4f, 13.216f, 4f, 12.25f)
            verticalLineToRelative(-1.5f)
            curveTo(4f, 9.784f, 4.784f, 9f, 5.75f, 9f)
            horizontalLineToRelative(4.5f)
            close()
            moveTo(11f, 10.75f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-4.5f)
            curveTo(5.336f, 10f, 5f, 10.336f, 5f, 10.75f)
            verticalLineToRelative(1.5f)
            curveTo(5f, 12.664f, 5.336f, 13f, 5.75f, 13f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-1.5f)
            close()
        }
    }.build()
}
