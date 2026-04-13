package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTurnRightUp48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTurnRightUp48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 35f)
            curveTo(6.672f, 35f, 6f, 35.672f, 6f, 36.5f)
            reflectiveCurveTo(6.672f, 38f, 7.5f, 38f)
            horizontalLineToRelative(18f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            verticalLineTo(13.121f)
            lineToRelative(6.44f, 6.44f)
            curveToRelative(0.585f, 0.585f, 1.535f, 0.585f, 2.12f, 0f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0f, -2.122f)
            lineToRelative(-9f, -9f)
            curveToRelative(-0.585f, -0.585f, -1.535f, -0.585f, -2.12f, 0f)
            lineToRelative(-9f, 9f)
            curveToRelative(-0.586f, 0.586f, -0.586f, 1.536f, 0f, 2.122f)
            curveToRelative(0.585f, 0.585f, 1.535f, 0.585f, 2.12f, 0f)
            lineTo(30f, 13.12f)
            verticalLineTo(30.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-18f)
            close()
        }
    }.build()
}
