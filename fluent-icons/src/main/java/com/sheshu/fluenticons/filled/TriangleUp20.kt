package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TriangleUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TriangleUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.32f, 2.785f)
            curveToRelative(-0.568f, -1.047f, -2.071f, -1.047f, -2.638f, 0f)
            lineToRelative(-6.5f, 12f)
            curveToRelative(-0.541f, 0.998f, 0.183f, 2.213f, 1.32f, 2.213f)
            horizontalLineTo(16.5f)
            curveToRelative(1.137f, 0f, 1.86f, -1.215f, 1.319f, -2.214f)
            lineToRelative(-6.5f, -11.998f)
            close()
        }
    }.build()
}
