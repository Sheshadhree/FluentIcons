package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailClock24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailClock24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 6.5f)
            curveTo(23f, 3.462f, 20.538f, 1f, 17.5f, 1f)
            reflectiveCurveTo(12f, 3.462f, 12f, 6.5f)
            reflectiveCurveToRelative(2.462f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveTo(23f, 9.538f, 23f, 6.5f)
            close()
            moveTo(17.5f, 3f)
            curveTo(17.776f, 3f, 18f, 3.224f, 18f, 3.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(20.276f, 7f, 20f, 7f)
            horizontalLineToRelative(-2.5f)
            curveTo(17.224f, 7f, 17f, 6.776f, 17f, 6.5f)
            verticalLineToRelative(-3f)
            curveTo(17f, 3.224f, 17.224f, 3f, 17.5f, 3f)
            close()
            moveToRelative(4.5f, 8.19f)
            curveTo(20.832f, 12.311f, 19.247f, 13f, 17.5f, 13f)
            curveToRelative(-0.977f, 0f, -1.904f, -0.216f, -2.735f, -0.602f)
            lineToRelative(-2.417f, 1.266f)
            curveToRelative(-0.218f, 0.114f, -0.478f, 0.114f, -0.696f, 0f)
            lineTo(2f, 8.608f)
            verticalLineToRelative(8.142f)
            lineToRelative(0.005f, 0.184f)
            curveTo(2.101f, 18.644f, 3.517f, 20f, 5.25f, 20f)
            horizontalLineToRelative(13.5f)
            lineToRelative(0.184f, -0.005f)
            curveTo(20.644f, 19.899f, 22f, 18.483f, 22f, 16.75f)
            verticalLineToRelative(-5.56f)
            close()
            moveTo(11.498f, 4f)
            horizontalLineTo(5.25f)
            lineTo(5.064f, 4.005f)
            curveToRelative(-1.6f, 0.09f, -2.89f, 1.338f, -3.048f, 2.919f)
            lineTo(12f, 12.154f)
            lineToRelative(1.308f, -0.686f)
            curveTo(11.897f, 10.276f, 11f, 8.492f, 11f, 6.5f)
            curveToRelative(0f, -0.886f, 0.177f, -1.73f, 0.498f, -2.5f)
            close()
        }
    }.build()
}
