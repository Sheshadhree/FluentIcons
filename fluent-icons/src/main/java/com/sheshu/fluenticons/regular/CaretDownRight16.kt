package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretDownRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretDownRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.293f, 4.25f)
            curveTo(10.923f, 3.62f, 12f, 4.066f, 12f, 4.957f)
            verticalLineTo(10.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(4.957f)
            curveToRelative(-0.89f, 0f, -1.337f, -1.077f, -0.707f, -1.707f)
            lineToRelative(6.043f, -6.043f)
            close()
            moveTo(11f, 4.957f)
            lineTo(4.957f, 11f)
            horizontalLineTo(10.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(4.957f)
            close()
        }
    }.build()
}
