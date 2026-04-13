package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SplitHorizontal16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SplitHorizontal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 8f)
            curveTo(14.776f, 8f, 15f, 7.776f, 15f, 7.5f)
            reflectiveCurveTo(14.776f, 7f, 14.5f, 7f)
            horizontalLineToRelative(-13f)
            curveTo(1.224f, 7f, 1f, 7.224f, 1f, 7.5f)
            reflectiveCurveTo(1.224f, 8f, 1.5f, 8f)
            horizontalLineToRelative(13f)
            close()
            moveTo(11f, 1f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(3f)
            horizontalLineTo(3f)
            verticalLineTo(3f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            close()
            moveTo(3f, 9f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(9f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
