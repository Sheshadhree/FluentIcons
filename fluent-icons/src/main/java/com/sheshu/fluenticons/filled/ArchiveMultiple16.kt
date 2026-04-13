package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArchiveMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArchiveMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 1f)
            curveTo(1.448f, 1f, 1f, 1.448f, 1f, 2f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(2f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(2f)
            close()
            moveToRelative(0f, 4f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            horizontalLineTo(2f)
            close()
            moveToRelative(3.5f, 1.5f)
            curveTo(5.5f, 6.224f, 5.724f, 6f, 6f, 6f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(8.276f, 7f, 8f, 7f)
            horizontalLineTo(6f)
            curveTo(5.724f, 7f, 5.5f, 6.776f, 5.5f, 6.5f)
            close()
            moveTo(13f, 5.085f)
            curveToRelative(0.583f, 0.206f, 1f, 0.762f, 1f, 1.415f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-0.74f, 0f, -1.387f, -0.402f, -1.732f, -1f)
            horizontalLineTo(11f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5.085f)
            close()
        }
    }.build()
}
