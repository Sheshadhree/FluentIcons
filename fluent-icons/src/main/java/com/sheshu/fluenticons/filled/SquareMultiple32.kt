package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.113f, 5.5f)
            horizontalLineToRelative(2.097f)
            curveTo(10.596f, 4.617f, 11.477f, 4f, 12.502f, 4f)
            horizontalLineToRelative(11f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 1.026f, -0.618f, 1.907f, -1.502f, 2.293f)
            verticalLineToRelative(2.096f)
            curveToRelative(2.005f, -0.454f, 3.502f, -2.247f, 3.502f, -4.389f)
            verticalLineToRelative(-11f)
            curveToRelative(0f, -3.59f, -2.91f, -6.5f, -6.5f, -6.5f)
            horizontalLineToRelative(-11f)
            curveTo(10.36f, 2f, 8.568f, 3.496f, 8.113f, 5.5f)
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
        }
    }.build()
}
