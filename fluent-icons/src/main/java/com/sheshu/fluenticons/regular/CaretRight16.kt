package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.571f, 11.84f)
            curveTo(6.908f, 12.298f, 6f, 11.827f, 6f, 11.024f)
            verticalLineTo(4.975f)
            curveTo(6f, 4.172f, 6.908f, 3.701f, 7.571f, 4.16f)
            lineToRelative(3.784f, 2.617f)
            curveToRelative(0.858f, 0.593f, 0.858f, 1.854f, 0f, 2.447f)
            lineTo(7.571f, 11.84f)
            close()
            moveTo(7f, 11.024f)
            lineToRelative(3.784f, -2.616f)
            curveToRelative(0.286f, -0.198f, 0.286f, -0.619f, 0f, -0.816f)
            lineTo(7f, 4.975f)
            verticalLineToRelative(6.049f)
            close()
        }
    }.build()
}
