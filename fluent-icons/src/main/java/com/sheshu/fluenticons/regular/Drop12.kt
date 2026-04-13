package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Drop12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Drop12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveToRelative(0.133f, 0f, 0.26f, 0.053f, 0.354f, 0.147f)
            curveTo(6.61f, 1.404f, 7.387f, 2.18f, 8.1f, 3.218f)
            curveTo(8.806f, 4.244f, 9.5f, 5.597f, 9.5f, 7f)
            curveToRelative(0f, 1.337f, -0.36f, 2.352f, -1.019f, 3.035f)
            curveTo(7.821f, 10.718f, 6.928f, 11f, 6f, 11f)
            curveToRelative(-0.928f, 0f, -1.822f, -0.282f, -2.481f, -0.965f)
            curveTo(2.86f, 9.352f, 2.5f, 8.337f, 2.5f, 7f)
            curveToRelative(0f, -1.403f, 0.694f, -2.756f, 1.4f, -3.783f)
            curveToRelative(0.714f, -1.038f, 1.49f, -1.814f, 1.745f, -2.07f)
            horizontalLineToRelative(0.002f)
            curveTo(5.74f, 1.052f, 5.866f, 1f, 6f, 1f)
            close()
            moveToRelative(0f, 1.216f)
            curveTo(5.662f, 2.574f, 5.179f, 3.123f, 4.724f, 3.783f)
            curveTo(4.056f, 4.756f, 3.5f, 5.903f, 3.5f, 7f)
            curveToRelative(0f, 1.163f, 0.311f, 1.898f, 0.739f, 2.34f)
            curveTo(4.665f, 9.782f, 5.27f, 10f, 6f, 10f)
            curveToRelative(0.729f, 0f, 1.335f, -0.218f, 1.761f, -0.66f)
            curveTo(8.19f, 8.898f, 8.5f, 8.163f, 8.5f, 7f)
            curveToRelative(0f, -1.097f, -0.556f, -2.244f, -1.224f, -3.217f)
            curveTo(6.82f, 3.123f, 6.338f, 2.574f, 6f, 2.216f)
            close()
        }
    }.build()
}
