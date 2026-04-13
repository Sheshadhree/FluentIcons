package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PanelLeft32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.5f, 28f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-15f)
            curveTo(30f, 6.015f, 27.985f, 4f, 25.5f, 4f)
            horizontalLineToRelative(-19f)
            curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
            verticalLineToRelative(15f)
            curveTo(2f, 25.985f, 4.015f, 28f, 6.5f, 28f)
            horizontalLineToRelative(19f)
            close()
            moveToRelative(0f, -22f)
            curveTo(26.88f, 6f, 28f, 7.12f, 28f, 8.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(12f)
            verticalLineTo(6f)
            horizontalLineToRelative(13.5f)
            close()
        }
    }.build()
}
