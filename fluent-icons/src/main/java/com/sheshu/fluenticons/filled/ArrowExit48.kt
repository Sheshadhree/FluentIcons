package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowExit48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowExit48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 6f)
            curveTo(8.91f, 6f, 6f, 8.91f, 6f, 12.5f)
            verticalLineToRelative(23f)
            curveToRelative(0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
            horizontalLineToRelative(18f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(31.328f, 39f, 30.5f, 39f)
            horizontalLineToRelative(-18f)
            curveTo(10.567f, 39f, 9f, 37.433f, 9f, 35.5f)
            verticalLineToRelative(-23f)
            curveTo(9f, 10.567f, 10.567f, 9f, 12.5f, 9f)
            horizontalLineToRelative(18f)
            curveTo(31.328f, 9f, 32f, 8.328f, 32f, 7.5f)
            reflectiveCurveTo(31.328f, 6f, 30.5f, 6f)
            horizontalLineToRelative(-18f)
            close()
            moveToRelative(22.56f, 8.44f)
            curveToRelative(-0.585f, -0.586f, -1.535f, -0.586f, -2.12f, 0f)
            curveToRelative(-0.586f, 0.585f, -0.586f, 1.535f, 0f, 2.12f)
            lineToRelative(5.939f, 5.94f)
            horizontalLineTo(17.5f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21.379f)
            lineToRelative(-5.94f, 5.94f)
            curveToRelative(-0.585f, 0.585f, -0.585f, 1.535f, 0f, 2.12f)
            curveToRelative(0.586f, 0.586f, 1.536f, 0.586f, 2.122f, 0f)
            lineToRelative(8.5f, -8.5f)
            curveToRelative(0.585f, -0.585f, 0.585f, -1.535f, 0f, -2.12f)
            lineToRelative(-8.5f, -8.5f)
            close()
        }
    }.build()
}
