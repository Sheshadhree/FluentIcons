package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CaretLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CaretLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.428f, 11.84f)
            curveToRelative(0.663f, 0.458f, 1.571f, -0.013f, 1.571f, -0.816f)
            verticalLineTo(4.975f)
            curveToRelative(0f, -0.803f, -0.908f, -1.274f, -1.571f, -0.816f)
            lineTo(5.643f, 6.776f)
            curveToRelative(-0.857f, 0.593f, -0.857f, 1.854f, 0f, 2.447f)
            lineToRelative(3.785f, 2.617f)
            close()
        }
    }.build()
}
