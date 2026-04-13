package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretDownRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretDownRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.293f, 5.25f)
            curveTo(13.923f, 4.62f, 15f, 5.066f, 15f, 5.957f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(5.957f)
            curveToRelative(-0.89f, 0f, -1.337f, -1.077f, -0.707f, -1.707f)
            lineToRelative(8.043f, -8.043f)
            close()
            moveTo(14f, 5.957f)
            lineTo(5.957f, 14f)
            horizontalLineTo(13.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(5.957f)
            close()
        }
    }.build()
}
