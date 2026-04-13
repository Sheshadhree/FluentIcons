package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CaretRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CaretRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 14.204f)
            curveToRelative(0f, 0.84f, 0.974f, 1.306f, 1.628f, 0.778f)
            lineToRelative(4.723f, -3.815f)
            curveToRelative(0.743f, -0.6f, 0.743f, -1.733f, 0f, -2.334f)
            lineTo(8.628f, 5.02f)
            curveTo(7.974f, 4.49f, 7f, 4.956f, 7f, 5.797f)
            verticalLineToRelative(8.407f)
            close()
        }
    }.build()
}
