package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowClockwise12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowClockwise12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.966f, 6.453f)
            curveTo(9.004f, 6.205f, 9.204f, 6f, 9.455f, 6f)
            curveToRelative(0.3f, 0f, 0.549f, 0.246f, 0.508f, 0.544f)
            curveTo(9.698f, 8.496f, 8.025f, 10f, 6f, 10f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            curveToRelative(1.195f, 0f, 2.267f, 0.524f, 3f, 1.354f)
            verticalLineTo(2.5f)
            curveTo(9f, 2.224f, 9.224f, 2f, 9.5f, 2f)
            reflectiveCurveTo(10f, 2.224f, 10f, 2.5f)
            verticalLineToRelative(2f)
            curveTo(10f, 4.776f, 9.776f, 5f, 9.5f, 5f)
            horizontalLineToRelative(-2f)
            curveTo(7.224f, 5f, 7f, 4.776f, 7f, 4.5f)
            reflectiveCurveTo(7.224f, 4f, 7.5f, 4f)
            horizontalLineToRelative(0.736f)
            curveTo(7.686f, 3.386f, 6.888f, 3f, 6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            curveToRelative(1.503f, 0f, 2.748f, -1.105f, 2.966f, -2.547f)
            close()
        }
    }.build()
}
