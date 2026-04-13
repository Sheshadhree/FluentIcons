package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarTemplate32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarTemplate32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 2f)
            curveTo(4.015f, 2f, 2f, 4.015f, 2f, 6.5f)
            verticalLineToRelative(15f)
            curveTo(2f, 23.985f, 4.015f, 26f, 6.5f, 26f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-5f)
            curveTo(5.12f, 24f, 4f, 22.88f, 4f, 21.5f)
            verticalLineToRelative(-15f)
            curveTo(4f, 5.12f, 5.12f, 4f, 6.5f, 4f)
            horizontalLineToRelative(15f)
            curveTo(22.88f, 4f, 24f, 5.12f, 24f, 6.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-5f)
            curveTo(26f, 4.015f, 23.985f, 2f, 21.5f, 2f)
            horizontalLineToRelative(-15f)
            close()
            moveToRelative(7.818f, 10f)
            horizontalLineTo(8f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4.169f)
            curveToRelative(0.499f, -0.863f, 1.248f, -1.563f, 2.149f, -2f)
            close()
            moveTo(8f, 8f)
            curveTo(7.448f, 8f, 7f, 8.448f, 7f, 9f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(12f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(8f)
            close()
            moveToRelative(5f, 8.5f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(10f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-10f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            verticalLineToRelative(-10f)
            close()
            moveToRelative(2f, 3.5f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(10f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(20f)
            horizontalLineTo(15f)
            close()
            moveToRelative(13f, -2f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-10f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineTo(18f)
            horizontalLineToRelative(13f)
            close()
        }
    }.build()
}
