package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Play28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Play28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.138f, 3.382f)
            curveTo(8.304f, 2.31f, 6f, 3.632f, 6f, 5.756f)
            verticalLineToRelative(16.489f)
            curveToRelative(0f, 2.123f, 2.304f, 3.445f, 4.138f, 2.374f)
            lineToRelative(14.697f, -8.59f)
            curveToRelative(1.552f, -0.907f, 1.552f, -3.15f, 0f, -4.057f)
            lineToRelative(-14.697f, -8.59f)
            close()
        }
    }.build()
}
