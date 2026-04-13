package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabDesktopClock20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabDesktopClock20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineToRelative(4.1f)
            curveTo(3.75f, 9.216f, 4.6f, 9f, 5.5f, 9f)
            curveToRelative(3.038f, 0f, 5.5f, 2.462f, 5.5f, 5.5f)
            curveToRelative(0f, 0.9f, -0.216f, 1.75f, -0.6f, 2.5f)
            horizontalLineToRelative(4.1f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(7f)
            horizontalLineTo(9.5f)
            curveTo(8.672f, 7f, 8f, 6.328f, 8f, 5.5f)
            verticalLineTo(3f)
            horizontalLineTo(5.5f)
            close()
            moveTo(9f, 3f)
            verticalLineToRelative(2.5f)
            curveTo(9f, 5.776f, 9.224f, 6f, 9.5f, 6f)
            horizontalLineTo(17f)
            verticalLineTo(5.5f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineTo(9f)
            close()
            moveTo(5.5f, 19f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(7.985f, 10f, 5.5f, 10f)
            reflectiveCurveTo(1f, 12.015f, 1f, 14.5f)
            reflectiveCurveTo(3.015f, 19f, 5.5f, 19f)
            close()
            moveToRelative(0f, -7f)
            curveTo(5.776f, 12f, 6f, 12.224f, 6f, 12.5f)
            verticalLineTo(14f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(7.276f, 15f, 7f, 15f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 15f, 5f, 14.776f, 5f, 14.5f)
            verticalLineToRelative(-2f)
            curveTo(5f, 12.224f, 5.224f, 12f, 5.5f, 12f)
            close()
        }
    }.build()
}
