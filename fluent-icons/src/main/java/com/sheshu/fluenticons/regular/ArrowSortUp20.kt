package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSortUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSortUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.998f, 4.71f)
            lineTo(6.354f, 7.354f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0f, -0.707f)
            lineTo(9.115f, 3.18f)
            curveTo(9.206f, 3.069f, 9.345f, 3f, 9.498f, 3f)
            horizontalLineTo(9.5f)
            curveToRelative(0.078f, 0f, 0.157f, 0.018f, 0.229f, 0.055f)
            curveToRelative(0.045f, 0.023f, 0.087f, 0.054f, 0.125f, 0.092f)
            lineToRelative(0.01f, 0.01f)
            lineToRelative(3.49f, 3.49f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(-0.195f, 0.196f, -0.512f, 0.196f, -0.707f, 0f)
            lineToRelative(-2.65f, -2.649f)
            verticalLineTo(16.5f)
            curveToRelative(0f, 0.276f, -0.223f, 0.5f, -0.5f, 0.5f)
            curveToRelative(-0.275f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(4.71f)
            close()
        }
    }.build()
}
