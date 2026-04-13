package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Premium20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Premium20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3f)
            curveTo(5.324f, 3f, 5.162f, 3.092f, 5.071f, 3.243f)
            lineToRelative(-3f, 5f)
            curveTo(1.961f, 8.425f, 1.98f, 8.657f, 2.116f, 8.82f)
            lineToRelative(7.5f, 9f)
            curveTo(9.71f, 17.934f, 9.852f, 18f, 10f, 18f)
            curveToRelative(0.148f, 0f, 0.29f, -0.066f, 0.384f, -0.18f)
            lineToRelative(7.5f, -9f)
            curveToRelative(0.136f, -0.163f, 0.154f, -0.395f, 0.045f, -0.577f)
            lineToRelative(-3f, -5f)
            curveTo(14.839f, 3.093f, 14.676f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(3.383f, 8f)
            lineToRelative(2.4f, -4f)
            horizontalLineToRelative(1.978f)
            lineToRelative(-1.6f, 4f)
            horizontalLineTo(3.384f)
            close()
            moveToRelative(2.775f, 1f)
            lineToRelative(2.267f, 5.829f)
            lineTo(3.567f, 9f)
            horizontalLineToRelative(2.591f)
            close()
            moveTo(10f, 16.12f)
            lineTo(7.231f, 9f)
            horizontalLineToRelative(5.538f)
            lineTo(10f, 16.12f)
            close()
            moveTo(7.239f, 8f)
            lineToRelative(1.6f, -4f)
            horizontalLineToRelative(2.322f)
            lineToRelative(1.6f, 4f)
            horizontalLineTo(7.24f)
            close()
            moveToRelative(6.6f, 0f)
            lineToRelative(-1.6f, -4f)
            horizontalLineToRelative(1.978f)
            lineToRelative(2.4f, 4f)
            horizontalLineToRelative(-2.779f)
            close()
            moveToRelative(0.003f, 1f)
            horizontalLineToRelative(2.59f)
            lineToRelative(-4.857f, 5.829f)
            lineTo(13.842f, 9f)
            close()
        }
    }.build()
}
