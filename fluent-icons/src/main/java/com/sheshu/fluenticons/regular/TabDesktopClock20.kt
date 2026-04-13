package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TabDesktopClock20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TabDesktopClock20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-4.1f)
            curveToRelative(0.162f, -0.317f, 0.294f, -0.651f, 0.393f, -1f)
            horizontalLineTo(14.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(7f)
            horizontalLineTo(9.5f)
            curveTo(8.672f, 7f, 8f, 6.328f, 8f, 5.5f)
            verticalLineTo(4f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 4f, 4f, 4.672f, 4f, 5.5f)
            verticalLineToRelative(3.707f)
            curveTo(3.651f, 9.306f, 3.317f, 9.437f, 3f, 9.6f)
            verticalLineTo(5.5f)
            close()
            moveTo(16f, 6f)
            verticalLineTo(5.5f)
            curveTo(16f, 4.672f, 15.328f, 4f, 14.5f, 4f)
            horizontalLineTo(9f)
            verticalLineToRelative(1.5f)
            curveTo(9f, 5.776f, 9.224f, 6f, 9.5f, 6f)
            horizontalLineTo(16f)
            close()
            moveToRelative(-6f, 8.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(1f, 16.985f, 1f, 14.5f)
            reflectiveCurveTo(3.015f, 10f, 5.5f, 10f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveTo(5.5f, 12f)
            curveTo(5.224f, 12f, 5f, 12.224f, 5f, 12.5f)
            verticalLineToRelative(2f)
            curveTo(5f, 14.776f, 5.224f, 15f, 5.5f, 15f)
            horizontalLineTo(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(7.276f, 14f, 7f, 14f)
            horizontalLineTo(6f)
            verticalLineToRelative(-1.5f)
            curveTo(6f, 12.224f, 5.776f, 12f, 5.5f, 12f)
            close()
        }
    }.build()
}
