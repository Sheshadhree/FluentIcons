package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarTemplate32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarTemplate32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.5f)
            curveTo(2f, 4.015f, 4.015f, 2f, 6.5f, 2f)
            horizontalLineToRelative(15f)
            curveTo(23.985f, 2f, 26f, 4.015f, 26f, 6.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-9.5f)
            curveToRelative(-0.782f, 0f, -1.523f, 0.18f, -2.182f, 0.5f)
            horizontalLineTo(8f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4.169f)
            curveToRelative(-0.426f, 0.735f, -0.669f, 1.59f, -0.669f, 2.5f)
            verticalLineTo(26f)
            horizontalLineToRelative(-5f)
            curveTo(4.015f, 26f, 2f, 23.985f, 2f, 21.5f)
            verticalLineToRelative(-15f)
            close()
            moveTo(7f, 9f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(12f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(8f)
            curveTo(7.448f, 8f, 7f, 8.448f, 7f, 9f)
            close()
            moveToRelative(6f, 7.5f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(10f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineTo(18f)
            horizontalLineTo(13f)
            verticalLineToRelative(-1.5f)
            close()
            moveToRelative(0f, 10f)
            verticalLineTo(20f)
            horizontalLineToRelative(17f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-10f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            close()
        }
    }.build()
}
