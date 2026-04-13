package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Archive32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Archive32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 14f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-6f)
            close()
            moveTo(3f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(20f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.889f, -0.386f, 1.687f, -1f, 2.236f)
            verticalLineTo(23.5f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-13f)
            curveTo(6.462f, 29f, 4f, 26.538f, 4f, 23.5f)
            verticalLineTo(10.236f)
            curveTo(3.386f, 9.686f, 3f, 8.888f, 3f, 8f)
            verticalLineTo(6f)
            close()
            moveToRelative(3f, 5f)
            verticalLineToRelative(12.5f)
            curveTo(6f, 25.433f, 7.567f, 27f, 9.5f, 27f)
            horizontalLineToRelative(13f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(11f)
            horizontalLineTo(6f)
            close()
            moveToRelative(0f, -6f)
            curveTo(5.448f, 5f, 5f, 5.448f, 5f, 6f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(20f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
