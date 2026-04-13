package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TabGroup20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TabGroup20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 6.5f)
            curveTo(1f, 5.12f, 2.12f, 4f, 3.5f, 4f)
            horizontalLineToRelative(11f)
            curveTo(15.88f, 4f, 17f, 5.12f, 17f, 6.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveTo(2.12f, 14f, 1f, 12.88f, 1f, 11.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(3.5f, 5f)
            curveTo(2.672f, 5f, 2f, 5.672f, 2f, 6.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 12.328f, 2.672f, 13f, 3.5f, 13f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveTo(16f, 5.672f, 15.328f, 5f, 14.5f, 5f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(2.004f, 11f)
            curveToRelative(-0.818f, 0f, -1.544f, -0.393f, -2f, -1f)
            horizontalLineToRelative(11f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0.607f, 0.456f, 1f, 1.182f, 1f, 2f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(5.5f, 8.5f)
            curveTo(5.224f, 8.5f, 5f, 8.724f, 5f, 9f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(7f)
            curveTo(12.776f, 9.5f, 13f, 9.276f, 13f, 9f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
