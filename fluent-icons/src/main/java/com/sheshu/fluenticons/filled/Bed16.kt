package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Bed16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Bed16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 6f)
            horizontalLineToRelative(1f)
            verticalLineTo(5.5f)
            curveTo(8.5f, 5.224f, 8.724f, 5f, 9f, 5f)
            horizontalLineToRelative(1.5f)
            curveTo(10.776f, 5f, 11f, 5.224f, 11f, 5.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(5f)
            curveTo(3.895f, 2f, 3f, 2.895f, 3f, 4f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2f)
            verticalLineTo(5.5f)
            curveTo(5f, 5.224f, 5.224f, 5f, 5.5f, 5f)
            horizontalLineTo(7f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(6f)
            close()
            moveToRelative(-4f, 1f)
            curveTo(2.12f, 7f, 1f, 8.12f, 1f, 9.5f)
            verticalLineToRelative(4f)
            curveTo(1f, 13.776f, 1.224f, 14f, 1.5f, 14f)
            reflectiveCurveTo(2f, 13.776f, 2f, 13.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-4f)
            curveTo(15f, 8.12f, 13.88f, 7f, 12.5f, 7f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}
