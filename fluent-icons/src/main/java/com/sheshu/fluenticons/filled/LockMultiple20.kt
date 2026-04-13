package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LockMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LockMultiple20",
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
            moveToRelative(3f, 3f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            reflectiveCurveTo(6f, 3.343f, 6f, 5f)
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
            close()
            moveTo(6.086f, 16f)
            curveToRelative(0.206f, 0.583f, 0.761f, 1f, 1.415f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.653f, -0.418f, -1.209f, -1f, -1.415f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(6.086f)
            close()
            moveTo(10f, 10.5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
        }
    }.build()
}
