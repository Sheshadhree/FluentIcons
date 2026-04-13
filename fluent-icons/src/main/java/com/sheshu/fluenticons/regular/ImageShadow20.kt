package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ImageShadow20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageShadow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 2f)
            curveTo(3.343f, 2f, 2f, 3.343f, 2f, 5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(5f)
            close()
            moveTo(3f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.37f, -0.101f, 0.718f, -0.277f, 1.016f)
            lineToRelative(-3.52f, -3.521f)
            curveToRelative(-0.665f, -0.664f, -1.741f, -0.664f, -2.405f, 0f)
            lineToRelative(-3.521f, 3.521f)
            curveTo(3.1f, 11.718f, 3f, 11.371f, 3f, 11f)
            verticalLineTo(5f)
            close()
            moveToRelative(5.495f, 4.202f)
            lineToRelative(3.521f, 3.521f)
            curveTo(11.718f, 12.9f, 11.371f, 13f, 11f, 13f)
            horizontalLineTo(5f)
            curveToRelative(-0.37f, 0f, -0.718f, -0.101f, -1.016f, -0.277f)
            lineToRelative(3.521f, -3.52f)
            curveToRelative(0.273f, -0.274f, 0.717f, -0.274f, 0.99f, 0f)
            close()
            moveTo(11f, 6f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveTo(9f, 6.552f, 9f, 6f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(-5f, 9f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(3f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
