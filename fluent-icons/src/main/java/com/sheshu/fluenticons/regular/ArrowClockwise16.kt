package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowClockwise16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowClockwise16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 8f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            curveToRelative(1.635f, 0f, 3.088f, 0.785f, 4f, 2f)
            horizontalLineToRelative(-2f)
            curveTo(9.724f, 5f, 9.5f, 5.224f, 9.5f, 5.5f)
            reflectiveCurveTo(9.724f, 6f, 10f, 6f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-3f)
            curveTo(13.5f, 2.224f, 13.276f, 2f, 13f, 2f)
            reflectiveCurveToRelative(-0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(1.531f)
            curveTo(11.4f, 2.786f, 9.793f, 2f, 8f, 2f)
            curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            curveToRelative(3.13f, 0f, 5.7f, -2.396f, 5.976f, -5.455f)
            curveTo(14f, 8.27f, 13.797f, 8.027f, 13.522f, 8.002f)
            curveToRelative(-0.275f, -0.025f, -0.518f, 0.178f, -0.542f, 0.453f)
            curveTo(12.75f, 11.003f, 10.608f, 13f, 8f, 13f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            close()
        }
    }.build()
}
