package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Dismiss32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Dismiss32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26.29f, 4.293f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineTo(17.413f, 15.998f)
            lineTo(27.704f, 26.29f)
            curveToRelative(0.391f, 0.39f, 0.391f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.39f, 0.39f, -1.023f, 0.39f, -1.414f, 0f)
            lineTo(16f, 17.413f)
            lineTo(5.707f, 27.704f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.023f, 0f, -1.414f)
            lineTo(14.584f, 16f)
            lineTo(4.293f, 5.707f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineTo(16f, 14.584f)
            lineTo(26.29f, 4.293f)
            close()
        }
    }.build()
}
