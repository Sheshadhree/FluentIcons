package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Headphones32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Headphones32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 4f)
            curveTo(9.149f, 4f, 4f, 9.149f, 4f, 15.5f)
            verticalLineTo(18f)
            horizontalLineToRelative(7f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 30f, 2f, 27.985f, 2f, 25.5f)
            verticalLineToRelative(-10f)
            curveTo(2f, 8.044f, 8.044f, 2f, 15.5f, 2f)
            reflectiveCurveTo(29f, 8.044f, 29f, 15.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineTo(20f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(19f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(-2.5f)
            curveTo(27f, 9.149f, 21.851f, 4f, 15.5f, 4f)
            close()
            moveTo(27f, 20f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(20f)
            close()
            moveTo(4f, 20f)
            verticalLineToRelative(5.5f)
            curveTo(4f, 26.88f, 5.12f, 28f, 6.5f, 28f)
            horizontalLineTo(10f)
            verticalLineToRelative(-8f)
            horizontalLineTo(4f)
            close()
        }
    }.build()
}
