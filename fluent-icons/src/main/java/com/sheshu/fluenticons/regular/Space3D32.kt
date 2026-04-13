package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Space3D32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Space3D32",
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
            verticalLineToRelative(17f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-17f)
            close()
            moveTo(7.5f, 5f)
            curveTo(6.12f, 5f, 5f, 6.12f, 5f, 7.5f)
            verticalLineTo(15f)
            horizontalLineToRelative(22f)
            verticalLineTo(7.5f)
            curveTo(27f, 6.12f, 25.88f, 5f, 24.5f, 5f)
            horizontalLineToRelative(-17f)
            close()
            moveTo(5f, 19.846f)
            lineTo(7.5f, 17f)
            horizontalLineTo(5f)
            verticalLineToRelative(2.846f)
            close()
            moveTo(6.648f, 21f)
            horizontalLineToRelative(4.494f)
            lineToRelative(1.251f, -4f)
            horizontalLineToRelative(-2.232f)
            lineToRelative(-3.513f, 4f)
            close()
            moveTo(5f, 23f)
            verticalLineToRelative(1.5f)
            curveTo(5f, 25.88f, 6.12f, 27f, 7.5f, 27f)
            horizontalLineToRelative(1.765f)
            lineToRelative(1.251f, -4f)
            horizontalLineTo(5f)
            close()
            moveToRelative(7.612f, 0f)
            lineToRelative(-1.251f, 4f)
            horizontalLineToRelative(9.278f)
            lineToRelative(-1.25f, -4f)
            horizontalLineToRelative(-6.777f)
            close()
            moveToRelative(8.872f, 0f)
            lineToRelative(1.251f, 4f)
            horizontalLineTo(24.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(23f)
            horizontalLineToRelative(-5.516f)
            close()
            moveToRelative(3.868f, -2f)
            lineToRelative(-3.513f, -4f)
            horizontalLineToRelative(-2.232f)
            lineToRelative(1.251f, 4f)
            horizontalLineToRelative(4.494f)
            close()
            moveToRelative(-6.59f, 0f)
            lineToRelative(-1.25f, -4f)
            horizontalLineToRelative(-3.023f)
            lineToRelative(-1.252f, 4f)
            horizontalLineToRelative(5.525f)
            close()
            moveTo(27f, 19.846f)
            verticalLineTo(17f)
            horizontalLineToRelative(-2.5f)
            lineToRelative(2.5f, 2.846f)
            close()
        }
    }.build()
}
