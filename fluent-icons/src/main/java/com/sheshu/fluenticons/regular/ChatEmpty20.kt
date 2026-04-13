package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChatEmpty20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatEmpty20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            curveToRelative(-1.273f, 0f, -2.504f, -0.298f, -3.613f, -0.86f)
            lineToRelative(-0.121f, -0.065f)
            lineToRelative(-3.645f, 0.91f)
            curveToRelative(-0.31f, 0.078f, -0.595f, -0.148f, -0.62f, -0.441f)
            verticalLineToRelative(-0.082f)
            lineToRelative(0.014f, -0.083f)
            lineToRelative(0.91f, -3.644f)
            lineToRelative(-0.063f, -0.12f)
            curveToRelative(-0.455f, -0.896f, -0.738f, -1.873f, -0.83f, -2.887f)
            lineToRelative(-0.025f, -0.382f)
            lineTo(2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            curveToRelative(0f, 1.217f, 0.31f, 2.388f, 0.893f, 3.425f)
            curveToRelative(0.048f, 0.083f, 0.07f, 0.178f, 0.064f, 0.272f)
            lineToRelative(-0.014f, 0.094f)
            lineToRelative(-0.756f, 3.021f)
            lineToRelative(3.024f, -0.754f)
            curveToRelative(0.062f, -0.015f, 0.126f, -0.018f, 0.188f, -0.01f)
            lineToRelative(0.091f, 0.021f)
            lineToRelative(0.087f, 0.039f)
            curveTo(7.614f, 16.69f, 8.784f, 17f, 10f, 17f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
        }
    }.build()
}
