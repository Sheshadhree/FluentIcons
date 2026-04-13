package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TriangleRight32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TriangleRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(27.317f, 18.846f)
            curveToRelative(2.242f, -1.235f, 2.242f, -4.457f, 0f, -5.693f)
            lineTo(7.82f, 2.403f)
            curveTo(5.653f, 1.21f, 3f, 2.777f, 3f, 5.25f)
            verticalLineToRelative(21.492f)
            curveToRelative(0f, 2.473f, 2.652f, 4.04f, 4.818f, 2.846f)
            lineToRelative(19.499f, -10.742f)
            close()
        }
    }.build()
}
