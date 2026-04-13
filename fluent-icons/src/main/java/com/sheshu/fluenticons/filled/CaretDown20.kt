package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CaretDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CaretDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.797f, 7f)
            curveTo(4.957f, 7f, 4.49f, 7.974f, 5.019f, 8.628f)
            lineToRelative(3.814f, 4.723f)
            curveToRelative(0.6f, 0.743f, 1.734f, 0.743f, 2.334f, 0f)
            lineToRelative(3.815f, -4.723f)
            curveTo(15.51f, 7.974f, 15.044f, 7f, 14.204f, 7f)
            horizontalLineTo(5.797f)
            close()
        }
    }.build()
}
