package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextT16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextT16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 2.5f)
            curveTo(3f, 2.224f, 3.224f, 2f, 3.5f, 2f)
            horizontalLineToRelative(8f)
            curveTo(11.776f, 2f, 12f, 2.224f, 12f, 2.5f)
            verticalLineToRelative(2f)
            curveTo(12f, 4.776f, 11.776f, 5f, 11.5f, 5f)
            reflectiveCurveTo(11f, 4.776f, 11f, 4.5f)
            verticalLineTo(3f)
            horizontalLineTo(8f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(9.276f, 14f, 9f, 14f)
            horizontalLineTo(6f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveTo(5.724f, 13f, 6f, 13f)
            horizontalLineToRelative(1f)
            verticalLineTo(3f)
            horizontalLineTo(4f)
            verticalLineToRelative(1.5f)
            curveTo(4f, 4.776f, 3.776f, 5f, 3.5f, 5f)
            reflectiveCurveTo(3f, 4.776f, 3f, 4.5f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}
