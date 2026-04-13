package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabGroup20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabGroup20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 4f)
            curveTo(2.12f, 4f, 1f, 5.12f, 1f, 6.5f)
            verticalLineToRelative(5f)
            curveTo(1f, 12.88f, 2.12f, 14f, 3.5f, 14f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveTo(17f, 5.12f, 15.88f, 4f, 14.5f, 4f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(5f, 9f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(7f)
            curveTo(12.776f, 8.5f, 13f, 8.724f, 13f, 9f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-7f)
            curveTo(5.224f, 9.5f, 5f, 9.276f, 5f, 9f)
            close()
            moveToRelative(-1.496f, 6f)
            curveToRelative(0.456f, 0.607f, 1.182f, 1f, 2f, 1f)
            horizontalLineToRelative(9f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.818f, -0.393f, -1.544f, -1f, -2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-11f)
            close()
        }
    }.build()
}
