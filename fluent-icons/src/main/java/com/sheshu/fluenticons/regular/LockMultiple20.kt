package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LockMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LockMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 3f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(1f)
            horizontalLineTo(7f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
            moveTo(6f, 5f)
            verticalLineToRelative(1f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 6f, 4f, 6.672f, 4f, 7.5f)
            verticalLineToRelative(6f)
            curveTo(4f, 14.328f, 4.672f, 15f, 5.5f, 15f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            curveTo(14f, 6.672f, 13.328f, 6f, 12.5f, 6f)
            horizontalLineTo(12f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            reflectiveCurveTo(6f, 3.343f, 6f, 5f)
            close()
            moveTo(5f, 7.5f)
            curveTo(5f, 7.224f, 5.224f, 7f, 5.5f, 7f)
            horizontalLineToRelative(7f)
            curveTo(12.776f, 7f, 13f, 7.224f, 13f, 7.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-7f)
            curveTo(5.224f, 14f, 5f, 13.776f, 5f, 13.5f)
            verticalLineToRelative(-6f)
            close()
            moveTo(7.5f, 17f)
            curveToRelative(-0.652f, 0f, -1.208f, -0.417f, -1.414f, -1f)
            horizontalLineTo(12.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(8.085f)
            curveToRelative(0.582f, 0.206f, 1f, 0.762f, 1f, 1.415f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(9f, 11.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
