package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.073f, 18.839f)
            curveTo(10.265f, 19.546f, 9f, 18.972f, 9f, 17.899f)
            verticalLineTo(6.101f)
            curveToRelative(0f, -1.074f, 1.265f, -1.648f, 2.073f, -0.94f)
            lineToRelative(6.31f, 5.521f)
            curveToRelative(0.798f, 0.697f, 0.798f, 1.937f, 0f, 2.634f)
            lineToRelative(-6.31f, 5.522f)
            close()
            moveTo(10.5f, 17.347f)
            lineToRelative(5.896f, -5.159f)
            curveToRelative(0.114f, -0.1f, 0.114f, -0.276f, 0f, -0.376f)
            lineTo(10.5f, 6.653f)
            verticalLineToRelative(10.694f)
            close()
        }
    }.build()
}
