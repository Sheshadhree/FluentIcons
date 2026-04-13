package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SlideTextMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideTextMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 4f)
            curveTo(4.224f, 4f, 4f, 4.224f, 4f, 4.5f)
            reflectiveCurveTo(4.224f, 5f, 4.5f, 5f)
            horizontalLineToRelative(3f)
            curveTo(7.776f, 5f, 8f, 4.776f, 8f, 4.5f)
            reflectiveCurveTo(7.776f, 4f, 7.5f, 4f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(4f, 6.5f)
            curveTo(4f, 6.224f, 4.224f, 6f, 4.5f, 6f)
            horizontalLineToRelative(5f)
            curveTo(9.776f, 6f, 10f, 6.224f, 10f, 6.5f)
            reflectiveCurveTo(9.776f, 7f, 9.5f, 7f)
            horizontalLineToRelative(-5f)
            curveTo(4.224f, 7f, 4f, 6.776f, 4f, 6.5f)
            close()
            moveTo(4.5f, 8f)
            curveTo(4.224f, 8f, 4f, 8.224f, 4f, 8.5f)
            reflectiveCurveTo(4.224f, 9f, 4.5f, 9f)
            horizontalLineToRelative(3f)
            curveTo(7.776f, 9f, 8f, 8.776f, 8f, 8.5f)
            reflectiveCurveTo(7.776f, 8f, 7.5f, 8f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(-3f, -3.5f)
            curveTo(1.5f, 3.12f, 2.62f, 2f, 4f, 2f)
            horizontalLineToRelative(6.5f)
            curveTo(11.88f, 2f, 13f, 3.12f, 13f, 4.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(4f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(4f, 3f)
            curveTo(3.172f, 3f, 2.5f, 3.672f, 2.5f, 4.5f)
            verticalLineToRelative(5f)
            curveTo(2.5f, 10.328f, 3.172f, 11f, 4f, 11f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveTo(12f, 3.672f, 11.328f, 3f, 10.5f, 3f)
            horizontalLineTo(4f)
            close()
            moveToRelative(10f, 6.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineTo(3.671f)
            curveToRelative(0.773f, 0.626f, 1.757f, 1f, 2.829f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.072f, -0.375f, -2.056f, -1f, -2.829f)
            verticalLineTo(9.5f)
            close()
        }
    }.build()
}
