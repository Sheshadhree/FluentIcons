package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Frame16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Frame16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 1f)
            curveTo(3.776f, 1f, 4f, 1.224f, 4f, 1.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(8f)
            verticalLineTo(1.5f)
            curveTo(12f, 1.224f, 12.224f, 1f, 12.5f, 1f)
            reflectiveCurveTo(13f, 1.224f, 13f, 1.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(1.5f)
            curveTo(14.776f, 3f, 15f, 3.224f, 15f, 3.5f)
            reflectiveCurveTo(14.776f, 4f, 14.5f, 4f)
            horizontalLineTo(13f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(14.776f, 13f, 14.5f, 13f)
            horizontalLineTo(13f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(12f, 14.776f, 12f, 14.5f)
            verticalLineTo(13f)
            horizontalLineTo(4f)
            verticalLineToRelative(1.5f)
            curveTo(4f, 14.776f, 3.776f, 15f, 3.5f, 15f)
            reflectiveCurveTo(3f, 14.776f, 3f, 14.5f)
            verticalLineTo(13f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 13f, 1f, 12.776f, 1f, 12.5f)
            reflectiveCurveTo(1.224f, 12f, 1.5f, 12f)
            horizontalLineTo(3f)
            verticalLineTo(4f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 4f, 1f, 3.776f, 1f, 3.5f)
            reflectiveCurveTo(1.224f, 3f, 1.5f, 3f)
            horizontalLineTo(3f)
            verticalLineTo(1.5f)
            curveTo(3f, 1.224f, 3.224f, 1f, 3.5f, 1f)
            close()
        }
    }.build()
}
