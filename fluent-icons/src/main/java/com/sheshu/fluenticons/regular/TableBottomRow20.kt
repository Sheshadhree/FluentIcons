package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableBottomRow20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableBottomRow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 3f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineToRelative(-9f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            close()
            moveTo(4f, 13f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.78f, 0.595f, 1.42f, 1.356f, 1.493f)
            lineTo(5.5f, 16f)
            horizontalLineTo(7f)
            verticalLineToRelative(-3f)
            horizontalLineTo(4f)
            close()
            moveToRelative(4f, 3f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-3f)
            horizontalLineTo(8f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(5f, 0f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.78f, 0f, 1.42f, -0.595f, 1.493f, -1.355f)
            lineTo(16f, 14.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(3f, -4f)
            verticalLineTo(5.5f)
            curveToRelative(0f, -0.78f, -0.595f, -1.42f, -1.355f, -1.493f)
            lineTo(14.5f, 4f)
            horizontalLineToRelative(-9f)
            curveTo(4.72f, 4f, 4.08f, 4.595f, 4.007f, 5.356f)
            lineTo(4f, 5.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(12f)
            close()
        }
    }.build()
}
