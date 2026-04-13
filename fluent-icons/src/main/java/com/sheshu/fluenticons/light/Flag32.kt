package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Flag32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Flag32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4.5f)
            curveTo(5f, 3.672f, 5.672f, 3f, 6.5f, 3f)
            horizontalLineToRelative(22f)
            curveToRelative(0.19f, 0f, 0.364f, 0.108f, 0.448f, 0.279f)
            curveToRelative(0.084f, 0.17f, 0.065f, 0.374f, -0.05f, 0.525f)
            lineTo(22.628f, 12f)
            lineToRelative(6.268f, 8.196f)
            curveToRelative(0.116f, 0.151f, 0.136f, 0.355f, 0.051f, 0.525f)
            curveTo(28.864f, 20.892f, 28.69f, 21f, 28.5f, 21f)
            horizontalLineTo(6f)
            verticalLineToRelative(7.5f)
            curveTo(6f, 28.776f, 5.776f, 29f, 5.5f, 29f)
            reflectiveCurveTo(5f, 28.776f, 5f, 28.5f)
            verticalLineToRelative(-24f)
            close()
            moveTo(6f, 20f)
            horizontalLineToRelative(21.488f)
            lineToRelative(-5.885f, -7.696f)
            curveToRelative(-0.137f, -0.18f, -0.137f, -0.428f, 0f, -0.608f)
            lineTo(27.488f, 4f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 4f, 6f, 4.224f, 6f, 4.5f)
            verticalLineTo(20f)
            close()
        }
    }.build()
}
