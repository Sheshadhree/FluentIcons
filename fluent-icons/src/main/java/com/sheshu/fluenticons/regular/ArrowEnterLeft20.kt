package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowEnterLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowEnterLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.76f, 12f)
            lineToRelative(3.333f, 3.136f)
            curveToRelative(0.2f, 0.19f, 0.21f, 0.506f, 0.021f, 0.707f)
            curveToRelative(-0.19f, 0.2f, -0.506f, 0.21f, -0.707f, 0.021f)
            lineToRelative(-4.25f, -4f)
            curveTo(2.057f, 11.77f, 2f, 11.638f, 2f, 11.5f)
            curveToRelative(0f, -0.138f, 0.057f, -0.27f, 0.157f, -0.364f)
            lineToRelative(4.25f, -4f)
            curveToRelative(0.201f, -0.19f, 0.518f, -0.18f, 0.707f, 0.021f)
            curveToRelative(0.19f, 0.202f, 0.18f, 0.518f, -0.021f, 0.707f)
            lineTo(3.76f, 11f)
            horizontalLineTo(15f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4.5f)
            curveTo(17f, 4.224f, 17.224f, 4f, 17.5f, 4f)
            reflectiveCurveTo(18f, 4.224f, 18f, 4.5f)
            verticalLineTo(9f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(3.76f)
            close()
        }
    }.build()
}
