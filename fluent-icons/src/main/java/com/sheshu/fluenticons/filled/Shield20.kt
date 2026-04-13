package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Shield20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Shield20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.723f, 2.084f)
            curveToRelative(0.168f, -0.112f, 0.386f, -0.112f, 0.554f, 0f)
            curveToRelative(1.939f, 1.292f, 4.035f, 2.098f, 6.294f, 2.421f)
            curveTo(16.817f, 4.54f, 17f, 4.751f, 17f, 5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 3.891f, -2.307f, 6.73f, -6.82f, 8.467f)
            curveToRelative(-0.116f, 0.044f, -0.244f, 0.044f, -0.36f, 0f)
            curveTo(5.307f, 16.23f, 3f, 13.39f, 3f, 9.5f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.249f, 0.183f, -0.46f, 0.43f, -0.495f)
            curveToRelative(2.258f, -0.323f, 4.354f, -1.129f, 6.293f, -2.421f)
            close()
        }
    }.build()
}
