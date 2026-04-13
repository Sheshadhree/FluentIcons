package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Autosum20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Autosum20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.04f, 3.804f)
            curveTo(4.118f, 3.62f, 4.3f, 3.5f, 4.5f, 3.5f)
            horizontalLineToRelative(11f)
            curveTo(15.776f, 3.5f, 16f, 3.724f, 16f, 4f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(5.675f)
            lineToRelative(4.553f, 4.732f)
            curveToRelative(0.177f, 0.183f, 0.187f, 0.471f, 0.023f, 0.667f)
            lineTo(5.57f, 15.5f)
            horizontalLineToRelative(9.93f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-11f)
            curveToRelative(-0.194f, 0f, -0.37f, -0.112f, -0.453f, -0.288f)
            curveToRelative(-0.082f, -0.176f, -0.055f, -0.384f, 0.07f, -0.533f)
            lineToRelative(5.079f, -6.077f)
            lineTo(4.14f, 4.347f)
            curveTo(4f, 4.202f, 3.96f, 3.989f, 4.04f, 3.804f)
            close()
        }
    }.build()
}
