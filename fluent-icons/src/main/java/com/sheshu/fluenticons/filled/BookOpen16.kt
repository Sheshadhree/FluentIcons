package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookOpen16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookOpen16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 2f)
            curveTo(1.784f, 2f, 1f, 2.784f, 1f, 3.75f)
            verticalLineToRelative(8.5f)
            curveTo(1f, 13.216f, 1.784f, 14f, 2.75f, 14f)
            horizontalLineTo(6f)
            curveToRelative(0.788f, 0f, 1.499f, -0.331f, 2f, -0.863f)
            curveTo(8.501f, 13.67f, 9.212f, 14f, 10f, 14f)
            horizontalLineToRelative(3.25f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-8.5f)
            curveTo(15f, 2.784f, 14.216f, 2f, 13.25f, 2f)
            horizontalLineTo(10f)
            curveTo(9.212f, 2f, 8.501f, 2.331f, 8f, 2.862f)
            curveTo(7.499f, 2.332f, 6.788f, 2f, 6f, 2f)
            horizontalLineTo(2.75f)
            close()
            moveToRelative(4.5f, 2.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(2.75f)
            curveToRelative(-0.138f, 0f, -0.25f, -0.112f, -0.25f, -0.25f)
            verticalLineToRelative(-8.5f)
            curveToRelative(0f, -0.138f, 0.112f, -0.25f, 0.25f, -0.25f)
            horizontalLineTo(6f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            close()
            moveToRelative(1.5f, 6.5f)
            verticalLineToRelative(-6.5f)
            curveTo(8.75f, 4.06f, 9.31f, 3.5f, 10f, 3.5f)
            horizontalLineToRelative(3.25f)
            curveToRelative(0.138f, 0f, 0.25f, 0.112f, 0.25f, 0.25f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.138f, -0.112f, 0.25f, -0.25f, 0.25f)
            horizontalLineTo(10f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            close()
        }
    }.build()
}
