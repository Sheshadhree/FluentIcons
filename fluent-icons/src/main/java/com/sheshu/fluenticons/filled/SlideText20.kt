package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideText20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideText20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.5f)
            curveTo(2f, 5.12f, 3.12f, 4f, 4.5f, 4f)
            horizontalLineToRelative(11f)
            curveTo(16.88f, 4f, 18f, 5.12f, 18f, 6.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.12f, 16f, 2f, 14.88f, 2f, 13.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(5.5f, 7f)
            curveTo(5.224f, 7f, 5f, 7.224f, 5f, 7.5f)
            reflectiveCurveTo(5.224f, 8f, 5.5f, 8f)
            horizontalLineToRelative(4f)
            curveTo(9.776f, 8f, 10f, 7.776f, 10f, 7.5f)
            reflectiveCurveTo(9.776f, 7f, 9.5f, 7f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(5f, 10f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-7f)
            curveTo(5.224f, 9.5f, 5f, 9.724f, 5f, 10f)
            close()
            moveToRelative(0.5f, 2f)
            curveTo(5.224f, 12f, 5f, 12.224f, 5f, 12.5f)
            reflectiveCurveTo(5.224f, 13f, 5.5f, 13f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.776f, 12f, 10.5f, 12f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
