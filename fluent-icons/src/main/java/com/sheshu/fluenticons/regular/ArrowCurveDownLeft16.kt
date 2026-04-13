package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCurveDownLeft16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCurveDownLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.934f, 1.252f)
            curveToRelative(0.137f, 0.24f, 0.054f, 0.545f, -0.186f, 0.682f)
            curveTo(8.213f, 3.383f, 8f, 6.002f, 8f, 8f)
            verticalLineToRelative(5.293f)
            lineToRelative(2.646f, -2.646f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(-3.5f, 3.5f)
            curveTo(7.76f, 14.947f, 7.633f, 15f, 7.5f, 15f)
            curveToRelative(-0.133f, 0f, -0.26f, -0.053f, -0.354f, -0.146f)
            lineToRelative(-3.5f, -3.5f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            lineTo(7f, 13.293f)
            verticalLineTo(8f)
            curveToRelative(0f, -2.002f, 0.187f, -5.183f, 3.252f, -6.934f)
            curveToRelative(0.24f, -0.137f, 0.545f, -0.054f, 0.682f, 0.186f)
            close()
        }
    }.build()
}
