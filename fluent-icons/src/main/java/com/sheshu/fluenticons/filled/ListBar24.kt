package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ListBar24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ListBar24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 21f)
            horizontalLineTo(19f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(9.5f)
            verticalLineToRelative(5f)
            close()
            moveToRelative(0f, -6.5f)
            horizontalLineTo(19f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(9.5f)
            verticalLineToRelative(5f)
            close()
            moveTo(8f, 9.5f)
            verticalLineToRelative(5f)
            horizontalLineTo(5f)
            curveToRelative(-1.104f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.105f, 0.896f, -2f, 2f, -2f)
            horizontalLineToRelative(3f)
            close()
            moveTo(9.5f, 8f)
            horizontalLineTo(19f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(9.5f)
            verticalLineToRelative(5f)
            close()
            moveTo(8f, 3f)
            verticalLineToRelative(5f)
            horizontalLineTo(5f)
            curveTo(3.895f, 8f, 3f, 7.105f, 3f, 6f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(0f, 13f)
            verticalLineToRelative(5f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(3f)
            close()
        }
    }.build()
}
