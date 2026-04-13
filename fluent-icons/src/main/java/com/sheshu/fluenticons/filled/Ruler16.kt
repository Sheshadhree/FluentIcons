package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Ruler16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Ruler16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 2f)
            curveTo(10.328f, 2f, 11f, 2.672f, 11f, 3.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveTo(5.672f, 14f, 5f, 13.33f, 5f, 12.5f)
            verticalLineToRelative(-9f)
            curveTo(5f, 2.672f, 5.672f, 2f, 6.5f, 2f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(-2f, 9f)
            curveTo(7.776f, 11f, 8f, 10.776f, 8f, 10.5f)
            reflectiveCurveTo(7.776f, 10f, 7.5f, 10f)
            horizontalLineTo(6f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1.5f)
            close()
            moveTo(8f, 8.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.223f, 0.5f, -0.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(6f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(2f)
            close()
            moveTo(7.5f, 6f)
            curveTo(7.776f, 6f, 8f, 5.777f, 8f, 5.5f)
            curveTo(8f, 5.224f, 7.776f, 5f, 7.5f, 5f)
            horizontalLineTo(6f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1.5f)
            close()
        }
    }.build()
}
