package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Lightbulb28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Lightbulb28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2f)
            curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
            curveToRelative(0f, 2.765f, 1.248f, 5.24f, 3.21f, 6.89f)
            curveToRelative(0.402f, 0.339f, 0.679f, 0.736f, 0.78f, 1.158f)
            lineTo(9.34f, 20.5f)
            horizontalLineToRelative(9.322f)
            lineToRelative(0.349f, -1.452f)
            curveToRelative(0.101f, -0.422f, 0.378f, -0.819f, 0.78f, -1.158f)
            curveTo(21.753f, 16.24f, 23f, 13.765f, 23f, 11f)
            curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
            close()
            moveToRelative(4.301f, 20f)
            horizontalLineTo(9.7f)
            lineToRelative(0.362f, 1.508f)
            curveTo(10.41f, 24.97f, 11.718f, 26f, 13.22f, 26f)
            horizontalLineToRelative(1.558f)
            curveToRelative(1.503f, 0f, 2.81f, -1.03f, 3.16f, -2.492f)
            lineTo(18.301f, 22f)
            close()
        }
    }.build()
}
