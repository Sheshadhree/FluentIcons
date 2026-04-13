package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTurnRight48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTurnRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(30.56f, 26.56f)
            curveToRelative(-0.585f, 0.586f, -1.535f, 0.586f, -2.12f, 0f)
            curveToRelative(-0.586f, -0.585f, -0.586f, -1.535f, 0f, -2.12f)
            lineTo(34.877f, 18f)
            horizontalLineTo(17.5f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 0.83f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(10f, 41.33f, 10f, 40.5f)
            verticalLineToRelative(-18f)
            curveToRelative(0f, -4.141f, 3.358f, -7.5f, 7.5f, -7.5f)
            horizontalLineToRelative(17.38f)
            lineToRelative(-6.44f, -6.44f)
            curveToRelative(-0.586f, -0.585f, -0.586f, -1.535f, 0f, -2.12f)
            curveToRelative(0.585f, -0.587f, 1.535f, -0.587f, 2.12f, 0f)
            lineToRelative(9f, 9f)
            curveToRelative(0.586f, 0.585f, 0.586f, 1.535f, 0f, 2.12f)
            lineToRelative(-9f, 9f)
            close()
        }
    }.build()
}
