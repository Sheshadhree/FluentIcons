package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableColumnTopBottom20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableColumnTopBottom20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 5.5f)
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
            verticalLineTo(13f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineTo(5.5f)
            lineToRelative(-0.144f, -0.007f)
            curveTo(4.595f, 15.92f, 4f, 15.28f, 4f, 14.5f)
            close()
            moveTo(14.5f, 16f)
            horizontalLineTo(13f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(1.5f)
            lineToRelative(-0.007f, 0.145f)
            curveTo(15.92f, 15.405f, 15.28f, 16f, 14.5f, 16f)
            close()
            moveTo(12f, 8f)
            verticalLineToRelative(4f)
            horizontalLineTo(8f)
            verticalLineTo(8f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(1f, 0f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-3f)
            verticalLineTo(8f)
            close()
            moveToRelative(0f, -4f)
            horizontalLineToRelative(1.5f)
            lineToRelative(0.145f, 0.007f)
            curveTo(15.405f, 4.08f, 16f, 4.72f, 16f, 5.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(-3f)
            verticalLineTo(4f)
            close()
            moveTo(4f, 7f)
            verticalLineTo(5.5f)
            lineToRelative(0.007f, -0.144f)
            curveTo(4.08f, 4.595f, 4.72f, 4f, 5.5f, 4f)
            horizontalLineTo(7f)
            verticalLineToRelative(3f)
            horizontalLineTo(4f)
            close()
            moveToRelative(3f, 1f)
            verticalLineToRelative(4f)
            horizontalLineTo(4f)
            verticalLineTo(8f)
            horizontalLineToRelative(3f)
            close()
        }
    }.build()
}
