package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CircleOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.292f, 16f)
            lineToRelative(1.854f, 1.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1.855f, 1.854f)
            curveTo(2.755f, 6.118f, 2f, 7.97f, 2f, 10f)
            curveToRelative(0f, 4.418f, 3.582f, 8f, 8f, 8f)
            curveToRelative(2.03f, 0f, 3.882f, -0.756f, 5.292f, -2f)
            close()
            moveTo(18f, 10f)
            curveToRelative(0f, 1.667f, -0.51f, 3.215f, -1.382f, 4.496f)
            lineTo(5.504f, 3.382f)
            curveTo(6.785f, 2.51f, 8.333f, 2f, 10f, 2f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            close()
        }
    }.build()
}
