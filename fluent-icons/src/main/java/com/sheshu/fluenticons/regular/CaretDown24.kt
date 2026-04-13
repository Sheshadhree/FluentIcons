package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.161f, 10.073f)
            curveTo(4.454f, 9.265f, 5.028f, 8f, 6.102f, 8f)
            horizontalLineToRelative(11.796f)
            curveToRelative(1.074f, 0f, 1.648f, 1.265f, 0.941f, 2.073f)
            lineToRelative(-5.522f, 6.31f)
            curveToRelative(-0.697f, 0.798f, -1.937f, 0.798f, -2.634f, 0f)
            lineToRelative(-5.522f, -6.31f)
            close()
            moveTo(6.653f, 9.5f)
            lineToRelative(5.159f, 5.896f)
            curveToRelative(0.1f, 0.114f, 0.277f, 0.114f, 0.376f, 0f)
            lineToRelative(5.16f, -5.896f)
            horizontalLineTo(6.652f)
            close()
        }
    }.build()
}
