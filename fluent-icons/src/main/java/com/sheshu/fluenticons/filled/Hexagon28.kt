package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Hexagon28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Hexagon28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.39f, 3f)
            curveTo(8.42f, 3f, 7.52f, 3.513f, 7.024f, 4.349f)
            lineToRelative(-4.885f, 8.25f)
            curveToRelative(-0.512f, 0.864f, -0.512f, 1.938f, 0f, 2.802f)
            lineToRelative(4.885f, 8.25f)
            curveTo(7.519f, 24.487f, 8.419f, 25f, 9.39f, 25f)
            horizontalLineToRelative(9.22f)
            curveToRelative(0.972f, 0f, 1.871f, -0.513f, 2.366f, -1.348f)
            lineToRelative(4.887f, -8.25f)
            curveToRelative(0.512f, -0.865f, 0.512f, -1.94f, 0f, -2.804f)
            lineToRelative(-4.887f, -8.25f)
            curveTo(20.481f, 3.513f, 19.582f, 3f, 18.61f, 3f)
            horizontalLineTo(9.39f)
            close()
            moveToRelative(-7.25f, 9.599f)
            lineToRelative(0.645f, 0.382f)
            lineToRelative(-0.645f, -0.382f)
            close()
        }
    }.build()
}
