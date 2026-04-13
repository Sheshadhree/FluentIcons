package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Ruler32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Ruler32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 5.5f)
            curveTo(9f, 3.567f, 10.567f, 2f, 12.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(21.433f, 2f, 23f, 3.567f, 23f, 5.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.242f, 0f, -0.477f, -0.024f, -0.705f, -0.071f)
            curveTo(10.2f, 29.603f, 9f, 28.19f, 9f, 26.5f)
            verticalLineToRelative(-21f)
            close()
            moveTo(11f, 6f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(0f, 4.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(0f, 4.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(0f, 4.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(0f, 4.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
