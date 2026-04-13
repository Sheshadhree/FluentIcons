package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Mail48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mail48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.02f, 13.747f)
            curveTo(4.276f, 10.53f, 6.968f, 8f, 10.25f, 8f)
            horizontalLineToRelative(27.5f)
            curveToRelative(3.31f, 0f, 6.019f, 2.573f, 6.236f, 5.828f)
            lineTo(24.002f, 24.35f)
            lineTo(4.02f, 13.747f)
            close()
            moveTo(4f, 16.567f)
            verticalLineTo(33.75f)
            curveTo(4f, 37.202f, 6.798f, 40f, 10.25f, 40f)
            horizontalLineToRelative(27.5f)
            curveToRelative(3.452f, 0f, 6.25f, -2.798f, 6.25f, -6.25f)
            verticalLineTo(16.645f)
            lineTo(24.582f, 26.87f)
            curveToRelative(-0.365f, 0.192f, -0.803f, 0.191f, -1.168f, -0.002f)
            lineTo(4f, 16.567f)
            close()
        }
    }.build()
}
