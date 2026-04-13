package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Document32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Document32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(8f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            close()
            moveToRelative(19.927f, 7f)
            horizontalLineTo(19f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(3.073f)
            curveToRelative(0.33f, 0.092f, 0.633f, 0.267f, 0.879f, 0.513f)
            lineToRelative(7.535f, 7.535f)
            curveToRelative(0.246f, 0.246f, 0.421f, 0.55f, 0.513f, 0.879f)
            close()
            moveTo(8f, 2f)
            curveTo(6.343f, 2f, 5f, 3.343f, 5f, 5f)
            verticalLineToRelative(22f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(16f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(12.536f)
            curveToRelative(0f, -0.796f, -0.316f, -1.56f, -0.879f, -2.122f)
            lineTo(18.586f, 2.88f)
            curveTo(18.023f, 2.316f, 17.26f, 2f, 16.465f, 2f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}
