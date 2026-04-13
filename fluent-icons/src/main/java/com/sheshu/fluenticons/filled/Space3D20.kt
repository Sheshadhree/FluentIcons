package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Space3D20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Space3D20",
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
            verticalLineToRelative(6.5f)
            horizontalLineToRelative(-0.71f)
            lineTo(14.862f, 10f)
            horizontalLineTo(16f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(1.138f)
            lineTo(3.71f, 12.5f)
            horizontalLineTo(3f)
            verticalLineTo(6f)
            close()
            moveToRelative(0f, 8f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(4.337f)
            lineTo(6.52f, 16.36f)
            lineTo(6.328f, 17f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            close()
            moveToRelative(4.48f, 2.637f)
            lineTo(8.378f, 13.5f)
            horizontalLineToRelative(3.246f)
            lineToRelative(0.895f, 3.134f)
            lineToRelative(0.1f, 0.366f)
            horizontalLineTo(7.372f)
            lineToRelative(0.107f, -0.356f)
            lineToRelative(0.002f, -0.007f)
            close()
            moveTo(8.664f, 12.5f)
            horizontalLineToRelative(2.674f)
            lineTo(10.623f, 10f)
            horizontalLineTo(9.377f)
            lineToRelative(-0.714f, 2.5f)
            close()
            moveToRelative(4.818f, 3.863f)
            lineTo(12.663f, 13.5f)
            horizontalLineTo(17f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineToRelative(-0.345f)
            lineToRelative(-0.173f, -0.632f)
            lineToRelative(-0.001f, -0.005f)
            close()
            moveTo(12.377f, 12.5f)
            horizontalLineToRelative(2.761f)
            lineTo(13.71f, 10f)
            horizontalLineToRelative(-2.047f)
            lineToRelative(0.714f, 2.5f)
            close()
            moveToRelative(-7.515f, 0f)
            horizontalLineToRelative(2.76f)
            lineTo(8.338f, 10f)
            horizontalLineTo(6.29f)
            lineToRelative(-1.428f, 2.5f)
            close()
        }
    }.build()
}
