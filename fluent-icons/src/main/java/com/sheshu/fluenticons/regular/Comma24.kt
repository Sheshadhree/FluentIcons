package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Comma24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Comma24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.62f, 12.023f)
            curveTo(13.918f, 12.632f, 13.002f, 13f, 12f, 13f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            curveToRelative(2.053f, 0f, 3.745f, 1.547f, 3.974f, 3.54f)
            curveToRelative(0.356f, 1.81f, 0.352f, 3.966f, -0.464f, 5.9f)
            curveToRelative(-0.862f, 2.04f, -2.601f, 3.758f, -5.57f, 4.536f)
            curveToRelative(-0.4f, 0.105f, -0.81f, -0.135f, -0.915f, -0.536f)
            curveToRelative(-0.106f, -0.4f, 0.134f, -0.81f, 0.535f, -0.916f)
            curveToRelative(2.531f, -0.662f, 3.892f, -2.069f, 4.568f, -3.668f)
            curveToRelative(0.246f, -0.584f, 0.405f, -1.203f, 0.492f, -1.833f)
            close()
        }
    }.build()
}
