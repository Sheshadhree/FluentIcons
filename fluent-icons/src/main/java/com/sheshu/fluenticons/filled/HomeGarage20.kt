package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HomeGarage20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HomeGarage20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.005f, 2.386f)
            curveToRelative(-0.571f, -0.515f, -1.439f, -0.515f, -2.01f, 0f)
            lineToRelative(-5.5f, 4.96f)
            curveTo(3.18f, 7.63f, 3f, 8.033f, 3f, 8.458f)
            verticalLineToRelative(7.04f)
            curveTo(3f, 16.33f, 3.672f, 17f, 4.5f, 17f)
            horizontalLineTo(6f)
            verticalLineToRelative(-4.5f)
            curveTo(6f, 11.672f, 6.672f, 11f, 7.5f, 11f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(8.46f)
            curveToRelative(0f, -0.426f, -0.18f, -0.83f, -0.495f, -1.115f)
            lineToRelative(-5.5f, -4.959f)
            close()
            moveTo(13f, 14f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 12f, 7f, 12.224f, 7f, 12.5f)
            verticalLineTo(14f)
            horizontalLineToRelative(6f)
            close()
            moveToRelative(-6f, 1f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(2f)
            horizontalLineTo(7f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}
