package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Mail32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Mail32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 5f)
            horizontalLineToRelative(19f)
            curveTo(27.985f, 5f, 30f, 7.015f, 30f, 9.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-19f)
            curveTo(4.015f, 27f, 2f, 24.985f, 2f, 22.5f)
            verticalLineToRelative(-13f)
            curveTo(2f, 7.015f, 4.015f, 5f, 6.5f, 5f)
            close()
            moveTo(29f, 10.206f)
            verticalLineTo(9.5f)
            curveTo(29f, 7.567f, 27.433f, 6f, 25.5f, 6f)
            horizontalLineToRelative(-19f)
            curveTo(4.567f, 6f, 3f, 7.567f, 3f, 9.5f)
            verticalLineToRelative(0.706f)
            lineToRelative(13f, 7.222f)
            lineToRelative(13f, -7.222f)
            close()
            moveTo(3f, 11.35f)
            verticalLineTo(22.5f)
            curveTo(3f, 24.433f, 4.567f, 26f, 6.5f, 26f)
            horizontalLineToRelative(19f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(11.35f)
            lineToRelative(-12.757f, 7.087f)
            curveToRelative(-0.151f, 0.084f, -0.335f, 0.084f, -0.486f, 0f)
            lineTo(3f, 11.35f)
            close()
        }
    }.build()
}
