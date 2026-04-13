package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Joystick20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Joystick20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 7.958f)
            curveTo(11.919f, 7.721f, 13f, 6.487f, 13f, 5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            reflectiveCurveTo(7f, 3.343f, 7f, 5f)
            curveToRelative(0f, 1.487f, 1.081f, 2.72f, 2.5f, 2.958f)
            verticalLineTo(11f)
            horizontalLineToRelative(-2f)
            curveTo(6.672f, 11f, 6f, 11.672f, 6f, 12.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            verticalLineTo(7.958f)
            close()
            moveTo(3f, 16f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 18f, 3f, 17.776f, 3f, 17.5f)
            verticalLineTo(16f)
            close()
        }
    }.build()
}
