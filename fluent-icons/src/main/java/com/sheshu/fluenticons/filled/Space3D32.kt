package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Space3D32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Space3D32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(21f)
            horizontalLineToRelative(-0.986f)
            lineToRelative(-4.392f, -5f)
            horizontalLineTo(27f)
            verticalLineTo(7.5f)
            curveTo(27f, 6.12f, 25.88f, 5f, 24.5f, 5f)
            horizontalLineToRelative(-17f)
            curveTo(6.12f, 5f, 5f, 6.12f, 5f, 7.5f)
            verticalLineTo(16f)
            horizontalLineToRelative(3.378f)
            lineToRelative(-4.391f, 5f)
            horizontalLineTo(3f)
            verticalLineTo(7.5f)
            close()
            moveTo(21.484f, 23f)
            horizontalLineTo(29f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-1.146f)
            lineToRelative(-0.4f, -1.299f)
            lineTo(21.484f, 23f)
            close()
            moveToRelative(3.868f, -2f)
            horizontalLineToRelative(-4.494f)
            lineToRelative(-1.564f, -5f)
            horizontalLineToRelative(1.666f)
            lineToRelative(4.392f, 5f)
            close()
            moveToRelative(-12.114f, 0f)
            horizontalLineToRelative(5.524f)
            lineToRelative(-1.564f, -5f)
            horizontalLineToRelative(-2.396f)
            lineToRelative(-1.564f, 5f)
            close()
            moveToRelative(6.15f, 2f)
            horizontalLineToRelative(-6.776f)
            lineToRelative(-1.877f, 6f)
            horizontalLineToRelative(10.526f)
            lineToRelative(-0.215f, -0.701f)
            lineToRelative(-0.002f, -0.005f)
            lineTo(19.388f, 23f)
            close()
            moveToRelative(-6.682f, -7f)
            lineToRelative(-1.564f, 5f)
            horizontalLineTo(6.649f)
            lineToRelative(4.39f, -5f)
            horizontalLineToRelative(1.667f)
            close()
            moveTo(3f, 24.5f)
            verticalLineTo(23f)
            horizontalLineToRelative(7.516f)
            lineTo(8.64f, 29f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            close()
        }
    }.build()
}
