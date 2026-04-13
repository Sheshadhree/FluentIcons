package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LockClosed16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LockClosed16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 9f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveTo(7f, 9.552f, 7f, 9f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveTo(5f, 4f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 4f, 2f, 5.12f, 2f, 6.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveTo(14f, 5.12f, 12.88f, 4f, 11.5f, 4f)
            horizontalLineTo(11f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
            verticalLineTo(4f)
            close()
            moveToRelative(1f, -0.5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            verticalLineTo(4f)
            horizontalLineTo(6f)
            verticalLineTo(3.5f)
            close()
            moveTo(11.5f, 5f)
            curveTo(12.328f, 5f, 13f, 5.672f, 13f, 6.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineToRelative(-5f)
            curveTo(3f, 5.672f, 3.672f, 5f, 4.5f, 5f)
            horizontalLineToRelative(7f)
            close()
        }
    }.build()
}
