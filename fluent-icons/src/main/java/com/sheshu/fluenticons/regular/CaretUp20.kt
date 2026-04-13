package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.019f, 12.28f)
            curveToRelative(-0.528f, 0.654f, -0.063f, 1.628f, 0.778f, 1.628f)
            horizontalLineToRelative(8.407f)
            curveToRelative(0.84f, 0f, 1.306f, -0.974f, 0.778f, -1.628f)
            lineToRelative(-3.815f, -4.723f)
            curveToRelative(-0.6f, -0.743f, -1.733f, -0.743f, -2.334f, 0f)
            lineTo(5.02f, 12.28f)
            close()
            moveToRelative(9.185f, 0.628f)
            horizontalLineTo(5.797f)
            lineTo(9.61f, 8.185f)
            curveToRelative(0.2f, -0.247f, 0.578f, -0.247f, 0.778f, 0f)
            lineToRelative(3.815f, 4.723f)
            close()
        }
    }.build()
}
