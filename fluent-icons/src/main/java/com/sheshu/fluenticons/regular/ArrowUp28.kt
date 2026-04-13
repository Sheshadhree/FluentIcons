package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUp28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUp28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.211f, 12.733f)
            curveToRelative(-0.287f, 0.298f, -0.278f, 0.773f, 0.021f, 1.06f)
            curveToRelative(0.298f, 0.287f, 0.773f, 0.278f, 1.06f, -0.02f)
            lineToRelative(7.96f, -8.275f)
            verticalLineToRelative(18.753f)
            curveToRelative(0f, 0.415f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.335f, 0.75f, -0.75f)
            verticalLineTo(5.5f)
            lineToRelative(7.958f, 8.274f)
            curveToRelative(0.288f, 0.298f, 0.762f, 0.307f, 1.061f, 0.02f)
            curveToRelative(0.299f, -0.287f, 0.308f, -0.762f, 0.02f, -1.06f)
            lineToRelative(-9.069f, -9.428f)
            curveToRelative(-0.393f, -0.41f, -1.048f, -0.41f, -1.441f, 0f)
            lineToRelative(-9.07f, 9.428f)
            close()
        }
    }.build()
}
