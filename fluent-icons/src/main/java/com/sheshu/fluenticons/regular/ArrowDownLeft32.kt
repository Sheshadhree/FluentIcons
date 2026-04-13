package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDownLeft32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.004f, 28.996f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            curveToRelative(0f, -0.553f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(6.418f)
            lineTo(28.707f, 4.707f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineTo(5.003f, 25.582f)
            verticalLineTo(14.996f)
            curveToRelative(0f, -0.553f, -0.447f, -1f, -1f, -1f)
            curveToRelative(-0.551f, 0f, -1f, 0.447f, -1f, 1f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.552f, 0.449f, 1f, 1f, 1f)
            horizontalLineToRelative(13f)
            close()
        }
    }.build()
}
