package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.RectangleLandscape32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RectangleLandscape32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8.5f)
            curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
            horizontalLineToRelative(19f)
            curveTo(27.985f, 4f, 30f, 6.015f, 30f, 8.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-19f)
            curveTo(4.015f, 28f, 2f, 25.985f, 2f, 23.5f)
            verticalLineToRelative(-15f)
            close()
            moveTo(6.5f, 6f)
            curveTo(5.12f, 6f, 4f, 7.12f, 4f, 8.5f)
            verticalLineToRelative(15f)
            curveTo(4f, 24.88f, 5.12f, 26f, 6.5f, 26f)
            horizontalLineToRelative(19f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-15f)
            curveTo(28f, 7.12f, 26.88f, 6f, 25.5f, 6f)
            horizontalLineToRelative(-19f)
            close()
        }
    }.build()
}
