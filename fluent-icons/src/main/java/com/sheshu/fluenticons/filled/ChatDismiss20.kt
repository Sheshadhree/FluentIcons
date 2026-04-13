package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChatDismiss20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatDismiss20",
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
            moveTo(7.854f, 7.146f)
            lineTo(10f, 9.293f)
            lineToRelative(2.146f, -2.146f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineTo(10.707f, 10f)
            lineToRelative(2.147f, 2.146f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(10f, 10.707f)
            lineToRelative(-2.146f, 2.147f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(9.293f, 10f)
            lineTo(7.147f, 7.854f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            close()
        }
    }.build()
}
