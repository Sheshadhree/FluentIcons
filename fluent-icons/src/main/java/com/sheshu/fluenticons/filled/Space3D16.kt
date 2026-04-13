package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Space3D16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Space3D16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(-0.732f)
            lineToRelative(-1.334f, -2f)
            horizontalLineTo(13f)
            verticalLineTo(4.5f)
            curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(1.066f)
            lineToRelative(-1.334f, 2f)
            horizontalLineTo(2f)
            verticalLineTo(4.5f)
            close()
            moveToRelative(0f, 7f)
            verticalLineTo(11f)
            horizontalLineToRelative(3.306f)
            lineTo(4.31f, 13.993f)
            curveTo(3.017f, 13.895f, 2f, 12.816f, 2f, 11.5f)
            close()
            moveTo(6.36f, 11f)
            horizontalLineToRelative(3.28f)
            lineToRelative(1f, 3f)
            horizontalLineTo(5.36f)
            lineToRelative(1f, -3f)
            close()
            moveToRelative(0.334f, -1f)
            horizontalLineToRelative(2.612f)
            lineTo(8.64f, 8f)
            horizontalLineTo(7.36f)
            lineToRelative(-0.666f, 2f)
            close()
            moveToRelative(4f, 1f)
            horizontalLineTo(14f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.316f, -1.017f, 2.395f, -2.309f, 2.493f)
            lineTo(10.694f, 11f)
            close()
            moveToRelative(-0.334f, -1f)
            horizontalLineToRelative(1.706f)
            lineToRelative(-1.334f, -2f)
            horizontalLineTo(9.694f)
            lineToRelative(0.666f, 2f)
            close()
            moveToRelative(-6.426f, 0f)
            horizontalLineTo(5.64f)
            lineToRelative(0.666f, -2f)
            horizontalLineTo(5.268f)
            lineToRelative(-1.334f, 2f)
            close()
        }
    }.build()
}
