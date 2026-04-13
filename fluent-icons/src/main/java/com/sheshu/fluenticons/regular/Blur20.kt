package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Blur20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Blur20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveToRelative(-4.418f, 0f, -8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            curveToRelative(2.029f, 0f, 3.881f, -0.755f, 5.292f, -2f)
            horizontalLineTo(10f)
            verticalLineToRelative(1f)
            curveToRelative(-3.866f, 0f, -7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            horizontalLineToRelative(3.876f)
            curveTo(12.728f, 2.363f, 11.406f, 2f, 10f, 2f)
            close()
            moveToRelative(0f, 2f)
            horizontalLineToRelative(5.292f)
            curveToRelative(0.345f, 0.305f, 0.665f, 0.64f, 0.953f, 1f)
            horizontalLineTo(10f)
            verticalLineTo(4f)
            close()
            moveToRelative(6.93f, 2f)
            horizontalLineTo(10f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(7.419f)
            curveToRelative(-0.14f, -0.346f, -0.304f, -0.68f, -0.49f, -1f)
            close()
            moveTo(10f, 8f)
            horizontalLineToRelative(7.748f)
            curveToRelative(0.084f, 0.326f, 0.148f, 0.66f, 0.19f, 1f)
            horizontalLineTo(10f)
            verticalLineTo(8f)
            close()
            moveToRelative(8f, 2f)
            horizontalLineToRelative(-8f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(7.938f)
            curveTo(17.98f, 10.672f, 18f, 10.339f, 18f, 10f)
            close()
            moveToRelative(-8f, 2f)
            horizontalLineToRelative(7.748f)
            curveToRelative(-0.088f, 0.343f, -0.199f, 0.677f, -0.33f, 1f)
            horizontalLineTo(10f)
            verticalLineToRelative(-1f)
            close()
            moveToRelative(6.93f, 2f)
            horizontalLineTo(10f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(6.245f)
            curveToRelative(0.253f, -0.315f, 0.482f, -0.649f, 0.685f, -1f)
            close()
        }
    }.build()
}
