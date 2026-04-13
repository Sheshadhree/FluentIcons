package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ToggleMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ToggleMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.5f)
            curveTo(3f, 3.567f, 4.567f, 2f, 6.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(15.433f, 2f, 17f, 3.567f, 17f, 5.5f)
            reflectiveCurveTo(15.433f, 9f, 13.5f, 9f)
            horizontalLineToRelative(-7f)
            curveTo(4.567f, 9f, 3f, 7.433f, 3f, 5.5f)
            close()
            moveToRelative(5f, 0f)
            curveTo(8f, 4.672f, 7.328f, 4f, 6.5f, 4f)
            reflectiveCurveTo(5f, 4.672f, 5f, 5.5f)
            reflectiveCurveTo(5.672f, 7f, 6.5f, 7f)
            reflectiveCurveTo(8f, 6.328f, 8f, 5.5f)
            close()
            moveTo(6.5f, 11f)
            curveTo(4.567f, 11f, 3f, 12.567f, 3f, 14.5f)
            reflectiveCurveTo(4.567f, 18f, 6.5f, 18f)
            horizontalLineToRelative(7f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            reflectiveCurveTo(15.433f, 11f, 13.5f, 11f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(7f, 5f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.build()
}
