package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Play16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Play16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.235f, 2.192f)
            curveTo(5.235f, 1.629f, 4f, 2.352f, 4f, 3.499f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.148f, 1.236f, 1.87f, 2.235f, 1.308f)
            lineToRelative(8f, -4.5f)
            curveToRelative(1.02f, -0.574f, 1.02f, -2.041f, 0f, -2.615f)
            lineToRelative(-8f, -4.5f)
            close()
        }
    }.build()
}
