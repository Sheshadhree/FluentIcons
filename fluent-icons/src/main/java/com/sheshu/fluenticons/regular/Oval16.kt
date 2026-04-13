package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Oval16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Oval16",
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
            moveToRelative(5f, -4f)
            curveTo(3.79f, 4f, 2f, 5.79f, 2f, 8f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(4f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
