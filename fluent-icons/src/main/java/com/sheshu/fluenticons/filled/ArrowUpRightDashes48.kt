package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUpRightDashes48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUpRightDashes48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 6f)
            curveTo(21.672f, 6f, 21f, 6.672f, 21f, 7.5f)
            reflectiveCurveTo(21.672f, 9f, 22.5f, 9f)
            horizontalLineToRelative(14.379f)
            lineToRelative(-6.44f, 6.44f)
            curveToRelative(-0.585f, 0.585f, -0.585f, 1.535f, 0f, 2.12f)
            curveToRelative(0.586f, 0.586f, 1.536f, 0.586f, 2.122f, 0f)
            lineTo(39f, 11.122f)
            verticalLineTo(25.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-18f)
            curveTo(42f, 6.672f, 41.328f, 6f, 40.5f, 6f)
            horizontalLineToRelative(-18f)
            close()
            moveToRelative(-5.94f, 27.56f)
            curveToRelative(0.586f, -0.585f, 0.586f, -1.535f, 0f, -2.12f)
            curveToRelative(-0.585f, -0.586f, -1.535f, -0.586f, -2.12f, 0f)
            lineToRelative(-8f, 8f)
            curveToRelative(-0.587f, 0.585f, -0.587f, 1.535f, 0f, 2.12f)
            curveToRelative(0.585f, 0.586f, 1.535f, 0.586f, 2.12f, 0f)
            lineToRelative(8f, -8f)
            close()
            moveToRelative(12f, -14.12f)
            curveToRelative(0.586f, 0.585f, 0.586f, 1.535f, 0f, 2.12f)
            lineToRelative(-8f, 8f)
            curveToRelative(-0.585f, 0.586f, -1.535f, 0.586f, -2.12f, 0f)
            curveToRelative(-0.586f, -0.585f, -0.586f, -1.535f, 0f, -2.12f)
            lineToRelative(8f, -8f)
            curveToRelative(0.585f, -0.586f, 1.535f, -0.586f, 2.12f, 0f)
            close()
        }
    }.build()
}
