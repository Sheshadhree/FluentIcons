package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Important24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Important24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2.002f)
            curveToRelative(-2.14f, 0f, -3.875f, 1.735f, -3.875f, 3.875f)
            curveToRelative(0f, 2.92f, 1.207f, 6.552f, 1.813f, 8.199f)
            curveToRelative(0.323f, 0.878f, 1.159f, 1.423f, 2.064f, 1.423f)
            curveToRelative(0.904f, 0f, 1.739f, -0.542f, 2.063f, -1.418f)
            curveToRelative(0.606f, -1.64f, 1.81f, -5.254f, 1.81f, -8.204f)
            curveToRelative(0f, -2.14f, -1.734f, -3.875f, -3.875f, -3.875f)
            close()
            moveToRelative(0.001f, 14.999f)
            curveToRelative(-1.381f, 0f, -2.501f, 1.12f, -2.501f, 2.501f)
            curveToRelative(0f, 1.381f, 1.12f, 2.501f, 2.501f, 2.501f)
            curveToRelative(1.382f, 0f, 2.501f, -1.12f, 2.501f, -2.5f)
            curveToRelative(0f, -1.382f, -1.12f, -2.502f, -2.5f, -2.502f)
            close()
        }
    }.build()
}
