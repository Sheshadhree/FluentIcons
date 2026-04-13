package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Location16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Location16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            curveToRelative(0f, 2.874f, -3.097f, 6.016f, -4.84f, 7.558f)
            curveToRelative(-0.67f, 0.59f, -1.65f, 0.59f, -2.32f, 0f)
            curveTo(5.098f, 13.016f, 2f, 9.874f, 2f, 7f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            close()
            moveToRelative(0f, 1f)
            curveTo(5.239f, 2f, 3f, 4.239f, 3f, 7f)
            curveToRelative(0f, 1.108f, 0.614f, 2.395f, 1.57f, 3.683f)
            curveToRelative(0.933f, 1.258f, 2.087f, 2.377f, 2.934f, 3.126f)
            curveToRelative(0.29f, 0.256f, 0.702f, 0.256f, 0.992f, 0f)
            curveToRelative(0.847f, -0.749f, 2f, -1.867f, 2.935f, -3.126f)
            curveTo(12.386f, 9.395f, 13f, 8.108f, 13f, 7f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            close()
            moveToRelative(0f, 2.75f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            reflectiveCurveTo(9.243f, 9.25f, 8f, 9.25f)
            reflectiveCurveTo(5.75f, 8.243f, 5.75f, 7f)
            reflectiveCurveTo(6.757f, 4.75f, 8f, 4.75f)
            close()
            moveToRelative(0f, 1f)
            curveTo(7.31f, 5.75f, 6.75f, 6.31f, 6.75f, 7f)
            reflectiveCurveTo(7.31f, 8.25f, 8f, 8.25f)
            reflectiveCurveTo(9.25f, 7.69f, 9.25f, 7f)
            reflectiveCurveTo(8.69f, 5.75f, 8f, 5.75f)
            close()
        }
    }.build()
}
