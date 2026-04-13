package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LocationArrowRight16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LocationArrowRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.159f, 14.558f)
            curveTo(10.903f, 13.016f, 14f, 9.874f, 14f, 7f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            reflectiveCurveTo(2f, 3.686f, 2f, 7f)
            curveToRelative(0f, 2.874f, 3.097f, 6.016f, 4.841f, 7.558f)
            curveToRelative(0.668f, 0.59f, 1.65f, 0.59f, 2.318f, 0f)
            close()
            moveTo(8f, 2f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            curveToRelative(0f, 1.108f, -0.615f, 2.395f, -1.57f, 3.683f)
            curveToRelative(-0.934f, 1.258f, -2.087f, 2.377f, -2.933f, 3.126f)
            curveToRelative(-0.29f, 0.256f, -0.703f, 0.256f, -0.994f, 0f)
            curveToRelative(-0.846f, -0.749f, -2f, -1.867f, -2.933f, -3.126f)
            curveTo(3.615f, 9.395f, 3f, 8.108f, 3f, 7f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            close()
            moveToRelative(0.146f, 2.854f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.196f, 0.196f, 0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            lineTo(9.293f, 7f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 7f, 5f, 6.776f, 5f, 6.5f)
            reflectiveCurveTo(5.224f, 6f, 5.5f, 6f)
            horizontalLineToRelative(3.793f)
            lineTo(8.147f, 4.854f)
            close()
        }
    }.build()
}
