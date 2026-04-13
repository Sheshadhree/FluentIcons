package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.PanelLeftDefault32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.PanelLeftDefault32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8.5f)
            curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
            horizontalLineToRelative(19f)
            curveTo(27.985f, 4f, 30f, 6.015f, 30f, 8.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-19f)
            curveTo(4.015f, 28f, 2f, 25.985f, 2f, 23.5f)
            verticalLineToRelative(-15f)
            close()
            moveTo(25.5f, 27f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-15f)
            curveTo(29f, 6.567f, 27.433f, 5f, 25.5f, 5f)
            horizontalLineTo(12f)
            verticalLineToRelative(22f)
            horizontalLineToRelative(13.5f)
            close()
        }
    }.build()
}
