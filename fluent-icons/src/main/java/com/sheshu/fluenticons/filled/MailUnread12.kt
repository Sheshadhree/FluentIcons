package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailUnread12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailUnread12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 4.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            curveToRelative(-0.372f, 0f, -0.697f, 0.204f, -0.87f, 0.506f)
            lineTo(8.62f, 3.023f)
            curveTo(8.545f, 3.165f, 8.5f, 3.327f, 8.5f, 3.5f)
            curveToRelative(0f, 0.477f, 0.334f, 0.875f, 0.78f, 0.976f)
            curveTo(9.35f, 4.492f, 9.424f, 4.5f, 9.5f, 4.5f)
            close()
            moveTo(3.5f, 3f)
            horizontalLineToRelative(4.063f)
            curveTo(7.522f, 3.16f, 7.5f, 3.327f, 7.5f, 3.5f)
            curveToRelative(0f, 0.587f, 0.253f, 1.115f, 0.656f, 1.481f)
            lineTo(6f, 5.951f)
            lineTo(2.037f, 4.169f)
            curveTo(2.187f, 3.5f, 2.786f, 3f, 3.5f, 3f)
            close()
            moveToRelative(2.705f, 3.956f)
            lineToRelative(3.237f, -1.457f)
            lineTo(9.5f, 5.5f)
            curveToRelative(0.173f, 0f, 0.34f, -0.022f, 0.5f, -0.063f)
            verticalLineTo(7.5f)
            curveTo(10f, 8.328f, 9.328f, 9f, 8.5f, 9f)
            horizontalLineToRelative(-5f)
            curveTo(2.672f, 9f, 2f, 8.328f, 2f, 7.5f)
            verticalLineTo(5.248f)
            lineToRelative(3.794f, 1.708f)
            curveToRelative(0.13f, 0.059f, 0.28f, 0.059f, 0.41f, 0f)
            close()
        }
    }.build()
}
