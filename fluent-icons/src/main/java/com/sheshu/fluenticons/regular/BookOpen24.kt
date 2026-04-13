package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BookOpen24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookOpen24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 19.137f)
            curveTo(11.499f, 19.67f, 10.788f, 20f, 10f, 20f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 20f, 2f, 19.216f, 2f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(2f, 4.784f, 2.784f, 4f, 3.75f, 4f)
            horizontalLineTo(10f)
            curveToRelative(0.788f, 0f, 1.499f, 0.331f, 2f, 0.862f)
            curveTo(12.501f, 4.332f, 13.212f, 4f, 14f, 4f)
            horizontalLineToRelative(6.25f)
            curveTo(21.216f, 4f, 22f, 4.784f, 22f, 5.75f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(14f)
            curveToRelative(-0.788f, 0f, -1.499f, -0.331f, -2f, -0.863f)
            close()
            moveTo(3.5f, 5.75f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
            horizontalLineTo(10f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(6.75f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(3.75f)
            curveTo(3.612f, 5.5f, 3.5f, 5.612f, 3.5f, 5.75f)
            close()
            moveToRelative(9.25f, 11.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(6.25f)
            curveToRelative(0.138f, 0f, 0.25f, -0.112f, 0.25f, -0.25f)
            verticalLineTo(5.75f)
            curveToRelative(0f, -0.138f, -0.112f, -0.25f, -0.25f, -0.25f)
            horizontalLineTo(14f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineToRelative(10.5f)
            close()
        }
    }.build()
}
