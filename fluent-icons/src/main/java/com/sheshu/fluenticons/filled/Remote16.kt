package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Remote16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Remote16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.796f, 3.264f)
            curveToRelative(0.284f, -0.302f, 0.27f, -0.776f, -0.032f, -1.06f)
            curveToRelative(-0.302f, -0.284f, -0.776f, -0.27f, -1.06f, 0.032f)
            lineToRelative(-4f, 4.25f)
            curveToRelative(-0.272f, 0.289f, -0.272f, 0.74f, 0f, 1.028f)
            lineToRelative(4f, 4.25f)
            curveToRelative(0.284f, 0.302f, 0.758f, 0.316f, 1.06f, 0.032f)
            curveToRelative(0.302f, -0.284f, 0.316f, -0.758f, 0.032f, -1.06f)
            lineTo(10.28f, 7f)
            lineToRelative(3.516f, -3.736f)
            close()
            moveToRelative(-10.5f, 0.972f)
            curveTo(3.012f, 3.934f, 2.538f, 3.92f, 2.236f, 4.204f)
            curveTo(1.934f, 4.488f, 1.92f, 4.962f, 2.204f, 5.264f)
            lineTo(5.72f, 9f)
            lineToRelative(-3.516f, 3.736f)
            curveToRelative(-0.284f, 0.302f, -0.27f, 0.776f, 0.032f, 1.06f)
            curveToRelative(0.302f, 0.284f, 0.776f, 0.27f, 1.06f, -0.032f)
            lineToRelative(4f, -4.25f)
            curveToRelative(0.272f, -0.289f, 0.272f, -0.74f, 0f, -1.028f)
            lineToRelative(-4f, -4.25f)
            close()
        }
    }.build()
}
