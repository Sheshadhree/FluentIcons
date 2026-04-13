package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Star24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Star24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.788f, 3.102f)
            curveToRelative(0.495f, -1.003f, 1.926f, -1.003f, 2.421f, 0f)
            lineToRelative(2.358f, 4.778f)
            lineToRelative(5.273f, 0.766f)
            curveToRelative(1.107f, 0.16f, 1.549f, 1.522f, 0.748f, 2.303f)
            lineToRelative(-3.816f, 3.719f)
            lineToRelative(0.901f, 5.25f)
            curveToRelative(0.19f, 1.104f, -0.968f, 1.945f, -1.959f, 1.424f)
            lineToRelative(-4.716f, -2.48f)
            lineToRelative(-4.715f, 2.48f)
            curveToRelative(-0.99f, 0.52f, -2.148f, -0.32f, -1.96f, -1.423f)
            lineToRelative(0.901f, -5.251f)
            lineToRelative(-3.815f, -3.72f)
            curveToRelative(-0.801f, -0.78f, -0.359f, -2.141f, 0.748f, -2.302f)
            lineTo(8.43f, 7.88f)
            lineToRelative(2.358f, -4.778f)
            close()
        }
    }.build()
}
