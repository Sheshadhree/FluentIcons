package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowReset48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowReset48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.81f, 6.81f)
            curveToRelative(0.586f, -0.585f, 0.586f, -1.535f, 0f, -2.12f)
            curveToRelative(-0.585f, -0.587f, -1.535f, -0.587f, -2.12f, 0f)
            lineToRelative(-7.5f, 7.5f)
            curveToRelative(-0.587f, 0.585f, -0.587f, 1.535f, 0f, 2.12f)
            lineToRelative(7.5f, 7.5f)
            curveToRelative(0.585f, 0.586f, 1.535f, 0.586f, 2.12f, 0f)
            curveToRelative(0.586f, -0.585f, 0.586f, -1.535f, 0f, -2.12f)
            lineToRelative(-4.939f, -4.94f)
            horizontalLineTo(26.5f)
            curveToRelative(7.042f, 0f, 12.75f, 5.708f, 12.75f, 12.75f)
            reflectiveCurveTo(33.542f, 40.25f, 26.5f, 40.25f)
            reflectiveCurveTo(13.75f, 34.542f, 13.75f, 27.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            curveToRelative(0f, 8.699f, 7.052f, 15.75f, 15.75f, 15.75f)
            curveToRelative(8.699f, 0f, 15.75f, -7.051f, 15.75f, -15.75f)
            curveToRelative(0f, -8.698f, -7.051f, -15.75f, -15.75f, -15.75f)
            horizontalLineTo(8.871f)
            lineToRelative(4.94f, -4.94f)
            close()
        }
    }.build()
}
