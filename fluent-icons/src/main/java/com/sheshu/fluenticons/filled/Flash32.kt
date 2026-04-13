package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Flash32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flash32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(-0.86f, 0f, -1.625f, 0.55f, -1.897f, 1.368f)
            lineToRelative(-4f, 12f)
            curveToRelative(-0.204f, 0.61f, -0.101f, 1.28f, 0.275f, 1.801f)
            curveTo(6.753f, 17.691f, 7.357f, 18f, 8f, 18f)
            horizontalLineToRelative(2.415f)
            lineToRelative(-2.287f, 8.825f)
            curveToRelative(-0.671f, 2.587f, 2.64f, 4.28f, 4.345f, 2.222f)
            lineTo(25.54f, 13.276f)
            curveToRelative(0.495f, -0.597f, 0.6f, -1.425f, 0.27f, -2.127f)
            curveTo(25.48f, 10.448f, 24.775f, 10f, 24f, 10f)
            horizontalLineToRelative(-3.114f)
            lineToRelative(1.987f, -5.298f)
            curveToRelative(0.23f, -0.614f, 0.144f, -1.302f, -0.23f, -1.841f)
            curveTo(22.27f, 2.32f, 21.657f, 2f, 21f, 2f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}
