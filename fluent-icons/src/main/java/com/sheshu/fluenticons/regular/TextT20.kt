package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextT20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextT20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3.5f)
            curveTo(4f, 3.224f, 4.224f, 3f, 4.5f, 3f)
            horizontalLineToRelative(10f)
            curveTo(14.776f, 3f, 15f, 3.224f, 15f, 3.5f)
            verticalLineToRelative(2f)
            curveTo(15f, 5.776f, 14.776f, 6f, 14.5f, 6f)
            reflectiveCurveTo(14f, 5.776f, 14f, 5.5f)
            verticalLineTo(4f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(11.776f, 17f, 11.5f, 17f)
            horizontalLineToRelative(-4f)
            curveTo(7.224f, 17f, 7f, 16.776f, 7f, 16.5f)
            reflectiveCurveTo(7.224f, 16f, 7.5f, 16f)
            horizontalLineTo(9f)
            verticalLineTo(4f)
            horizontalLineTo(5f)
            verticalLineToRelative(1.5f)
            curveTo(5f, 5.776f, 4.776f, 6f, 4.5f, 6f)
            reflectiveCurveTo(4f, 5.776f, 4f, 5.5f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}
