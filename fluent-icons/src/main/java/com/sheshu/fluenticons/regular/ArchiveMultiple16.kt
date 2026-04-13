package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArchiveMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArchiveMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 6f)
            curveTo(5.724f, 6f, 5.5f, 6.224f, 5.5f, 6.5f)
            reflectiveCurveTo(5.724f, 7f, 6f, 7f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(8.276f, 6f, 8f, 6f)
            horizontalLineTo(6f)
            close()
            moveTo(2f, 1f)
            curveTo(1.448f, 1f, 1f, 1.448f, 1f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(2f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(2f)
            close()
            moveToRelative(1f, 10f)
            verticalLineTo(5f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            close()
            moveTo(2f, 2f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(2f)
            horizontalLineTo(2f)
            verticalLineTo(2f)
            close()
            moveToRelative(12f, 4.5f)
            curveToRelative(0f, -0.653f, -0.417f, -1.209f, -1f, -1.415f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.104f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4.268f)
            curveTo(4.613f, 14.598f, 5.26f, 15f, 6f, 15f)
            horizontalLineToRelative(5f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6.5f)
            close()
        }
    }.build()
}
