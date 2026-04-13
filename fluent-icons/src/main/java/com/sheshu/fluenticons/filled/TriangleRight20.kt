package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TriangleRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TriangleRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.215f, 8.68f)
            curveToRelative(1.047f, 0.568f, 1.047f, 2.07f, 0f, 2.638f)
            lineToRelative(-11.999f, 6.5f)
            curveToRelative(-1f, 0.541f, -2.214f, -0.183f, -2.214f, -1.32f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -1.137f, 1.215f, -1.86f, 2.214f, -1.32f)
            lineToRelative(11.999f, 6.5f)
            close()
        }
    }.build()
}
