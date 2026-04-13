package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableStackAbove16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableStackAbove16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 2f)
            curveTo(2.224f, 2f, 2f, 2.224f, 2f, 2.5f)
            reflectiveCurveTo(2.224f, 3f, 2.5f, 3f)
            horizontalLineToRelative(11f)
            curveTo(13.776f, 3f, 14f, 2.776f, 14f, 2.5f)
            reflectiveCurveTo(13.776f, 2f, 13.5f, 2f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(9f, 12f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveTo(14f, 6.224f, 13.776f, 6f, 13.5f, 6f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 6f, 2f, 6.224f, 2f, 6.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            close()
            moveTo(3f, 7f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3f)
            horizontalLineTo(3f)
            verticalLineTo(7f)
            close()
            moveToRelative(3f, 0f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(3f)
            horizontalLineTo(6f)
            verticalLineTo(7f)
            close()
            moveToRelative(5f, 0f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-2f)
            verticalLineTo(7f)
            close()
            moveToRelative(-1f, 6f)
            horizontalLineTo(6f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(2f)
            close()
            moveToRelative(-5f, 0f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            close()
            moveToRelative(6f, 0f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(11f)
            close()
        }
    }.build()
}
