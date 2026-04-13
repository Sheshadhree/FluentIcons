package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowForward48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowForward48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(30.44f, 10.56f)
            curveToRelative(-0.586f, -0.585f, -0.586f, -1.535f, 0f, -2.12f)
            curveToRelative(0.585f, -0.586f, 1.535f, -0.586f, 2.12f, 0f)
            lineToRelative(11f, 11f)
            curveToRelative(0.586f, 0.585f, 0.586f, 1.535f, 0f, 2.12f)
            lineToRelative(-11f, 11f)
            curveToRelative(-0.585f, 0.586f, -1.535f, 0.586f, -2.12f, 0f)
            curveToRelative(-0.586f, -0.585f, -0.586f, -1.535f, 0f, -2.12f)
            lineTo(38.878f, 22f)
            horizontalLineTo(23.5f)
            curveTo(14.387f, 22f, 7f, 29.387f, 7f, 38.5f)
            curveTo(7f, 39.328f, 6.328f, 40f, 5.5f, 40f)
            reflectiveCurveTo(4f, 39.328f, 4f, 38.5f)
            curveTo(4f, 27.73f, 12.73f, 19f, 23.5f, 19f)
            horizontalLineToRelative(15.379f)
            lineToRelative(-8.44f, -8.44f)
            close()
        }
    }.build()
}
