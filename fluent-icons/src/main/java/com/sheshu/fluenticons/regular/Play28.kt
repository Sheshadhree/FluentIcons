package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Play28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Play28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.38f, 4.677f)
            curveTo(8.548f, 4.19f, 7.5f, 4.79f, 7.5f, 5.757f)
            verticalLineToRelative(16.488f)
            curveToRelative(0f, 0.965f, 1.047f, 1.566f, 1.88f, 1.079f)
            lineToRelative(14.698f, -8.59f)
            curveToRelative(0.561f, -0.328f, 0.561f, -1.14f, 0f, -1.467f)
            lineTo(9.381f, 4.677f)
            close()
            moveTo(6f, 5.757f)
            curveToRelative(0f, -2.124f, 2.304f, -3.447f, 4.138f, -2.375f)
            lineToRelative(14.697f, 8.59f)
            curveToRelative(1.552f, 0.907f, 1.552f, 3.15f, 0f, 4.057f)
            lineToRelative(-14.697f, 8.59f)
            curveTo(8.304f, 25.691f, 6f, 24.369f, 6f, 22.245f)
            verticalLineTo(5.756f)
            close()
        }
    }.build()
}
