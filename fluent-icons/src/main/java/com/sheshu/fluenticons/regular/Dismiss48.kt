package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Dismiss48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Dismiss48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.384f, 6.616f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, 1.28f, 0f, 1.768f)
            lineTo(22.232f, 24f)
            lineTo(6.616f, 39.616f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            curveToRelative(0.489f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            lineTo(24f, 25.768f)
            lineToRelative(15.615f, 15.615f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, -1.28f, 0f, -1.768f)
            lineTo(25.768f, 24f)
            lineTo(41.383f, 8.384f)
            curveToRelative(0.489f, -0.488f, 0.489f, -1.28f, 0f, -1.767f)
            curveToRelative(-0.488f, -0.489f, -1.28f, -0.489f, -1.767f, 0f)
            lineTo(24f, 22.232f)
            lineTo(8.384f, 6.616f)
            close()
        }
    }.build()
}
