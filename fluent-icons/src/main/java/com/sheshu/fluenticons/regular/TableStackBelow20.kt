package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableStackBelow20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableStackBelow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 16.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 17f, 3f, 16.776f, 3f, 16.5f)
            reflectiveCurveTo(3.224f, 16f, 3.5f, 16f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            close()
            moveToRelative(0f, -5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 12f, 3f, 11.776f, 3f, 11.5f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6.5f)
            close()
            moveTo(16f, 7f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            close()
            moveTo(8f, 4f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(4f)
            verticalLineTo(4f)
            horizontalLineTo(8f)
            close()
            moveTo(7f, 4f)
            horizontalLineTo(5f)
            curveTo(4.448f, 4f, 4f, 4.448f, 4f, 5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(3f)
            verticalLineTo(4f)
            close()
            moveToRelative(0f, 4f)
            horizontalLineTo(4f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineTo(8f)
            close()
            moveToRelative(1f, 3f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            horizontalLineTo(8f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(8f, 0f)
            verticalLineTo(8f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            close()
        }
    }.build()
}
