package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AlignBottom32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AlignBottom32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 29f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(24f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(4f)
            close()
            moveToRelative(1f, -7.5f)
            curveTo(5f, 23.433f, 6.567f, 25f, 8.5f, 25f)
            horizontalLineToRelative(3f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-15f)
            curveTo(15f, 4.567f, 13.433f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-3f)
            curveTo(6.567f, 3f, 5f, 4.567f, 5f, 6.5f)
            verticalLineToRelative(15f)
            close()
            moveTo(8.5f, 23f)
            curveTo(7.672f, 23f, 7f, 22.328f, 7f, 21.5f)
            verticalLineToRelative(-15f)
            curveTo(7f, 5.672f, 7.672f, 5f, 8.5f, 5f)
            horizontalLineToRelative(3f)
            curveTo(12.328f, 5f, 13f, 5.672f, 13f, 6.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(8.5f, -1.5f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(3f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.933f, 0f, -3.5f, 1.567f, -3.5f, 3.5f)
            verticalLineToRelative(9f)
            close()
            moveToRelative(3.5f, 1.5f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
