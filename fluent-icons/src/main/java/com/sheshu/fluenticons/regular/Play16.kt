package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Play16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Play16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.745f, 3.064f)
            curveTo(5.412f, 2.877f, 5f, 3.118f, 5f, 3.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.383f, 0.412f, 0.624f, 0.745f, 0.436f)
            lineToRelative(8f, -4.5f)
            curveToRelative(0.34f, -0.19f, 0.34f, -0.68f, 0f, -0.871f)
            lineToRelative(-8f, -4.5f)
            close()
            moveTo(4f, 3.5f)
            curveToRelative(0f, -1.147f, 1.236f, -1.87f, 2.235f, -1.307f)
            lineToRelative(8f, 4.5f)
            curveToRelative(1.02f, 0.574f, 1.02f, 2.042f, 0f, 2.615f)
            lineToRelative(-8f, 4.5f)
            curveTo(5.235f, 14.37f, 4f, 13.648f, 4f, 12.5f)
            verticalLineToRelative(-9f)
            close()
        }
    }.build()
}
