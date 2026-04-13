package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CaretDownRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CaretDownRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 7.208f)
            curveToRelative(0f, -1.114f, -1.346f, -1.672f, -2.133f, -0.884f)
            lineToRelative(-9.543f, 9.543f)
            curveTo(5.536f, 16.654f, 6.094f, 18f, 7.208f, 18f)
            horizontalLineToRelative(9.043f)
            curveToRelative(0.966f, 0f, 1.75f, -0.783f, 1.75f, -1.75f)
            verticalLineTo(7.208f)
            close()
        }
    }.build()
}
