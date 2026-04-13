package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Prohibited28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Prohibited28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.329f, 6.257f)
            curveToRelative(-3.928f, -3.219f, -9.734f, -2.995f, -13.4f, 0.672f)
            curveToRelative(-3.667f, 3.666f, -3.89f, 9.472f, -0.672f, 13.4f)
            lineTo(20.329f, 6.257f)
            close()
            moveToRelative(1.414f, 1.414f)
            lineTo(7.671f, 21.743f)
            curveToRelative(3.928f, 3.219f, 9.733f, 2.995f, 13.4f, -0.672f)
            curveToRelative(3.667f, -3.667f, 3.89f, -9.472f, 0.672f, -13.4f)
            close()
            moveTo(5.515f, 5.515f)
            curveToRelative(4.686f, -4.687f, 12.284f, -4.687f, 16.97f, 0f)
            curveToRelative(4.687f, 4.686f, 4.687f, 12.284f, 0f, 16.97f)
            curveToRelative(-4.686f, 4.687f, -12.284f, 4.687f, -16.97f, 0f)
            curveToRelative(-4.687f, -4.686f, -4.687f, -12.284f, 0f, -16.97f)
            close()
        }
    }.build()
}
