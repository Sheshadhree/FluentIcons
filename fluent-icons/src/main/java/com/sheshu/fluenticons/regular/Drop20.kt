package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Drop20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Drop20",
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
            moveTo(7.55f, 6.576f)
            curveTo(6.43f, 8.38f, 5.5f, 10.401f, 5.5f, 12f)
            curveToRelative(0f, 1.656f, 0.472f, 2.898f, 1.24f, 3.721f)
            curveTo(7.506f, 16.541f, 8.616f, 17f, 10f, 17f)
            curveToRelative(1.385f, 0f, 2.494f, -0.459f, 3.26f, -1.279f)
            curveToRelative(0.768f, -0.823f, 1.24f, -2.065f, 1.24f, -3.721f)
            curveToRelative(0f, -1.598f, -0.93f, -3.62f, -2.05f, -5.424f)
            curveToRelative(-0.892f, -1.438f, -1.862f, -2.67f, -2.45f, -3.34f)
            curveToRelative(-0.588f, 0.67f, -1.558f, 1.902f, -2.45f, 3.34f)
            close()
        }
    }.build()
}
