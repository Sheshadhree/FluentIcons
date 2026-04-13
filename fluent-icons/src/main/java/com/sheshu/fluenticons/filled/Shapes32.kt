package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Shapes32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Shapes32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 12f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            curveToRelative(4.46f, 0f, 8.161f, 3.243f, 8.876f, 7.5f)
            horizontalLineTo(16.5f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            verticalLineToRelative(4.376f)
            curveTo(6.243f, 20.16f, 3f, 16.459f, 3f, 12f)
            close()
            moveToRelative(9f, 4.5f)
            curveToRelative(0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
            horizontalLineToRelative(8f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-8f)
            curveToRelative(-2.485f, 0f, -4.5f, -2.015f, -4.5f, -4.5f)
            verticalLineToRelative(-8f)
            close()
        }
    }.build()
}
