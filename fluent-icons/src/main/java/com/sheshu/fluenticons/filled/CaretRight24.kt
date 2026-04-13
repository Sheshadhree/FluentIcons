package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CaretRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CaretRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 17.898f)
            curveToRelative(0f, 1.074f, 1.265f, 1.648f, 2.073f, 0.941f)
            lineToRelative(6.31f, -5.522f)
            curveToRelative(0.798f, -0.697f, 0.798f, -1.937f, 0f, -2.634f)
            lineToRelative(-6.31f, -5.522f)
            curveTo(10.265f, 4.454f, 9f, 5.028f, 9f, 6.102f)
            verticalLineToRelative(11.796f)
            close()
        }
    }.build()
}
