package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AlignLeft32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AlignLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(24f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineTo(4f)
            close()
            moveToRelative(7.5f, 1f)
            curveTo(8.567f, 5f, 7f, 6.567f, 7f, 8.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(15f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-3f)
            curveTo(29f, 6.567f, 27.433f, 5f, 25.5f, 5f)
            horizontalLineToRelative(-15f)
            close()
            moveTo(9f, 8.5f)
            curveTo(9f, 7.672f, 9.672f, 7f, 10.5f, 7f)
            horizontalLineToRelative(15f)
            curveTo(26.328f, 7f, 27f, 7.672f, 27f, 8.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-15f)
            curveTo(9.672f, 13f, 9f, 12.328f, 9f, 11.5f)
            verticalLineToRelative(-3f)
            close()
            moveToRelative(1.5f, 8.5f)
            curveTo(8.567f, 17f, 7f, 18.567f, 7f, 20.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(9f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(9f, 20.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(9.672f, 25f, 9f, 24.328f, 9f, 23.5f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
