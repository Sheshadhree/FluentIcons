package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Scales24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Scales24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 3f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            reflectiveCurveTo(3.336f, 4.5f, 3.75f, 4.5f)
            horizontalLineToRelative(1.042f)
            lineToRelative(-2.737f, 6.717f)
            curveTo(2.02f, 11.307f, 2f, 11.403f, 2f, 11.5f)
            curveTo(2f, 13.433f, 3.567f, 15f, 5.5f, 15f)
            reflectiveCurveTo(9f, 13.433f, 9f, 11.5f)
            curveToRelative(0f, -0.097f, -0.019f, -0.193f, -0.055f, -0.283f)
            lineTo(6.208f, 4.5f)
            horizontalLineToRelative(5.042f)
            verticalLineToRelative(12f)
            horizontalLineTo(7.253f)
            curveToRelative(-1.243f, 0f, -2.25f, 1.007f, -2.25f, 2.25f)
            reflectiveCurveTo(6.01f, 21f, 7.253f, 21f)
            horizontalLineToRelative(9.497f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            reflectiveCurveToRelative(-1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-12f)
            horizontalLineToRelative(5.042f)
            lineToRelative(-2.737f, 6.717f)
            curveTo(15.02f, 11.307f, 15f, 11.403f, 15f, 11.5f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            curveToRelative(0f, -0.097f, -0.019f, -0.193f, -0.055f, -0.283f)
            lineTo(19.208f, 4.5f)
            horizontalLineToRelative(1.042f)
            curveTo(20.664f, 4.5f, 21f, 4.164f, 21f, 3.75f)
            reflectiveCurveTo(20.664f, 3f, 20.25f, 3f)
            horizontalLineTo(3.75f)
            close()
            moveTo(5.5f, 6.738f)
            lineToRelative(1.635f, 4.012f)
            horizontalLineToRelative(-3.27f)
            lineTo(5.5f, 6.738f)
            close()
            moveToRelative(11.365f, 4.012f)
            lineTo(18.5f, 6.738f)
            lineToRelative(1.635f, 4.012f)
            horizontalLineToRelative(-3.27f)
            close()
        }
    }.build()
}
