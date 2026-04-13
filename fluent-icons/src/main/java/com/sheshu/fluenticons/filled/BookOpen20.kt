package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookOpen20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookOpen20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 16.137f)
            curveTo(9.499f, 16.67f, 8.788f, 17f, 8f, 17f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 17f, 2f, 16.216f, 2f, 15.25f)
            verticalLineTo(4.75f)
            curveTo(2f, 3.784f, 2.784f, 3f, 3.75f, 3f)
            horizontalLineTo(8f)
            curveToRelative(0.788f, 0f, 1.499f, 0.331f, 2f, 0.862f)
            curveTo(10.501f, 3.332f, 11.212f, 3f, 12f, 3f)
            horizontalLineToRelative(4.25f)
            curveTo(17.216f, 3f, 18f, 3.784f, 18f, 4.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(12f)
            curveToRelative(-0.788f, 0f, -1.499f, -0.331f, -2f, -0.863f)
            close()
            moveTo(3.5f, 4.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
            horizontalLineTo(8f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-8.5f)
            curveTo(9.25f, 5.06f, 8.69f, 4.5f, 8f, 4.5f)
            horizontalLineTo(3.75f)
            curveTo(3.612f, 4.5f, 3.5f, 4.612f, 3.5f, 4.75f)
            close()
            moveToRelative(7.25f, 9.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(4.25f)
            curveToRelative(0.138f, 0f, 0.25f, -0.112f, 0.25f, -0.25f)
            verticalLineTo(4.75f)
            curveToRelative(0f, -0.138f, -0.112f, -0.25f, -0.25f, -0.25f)
            horizontalLineTo(12f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineToRelative(8.5f)
            close()
        }
    }.build()
}
