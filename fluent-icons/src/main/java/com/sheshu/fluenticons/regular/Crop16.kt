package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Crop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Crop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 1.5f)
            curveTo(5f, 1.224f, 4.776f, 1f, 4.5f, 1f)
            reflectiveCurveTo(4f, 1.224f, 4f, 1.5f)
            verticalLineTo(4f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 4f, 1f, 4.224f, 1f, 4.5f)
            reflectiveCurveTo(1.224f, 5f, 1.5f, 5f)
            horizontalLineTo(4f)
            verticalLineToRelative(4.5f)
            curveTo(4f, 10.88f, 5.12f, 12f, 6.5f, 12f)
            horizontalLineTo(11f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 11f, 14.5f, 11f)
            horizontalLineToRelative(-8f)
            curveTo(5.672f, 11f, 5f, 10.328f, 5f, 9.5f)
            verticalLineToRelative(-8f)
            close()
            moveToRelative(6f, 5f)
            verticalLineTo(10f)
            horizontalLineToRelative(1f)
            verticalLineTo(6.5f)
            curveTo(12f, 5.12f, 10.88f, 4f, 9.5f, 4f)
            horizontalLineTo(6f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(3.5f)
            curveTo(10.328f, 5f, 11f, 5.672f, 11f, 6.5f)
            close()
        }
    }.build()
}
