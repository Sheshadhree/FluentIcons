package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TeardropBottomRight28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TeardropBottomRight28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.75f, 2f)
            curveTo(7.26f, 2f, 2f, 7.26f, 2f, 13.75f)
            verticalLineToRelative(0.5f)
            curveTo(2f, 20.74f, 7.26f, 26f, 13.75f, 26f)
            horizontalLineToRelative(9.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineToRelative(-9.5f)
            curveTo(26f, 7.26f, 20.74f, 2f, 14.25f, 2f)
            horizontalLineToRelative(-0.5f)
            close()
        }
    }.build()
}
