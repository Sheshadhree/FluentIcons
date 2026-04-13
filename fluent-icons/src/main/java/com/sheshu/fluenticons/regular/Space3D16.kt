package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Space3D16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Space3D16",
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
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(3f, 11f)
            verticalLineToRelative(0.5f)
            curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineToRelative(0.14f)
            lineToRelative(0.666f, -2f)
            horizontalLineTo(3f)
            close()
            moveToRelative(2.64f, -1f)
            lineToRelative(0.666f, -2f)
            horizontalLineTo(5.268f)
            lineToRelative(-1.334f, 2f)
            horizontalLineTo(5.64f)
            close()
            moveToRelative(0.72f, 1f)
            lineToRelative(-0.666f, 2f)
            horizontalLineToRelative(4.612f)
            lineTo(9.64f, 11f)
            horizontalLineTo(6.36f)
            close()
            moveToRelative(2.946f, -1f)
            lineTo(8.64f, 8f)
            horizontalLineTo(7.36f)
            lineToRelative(-0.666f, 2f)
            horizontalLineToRelative(2.612f)
            close()
            moveToRelative(1.388f, 1f)
            lineToRelative(0.666f, 2f)
            horizontalLineToRelative(0.14f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(-2.306f)
            close()
            moveToRelative(1.372f, -1f)
            lineToRelative(-1.334f, -2f)
            horizontalLineTo(9.694f)
            lineToRelative(0.666f, 2f)
            horizontalLineToRelative(1.706f)
            close()
            moveTo(13f, 4.5f)
            curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(10f)
            verticalLineTo(4.5f)
            close()
            moveTo(3f, 9.599f)
            lineTo(4.066f, 8f)
            horizontalLineTo(3f)
            verticalLineToRelative(1.599f)
            close()
            moveToRelative(10f, 0f)
            verticalLineTo(8f)
            horizontalLineToRelative(-1.066f)
            lineTo(13f, 9.599f)
            close()
        }
    }.build()
}
