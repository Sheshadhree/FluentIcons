package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Rename16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Rename16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 2f)
            curveTo(6.224f, 2f, 6f, 2.224f, 6f, 2.5f)
            reflectiveCurveTo(6.224f, 3f, 6.5f, 3f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(-1f)
            curveTo(6.224f, 13f, 6f, 13.224f, 6f, 13.5f)
            reflectiveCurveTo(6.224f, 14f, 6.5f, 14f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(9.776f, 13f, 9.5f, 13f)
            horizontalLineToRelative(-1f)
            verticalLineTo(3f)
            horizontalLineToRelative(1f)
            curveTo(9.776f, 3f, 10f, 2.776f, 10f, 2.5f)
            reflectiveCurveTo(9.776f, 2f, 9.5f, 2f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(4f, 4f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(8f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
            moveToRelative(8f, 8f)
            horizontalLineTo(9.5f)
            verticalLineTo(4f)
            horizontalLineTo(12f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            close()
        }
    }.build()
}
