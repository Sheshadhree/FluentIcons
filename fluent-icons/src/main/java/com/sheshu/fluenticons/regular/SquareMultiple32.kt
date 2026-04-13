package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SquareMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SquareMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.208f, 5.5f)
            horizontalLineTo(8.11f)
            curveTo(8.566f, 3.496f, 10.358f, 2f, 12.5f, 2f)
            horizontalLineToRelative(11f)
            curveTo(27.09f, 2f, 30f, 4.91f, 30f, 8.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 2.142f, -1.497f, 3.935f, -3.502f, 4.389f)
            verticalLineToRelative(-2.096f)
            curveTo(27.382f, 21.407f, 28f, 20.526f, 28f, 19.5f)
            verticalLineToRelative(-11f)
            curveTo(28f, 6.015f, 25.985f, 4f, 23.5f, 4f)
            horizontalLineToRelative(-11f)
            curveToRelative(-1.025f, 0f, -1.906f, 0.617f, -2.292f, 1.5f)
            close()
            moveTo(6.5f, 7f)
            curveTo(4.015f, 7f, 2f, 9.015f, 2f, 11.5f)
            verticalLineToRelative(14f)
            curveTo(2f, 27.985f, 4.015f, 30f, 6.5f, 30f)
            horizontalLineToRelative(14f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-14f)
            curveTo(25f, 9.015f, 22.985f, 7f, 20.5f, 7f)
            horizontalLineToRelative(-14f)
            close()
            moveTo(4f, 11.5f)
            curveTo(4f, 10.12f, 5.12f, 9f, 6.5f, 9f)
            horizontalLineToRelative(14f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-14f)
            curveTo(5.12f, 28f, 4f, 26.88f, 4f, 25.5f)
            verticalLineToRelative(-14f)
            close()
        }
    }.build()
}
