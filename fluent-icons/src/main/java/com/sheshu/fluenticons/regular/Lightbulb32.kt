package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Lightbulb32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Lightbulb32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 12f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            curveToRelative(0f, 2.382f, -1.04f, 4.519f, -2.692f, 5.986f)
            curveToRelative(-0.568f, 0.504f, -1.067f, 1.188f, -1.262f, 2.033f)
            lineTo(19.358f, 23f)
            horizontalLineToRelative(-6.716f)
            lineToRelative(-0.688f, -2.981f)
            curveToRelative(-0.195f, -0.845f, -0.694f, -1.53f, -1.262f, -2.033f)
            curveTo(9.04f, 16.519f, 8f, 14.382f, 8f, 12f)
            close()
            moveToRelative(5.103f, 13f)
            horizontalLineToRelative(5.794f)
            lineToRelative(-0.424f, 1.837f)
            curveTo(18.316f, 27.517f, 17.71f, 28f, 17.01f, 28f)
            horizontalLineToRelative(-2.02f)
            curveToRelative(-0.699f, 0f, -1.305f, -0.482f, -1.462f, -1.163f)
            lineTo(13.103f, 25f)
            close()
            moveTo(16f, 2f)
            curveTo(10.477f, 2f, 6f, 6.477f, 6f, 12f)
            curveToRelative(0f, 2.977f, 1.302f, 5.651f, 3.365f, 7.482f)
            curveToRelative(0.343f, 0.304f, 0.561f, 0.645f, 0.64f, 0.986f)
            lineToRelative(1.573f, 6.819f)
            curveTo(11.945f, 28.875f, 13.36f, 30f, 14.988f, 30f)
            horizontalLineToRelative(2.023f)
            curveToRelative(1.63f, 0f, 3.044f, -1.125f, 3.41f, -2.713f)
            lineToRelative(1.574f, -6.819f)
            curveToRelative(0.079f, -0.34f, 0.297f, -0.682f, 0.64f, -0.986f)
            curveTo(24.698f, 17.652f, 26f, 14.977f, 26f, 12f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            close()
        }
    }.build()
}
