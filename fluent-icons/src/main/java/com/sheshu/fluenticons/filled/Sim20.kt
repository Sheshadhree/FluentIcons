package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Sim20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Sim20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 5f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(3.464f)
            curveToRelative(0.796f, 0f, 1.56f, 0.316f, 2.122f, 0.879f)
            lineToRelative(2.535f, 2.535f)
            curveTo(15.684f, 5.977f, 16f, 6.74f, 16f, 7.536f)
            verticalLineTo(15f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(7f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(5f)
            close()
            moveToRelative(3f, 5.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(3f)
            verticalLineTo(9f)
            horizontalLineTo(8.5f)
            curveTo(7.672f, 9f, 7f, 9.672f, 7f, 10.5f)
            close()
            moveTo(7f, 12f)
            verticalLineToRelative(1.5f)
            curveTo(7f, 14.328f, 7.672f, 15f, 8.5f, 15f)
            horizontalLineTo(10f)
            verticalLineToRelative(-3f)
            horizontalLineTo(7f)
            close()
            moveToRelative(4.5f, 3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveTo(13f, 9.672f, 12.328f, 9f, 11.5f, 9f)
            horizontalLineTo(11f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(0.5f)
            close()
        }
    }.build()
}
