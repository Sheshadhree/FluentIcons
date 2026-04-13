package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Joystick20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Joystick20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            close()
            moveToRelative(0.5f, 4.958f)
            curveTo(11.919f, 7.721f, 13f, 6.487f, 13f, 5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            reflectiveCurveTo(7f, 3.343f, 7f, 5f)
            curveToRelative(0f, 1.487f, 1.081f, 2.72f, 2.5f, 2.958f)
            verticalLineTo(11f)
            horizontalLineToRelative(-2f)
            curveTo(6.672f, 11f, 6f, 11.672f, 6f, 12.5f)
            verticalLineTo(13f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(2.5f)
            curveTo(3f, 17.776f, 3.224f, 18f, 3.5f, 18f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(15f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            verticalLineTo(7.958f)
            close()
            moveTo(7.5f, 12f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(13f)
            horizontalLineTo(7f)
            verticalLineToRelative(-0.5f)
            curveTo(7f, 12.224f, 7.224f, 12f, 7.5f, 12f)
            close()
            moveTo(5f, 14f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(2f)
            horizontalLineTo(4f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
