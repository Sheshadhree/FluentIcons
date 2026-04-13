package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShapeSubtract16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShapeSubtract16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 2.268f)
            curveTo(2.402f, 2.613f, 2f, 3.26f, 2f, 4f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.046f, 0.002f, 0.093f, 0.005f, 0.138f)
            lineTo(2.01f, 9.204f)
            curveToRelative(0.037f, 0.361f, 0.17f, 0.693f, 0.372f, 0.972f)
            curveToRelative(0.247f, 0.339f, 0.598f, 0.598f, 1.006f, 0.729f)
            lineToRelative(0.017f, 0.005f)
            curveTo(3.593f, 10.97f, 3.793f, 11f, 4f, 11f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(5f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-1f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            curveTo(3.636f, 2f, 3.294f, 2.097f, 3f, 2.268f)
            close()
            moveTo(6f, 7f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(7f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(7f)
            close()
        }
    }.build()
}
