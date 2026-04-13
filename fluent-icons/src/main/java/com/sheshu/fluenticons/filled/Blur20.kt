package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Blur20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Blur20",
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
            verticalLineToRelative(-1f)
            horizontalLineToRelative(6.245f)
            curveToRelative(0.253f, -0.315f, 0.482f, -0.649f, 0.685f, -1f)
            horizontalLineTo(10f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(7.419f)
            curveToRelative(0.13f, -0.323f, 0.24f, -0.657f, 0.329f, -1f)
            horizontalLineTo(10f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(7.938f)
            curveTo(17.98f, 10.672f, 18f, 10.339f, 18f, 10f)
            horizontalLineToRelative(-8f)
            verticalLineTo(9f)
            horizontalLineToRelative(7.938f)
            curveToRelative(-0.042f, -0.34f, -0.106f, -0.674f, -0.19f, -1f)
            horizontalLineTo(10f)
            verticalLineTo(7f)
            horizontalLineToRelative(7.419f)
            curveToRelative(-0.14f, -0.346f, -0.304f, -0.68f, -0.49f, -1f)
            horizontalLineTo(10f)
            verticalLineTo(5f)
            horizontalLineToRelative(6.245f)
            curveToRelative(-0.288f, -0.36f, -0.608f, -0.695f, -0.953f, -1f)
            horizontalLineTo(10f)
            verticalLineTo(3f)
            horizontalLineToRelative(3.876f)
            curveTo(12.728f, 2.363f, 11.406f, 2f, 10f, 2f)
            close()
        }
    }.build()
}
