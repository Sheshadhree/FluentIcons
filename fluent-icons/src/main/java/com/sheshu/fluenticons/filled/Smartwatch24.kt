package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Smartwatch24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Smartwatch24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 2f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(1.29f)
            curveTo(7.963f, 5.104f, 8.47f, 5f, 9f, 5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.53f, 0f, 1.037f, 0.103f, 1.5f, 0.29f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(9f, 6f)
            curveTo(7.343f, 6f, 6f, 7.343f, 6f, 9f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineToRelative(-2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(9f)
            close()
            moveToRelative(0f, 13f)
            curveToRelative(-0.53f, 0f, -1.037f, -0.103f, -1.5f, -0.29f)
            verticalLineTo(20f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(5f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-1.29f)
            curveTo(16.037f, 18.896f, 15.53f, 19f, 15f, 19f)
            horizontalLineTo(9f)
            close()
        }
    }.build()
}
