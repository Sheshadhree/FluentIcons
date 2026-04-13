package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideText16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideText16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            close()
            moveToRelative(3.5f, 0f)
            curveTo(4.224f, 5f, 4f, 5.224f, 4f, 5.5f)
            reflectiveCurveTo(4.224f, 6f, 4.5f, 6f)
            horizontalLineToRelative(3f)
            curveTo(7.776f, 6f, 8f, 5.776f, 8f, 5.5f)
            reflectiveCurveTo(7.776f, 5f, 7.5f, 5f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(4f, 7.5f)
            curveTo(4f, 7.776f, 4.224f, 8f, 4.5f, 8f)
            horizontalLineToRelative(6f)
            curveTo(10.776f, 8f, 11f, 7.776f, 11f, 7.5f)
            reflectiveCurveTo(10.776f, 7f, 10.5f, 7f)
            horizontalLineToRelative(-6f)
            curveTo(4.224f, 7f, 4f, 7.224f, 4f, 7.5f)
            close()
            moveTo(4.5f, 9f)
            curveTo(4.224f, 9f, 4f, 9.224f, 4f, 9.5f)
            reflectiveCurveTo(4.224f, 10f, 4.5f, 10f)
            horizontalLineToRelative(4f)
            curveTo(8.776f, 10f, 9f, 9.776f, 9f, 9.5f)
            reflectiveCurveTo(8.776f, 9f, 8.5f, 9f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
