package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Calendar32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Calendar32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 4f)
            curveTo(6.239f, 4f, 4f, 6.239f, 4f, 9f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(24f)
            verticalLineTo(9f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            horizontalLineTo(9f)
            close()
            moveTo(4f, 23f)
            verticalLineTo(12f)
            horizontalLineToRelative(24f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            horizontalLineTo(9f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            close()
            moveToRelative(6.5f, -5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(11.328f, 15f, 10.5f, 15f)
            reflectiveCurveTo(9f, 15.672f, 9f, 16.5f)
            reflectiveCurveTo(9.672f, 18f, 10.5f, 18f)
            close()
            moveToRelative(1.5f, 3.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveTo(9f, 20.672f, 9f, 21.5f)
            reflectiveCurveTo(9.672f, 23f, 10.5f, 23f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            close()
            moveToRelative(4f, 1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(16.828f, 20f, 16f, 20f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveTo(15.172f, 23f, 16f, 23f)
            close()
            moveToRelative(1.5f, -6.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveTo(15.172f, 18f, 16f, 18f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            close()
            moveToRelative(4f, 1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(22.328f, 15f, 21.5f, 15f)
            reflectiveCurveTo(20f, 15.672f, 20f, 16.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
