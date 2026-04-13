package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableChecker20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableChecker20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 5.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(1f)
            verticalLineTo(5.5f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineTo(9f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(5.5f)
            curveTo(15.328f, 4f, 16f, 4.672f, 16f, 5.5f)
            close()
            moveTo(3f, 9f)
            verticalLineToRelative(5.5f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineTo(11f)
            verticalLineToRelative(-1f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 16f, 4f, 15.328f, 4f, 14.5f)
            verticalLineTo(9f)
            horizontalLineTo(3f)
            close()
            moveToRelative(2.5f, -6f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(12f)
            verticalLineToRelative(-4f)
            horizontalLineTo(7f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineTo(5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            close()
            moveToRelative(9f, 13f)
            curveToRelative(0.78f, 0f, 1.42f, -0.595f, 1.493f, -1.355f)
            lineTo(16f, 14.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(1.5f)
            close()
            moveTo(12f, 8f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            close()
            moveTo(4f, 7f)
            horizontalLineToRelative(3f)
            verticalLineTo(4f)
            horizontalLineTo(5.5f)
            curveTo(4.72f, 4f, 4.08f, 4.595f, 4.007f, 5.356f)
            lineTo(4f, 5.5f)
            verticalLineTo(7f)
            close()
        }
    }.build()
}
