package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Rhombus28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Rhombus28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.555f, 5.928f)
            curveTo(6.999f, 4.767f, 8.113f, 4f, 9.357f, 4f)
            horizontalLineToRelative(14.638f)
            curveToRelative(2.103f, 0f, 3.553f, 2.107f, 2.802f, 4.072f)
            lineToRelative(-5.354f, 14f)
            curveTo(21f, 23.233f, 19.884f, 24f, 18.641f, 24f)
            horizontalLineTo(4.003f)
            curveTo(1.9f, 24f, 0.449f, 21.893f, 1.2f, 19.928f)
            lineToRelative(5.354f, -14f)
            close()
        }
    }.build()
}
