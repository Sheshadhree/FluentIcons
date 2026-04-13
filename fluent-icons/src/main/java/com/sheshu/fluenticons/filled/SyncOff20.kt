package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SyncOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SyncOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.938f, 9f)
            horizontalLineToRelative(-5.632f)
            lineToRelative(0.675f, -2.362f)
            curveToRelative(0.076f, -0.266f, -0.078f, -0.543f, -0.344f, -0.619f)
            curveToRelative(-0.265f, -0.075f, -0.542f, 0.078f, -0.618f, 0.344f)
            lineToRelative(-2f, 7f)
            curveToRelative(-0.076f, 0.265f, 0.078f, 0.542f, 0.344f, 0.618f)
            curveToRelative(0.265f, 0.076f, 0.542f, -0.078f, 0.618f, -0.344f)
            lineTo(12.02f, 10f)
            horizontalLineTo(18f)
            curveToRelative(0f, 4.418f, -3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            horizontalLineToRelative(5.98f)
            lineToRelative(-0.96f, 3.363f)
            curveToRelative(-0.077f, 0.265f, 0.077f, 0.542f, 0.343f, 0.618f)
            curveToRelative(0.265f, 0.076f, 0.542f, -0.078f, 0.618f, -0.344f)
            lineToRelative(2f, -7f)
            curveToRelative(0.076f, -0.265f, -0.078f, -0.542f, -0.344f, -0.618f)
            curveTo(9.372f, 5.944f, 9.095f, 6.097f, 9.02f, 6.363f)
            lineTo(8.266f, 9f)
            horizontalLineTo(2.062f)
            curveTo(2.554f, 5.054f, 5.92f, 2f, 10f, 2f)
            reflectiveCurveToRelative(7.446f, 3.054f, 7.938f, 7f)
            close()
        }
    }.build()
}
