package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Drop20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Drop20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.646f, 2.147f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            curveToRelative(0.531f, 0.531f, 1.804f, 2.063f, 2.946f, 3.902f)
            curveToRelative(1.13f, 1.82f, 2.2f, 4.05f, 2.2f, 5.951f)
            curveToRelative(0f, 1.844f, -0.528f, 3.352f, -1.51f, 4.404f)
            curveTo(13.007f, 17.459f, 11.616f, 18f, 10f, 18f)
            curveToRelative(-1.615f, 0f, -3.006f, -0.541f, -3.99f, -1.596f)
            curveTo(5.027f, 15.352f, 4.5f, 13.844f, 4.5f, 12f)
            curveToRelative(0f, -1.902f, 1.07f, -4.13f, 2.2f, -5.951f)
            curveToRelative(1.142f, -1.84f, 2.415f, -3.37f, 2.946f, -3.903f)
            close()
        }
    }.build()
}
