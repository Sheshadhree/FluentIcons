package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableStackAbove20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableStackAbove20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 3.5f)
            curveTo(3f, 3.224f, 3.224f, 3f, 3.5f, 3f)
            horizontalLineToRelative(13f)
            curveTo(16.776f, 3f, 17f, 3.224f, 17f, 3.5f)
            reflectiveCurveTo(16.776f, 4f, 16.5f, 4f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 4f, 3f, 3.776f, 3f, 3.5f)
            close()
            moveToRelative(0f, 5f)
            curveTo(3f, 8.224f, 3.224f, 8f, 3.5f, 8f)
            horizontalLineToRelative(13f)
            curveTo(16.776f, 8f, 17f, 8.224f, 17f, 8.5f)
            verticalLineTo(15f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(8.5f)
            close()
            moveTo(4f, 13f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-3f)
            horizontalLineTo(4f)
            close()
            moveToRelative(8f, 3f)
            verticalLineToRelative(-3f)
            horizontalLineTo(8f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(1f, 0f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(0f, -4f)
            horizontalLineToRelative(3f)
            verticalLineTo(9f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(-1f, -3f)
            horizontalLineTo(8f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(4f)
            verticalLineTo(9f)
            close()
            moveTo(4f, 9f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineTo(9f)
            horizontalLineTo(4f)
            close()
        }
    }.build()
}
