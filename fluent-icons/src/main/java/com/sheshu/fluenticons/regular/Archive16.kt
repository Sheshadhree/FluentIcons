package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Archive16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Archive16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 8f)
            curveTo(6.224f, 8f, 6f, 8.224f, 6f, 8.5f)
            reflectiveCurveTo(6.224f, 9f, 6.5f, 9f)
            horizontalLineToRelative(3f)
            curveTo(9.776f, 9f, 10f, 8.776f, 10f, 8.5f)
            reflectiveCurveTo(9.776f, 8f, 9.5f, 8f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(1f, 3.5f)
            curveTo(1f, 2.672f, 1.672f, 2f, 2.5f, 2f)
            horizontalLineToRelative(11f)
            curveTo(14.328f, 2f, 15f, 2.672f, 15f, 3.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.653f, -0.417f, 1.209f, -1f, 1.415f)
            verticalLineTo(11.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineTo(5.915f)
            curveTo(1.417f, 5.709f, 1f, 5.153f, 1f, 4.5f)
            verticalLineToRelative(-1f)
            close()
            moveTo(2.5f, 3f)
            curveTo(2.224f, 3f, 2f, 3.224f, 2f, 3.5f)
            verticalLineToRelative(1f)
            curveTo(2f, 4.776f, 2.224f, 5f, 2.5f, 5f)
            horizontalLineToRelative(11f)
            curveTo(13.776f, 5f, 14f, 4.776f, 14f, 4.5f)
            verticalLineToRelative(-1f)
            curveTo(14f, 3.224f, 13.776f, 3f, 13.5f, 3f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(3f, 6f)
            verticalLineToRelative(5.5f)
            curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(6f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
