package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowEnterUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowEnterUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.864f, 2.157f)
            curveTo(8.77f, 2.057f, 8.638f, 2f, 8.5f, 2f)
            curveTo(8.362f, 2f, 8.23f, 2.057f, 8.136f, 2.157f)
            lineToRelative(-4f, 4.25f)
            curveToRelative(-0.19f, 0.201f, -0.18f, 0.518f, 0.021f, 0.707f)
            curveToRelative(0.201f, 0.19f, 0.518f, 0.18f, 0.707f, -0.021f)
            lineTo(8f, 3.76f)
            verticalLineTo(15f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(15.776f, 17f, 15.5f, 17f)
            horizontalLineTo(11f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(3.76f)
            lineToRelative(3.136f, 3.333f)
            curveToRelative(0.19f, 0.2f, 0.506f, 0.21f, 0.707f, 0.021f)
            curveToRelative(0.2f, -0.19f, 0.21f, -0.506f, 0.021f, -0.707f)
            lineToRelative(-4f, -4.25f)
            close()
        }
    }.build()
}
