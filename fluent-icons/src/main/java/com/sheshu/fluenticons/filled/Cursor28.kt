package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cursor28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cursor28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3.604f)
            curveToRelative(0f, -1.346f, 1.56f, -2.09f, 2.607f, -1.243f)
            lineToRelative(16.88f, 13.669f)
            curveToRelative(1.018f, 0.824f, 0.435f, 2.47f, -0.875f, 2.47f)
            horizontalLineToRelative(-9.377f)
            curveToRelative(-0.679f, 0f, -1.322f, 0.307f, -1.749f, 0.835f)
            lineToRelative(-4.962f, 6.134f)
            curveTo(7.682f, 26.51f, 6f, 25.915f, 6f, 24.576f)
            verticalLineTo(3.604f)
            close()
        }
    }.build()
}
