package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Headphones12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Headphones12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(7.5f)
            curveTo(7.224f, 11f, 7f, 10.776f, 7f, 10.5f)
            verticalLineToRelative(-4f)
            curveTo(7f, 6.224f, 7.224f, 6f, 7.5f, 6f)
            horizontalLineTo(10f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            reflectiveCurveTo(2f, 3.79f, 2f, 6f)
            horizontalLineToRelative(2.5f)
            curveTo(4.776f, 6f, 5f, 6.224f, 5f, 6.5f)
            verticalLineToRelative(4f)
            curveTo(5f, 10.776f, 4.776f, 11f, 4.5f, 11f)
            horizontalLineTo(3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            close()
        }
    }.build()
}
