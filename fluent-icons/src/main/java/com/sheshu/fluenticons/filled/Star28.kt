package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Star28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Star28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.701f, 3.908f)
            curveToRelative(0.532f, -1.078f, 2.069f, -1.078f, 2.6f, 0f)
            lineToRelative(2.692f, 5.452f)
            lineToRelative(6.017f, 0.875f)
            curveToRelative(1.19f, 0.173f, 1.664f, 1.634f, 0.804f, 2.473f)
            lineToRelative(-4.355f, 4.244f)
            lineToRelative(1.028f, 5.993f)
            curveToRelative(0.204f, 1.185f, -1.04f, 2.088f, -2.103f, 1.529f)
            lineTo(14f, 21.644f)
            lineToRelative(-5.381f, 2.83f)
            curveToRelative(-1.064f, 0.559f, -2.307f, -0.344f, -2.104f, -1.529f)
            lineToRelative(1.028f, -5.993f)
            lineToRelative(-4.354f, -4.244f)
            curveToRelative(-0.861f, -0.839f, -0.386f, -2.3f, 0.803f, -2.473f)
            lineTo(10.01f, 9.36f)
            lineToRelative(2.691f, -5.452f)
            close()
        }
    }.build()
}
