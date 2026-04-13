package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CaretDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CaretDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.102f, 8f)
            curveToRelative(-1.074f, 0f, -1.648f, 1.265f, -0.94f, 2.073f)
            lineToRelative(5.521f, 6.31f)
            curveToRelative(0.697f, 0.798f, 1.937f, 0.798f, 2.634f, 0f)
            lineToRelative(5.522f, -6.31f)
            curveTo(19.546f, 9.265f, 18.972f, 8f, 17.899f, 8f)
            horizontalLineTo(6.101f)
            close()
        }
    }.build()
}
