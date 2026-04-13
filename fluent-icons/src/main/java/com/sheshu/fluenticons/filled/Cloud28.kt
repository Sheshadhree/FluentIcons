package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cloud28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cloud28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 5f)
            curveToRelative(-3.532f, 0f, -6.453f, 2.616f, -6.931f, 6.017f)
            curveTo(4.233f, 11.237f, 2f, 13.607f, 2f, 16.5f)
            curveTo(2f, 19.538f, 4.462f, 22f, 7.5f, 22f)
            horizontalLineToRelative(13f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            curveToRelative(0f, -2.892f, -2.233f, -5.263f, -5.069f, -5.483f)
            curveTo(20.453f, 7.616f, 17.532f, 5f, 14f, 5f)
            close()
        }
    }.build()
}
