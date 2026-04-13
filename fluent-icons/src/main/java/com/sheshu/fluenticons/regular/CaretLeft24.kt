package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.927f, 18.839f)
            curveTo(13.735f, 19.546f, 15f, 18.972f, 15f, 17.899f)
            verticalLineTo(6.101f)
            curveToRelative(0f, -1.074f, -1.265f, -1.648f, -2.073f, -0.94f)
            lineToRelative(-6.31f, 5.521f)
            curveToRelative(-0.798f, 0.697f, -0.798f, 1.937f, 0f, 2.634f)
            lineToRelative(6.31f, 5.522f)
            close()
            moveToRelative(0.573f, -1.492f)
            lineToRelative(-5.896f, -5.159f)
            curveToRelative(-0.114f, -0.1f, -0.114f, -0.276f, 0f, -0.376f)
            lineTo(13.5f, 6.653f)
            verticalLineToRelative(10.694f)
            close()
        }
    }.build()
}
