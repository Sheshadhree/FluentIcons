package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretDownRight12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretDownRight12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.298f, 3.256f)
            curveToRelative(0.63f, -0.63f, 1.707f, -0.184f, 1.707f, 0.707f)
            verticalLineToRelative(3.543f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(3.962f)
            curveToRelative(-0.89f, 0f, -1.337f, -1.077f, -0.707f, -1.707f)
            lineToRelative(4.043f, -4.043f)
            close()
            moveToRelative(0.707f, 0.707f)
            lineTo(3.962f, 8.006f)
            horizontalLineToRelative(3.543f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(3.963f)
            close()
        }
    }.build()
}
