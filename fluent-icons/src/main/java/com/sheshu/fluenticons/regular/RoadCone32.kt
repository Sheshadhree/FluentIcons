package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.RoadCone32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RoadCone32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.77f, 2f)
            curveToRelative(-0.66f, 0f, -1.242f, 0.432f, -1.434f, 1.064f)
            lineTo(5.758f, 28f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(26f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-2.759f)
            lineTo(18.665f, 3.064f)
            curveTo(18.473f, 2.432f, 17.89f, 2f, 17.229f, 2f)
            horizontalLineToRelative(-2.458f)
            close()
            moveTo(7.85f, 28f)
            lineToRelative(1.66f, -5.462f)
            curveToRelative(0.144f, 0.082f, 0.31f, 0.129f, 0.49f, 0.129f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            curveToRelative(0f, -0.553f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-8.423f)
            lineTo(10.887f, 18f)
            horizontalLineTo(17f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-5.505f)
            lineToRelative(3.646f, -12f)
            horizontalLineToRelative(1.718f)
            lineToRelative(7.292f, 24f)
            horizontalLineTo(7.849f)
            close()
        }
    }.build()
}
