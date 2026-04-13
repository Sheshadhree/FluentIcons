package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RoadCone32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RoadCone32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.77f, 2f)
            curveToRelative(-0.66f, 0f, -1.242f, 0.432f, -1.434f, 1.064f)
            lineTo(9.404f, 16f)
            horizontalLineTo(17f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(8.797f)
            lineToRelative(-0.81f, 2.667f)
            horizontalLineTo(18.5f)
            curveToRelative(0.552f, 0f, 1f, 0.447f, 1f, 1f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-11f)
            curveToRelative(-0.04f, 0f, -0.08f, -0.003f, -0.119f, -0.007f)
            lineTo(5.76f, 28f)
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
        }
    }.build()
}
