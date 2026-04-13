package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HomeEmpty28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HomeEmpty28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.592f, 3.498f)
            curveToRelative(0.823f, -0.66f, 1.993f, -0.66f, 2.816f, 0f)
            lineToRelative(7.75f, 6.217f)
            curveTo(23.69f, 10.142f, 24f, 10.787f, 24f, 11.47f)
            verticalLineToRelative(11.28f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 25f, 4f, 23.993f, 4f, 22.75f)
            verticalLineTo(11.47f)
            curveToRelative(0f, -0.683f, 0.31f, -1.328f, 0.842f, -1.755f)
            lineToRelative(7.75f, -6.217f)
            close()
        }
    }.build()
}
