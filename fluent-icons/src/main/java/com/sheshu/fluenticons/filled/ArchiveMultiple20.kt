package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArchiveMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArchiveMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
            verticalLineToRelative(1f)
            curveTo(2f, 5.328f, 2.672f, 6f, 3.5f, 6f)
            horizontalLineToRelative(11f)
            curveTo(15.328f, 6f, 16f, 5.328f, 16f, 4.5f)
            verticalLineToRelative(-1f)
            curveTo(16f, 2.672f, 15.328f, 2f, 14.5f, 2f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(15f, 7f)
            horizontalLineTo(3f)
            verticalLineToRelative(5.5f)
            curveTo(3f, 14.433f, 4.567f, 16f, 6.5f, 16f)
            horizontalLineToRelative(5f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(7f)
            close()
            moveTo(7f, 8.5f)
            curveTo(7f, 8.224f, 7.224f, 8f, 7.5f, 8f)
            horizontalLineToRelative(3f)
            curveTo(10.776f, 8f, 11f, 8.224f, 11f, 8.5f)
            reflectiveCurveTo(10.776f, 9f, 10.5f, 9f)
            horizontalLineToRelative(-3f)
            curveTo(7.224f, 9f, 7f, 8.776f, 7f, 8.5f)
            close()
            moveTo(8.5f, 18f)
            curveToRelative(-0.953f, 0f, -1.818f, -0.381f, -2.45f, -1f)
            horizontalLineToRelative(6.45f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(7.085f)
            curveToRelative(0.583f, 0.206f, 1f, 0.762f, 1f, 1.415f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.485f, -2.014f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
