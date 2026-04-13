package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableStackLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 16.5f)
            curveTo(3f, 16.776f, 3.224f, 17f, 3.5f, 17f)
            reflectiveCurveTo(4f, 16.776f, 4f, 16.5f)
            verticalLineToRelative(-13f)
            curveTo(4f, 3.224f, 3.776f, 3f, 3.5f, 3f)
            reflectiveCurveTo(3f, 3.224f, 3f, 3.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(17f, 5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-4f)
            verticalLineTo(3f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(-5f, -2f)
            verticalLineToRelative(4f)
            horizontalLineTo(8f)
            verticalLineTo(3.5f)
            curveTo(8f, 3.224f, 8.224f, 3f, 8.5f, 3f)
            horizontalLineTo(12f)
            close()
            moveToRelative(0f, 5f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            close()
            moveToRelative(5f, 4f)
            verticalLineTo(8f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(-9f, 1f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 17f, 8f, 16.776f, 8f, 16.5f)
            verticalLineTo(13f)
            close()
            moveToRelative(9f, 0f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            close()
        }
    }.build()
}
