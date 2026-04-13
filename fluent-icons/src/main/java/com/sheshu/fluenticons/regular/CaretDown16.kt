package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.136f, 6.571f)
            curveTo(3.675f, 5.908f, 4.149f, 5f, 4.956f, 5f)
            horizontalLineToRelative(6.087f)
            curveToRelative(0.808f, 0f, 1.282f, 0.908f, 0.82f, 1.571f)
            lineToRelative(-2.632f, 3.784f)
            curveToRelative(-0.597f, 0.858f, -1.866f, 0.858f, -2.462f, 0f)
            lineTo(4.136f, 6.571f)
            close()
            moveTo(4.956f, 6f)
            lineTo(7.59f, 9.784f)
            curveToRelative(0.2f, 0.286f, 0.622f, 0.286f, 0.821f, 0f)
            lineTo(11.043f, 6f)
            horizontalLineTo(4.957f)
            close()
        }
    }.build()
}
