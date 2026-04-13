package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AlignTop32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AlignTop32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3f)
            curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(24f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(4f)
            close()
            moveToRelative(1f, 7.5f)
            curveTo(5f, 8.567f, 6.567f, 7f, 8.5f, 7f)
            horizontalLineToRelative(3f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-3f)
            curveTo(6.567f, 29f, 5f, 27.433f, 5f, 25.5f)
            verticalLineToRelative(-15f)
            close()
            moveTo(8.5f, 9f)
            curveTo(7.672f, 9f, 7f, 9.672f, 7f, 10.5f)
            verticalLineToRelative(15f)
            curveTo(7f, 26.328f, 7.672f, 27f, 8.5f, 27f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-15f)
            curveTo(13f, 9.672f, 12.328f, 9f, 11.5f, 9f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(8.5f, 1.5f)
            curveTo(17f, 8.567f, 18.567f, 7f, 20.5f, 7f)
            horizontalLineToRelative(3f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            verticalLineToRelative(-9f)
            close()
            moveTo(20.5f, 9f)
            curveTo(19.672f, 9f, 19f, 9.672f, 19f, 10.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-9f)
            curveTo(25f, 9.672f, 24.328f, 9f, 23.5f, 9f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
