package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Play24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Play24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 5.274f)
            curveToRelative(0f, -1.707f, 1.826f, -2.792f, 3.325f, -1.977f)
            lineToRelative(12.362f, 6.726f)
            curveToRelative(1.566f, 0.853f, 1.566f, 3.101f, 0f, 3.953f)
            lineTo(8.325f, 20.702f)
            curveTo(6.826f, 21.518f, 5f, 20.432f, 5f, 18.726f)
            verticalLineTo(5.274f)
            close()
        }
    }.build()
}
