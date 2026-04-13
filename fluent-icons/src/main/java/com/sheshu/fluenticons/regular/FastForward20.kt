package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FastForward20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FastForward20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.018f, 5.486f)
            curveToRelative(0f, -0.819f, 0.931f, -1.29f, 1.592f, -0.806f)
            lineToRelative(5.88f, 4.312f)
            curveToRelative(0.68f, 0.499f, 0.68f, 1.516f, 0f, 2.015f)
            lineToRelative(-5.88f, 4.312f)
            curveToRelative(-0.66f, 0.485f, -1.592f, 0.013f, -1.592f, -0.806f)
            verticalLineToRelative(-3.16f)
            lineTo(4.61f, 15.319f)
            curveToRelative(-0.66f, 0.485f, -1.592f, 0.013f, -1.592f, -0.806f)
            verticalLineTo(5.486f)
            curveToRelative(0f, -0.819f, 0.931f, -1.29f, 1.592f, -0.806f)
            lineToRelative(5.408f, 3.966f)
            verticalLineToRelative(-3.16f)
            close()
            moveToRelative(6.88f, 4.312f)
            lineToRelative(-5.88f, -4.312f)
            verticalLineToRelative(9.027f)
            lineToRelative(5.88f, -4.312f)
            curveToRelative(0.136f, -0.1f, 0.136f, -0.303f, 0f, -0.403f)
            close()
            moveToRelative(-7f, 0f)
            lineToRelative(-5.88f, -4.312f)
            verticalLineToRelative(9.027f)
            lineToRelative(5.88f, -4.312f)
            curveToRelative(0.136f, -0.1f, 0.136f, -0.303f, 0f, -0.403f)
            close()
        }
    }.build()
}
