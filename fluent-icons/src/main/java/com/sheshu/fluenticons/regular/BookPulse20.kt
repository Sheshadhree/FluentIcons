package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BookPulse20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookPulse20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 16f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(15.776f, 18f, 15.5f, 18f)
            horizontalLineTo(6f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            close()
            moveTo(15f, 4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(6f)
            curveTo(5.448f, 3f, 5f, 3.448f, 5f, 4f)
            verticalLineToRelative(11f)
            horizontalLineToRelative(10f)
            verticalLineTo(4f)
            close()
            moveTo(9.455f, 6.293f)
            curveTo(9.375f, 6.118f, 9.202f, 6.003f, 9.01f, 6f)
            curveTo(8.817f, 5.997f, 8.64f, 6.104f, 8.553f, 6.276f)
            lineTo(7.19f, 9f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 9f, 6f, 9.224f, 6f, 9.5f)
            reflectiveCurveTo(6.224f, 10f, 6.5f, 10f)
            horizontalLineToRelative(1f)
            curveToRelative(0.19f, 0f, 0.362f, -0.107f, 0.447f, -0.276f)
            lineTo(8.98f, 7.66f)
            lineToRelative(2.066f, 4.546f)
            curveToRelative(0.077f, 0.17f, 0.241f, 0.282f, 0.427f, 0.292f)
            curveToRelative(0.185f, 0.01f, 0.361f, -0.082f, 0.457f, -0.242f)
            lineTo(13.283f, 10f)
            horizontalLineTo(13.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 9f, 13.5f, 9f)
            horizontalLineTo(13f)
            curveToRelative(-0.176f, 0f, -0.338f, 0.092f, -0.429f, 0.243f)
            lineToRelative(-1.01f, 1.683f)
            lineToRelative(-2.106f, -4.633f)
            close()
        }
    }.build()
}
