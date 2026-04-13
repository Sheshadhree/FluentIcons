package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChevronUpDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronUpDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.54f, 2.23f)
            curveTo(12.4f, 2.083f, 12.205f, 2f, 12f, 2f)
            curveToRelative(-0.204f, 0f, -0.4f, 0.083f, -0.54f, 0.23f)
            lineToRelative(-6.25f, 6.5f)
            curveToRelative(-0.289f, 0.3f, -0.279f, 0.774f, 0.02f, 1.06f)
            curveToRelative(0.299f, 0.288f, 0.773f, 0.278f, 1.06f, -0.02f)
            lineTo(12f, 3.832f)
            lineToRelative(5.71f, 5.938f)
            curveToRelative(0.287f, 0.298f, 0.761f, 0.308f, 1.06f, 0.02f)
            curveToRelative(0.298f, -0.286f, 0.308f, -0.761f, 0.02f, -1.06f)
            lineToRelative(-6.25f, -6.5f)
            close()
            moveToRelative(0f, 19.54f)
            curveTo(12.4f, 21.917f, 12.205f, 22f, 12f, 22f)
            curveToRelative(-0.204f, 0f, -0.4f, -0.083f, -0.54f, -0.23f)
            lineToRelative(-6.25f, -6.5f)
            curveToRelative(-0.288f, -0.299f, -0.278f, -0.774f, 0.02f, -1.06f)
            curveToRelative(0.299f, -0.288f, 0.773f, -0.278f, 1.06f, 0.02f)
            lineTo(12f, 20.168f)
            lineToRelative(5.71f, -5.938f)
            curveToRelative(0.287f, -0.298f, 0.761f, -0.308f, 1.06f, -0.02f)
            curveToRelative(0.298f, 0.286f, 0.308f, 0.761f, 0.02f, 1.06f)
            lineToRelative(-6.25f, 6.5f)
            close()
        }
    }.build()
}
