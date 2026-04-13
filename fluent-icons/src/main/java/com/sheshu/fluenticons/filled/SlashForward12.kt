package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlashForward12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlashForward12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.464f, 1.03f)
            curveTo(7.86f, 1.149f, 8.088f, 1.566f, 7.97f, 1.963f)
            lineToRelative(-2.501f, 8.5f)
            curveToRelative(-0.117f, 0.397f, -0.534f, 0.625f, -0.932f, 0.508f)
            curveToRelative(-0.397f, -0.117f, -0.624f, -0.534f, -0.507f, -0.932f)
            lineToRelative(2.502f, -8.5f)
            curveToRelative(0.116f, -0.397f, 0.533f, -0.624f, 0.93f, -0.507f)
            close()
        }
    }.build()
}
