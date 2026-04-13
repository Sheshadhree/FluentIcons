package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowStepBack20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowStepBack20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.851f, 3.146f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineTo(4.706f, 7f)
            horizontalLineTo(10f)
            curveToRelative(2.932f, 0f, 5.593f, 1.64f, 6.936f, 4.043f)
            curveToRelative(0.135f, 0.24f, 0.049f, 0.545f, -0.192f, 0.68f)
            reflectiveCurveToRelative(-0.546f, 0.049f, -0.68f, -0.192f)
            curveTo(14.894f, 9.438f, 12.564f, 8f, 10f, 8f)
            horizontalLineTo(4.707f)
            lineToRelative(3.144f, 3.145f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(-0.195f, 0.196f, -0.512f, 0.196f, -0.707f, 0f)
            lineTo(3.16f, 7.867f)
            curveTo(3.063f, 7.776f, 3f, 7.645f, 3f, 7.5f)
            curveToRelative(0f, -0.128f, 0.049f, -0.256f, 0.146f, -0.354f)
            lineToRelative(3.998f, -4f)
            curveToRelative(0.195f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            close()
            moveTo(12f, 15f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
        }
    }.build()
}
