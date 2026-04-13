package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.MailUnread32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.MailUnread32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(27f, 11f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            close()
            moveTo(6.5f, 5f)
            horizontalLineToRelative(15.375f)
            curveToRelative(-0.125f, 0.32f, -0.22f, 0.654f, -0.284f, 1f)
            horizontalLineTo(6.5f)
            curveTo(4.566f, 6f, 3f, 7.567f, 3f, 9.5f)
            verticalLineToRelative(0.706f)
            lineToRelative(13f, 7.222f)
            lineToRelative(9.332f, -5.185f)
            curveToRelative(0.505f, 0.16f, 1.041f, 0.25f, 1.597f, 0.257f)
            lineToRelative(-10.687f, 5.937f)
            curveToRelative(-0.151f, 0.084f, -0.335f, 0.084f, -0.486f, 0f)
            lineTo(3f, 11.35f)
            verticalLineTo(22.5f)
            curveTo(3f, 24.433f, 4.567f, 26f, 6.5f, 26f)
            horizontalLineToRelative(19f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(12.125f)
            curveToRelative(0.353f, -0.138f, 0.687f, -0.31f, 1f, -0.514f)
            verticalLineTo(22.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-19f)
            curveTo(4.015f, 27f, 2f, 24.985f, 2f, 22.5f)
            verticalLineToRelative(-13f)
            curveTo(2f, 7.015f, 4.015f, 5f, 6.5f, 5f)
            close()
        }
    }.build()
}
