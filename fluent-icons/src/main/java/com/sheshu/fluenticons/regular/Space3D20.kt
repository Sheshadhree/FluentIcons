package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Space3D20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Space3D20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            close()
            moveToRelative(13f, 0f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(12f)
            verticalLineTo(6f)
            close()
            moveTo(4f, 11.992f)
            lineTo(5.138f, 10f)
            horizontalLineTo(4f)
            verticalLineToRelative(1.992f)
            close()
            moveTo(4.862f, 12.5f)
            horizontalLineToRelative(2.76f)
            lineTo(8.338f, 10f)
            horizontalLineTo(6.29f)
            lineToRelative(-1.428f, 2.5f)
            close()
            moveTo(4f, 13.5f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(0.623f)
            lineToRelative(0.714f, -2.5f)
            horizontalLineTo(4f)
            close()
            moveToRelative(4.377f, 0f)
            lineTo(7.663f, 16f)
            horizontalLineToRelative(4.674f)
            lineToRelative(-0.714f, -2.5f)
            horizontalLineTo(8.377f)
            close()
            moveToRelative(4.286f, 0f)
            lineToRelative(0.714f, 2.5f)
            horizontalLineTo(14f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(-3.337f)
            close()
            moveToRelative(2.475f, -1f)
            lineTo(13.71f, 10f)
            horizontalLineToRelative(-2.047f)
            lineToRelative(0.714f, 2.5f)
            horizontalLineToRelative(2.761f)
            close()
            moveToRelative(-3.8f, 0f)
            lineTo(10.622f, 10f)
            horizontalLineTo(9.377f)
            lineToRelative(-0.714f, 2.5f)
            horizontalLineToRelative(2.674f)
            close()
            moveTo(16f, 11.992f)
            verticalLineTo(10f)
            horizontalLineToRelative(-1.138f)
            lineTo(16f, 11.992f)
            close()
        }
    }.build()
}
