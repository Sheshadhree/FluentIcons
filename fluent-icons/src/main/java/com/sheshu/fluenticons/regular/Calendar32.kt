package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Calendar32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Calendar32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 18f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(11.328f, 15f, 10.5f, 15f)
            reflectiveCurveTo(9f, 15.672f, 9f, 16.5f)
            reflectiveCurveTo(9.672f, 18f, 10.5f, 18f)
            close()
            moveToRelative(1.5f, 3.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(9f, 22.328f, 9f, 21.5f)
            reflectiveCurveTo(9.672f, 20f, 10.5f, 20f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            close()
            moveToRelative(4f, 1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(16.828f, 20f, 16f, 20f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveTo(15.172f, 23f, 16f, 23f)
            close()
            moveToRelative(1.5f, -6.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveTo(15.172f, 15f, 16f, 15f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            close()
            moveToRelative(4f, 1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(22.328f, 15f, 21.5f, 15f)
            reflectiveCurveTo(20f, 15.672f, 20f, 16.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(4f, 9f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            horizontalLineToRelative(14f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            horizontalLineTo(9f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            verticalLineTo(9f)
            close()
            moveToRelative(5f, -3f)
            curveTo(7.343f, 6f, 6f, 7.343f, 6f, 9f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(20f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(9f)
            close()
            moveTo(6f, 23f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(14f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(12f)
            horizontalLineTo(6f)
            verticalLineToRelative(11f)
            close()
        }
    }.build()
}
