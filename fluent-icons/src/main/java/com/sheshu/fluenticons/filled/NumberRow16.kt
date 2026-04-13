package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberRow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberRow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            close()
            moveToRelative(3f, 1f)
            curveTo(3.724f, 5f, 3.5f, 5.224f, 3.5f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(3.5f, 10.776f, 3.724f, 11f, 4f, 11f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveTo(4.5f, 5.224f, 4.276f, 5f, 4f, 5f)
            close()
            moveToRelative(5f, -1f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            close()
            moveToRelative(2f, 1.5f)
            curveTo(11f, 5.776f, 11.224f, 6f, 11.5f, 6f)
            horizontalLineTo(12f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-0.5f)
            curveTo(11.224f, 7.5f, 11f, 7.724f, 11f, 8f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 10f, 12.5f, 10f)
            horizontalLineTo(12f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(0.5f)
            curveTo(12.776f, 8.5f, 13f, 8.276f, 13f, 8f)
            verticalLineTo(5.5f)
            curveTo(13f, 5.224f, 12.776f, 5f, 12.5f, 5f)
            horizontalLineToRelative(-1f)
            curveTo(11.224f, 5f, 11f, 5.224f, 11f, 5.5f)
            close()
        }
    }.build()
}
