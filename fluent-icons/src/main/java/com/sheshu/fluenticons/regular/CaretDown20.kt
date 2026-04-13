package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.019f, 8.628f)
            curveTo(4.49f, 7.974f, 4.956f, 7f, 5.797f, 7f)
            horizontalLineToRelative(8.407f)
            curveToRelative(0.84f, 0f, 1.306f, 0.974f, 0.778f, 1.628f)
            lineToRelative(-3.815f, 4.723f)
            curveToRelative(-0.6f, 0.743f, -1.733f, 0.743f, -2.334f, 0f)
            lineTo(5.02f, 8.628f)
            close()
            moveTo(14.204f, 8f)
            horizontalLineTo(5.797f)
            lineToRelative(3.814f, 4.723f)
            curveToRelative(0.2f, 0.247f, 0.578f, 0.247f, 0.778f, 0f)
            lineTo(14.204f, 8f)
            close()
        }
    }.build()
}
