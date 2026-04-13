package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableCellsSplit20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableCellsSplit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 8f)
            verticalLineToRelative(4f)
            horizontalLineTo(9f)
            verticalLineTo(8f)
            horizontalLineToRelative(1f)
            close()
            moveToRelative(7f, -2.5f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9f)
            close()
            moveToRelative(-13f, 9f)
            verticalLineTo(14f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(2f)
            horizontalLineTo(5.5f)
            lineToRelative(-0.144f, -0.007f)
            curveTo(4.595f, 15.92f, 4f, 15.28f, 4f, 14.5f)
            close()
            moveTo(9f, 4f)
            lineTo(8.993f, 6f)
            horizontalLineToRelative(-5f)
            lineTo(4f, 5.5f)
            lineToRelative(0.007f, -0.144f)
            curveTo(4.08f, 4.595f, 4.72f, 4f, 5.5f, 4f)
            horizontalLineTo(9f)
            close()
            moveToRelative(0.993f, 2f)
            lineTo(10f, 4f)
            horizontalLineToRelative(4.5f)
            lineToRelative(0.145f, 0.007f)
            curveTo(15.405f, 4.08f, 16f, 4.72f, 16f, 5.5f)
            lineTo(15.993f, 6f)
            horizontalLineToRelative(-6f)
            close()
            moveTo(16f, 13f)
            horizontalLineTo(4f)
            lineTo(3.993f, 7f)
            horizontalLineToRelative(12f)
            lineTo(16f, 13f)
            close()
            moveToRelative(0f, 1.5f)
            lineToRelative(-0.007f, 0.145f)
            curveTo(15.92f, 15.405f, 15.28f, 16f, 14.5f, 16f)
            horizontalLineTo(10f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(0.5f)
            close()
        }
    }.build()
}
