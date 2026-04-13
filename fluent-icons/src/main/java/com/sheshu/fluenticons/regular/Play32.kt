package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Play32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Play32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.24f, 6.203f)
            curveTo(10.24f, 5.637f, 9f, 6.359f, 9f, 7.508f)
            verticalLineTo(24.5f)
            curveToRelative(0f, 1.15f, 1.24f, 1.872f, 2.24f, 1.305f)
            lineToRelative(14.997f, -8.498f)
            curveToRelative(1.014f, -0.575f, 1.014f, -2.036f, 0f, -2.61f)
            lineTo(11.239f, 6.202f)
            close()
            moveTo(7f, 7.508f)
            curveToRelative(0f, -2.681f, 2.891f, -4.367f, 5.225f, -3.046f)
            lineToRelative(14.997f, 8.493f)
            curveToRelative(2.367f, 1.34f, 2.368f, 4.75f, 0.001f, 6.09f)
            lineToRelative(-14.997f, 8.5f)
            curveTo(9.892f, 28.865f, 7f, 27.18f, 7f, 24.498f)
            verticalLineTo(7.51f)
            close()
        }
    }.build()
}
