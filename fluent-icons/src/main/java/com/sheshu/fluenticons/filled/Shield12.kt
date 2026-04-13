package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Shield12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Shield12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.014f, 10.99f)
            curveToRelative(-0.05f, 0f, -0.11f, 0f, -0.16f, -0.03f)
            curveToRelative(-4.439f, -1.47f, -4.378f, -4.84f, -4.348f, -7.29f)
            verticalLineTo(2.99f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            curveToRelative(0.02f, 0f, 2.315f, -0.02f, 3.637f, -1.35f)
            curveToRelative(0.19f, -0.19f, 0.521f, -0.19f, 0.711f, 0f)
            curveToRelative(1.333f, 1.33f, 3.617f, 1.35f, 3.637f, 1.35f)
            curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
            verticalLineToRelative(0.68f)
            curveToRelative(0.041f, 2.45f, 0.101f, 5.81f, -4.337f, 7.3f)
            curveToRelative(-0.05f, 0.02f, -0.1f, 0.03f, -0.16f, 0.03f)
            lineToRelative(0.02f, -0.01f)
            close()
        }
    }.build()
}
