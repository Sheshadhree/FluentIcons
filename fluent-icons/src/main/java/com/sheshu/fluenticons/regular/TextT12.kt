package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextT12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextT12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 2.5f)
            curveTo(2f, 2.224f, 2.224f, 2f, 2.5f, 2f)
            horizontalLineToRelative(6f)
            curveTo(8.776f, 2f, 9f, 2.224f, 9f, 2.5f)
            verticalLineTo(4f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(8f, 4.276f, 8f, 4f)
            verticalLineTo(3f)
            horizontalLineTo(6f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(0.5f)
            curveTo(6.776f, 9f, 7f, 9.224f, 7f, 9.5f)
            reflectiveCurveTo(6.776f, 10f, 6.5f, 10f)
            horizontalLineToRelative(-2f)
            curveTo(4.224f, 10f, 4f, 9.776f, 4f, 9.5f)
            reflectiveCurveTo(4.224f, 9f, 4.5f, 9f)
            horizontalLineTo(5f)
            verticalLineTo(3f)
            horizontalLineTo(3f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(2f, 4.276f, 2f, 4f)
            verticalLineTo(2.5f)
            close()
        }
    }.build()
}
