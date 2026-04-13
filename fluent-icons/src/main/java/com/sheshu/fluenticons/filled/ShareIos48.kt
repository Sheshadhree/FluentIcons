package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShareIos48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareIos48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.06f, 4.44f)
            curveToRelative(-0.585f, -0.587f, -1.535f, -0.587f, -2.12f, 0f)
            lineToRelative(-11.5f, 11.5f)
            curveToRelative(-0.586f, 0.585f, -0.586f, 1.535f, 0f, 2.12f)
            curveToRelative(0.585f, 0.586f, 1.535f, 0.586f, 2.12f, 0f)
            lineToRelative(8.94f, -8.939f)
            verticalLineTo(30.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(9.121f)
            lineToRelative(8.94f, 8.94f)
            curveToRelative(0.585f, 0.585f, 1.535f, 0.585f, 2.12f, 0f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0f, -2.122f)
            lineToRelative(-11.5f, -11.5f)
            close()
            moveTo(7.5f, 22f)
            curveTo(8.328f, 22f, 9f, 22.672f, 9f, 23.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(23f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-12f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
            horizontalLineToRelative(-23f)
            curveTo(8.91f, 42f, 6f, 39.09f, 6f, 35.5f)
            verticalLineToRelative(-12f)
            curveTo(6f, 22.672f, 6.672f, 22f, 7.5f, 22f)
            close()
        }
    }.build()
}
