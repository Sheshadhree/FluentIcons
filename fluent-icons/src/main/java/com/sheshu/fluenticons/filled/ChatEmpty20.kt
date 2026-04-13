package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChatEmpty20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatEmpty20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 10f)
            curveToRelative(0f, -4.418f, -3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            lineToRelative(0.007f, 0.346f)
            lineToRelative(0.026f, 0.382f)
            curveToRelative(0.091f, 1.014f, 0.374f, 1.99f, 0.829f, 2.887f)
            lineToRelative(0.063f, 0.12f)
            lineToRelative(-0.91f, 3.644f)
            lineTo(2f, 17.462f)
            verticalLineToRelative(0.082f)
            curveToRelative(0.025f, 0.293f, 0.31f, 0.518f, 0.62f, 0.441f)
            lineToRelative(3.645f, -0.91f)
            lineToRelative(0.12f, 0.064f)
            curveTo(7.497f, 17.702f, 8.727f, 18f, 10f, 18f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            close()
        }
    }.build()
}
