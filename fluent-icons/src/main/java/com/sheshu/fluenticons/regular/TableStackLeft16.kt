package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableStackLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableStackLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 13.5f)
            curveTo(2f, 13.776f, 2.224f, 14f, 2.5f, 14f)
            reflectiveCurveTo(3f, 13.776f, 3f, 13.5f)
            verticalLineToRelative(-11f)
            curveTo(3f, 2.224f, 2.776f, 2f, 2.5f, 2f)
            reflectiveCurveTo(2f, 2.224f, 2f, 2.5f)
            verticalLineToRelative(11f)
            close()
            moveToRelative(12f, -9f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-5f)
            curveTo(6.224f, 2f, 6f, 2.224f, 6f, 2.5f)
            verticalLineToRelative(11f)
            curveTo(6f, 13.776f, 6.224f, 14f, 6.5f, 14f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(7f, 13f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2f)
            horizontalLineTo(7f)
            close()
            moveToRelative(0f, -3f)
            verticalLineTo(6f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(4f)
            horizontalLineTo(7f)
            close()
            moveToRelative(0f, -5f)
            verticalLineTo(3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2f)
            horizontalLineTo(7f)
            close()
            moveToRelative(6f, 1f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-2f)
            verticalLineTo(6f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(0f, 5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(11f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(0f, -6f)
            horizontalLineToRelative(-2f)
            verticalLineTo(3f)
            horizontalLineToRelative(0.5f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}
