package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Rewind20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Rewind20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 5.487f)
            curveToRelative(0f, -0.819f, -0.93f, -1.29f, -1.591f, -0.806f)
            lineToRelative(-5.88f, 4.311f)
            curveToRelative(-0.68f, 0.5f, -0.68f, 1.517f, 0f, 2.016f)
            lineToRelative(5.88f, 4.312f)
            curveTo(9.069f, 15.805f, 10f, 15.333f, 10f, 14.514f)
            verticalLineToRelative(-3.16f)
            lineToRelative(5.409f, 3.966f)
            curveTo(16.069f, 15.805f, 17f, 15.333f, 17f, 14.514f)
            verticalLineTo(5.487f)
            curveToRelative(0f, -0.819f, -0.93f, -1.29f, -1.591f, -0.806f)
            lineTo(10f, 8.647f)
            verticalLineToRelative(-3.16f)
            close()
            moveTo(3.12f, 9.8f)
            lineTo(9f, 5.487f)
            verticalLineToRelative(9.027f)
            lineToRelative(-5.88f, -4.312f)
            curveToRelative(-0.135f, -0.1f, -0.135f, -0.303f, 0f, -0.403f)
            close()
            moveToRelative(7f, 0f)
            lineTo(16f, 5.487f)
            verticalLineToRelative(9.027f)
            lineToRelative(-5.88f, -4.312f)
            curveToRelative(-0.135f, -0.1f, -0.135f, -0.303f, 0f, -0.403f)
            close()
        }
    }.build()
}
