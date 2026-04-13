package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarHalf20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarHalf20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2.342f)
            curveToRelative(-0.356f, 0f, -0.713f, 0.186f, -0.896f, 0.557f)
            lineToRelative(-1.93f, 3.912f)
            lineToRelative(-4.317f, 0.627f)
            curveToRelative(-0.82f, 0.12f, -1.147f, 1.127f, -0.554f, 1.706f)
            lineToRelative(3.124f, 3.044f)
            lineToRelative(-0.738f, 4.3f)
            curveToRelative(-0.14f, 0.816f, 0.718f, 1.44f, 1.451f, 1.054f)
            lineToRelative(3.86f, -2.03f)
            verticalLineTo(2.342f)
            close()
        }
    }.build()
}
