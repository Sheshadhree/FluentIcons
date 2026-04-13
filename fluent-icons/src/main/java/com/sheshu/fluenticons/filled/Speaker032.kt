package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Speaker032: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Speaker032",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 5.433f)
            curveToRelative(0f, -1.398f, -1.742f, -2.036f, -2.645f, -0.97f)
            lineToRelative(-4.086f, 4.83f)
            curveTo(10.89f, 9.74f, 10.331f, 10f, 9.743f, 10f)
            horizontalLineTo(6f)
            curveToRelative(-2.21f, 0f, -4f, 1.791f, -4f, 4f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(3.743f)
            curveToRelative(0.588f, 0f, 1.146f, 0.26f, 1.526f, 0.708f)
            lineToRelative(4.086f, 4.829f)
            curveTo(16.257f, 28.603f, 18f, 27.965f, 18f, 26.567f)
            verticalLineTo(5.434f)
            close()
        }
    }.build()
}
