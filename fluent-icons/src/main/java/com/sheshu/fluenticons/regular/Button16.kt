package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Button16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Button16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 5.5f)
            curveTo(1f, 4.12f, 2.12f, 3f, 3.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(13.88f, 3f, 15f, 4.12f, 15f, 5.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.12f, 12f, 1f, 10.88f, 1f, 9.5f)
            verticalLineToRelative(-4f)
            close()
            moveTo(3.5f, 4f)
            curveTo(2.672f, 4f, 2f, 4.672f, 2f, 5.5f)
            verticalLineToRelative(4f)
            curveTo(2f, 10.328f, 2.672f, 11f, 3.5f, 11f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveTo(14f, 4.672f, 13.328f, 4f, 12.5f, 4f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(7f, 7.5f)
            curveTo(7f, 7.224f, 7.224f, 7f, 7.5f, 7f)
            horizontalLineTo(12f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.276f, 8f, 12f, 8f)
            horizontalLineTo(7.5f)
            curveTo(7.224f, 8f, 7f, 7.776f, 7f, 7.5f)
            close()
            moveToRelative(-1f, 0f)
            curveTo(6f, 8.328f, 5.328f, 9f, 4.5f, 9f)
            reflectiveCurveTo(3f, 8.328f, 3f, 7.5f)
            reflectiveCurveTo(3.672f, 6f, 4.5f, 6f)
            reflectiveCurveTo(6f, 6.672f, 6f, 7.5f)
            close()
        }
    }.build()
}
