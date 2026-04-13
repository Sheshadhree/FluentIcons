package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableStackLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableStackLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 17f)
            curveTo(3.224f, 17f, 3f, 16.776f, 3f, 16.5f)
            verticalLineToRelative(-13f)
            curveTo(3f, 3.224f, 3.224f, 3f, 3.5f, 3f)
            reflectiveCurveTo(4f, 3.224f, 4f, 3.5f)
            verticalLineToRelative(13f)
            curveTo(4f, 16.776f, 3.776f, 17f, 3.5f, 17f)
            close()
            moveToRelative(5f, 0f)
            curveTo(8.224f, 17f, 8f, 16.776f, 8f, 16.5f)
            verticalLineToRelative(-13f)
            curveTo(8f, 3.224f, 8.224f, 3f, 8.5f, 3f)
            horizontalLineTo(15f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(8.5f)
            close()
            moveToRelative(4.5f, -1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(3f, -8f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(3f)
            verticalLineTo(8f)
            close()
            moveToRelative(0f, -1f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(-4f, 0f)
            verticalLineTo(4f)
            horizontalLineTo(9f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            close()
            moveTo(9f, 8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(3f)
            verticalLineTo(8f)
            horizontalLineTo(9f)
            close()
            moveToRelative(0f, 8f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-3f)
            horizontalLineTo(9f)
            verticalLineToRelative(3f)
            close()
        }
    }.build()
}
