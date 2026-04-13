package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.269f, 15.794f)
            curveToRelative(-0.3f, 0.286f, -0.775f, 0.274f, -1.06f, -0.026f)
            lineToRelative(-5.002f, -5.25f)
            curveToRelative(-0.276f, -0.29f, -0.276f, -0.745f, 0f, -1.035f)
            lineToRelative(5.001f, -5.25f)
            curveToRelative(0.286f, -0.3f, 0.76f, -0.312f, 1.06f, -0.026f)
            curveToRelative(0.3f, 0.286f, 0.312f, 0.76f, 0.026f, 1.06f)
            lineToRelative(-4.508f, 4.734f)
            lineToRelative(4.508f, 4.733f)
            curveToRelative(0.286f, 0.3f, 0.274f, 0.774f, -0.025f, 1.06f)
            close()
        }
    }.build()
}
