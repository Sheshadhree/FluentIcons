package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowHookDownRight20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookDownRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 9f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            horizontalLineToRelative(4.5f)
            curveTo(13.776f, 4f, 14f, 4.224f, 14f, 4.5f)
            reflectiveCurveTo(13.776f, 5f, 13.5f, 5f)
            horizontalLineTo(9f)
            curveTo(6.79f, 5f, 5f, 6.79f, 5f, 9f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(5.293f)
            lineToRelative(-2.7f, -2.7f)
            curveToRelative(-0.194f, -0.194f, -0.194f, -0.511f, 0f, -0.706f)
            curveToRelative(0.196f, -0.196f, 0.513f, -0.196f, 0.708f, 0f)
            lineToRelative(3.539f, 3.539f)
            curveToRelative(0.134f, 0.134f, 0.176f, 0.326f, 0.125f, 0.497f)
            curveToRelative(-0.02f, 0.09f, -0.064f, 0.176f, -0.135f, 0.247f)
            lineToRelative(-3.533f, 3.533f)
            curveToRelative(-0.195f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0f, -0.707f)
            lineTo(14.293f, 14f)
            horizontalLineTo(9f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            close()
        }
    }.build()
}
