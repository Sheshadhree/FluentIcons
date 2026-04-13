package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDownRight32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 28.996f)
            curveToRelative(-0.553f, 0f, -1f, -0.448f, -1f, -1f)
            curveToRelative(0f, -0.553f, 0.447f, -1f, 1f, -1f)
            horizontalLineToRelative(10.585f)
            lineTo(3.297f, 4.707f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(0.39f, -0.39f, 1.023f, -0.39f, 1.414f, 0f)
            lineTo(27f, 25.582f)
            verticalLineTo(14.996f)
            curveToRelative(0f, -0.553f, 0.447f, -1f, 1f, -1f)
            curveToRelative(0.552f, 0f, 1f, 0.447f, 1f, 1f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(15f)
            close()
        }
    }.build()
}
