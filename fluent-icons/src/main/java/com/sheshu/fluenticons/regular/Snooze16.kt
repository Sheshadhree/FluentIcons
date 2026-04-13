package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Snooze16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Snooze16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.001f, 8f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.396f, 0f, 0.624f, 0.43f, 0.432f, 0.753f)
            lineTo(6.885f, 8.82f)
            lineTo(5.07f, 11f)
            horizontalLineTo(6.5f)
            curveTo(6.776f, 11f, 7f, 11.224f, 7f, 11.5f)
            curveToRelative(0f, 0.245f, -0.177f, 0.45f, -0.41f, 0.492f)
            lineTo(6.5f, 12f)
            horizontalLineTo(4f)
            curveToRelative(-0.396f, 0f, -0.624f, -0.43f, -0.432f, -0.753f)
            lineToRelative(0.048f, -0.067f)
            lineTo(5.433f, 9f)
            horizontalLineTo(4.001f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            curveToRelative(0f, -0.245f, 0.177f, -0.45f, 0.41f, -0.492f)
            lineTo(4.001f, 8f)
            horizontalLineToRelative(2.5f)
            horizontalLineToRelative(-2.5f)
            close()
            moveToRelative(5f, -5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.376f, 0f, 0.607f, 0.393f, 0.452f, 0.714f)
            lineToRelative(-0.042f, 0.073f)
            lineTo(9.96f, 8f)
            horizontalLineToRelative(2.54f)
            curveTo(12.776f, 8f, 13f, 8.224f, 13f, 8.5f)
            curveToRelative(0f, 0.245f, -0.177f, 0.45f, -0.41f, 0.492f)
            lineTo(12.5f, 9f)
            horizontalLineTo(9f)
            curveTo(8.625f, 9f, 8.394f, 8.607f, 8.549f, 8.286f)
            lineTo(8.59f, 8.213f)
            lineTo(11.541f, 4f)
            horizontalLineTo(9f)
            curveTo(8.724f, 4f, 8.5f, 3.776f, 8.5f, 3.5f)
            curveToRelative(0f, -0.245f, 0.177f, -0.45f, 0.41f, -0.492f)
            lineTo(9.001f, 3f)
            horizontalLineToRelative(3.5f)
            horizontalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
