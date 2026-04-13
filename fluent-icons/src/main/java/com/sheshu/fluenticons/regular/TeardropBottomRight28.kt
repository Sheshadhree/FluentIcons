package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TeardropBottomRight28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TeardropBottomRight28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 13.75f)
            curveTo(2f, 7.26f, 7.26f, 2f, 13.75f, 2f)
            horizontalLineToRelative(0.5f)
            curveTo(20.74f, 2f, 26f, 7.26f, 26f, 13.75f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-9.5f)
            curveTo(7.26f, 26f, 2f, 20.74f, 2f, 14.25f)
            verticalLineToRelative(-0.5f)
            close()
            moveTo(13.75f, 3.5f)
            curveTo(8.09f, 3.5f, 3.5f, 8.09f, 3.5f, 13.75f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 5.66f, 4.59f, 10.25f, 10.25f, 10.25f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -5.66f, -4.59f, -10.25f, -10.25f, -10.25f)
            horizontalLineToRelative(-0.5f)
            close()
        }
    }.build()
}
