package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDownload48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownload48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.5f, 6.5f)
            curveTo(25.5f, 5.672f, 24.828f, 5f, 24f, 5f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(25.379f)
            lineToRelative(-7.94f, -7.94f)
            curveToRelative(-0.585f, -0.585f, -1.535f, -0.585f, -2.12f, 0f)
            curveToRelative(-0.586f, 0.586f, -0.586f, 1.536f, 0f, 2.122f)
            lineToRelative(10.5f, 10.5f)
            curveToRelative(0.585f, 0.585f, 1.535f, 0.585f, 2.12f, 0f)
            lineToRelative(10.5f, -10.5f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0f, -2.122f)
            curveToRelative(-0.585f, -0.585f, -1.535f, -0.585f, -2.12f, 0f)
            lineToRelative(-7.94f, 7.94f)
            verticalLineTo(6.5f)
            close()
            moveTo(10.5f, 40f)
            curveTo(9.672f, 40f, 9f, 40.672f, 9f, 41.5f)
            reflectiveCurveTo(9.672f, 43f, 10.5f, 43f)
            horizontalLineToRelative(27f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(38.328f, 40f, 37.5f, 40f)
            horizontalLineToRelative(-27f)
            close()
        }
    }.build()
}
