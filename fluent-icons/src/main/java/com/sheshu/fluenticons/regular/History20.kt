package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.History20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.History20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 4f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            curveToRelative(0f, -0.156f, 0.006f, -0.31f, 0.018f, -0.462f)
            curveTo(4.037f, 9.263f, 3.832f, 9.022f, 3.557f, 9f)
            curveTo(3.28f, 8.981f, 3.04f, 9.187f, 3.02f, 9.462f)
            curveTo(3.007f, 9.64f, 3f, 9.82f, 3f, 10f)
            curveToRelative(0f, 3.866f, 3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            curveTo(8.04f, 3f, 6.27f, 3.805f, 5f, 5.101f)
            verticalLineTo(3.5f)
            curveTo(5f, 3.224f, 4.776f, 3f, 4.5f, 3f)
            reflectiveCurveTo(4f, 3.224f, 4f, 3.5f)
            verticalLineToRelative(3f)
            curveTo(4f, 6.776f, 4.224f, 7f, 4.5f, 7f)
            horizontalLineToRelative(3f)
            curveTo(7.776f, 7f, 8f, 6.776f, 8f, 6.5f)
            reflectiveCurveTo(7.776f, 6f, 7.5f, 6f)
            horizontalLineTo(5.528f)
            curveTo(6.627f, 4.772f, 8.223f, 4f, 10f, 4f)
            close()
            moveToRelative(0f, 2.5f)
            curveTo(10f, 6.224f, 9.776f, 6f, 9.5f, 6f)
            reflectiveCurveTo(9f, 6.224f, 9f, 6.5f)
            verticalLineToRelative(4f)
            curveTo(9f, 10.776f, 9.224f, 11f, 9.5f, 11f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 10f, 12.5f, 10f)
            horizontalLineTo(10f)
            verticalLineTo(6.5f)
            close()
        }
    }.build()
}
