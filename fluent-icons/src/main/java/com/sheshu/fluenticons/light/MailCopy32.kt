package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.MailCopy32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.MailCopy32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 5f)
            curveTo(7.015f, 5f, 5f, 7.015f, 5f, 9.5f)
            verticalLineToRelative(11f)
            curveTo(5f, 22.985f, 7.015f, 25f, 9.5f, 25f)
            horizontalLineToRelative(16f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-11f)
            curveTo(30f, 7.015f, 27.985f, 5f, 25.5f, 5f)
            horizontalLineToRelative(-16f)
            close()
            moveTo(6f, 9.5f)
            curveTo(6f, 7.567f, 7.567f, 6f, 9.5f, 6f)
            horizontalLineToRelative(16f)
            curveTo(27.433f, 6f, 29f, 7.567f, 29f, 9.5f)
            verticalLineToRelative(0.202f)
            lineToRelative(-11.5f, 6.23f)
            lineTo(6f, 9.701f)
            verticalLineTo(9.5f)
            close()
            moveToRelative(0f, 1.34f)
            lineToRelative(11.261f, 6.1f)
            curveToRelative(0.149f, 0.08f, 0.328f, 0.08f, 0.477f, 0f)
            lineTo(29f, 10.84f)
            verticalLineToRelative(9.66f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-16f)
            curveTo(7.567f, 24f, 6f, 22.433f, 6f, 20.5f)
            verticalLineToRelative(-9.66f)
            close()
            moveTo(2f, 12.5f)
            curveToRelative(0f, -1.072f, 0.375f, -2.056f, 1f, -2.829f)
            verticalLineToRelative(10.83f)
            curveTo(3f, 24.09f, 5.91f, 27f, 9.5f, 27f)
            horizontalLineToRelative(15.829f)
            curveToRelative(-0.773f, 0.624f, -1.757f, 1f, -2.829f, 1f)
            horizontalLineToRelative(-13f)
            curveTo(5.358f, 28f, 2f, 24.641f, 2f, 20.5f)
            verticalLineToRelative(-8f)
            close()
        }
    }.build()
}
