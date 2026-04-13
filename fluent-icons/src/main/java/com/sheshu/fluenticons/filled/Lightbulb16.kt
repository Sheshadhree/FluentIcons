package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Lightbulb16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Lightbulb16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveTo(5.515f, 2f, 3.5f, 4.015f, 3.5f, 6.5f)
            curveToRelative(0f, 1.256f, 0.515f, 2.393f, 1.345f, 3.208f)
            curveTo(4.94f, 9.803f, 5f, 9.902f, 5.025f, 9.995f)
            lineTo(5.3f, 11f)
            horizontalLineToRelative(5.4f)
            lineToRelative(0.274f, -1.005f)
            curveTo(11f, 9.902f, 11.06f, 9.803f, 11.155f, 9.707f)
            curveTo(11.985f, 8.893f, 12.5f, 7.756f, 12.5f, 6.5f)
            curveTo(12.5f, 4.015f, 10.485f, 2f, 8f, 2f)
            close()
            moveToRelative(2.427f, 10f)
            horizontalLineTo(5.573f)
            lineToRelative(0.244f, 0.895f)
            curveTo(5.995f, 13.547f, 6.587f, 14f, 7.264f, 14f)
            horizontalLineToRelative(1.472f)
            curveToRelative(0.677f, 0f, 1.27f, -0.453f, 1.447f, -1.105f)
            lineTo(10.427f, 12f)
            close()
        }
    }.build()
}
