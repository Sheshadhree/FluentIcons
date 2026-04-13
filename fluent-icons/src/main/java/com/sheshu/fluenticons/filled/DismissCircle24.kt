package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DismissCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DismissCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            close()
            moveToRelative(3.53f, 6.47f)
            lineToRelative(-0.084f, -0.073f)
            curveToRelative(-0.26f, -0.194f, -0.619f, -0.196f, -0.882f, -0.007f)
            lineTo(14.47f, 8.47f)
            lineTo(12f, 10.939f)
            lineToRelative(-2.47f, -2.47f)
            lineToRelative(-0.084f, -0.072f)
            curveTo(9.186f, 8.203f, 8.827f, 8.201f, 8.564f, 8.39f)
            lineTo(8.47f, 8.47f)
            lineTo(8.397f, 8.554f)
            curveTo(8.203f, 8.814f, 8.201f, 9.173f, 8.39f, 9.436f)
            lineTo(8.47f, 9.53f)
            lineTo(10.939f, 12f)
            lineToRelative(-2.47f, 2.47f)
            lineToRelative(-0.072f, 0.084f)
            curveToRelative(-0.194f, 0.26f, -0.196f, 0.619f, -0.007f, 0.882f)
            lineToRelative(0.08f, 0.094f)
            lineToRelative(0.084f, 0.073f)
            curveToRelative(0.26f, 0.194f, 0.619f, 0.196f, 0.882f, 0.007f)
            lineToRelative(0.094f, -0.08f)
            lineTo(12f, 13.061f)
            lineToRelative(2.47f, 2.47f)
            lineToRelative(0.084f, 0.072f)
            curveToRelative(0.26f, 0.194f, 0.619f, 0.196f, 0.882f, 0.007f)
            lineToRelative(0.094f, -0.08f)
            lineToRelative(0.073f, -0.084f)
            curveToRelative(0.194f, -0.26f, 0.196f, -0.619f, 0.007f, -0.882f)
            lineToRelative(-0.08f, -0.094f)
            lineTo(13.061f, 12f)
            lineToRelative(2.47f, -2.47f)
            lineToRelative(0.072f, -0.084f)
            curveToRelative(0.194f, -0.26f, 0.196f, -0.619f, 0.007f, -0.882f)
            lineTo(15.53f, 8.47f)
            lineToRelative(-0.084f, -0.073f)
            lineToRelative(0.084f, 0.073f)
            close()
        }
    }.build()
}
