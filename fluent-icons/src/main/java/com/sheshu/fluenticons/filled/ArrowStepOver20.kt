package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowStepOver20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowStepOver20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.149f, 3.146f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(15.294f, 7f)
            horizontalLineTo(10f)
            curveToRelative(-2.932f, 0f, -5.593f, 1.64f, -6.936f, 4.043f)
            curveToRelative(-0.135f, 0.24f, -0.049f, 0.545f, 0.192f, 0.68f)
            reflectiveCurveToRelative(0.546f, 0.049f, 0.68f, -0.192f)
            curveTo(5.107f, 9.438f, 7.437f, 8f, 10f, 8f)
            horizontalLineToRelative(5.293f)
            lineToRelative(-3.144f, 3.145f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(0.195f, 0.196f, 0.512f, 0.196f, 0.707f, 0f)
            lineToRelative(3.984f, -3.985f)
            curveTo(16.938f, 7.776f, 17f, 7.645f, 17f, 7.5f)
            curveToRelative(0f, -0.128f, -0.049f, -0.256f, -0.146f, -0.354f)
            lineToRelative(-3.998f, -4f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            close()
            moveTo(8f, 15f)
            curveToRelative(0f, 1.105f, 0.896f, 2f, 2f, 2f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            curveToRelative(-1.104f, 0f, -2f, 0.895f, -2f, 2f)
            close()
        }
    }.build()
}
