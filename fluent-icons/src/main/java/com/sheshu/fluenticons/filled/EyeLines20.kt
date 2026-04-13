package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EyeLines20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EyeLines20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 6f)
            horizontalLineTo(3.922f)
            curveTo(4.19f, 5.659f, 4.494f, 5.32f, 4.84f, 5f)
            horizontalLineTo(10f)
            verticalLineTo(4f)
            horizontalLineTo(6.182f)
            curveTo(7.207f, 3.4f, 8.469f, 3f, 10f, 3f)
            curveToRelative(2.943f, 0f, 4.889f, 1.48f, 6.081f, 3.004f)
            curveToRelative(0.594f, 0.76f, 1.006f, 1.533f, 1.27f, 2.151f)
            curveToRelative(0.132f, 0.31f, 0.228f, 0.584f, 0.293f, 0.802f)
            curveToRelative(0.057f, 0.195f, 0.106f, 0.4f, 0.106f, 0.543f)
            curveToRelative(0f, 0.143f, -0.049f, 0.348f, -0.106f, 0.543f)
            curveToRelative(-0.065f, 0.218f, -0.161f, 0.492f, -0.293f, 0.802f)
            curveToRelative(-0.264f, 0.618f, -0.676f, 1.391f, -1.27f, 2.15f)
            curveTo(14.89f, 14.52f, 12.943f, 16f, 10f, 16f)
            curveToRelative(-1.531f, 0f, -2.793f, -0.4f, -3.818f, -1f)
            horizontalLineTo(10f)
            verticalLineToRelative(-1f)
            horizontalLineTo(4.84f)
            curveToRelative(-0.346f, -0.32f, -0.65f, -0.659f, -0.918f, -1f)
            horizontalLineTo(10f)
            verticalLineToRelative(-0.5f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            verticalLineTo(6f)
            close()
            moveTo(8.341f, 7f)
            horizontalLineTo(3.238f)
            curveToRelative(-0.21f, 0.353f, -0.383f, 0.693f, -0.52f, 1f)
            horizontalLineTo(7.4f)
            curveToRelative(0.232f, -0.401f, 0.555f, -0.744f, 0.94f, -1f)
            close()
            moveToRelative(-1.3f, 2f)
            horizontalLineTo(2.345f)
            curveTo(2.292f, 9.182f, 2.25f, 9.367f, 2.25f, 9.5f)
            reflectiveCurveTo(2.292f, 9.818f, 2.344f, 10f)
            horizontalLineTo(7.04f)
            curveTo(7.014f, 9.837f, 7f, 9.67f, 7f, 9.5f)
            curveTo(7f, 9.33f, 7.014f, 9.163f, 7.042f, 9f)
            close()
            moveToRelative(0.36f, 2f)
            horizontalLineTo(2.718f)
            curveToRelative(0.137f, 0.307f, 0.31f, 0.647f, 0.52f, 1f)
            horizontalLineTo(8.34f)
            curveToRelative(-0.385f, -0.256f, -0.707f, -0.599f, -0.94f, -1f)
            close()
        }
    }.build()
}
