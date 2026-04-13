package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableStackRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableStackRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 3f)
            curveTo(16.776f, 3f, 17f, 3.224f, 17f, 3.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(16f, 16.776f, 16f, 16.5f)
            verticalLineToRelative(-13f)
            curveTo(16f, 3.224f, 16.224f, 3f, 16.5f, 3f)
            close()
            moveToRelative(-5f, 0f)
            curveTo(11.776f, 3f, 12f, 3.224f, 12f, 3.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6.5f)
            close()
            moveTo(7f, 4f)
            horizontalLineTo(5f)
            curveTo(4.448f, 4f, 4f, 4.448f, 4f, 5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(3f)
            verticalLineTo(4f)
            close()
            moveToRelative(-3f, 8f)
            horizontalLineToRelative(3f)
            verticalLineTo(8f)
            horizontalLineTo(4f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(0f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-3f)
            horizontalLineTo(4f)
            close()
            moveToRelative(4f, 0f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-3f)
            horizontalLineTo(8f)
            close()
            moveToRelative(3f, -1f)
            verticalLineTo(8f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(0f, -8f)
            horizontalLineTo(8f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineTo(4f)
            close()
        }
    }.build()
}
