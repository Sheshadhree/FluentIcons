package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.628f, 14.982f)
            curveTo(7.974f, 15.51f, 7f, 15.044f, 7f, 14.204f)
            verticalLineTo(5.797f)
            curveToRelative(0f, -0.84f, 0.974f, -1.306f, 1.628f, -0.778f)
            lineToRelative(4.723f, 3.814f)
            curveToRelative(0.743f, 0.6f, 0.743f, 1.734f, 0f, 2.334f)
            lineToRelative(-4.723f, 3.815f)
            close()
            moveTo(8f, 5.797f)
            verticalLineToRelative(8.407f)
            lineToRelative(4.723f, -3.815f)
            curveToRelative(0.247f, -0.2f, 0.247f, -0.578f, 0f, -0.778f)
            lineTo(8f, 5.797f)
            close()
        }
    }.build()
}
