package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CursorHover16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CursorHover16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.806f, -0.477f, 1.501f, -1.164f, 1.818f)
            curveToRelative(-0.07f, -0.138f, -0.162f, -0.266f, -0.275f, -0.379f)
            lineToRelative(-0.446f, -0.446f)
            curveTo(13.613f, 10.938f, 14f, 10.513f, 14f, 10f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(3f)
            curveTo(2.448f, 4f, 2f, 4.448f, 2f, 5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1f)
            horizontalLineTo(3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            close()
            moveToRelative(7.854f, 3.146f)
            curveTo(8.71f, 8.003f, 8.495f, 7.962f, 8.309f, 8.038f)
            curveTo(8.122f, 8.115f, 8f, 8.298f, 8f, 8.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.215f, 0.138f, 0.406f, 0.342f, 0.474f)
            curveTo(8.546f, 15.042f, 8.77f, 14.972f, 8.9f, 14.8f)
            lineToRelative(1.35f, -1.8f)
            horizontalLineToRelative(2.25f)
            curveToRelative(0.202f, 0f, 0.384f, -0.122f, 0.462f, -0.309f)
            curveToRelative(0.077f, -0.187f, 0.035f, -0.402f, -0.108f, -0.545f)
            lineToRelative(-4f, -4f)
            close()
            moveTo(9f, 13f)
            verticalLineTo(9.707f)
            lineTo(11.293f, 12f)
            horizontalLineTo(10f)
            curveToRelative(-0.157f, 0f, -0.306f, 0.074f, -0.4f, 0.2f)
            lineTo(9f, 13f)
            close()
        }
    }.build()
}
