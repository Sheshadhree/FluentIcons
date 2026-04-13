package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Location24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Location24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.843f, 4.57f)
            curveToRelative(3.4f, -3.401f, 8.913f, -3.401f, 12.314f, 0f)
            curveToRelative(3.4f, 3.4f, 3.4f, 8.912f, 0f, 12.313f)
            lineToRelative(-1.187f, 1.173f)
            curveToRelative(-0.875f, 0.859f, -2.01f, 1.963f, -3.406f, 3.313f)
            curveToRelative(-0.872f, 0.843f, -2.256f, 0.843f, -3.128f, 0f)
            lineToRelative(-3.491f, -3.397f)
            curveToRelative(-0.439f, -0.43f, -0.806f, -0.794f, -1.102f, -1.09f)
            curveToRelative(-3.4f, -3.4f, -3.4f, -8.913f, 0f, -12.313f)
            close()
            moveTo(12f, 8f)
            curveToRelative(-1.656f, 0f, -3f, 1.344f, -3f, 3f)
            curveToRelative(0f, 1.657f, 1.344f, 3f, 3f, 3f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            curveToRelative(0f, -1.656f, -1.343f, -3f, -3f, -3f)
            close()
        }
    }.build()
}
