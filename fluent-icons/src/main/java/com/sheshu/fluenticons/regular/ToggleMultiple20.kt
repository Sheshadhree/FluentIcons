package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ToggleMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ToggleMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 5.5f)
            curveTo(8f, 6.328f, 7.328f, 7f, 6.5f, 7f)
            reflectiveCurveTo(5f, 6.328f, 5f, 5.5f)
            reflectiveCurveTo(5.672f, 4f, 6.5f, 4f)
            reflectiveCurveTo(8f, 4.672f, 8f, 5.5f)
            close()
            moveToRelative(-5f, 0f)
            curveTo(3f, 7.433f, 4.567f, 9f, 6.5f, 9f)
            horizontalLineToRelative(7f)
            curveTo(15.433f, 9f, 17f, 7.433f, 17f, 5.5f)
            reflectiveCurveTo(15.433f, 2f, 13.5f, 2f)
            horizontalLineToRelative(-7f)
            curveTo(4.567f, 2f, 3f, 3.567f, 3f, 5.5f)
            close()
            moveTo(6.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(14.88f, 3f, 16f, 4.12f, 16f, 5.5f)
            reflectiveCurveTo(14.88f, 8f, 13.5f, 8f)
            horizontalLineToRelative(-7f)
            curveTo(5.12f, 8f, 4f, 6.88f, 4f, 5.5f)
            reflectiveCurveTo(5.12f, 3f, 6.5f, 3f)
            close()
            moveToRelative(7f, 13f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(14.328f, 13f, 13.5f, 13f)
            reflectiveCurveTo(12f, 13.672f, 12f, 14.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(3f, 14.5f)
            curveTo(3f, 16.433f, 4.567f, 18f, 6.5f, 18f)
            horizontalLineToRelative(7f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            reflectiveCurveTo(15.433f, 11f, 13.5f, 11f)
            horizontalLineToRelative(-7f)
            curveTo(4.567f, 11f, 3f, 12.567f, 3f, 14.5f)
            close()
            moveTo(6.5f, 12f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveTo(14.88f, 17f, 13.5f, 17f)
            horizontalLineToRelative(-7f)
            curveTo(5.12f, 17f, 4f, 15.88f, 4f, 14.5f)
            reflectiveCurveTo(5.12f, 12f, 6.5f, 12f)
            close()
        }
    }.build()
}
