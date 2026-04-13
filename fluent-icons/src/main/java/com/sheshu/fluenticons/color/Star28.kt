package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Star28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Star28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(25.2501f, 25.1244f),
                end = Offset(2.11238f, 3.29564f)
            )
        ) {
            moveTo(12.701f, 3.908f)
            curveToRelative(0.532f, -1.077f, 2.069f, -1.077f, 2.6f, 0f)
            lineToRelative(2.692f, 5.453f)
            lineToRelative(6.017f, 0.874f)
            curveToRelative(1.19f, 0.173f, 1.664f, 1.635f, 0.804f, 2.474f)
            lineToRelative(-4.355f, 4.244f)
            lineToRelative(1.028f, 5.993f)
            curveToRelative(0.204f, 1.184f, -1.04f, 2.087f, -2.103f, 1.528f)
            lineTo(14f, 21.644f)
            lineToRelative(-5.381f, 2.83f)
            curveToRelative(-1.064f, 0.56f, -2.307f, -0.344f, -2.104f, -1.528f)
            lineToRelative(1.028f, -5.993f)
            lineToRelative(-4.354f, -4.244f)
            curveToRelative(-0.861f, -0.84f, -0.386f, -2.3f, 0.803f, -2.474f)
            lineToRelative(6.017f, -0.874f)
            lineTo(12.7f, 3.908f)
            close()
        }
    }.build()
}
