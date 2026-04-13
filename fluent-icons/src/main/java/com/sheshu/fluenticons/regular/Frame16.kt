package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Frame16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Frame16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 1.5f)
            curveTo(4f, 1.224f, 3.776f, 1f, 3.5f, 1f)
            reflectiveCurveTo(3f, 1.224f, 3f, 1.5f)
            verticalLineTo(3f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 3f, 1f, 3.224f, 1f, 3.5f)
            reflectiveCurveTo(1.224f, 4f, 1.5f, 4f)
            horizontalLineTo(3f)
            verticalLineToRelative(8f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 12f, 1f, 12.224f, 1f, 12.5f)
            reflectiveCurveTo(1.224f, 13f, 1.5f, 13f)
            horizontalLineTo(3f)
            verticalLineToRelative(1.5f)
            curveTo(3f, 14.776f, 3.224f, 15f, 3.5f, 15f)
            reflectiveCurveTo(4f, 14.776f, 4f, 14.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 12f, 14.5f, 12f)
            horizontalLineTo(13f)
            verticalLineTo(4f)
            horizontalLineToRelative(1.5f)
            curveTo(14.776f, 4f, 15f, 3.776f, 15f, 3.5f)
            reflectiveCurveTo(14.776f, 3f, 14.5f, 3f)
            horizontalLineTo(13f)
            verticalLineTo(1.5f)
            curveTo(13f, 1.224f, 12.776f, 1f, 12.5f, 1f)
            reflectiveCurveTo(12f, 1.224f, 12f, 1.5f)
            verticalLineTo(3f)
            horizontalLineTo(4f)
            verticalLineTo(1.5f)
            close()
            moveTo(12f, 12f)
            horizontalLineTo(4f)
            verticalLineTo(4f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(8f)
            close()
        }
    }.build()
}
