package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Comment32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Comment32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7.5f)
            curveTo(2f, 5.015f, 4.015f, 3f, 6.5f, 3f)
            horizontalLineToRelative(19f)
            curveTo(27.985f, 3f, 30f, 5.015f, 30f, 7.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-7.617f)
            lineToRelative(-6.623f, 5.615f)
            curveTo(9.974f, 30.705f, 8f, 29.792f, 8f, 28.105f)
            verticalLineTo(24f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 24f, 2f, 21.985f, 2f, 19.5f)
            verticalLineToRelative(-12f)
            close()
            moveTo(6.5f, 4f)
            curveTo(4.567f, 4f, 3f, 5.567f, 3f, 7.5f)
            verticalLineToRelative(12f)
            curveTo(3f, 21.433f, 4.567f, 23f, 6.5f, 23f)
            horizontalLineToRelative(2f)
            curveTo(8.776f, 23f, 9f, 23.224f, 9f, 23.5f)
            verticalLineToRelative(4.605f)
            curveToRelative(0f, 0.835f, 0.977f, 1.287f, 1.614f, 0.747f)
            lineToRelative(6.763f, -5.733f)
            curveTo(17.467f, 23.042f, 17.582f, 23f, 17.7f, 23f)
            horizontalLineToRelative(7.8f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-12f)
            curveTo(29f, 5.567f, 27.433f, 4f, 25.5f, 4f)
            horizontalLineToRelative(-19f)
            close()
        }
    }.build()
}
