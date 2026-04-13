package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableStackBelow20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackBelow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 17f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.776f, 16f, 16.5f, 16f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 16f, 3f, 16.224f, 3f, 16.5f)
            reflectiveCurveTo(3.224f, 17f, 3.5f, 17f)
            horizontalLineToRelative(13f)
            close()
            moveTo(5f, 3f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(4f)
            horizontalLineTo(3f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
            moveTo(3f, 8f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 12f, 3f, 11.776f, 3f, 11.5f)
            verticalLineTo(8f)
            close()
            moveToRelative(5f, 0f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            horizontalLineTo(8f)
            close()
            moveToRelative(4f, -5f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(3f)
            close()
            moveToRelative(1f, 9f)
            verticalLineTo(8f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(13f)
            close()
            moveToRelative(0f, -9f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-4f)
            verticalLineTo(3f)
            close()
        }
    }.build()
}
