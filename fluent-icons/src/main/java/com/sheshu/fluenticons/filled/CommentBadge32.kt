package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentBadge32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentBadge32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.17f, 3f)
            curveToRelative(-0.425f, 0.736f, -0.67f, 1.589f, -0.67f, 2.5f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            curveToRelative(0.911f, 0f, 1.764f, -0.245f, 2.5f, -0.67f)
            verticalLineToRelative(9.67f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-7.632f)
            lineToRelative(-6.57f, 5.602f)
            curveTo(9.999f, 30.71f, 8f, 29.787f, 8f, 28.082f)
            verticalLineTo(24f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 24f, 2f, 21.985f, 2f, 19.5f)
            verticalLineToRelative(-12f)
            curveTo(2f, 5.015f, 4.015f, 3f, 6.5f, 3f)
            horizontalLineToRelative(16.67f)
            close()
            moveToRelative(4.33f, -1f)
            curveTo(29.433f, 2f, 31f, 3.567f, 31f, 5.5f)
            reflectiveCurveTo(29.433f, 9f, 27.5f, 9f)
            reflectiveCurveTo(24f, 7.433f, 24f, 5.5f)
            reflectiveCurveTo(25.567f, 2f, 27.5f, 2f)
            close()
        }
    }.build()
}
