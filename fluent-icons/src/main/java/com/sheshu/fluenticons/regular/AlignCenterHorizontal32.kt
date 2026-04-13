package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AlignCenterHorizontal32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AlignCenterHorizontal32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(30f, 16f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-3f)
            curveTo(6.567f, 27f, 5f, 25.433f, 5f, 23.5f)
            verticalLineTo(17f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(2f)
            verticalLineTo(8.5f)
            curveTo(5f, 6.567f, 6.567f, 5f, 8.5f, 5f)
            horizontalLineToRelative(3f)
            curveTo(13.433f, 5f, 15f, 6.567f, 15f, 8.5f)
            verticalLineTo(15f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-3.5f)
            curveTo(17f, 9.567f, 18.567f, 8f, 20.5f, 8f)
            horizontalLineToRelative(3f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineTo(15f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(-5f, -4.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-9f)
            close()
            moveTo(11.5f, 7f)
            horizontalLineToRelative(-3f)
            curveTo(7.672f, 7f, 7f, 7.672f, 7f, 8.5f)
            verticalLineToRelative(15f)
            curveTo(7f, 24.328f, 7.672f, 25f, 8.5f, 25f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-15f)
            curveTo(13f, 7.672f, 12.328f, 7f, 11.5f, 7f)
            close()
        }
    }.build()
}
