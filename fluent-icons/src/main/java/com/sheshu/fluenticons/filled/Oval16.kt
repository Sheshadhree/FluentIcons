package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Oval16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Oval16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 8f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            horizontalLineToRelative(4f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            horizontalLineTo(6f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            close()
        }
    }.build()
}
