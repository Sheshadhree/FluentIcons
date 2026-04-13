package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpRight32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 3f)
            curveToRelative(-0.553f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.447f, 1f, 1f, 1f)
            horizontalLineToRelative(10.585f)
            lineTo(3.297f, 27.288f)
            curveToRelative(-0.39f, 0.391f, -0.39f, 1.024f, 0f, 1.415f)
            curveToRelative(0.39f, 0.39f, 1.023f, 0.39f, 1.414f, 0f)
            lineTo(27f, 6.414f)
            verticalLineTo(17f)
            curveToRelative(0f, 0.552f, 0.447f, 1f, 1f, 1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(15f)
            close()
        }
    }.build()
}
