package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowMaximize48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowMaximize48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(39f, 7.5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineTo(12.621f)
            lineTo(12.621f, 37.5f)
            horizontalLineTo(24.5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(9f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineTo(23.5f)
            curveTo(7.5f, 22.672f, 8.172f, 22f, 9f, 22f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(11.879f)
            lineTo(35.379f, 10.5f)
            horizontalLineTo(23.5f)
            curveTo(22.672f, 10.5f, 22f, 9.828f, 22f, 9f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineTo(39f)
            close()
        }
    }.build()
}
