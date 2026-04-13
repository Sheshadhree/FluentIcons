package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Button16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Button16",
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
            moveToRelative(6f, 2f)
            curveTo(7f, 7.776f, 7.224f, 8f, 7.5f, 8f)
            horizontalLineTo(12f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.276f, 7f, 12f, 7f)
            horizontalLineTo(7.5f)
            curveTo(7.224f, 7f, 7f, 7.224f, 7f, 7.5f)
            close()
            moveToRelative(-1f, 0f)
            curveTo(6f, 6.672f, 5.328f, 6f, 4.5f, 6f)
            reflectiveCurveTo(3f, 6.672f, 3f, 7.5f)
            reflectiveCurveTo(3.672f, 9f, 4.5f, 9f)
            reflectiveCurveTo(6f, 8.328f, 6f, 7.5f)
            close()
        }
    }.build()
}
