package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.RectanglePortrait32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RectanglePortrait32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 30f)
            curveTo(6.015f, 30f, 4f, 27.985f, 4f, 25.5f)
            verticalLineToRelative(-19f)
            curveTo(4f, 4.015f, 6.015f, 2f, 8.5f, 2f)
            horizontalLineToRelative(15f)
            curveTo(25.985f, 2f, 28f, 4.015f, 28f, 6.5f)
            verticalLineToRelative(19f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-15f)
            close()
            moveTo(6f, 25.5f)
            curveTo(6f, 26.88f, 7.12f, 28f, 8.5f, 28f)
            horizontalLineToRelative(15f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-19f)
            curveTo(26f, 5.12f, 24.88f, 4f, 23.5f, 4f)
            horizontalLineToRelative(-15f)
            curveTo(7.12f, 4f, 6f, 5.12f, 6f, 6.5f)
            verticalLineToRelative(19f)
            close()
        }
    }.build()
}
