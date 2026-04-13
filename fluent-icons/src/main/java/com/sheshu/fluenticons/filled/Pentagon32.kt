package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pentagon32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pentagon32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.91f, 2.602f)
            curveToRelative(-1.139f, -0.827f, -2.681f, -0.827f, -3.82f, 0f)
            lineTo(3.847f, 10.043f)
            curveToRelative(-1.14f, 0.828f, -1.616f, 2.295f, -1.18f, 3.634f)
            lineToRelative(3.911f, 12.04f)
            curveToRelative(0.435f, 1.339f, 1.683f, 2.245f, 3.091f, 2.245f)
            horizontalLineToRelative(12.66f)
            curveToRelative(1.408f, 0f, 2.655f, -0.906f, 3.09f, -2.245f)
            lineToRelative(3.912f, -12.04f)
            curveToRelative(0.436f, -1.34f, -0.041f, -2.806f, -1.18f, -3.634f)
            lineTo(17.91f, 2.603f)
            close()
        }
    }.build()
}
