package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CaretDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CaretDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.957f, 5f)
            curveTo(4.149f, 5f, 3.675f, 5.908f, 4.136f, 6.571f)
            lineToRelative(2.633f, 3.784f)
            curveToRelative(0.596f, 0.858f, 1.865f, 0.858f, 2.462f, 0f)
            lineToRelative(2.633f, -3.784f)
            curveTo(12.325f, 5.908f, 11.85f, 5f, 11.043f, 5f)
            horizontalLineTo(4.957f)
            close()
        }
    }.build()
}
