package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Heart20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Heart20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.388f, 4.29f)
            curveTo(7.693f, 2.577f, 4.95f, 2.569f, 3.261f, 4.274f)
            curveToRelative(-1.688f, 1.705f, -1.68f, 4.476f, 0.016f, 6.189f)
            lineToRelative(6.277f, 6.34f)
            curveToRelative(0.26f, 0.263f, 0.682f, 0.263f, 0.942f, 0f)
            lineToRelative(6.245f, -6.304f)
            curveToRelative(1.684f, -1.71f, 1.679f, -4.474f, -0.017f, -6.187f)
            curveToRelative(-1.699f, -1.715f, -4.443f, -1.724f, -6.135f, -0.015f)
            lineTo(9.993f, 4.9f)
            lineTo(9.388f, 4.29f)
            close()
        }
    }.build()
}
