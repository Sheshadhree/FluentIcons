package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Hexagon24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Hexagon24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.105f, 3f)
            curveTo(7.301f, 3f, 6.56f, 3.429f, 6.157f, 4.125f)
            lineToRelative(-3.896f, 6.75f)
            curveToRelative(-0.402f, 0.696f, -0.402f, 1.554f, 0f, 2.25f)
            lineToRelative(3.896f, 6.75f)
            curveTo(6.559f, 20.57f, 7.3f, 21f, 8.105f, 21f)
            horizontalLineToRelative(7.79f)
            curveToRelative(0.804f, 0f, 1.547f, -0.429f, 1.95f, -1.125f)
            lineToRelative(3.895f, -6.75f)
            curveToRelative(0.401f, -0.696f, 0.401f, -1.554f, 0f, -2.25f)
            lineToRelative(-3.896f, -6.75f)
            curveTo(17.442f, 3.43f, 16.7f, 3f, 15.895f, 3f)
            horizontalLineToRelative(-7.79f)
            close()
        }
    }.build()
}
