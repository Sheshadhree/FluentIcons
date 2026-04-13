package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LockOpen12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LockOpen12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(11f, 3.276f, 11f, 3f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveTo(7f, 1.895f, 7f, 3f)
            verticalLineToRelative(1f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 4f, 2f, 4.672f, 2f, 5.5f)
            verticalLineToRelative(4f)
            curveTo(2f, 10.328f, 2.672f, 11f, 3.5f, 11f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveTo(10f, 4.672f, 9.328f, 4f, 8.5f, 4f)
            horizontalLineTo(8f)
            verticalLineTo(3f)
            close()
            moveTo(3.5f, 5f)
            horizontalLineToRelative(5f)
            curveTo(8.776f, 5f, 9f, 5.224f, 9f, 5.5f)
            verticalLineToRelative(4f)
            curveTo(9f, 9.776f, 8.776f, 10f, 8.5f, 10f)
            horizontalLineToRelative(-5f)
            curveTo(3.224f, 10f, 3f, 9.776f, 3f, 9.5f)
            verticalLineToRelative(-4f)
            curveTo(3f, 5.224f, 3.224f, 5f, 3.5f, 5f)
            close()
        }
    }.build()
}
