package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDownRight48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 42f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(14.379f)
            lineTo(6.439f, 8.56f)
            curveToRelative(-0.585f, -0.585f, -0.585f, -1.535f, 0f, -2.12f)
            curveToRelative(0.586f, -0.587f, 1.536f, -0.587f, 2.122f, 0f)
            lineTo(39f, 36.878f)
            verticalLineTo(22.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-18f)
            close()
        }
    }.build()
}
