package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.City16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.City16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.501f, 1.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveToRelative(-0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineTo(2f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 2f, 5f, 2.672f, 5f, 3.5f)
            verticalLineToRelative(0.504f)
            curveToRelative(1.105f, 0f, 2f, 0.896f, 2f, 2f)
            verticalLineTo(14f)
            horizontalLineToRelative(2f)
            verticalLineTo(7.504f)
            curveToRelative(0f, -1.21f, 0.859f, -2.218f, 2f, -2.45f)
            verticalLineTo(3.5f)
            curveTo(11f, 2.672f, 10.328f, 2f, 9.5f, 2f)
            horizontalLineTo(8.501f)
            verticalLineTo(1.5f)
            close()
            moveTo(12.5f, 14f)
            horizontalLineTo(10f)
            verticalLineTo(7.504f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1f)
            verticalLineTo(6f)
            curveTo(13.33f, 6f, 14f, 6.672f, 14f, 7.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(4.843f, 5.135f)
            curveToRelative(0.5f, -0.324f, 1.158f, 0.034f, 1.158f, 0.63f)
            lineTo(6f, 13.5f)
            curveTo(6f, 13.776f, 5.776f, 14f, 5.5f, 14f)
            horizontalLineToRelative(-2f)
            curveTo(2.672f, 14f, 2f, 13.328f, 2f, 12.5f)
            verticalLineTo(7.793f)
            curveToRelative(0f, -0.508f, 0.257f, -0.982f, 0.684f, -1.258f)
            lineToRelative(2.16f, -1.4f)
            close()
        }
    }.build()
}
