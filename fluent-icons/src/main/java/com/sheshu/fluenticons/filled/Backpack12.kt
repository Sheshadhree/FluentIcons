package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Backpack12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Backpack12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.062f, 3.5f)
            horizontalLineTo(4f)
            verticalLineToRelative(-1f)
            curveTo(4f, 1.672f, 4.672f, 1f, 5.5f, 1f)
            horizontalLineToRelative(1f)
            curveTo(7.328f, 1f, 8f, 1.672f, 8f, 2.5f)
            verticalLineToRelative(1f)
            horizontalLineTo(7.938f)
            curveTo(9.168f, 4.182f, 10f, 5.494f, 10f, 7f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(2.672f, 11f, 2f, 10.328f, 2f, 9.5f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.506f, 0.832f, -2.818f, 2.062f, -3.5f)
            close()
            moveTo(5f, 2.5f)
            verticalLineToRelative(0.626f)
            curveTo(5.32f, 3.044f, 5.655f, 3f, 6f, 3f)
            reflectiveCurveToRelative(0.68f, 0.044f, 1f, 0.126f)
            verticalLineTo(2.5f)
            curveTo(7f, 2.224f, 6.776f, 2f, 6.5f, 2f)
            horizontalLineToRelative(-1f)
            curveTo(5.224f, 2f, 5f, 2.224f, 5f, 2.5f)
            close()
            moveToRelative(0f, 3f)
            curveTo(5f, 5.776f, 5.224f, 6f, 5.5f, 6f)
            horizontalLineToRelative(1f)
            curveTo(6.776f, 6f, 7f, 5.776f, 7f, 5.5f)
            reflectiveCurveTo(6.776f, 5f, 6.5f, 5f)
            horizontalLineToRelative(-1f)
            curveTo(5.224f, 5f, 5f, 5.224f, 5f, 5.5f)
            close()
            moveTo(4.5f, 8f)
            curveTo(4.224f, 8f, 4f, 8.224f, 4f, 8.5f)
            reflectiveCurveTo(4.224f, 9f, 4.5f, 9f)
            horizontalLineToRelative(3f)
            curveTo(7.776f, 9f, 8f, 8.776f, 8f, 8.5f)
            reflectiveCurveTo(7.776f, 8f, 7.5f, 8f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
