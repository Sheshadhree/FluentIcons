package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DesktopOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DesktopOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.293f, 15f)
            lineToRelative(2.853f, 2.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.707f)
            curveTo(2.053f, 3.05f, 2f, 3.268f, 2f, 3.5f)
            verticalLineToRelative(10f)
            curveTo(2f, 14.328f, 2.672f, 15f, 3.5f, 15f)
            horizontalLineTo(7f)
            verticalLineToRelative(2f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 17f, 5f, 17.224f, 5f, 17.5f)
            reflectiveCurveTo(5.224f, 18f, 5.5f, 18f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 17f, 14.5f, 17f)
            horizontalLineTo(13f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(1.293f)
            close()
            moveTo(18f, 13.5f)
            curveToRelative(0f, 0.643f, -0.405f, 1.192f, -0.974f, 1.405f)
            lineTo(4.121f, 2f)
            horizontalLineTo(16.5f)
            curveTo(17.328f, 2f, 18f, 2.672f, 18f, 3.5f)
            verticalLineToRelative(10f)
            close()
            moveTo(12f, 15f)
            verticalLineToRelative(2f)
            horizontalLineTo(8f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(4f)
            close()
        }
    }.build()
}
