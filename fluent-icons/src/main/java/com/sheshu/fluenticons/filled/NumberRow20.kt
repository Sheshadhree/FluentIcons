package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberRow20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberRow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3f)
            curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(3f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            close()
            moveToRelative(1f, 3.5f)
            curveTo(5f, 6.224f, 5.224f, 6f, 5.5f, 6f)
            reflectiveCurveTo(6f, 6.224f, 6f, 6.5f)
            verticalLineToRelative(7f)
            curveTo(6f, 13.776f, 5.776f, 14f, 5.5f, 14f)
            reflectiveCurveTo(5f, 13.776f, 5f, 13.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(13f, 3f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(3f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(0.5f, 3f)
            horizontalLineToRelative(2f)
            curveTo(15.776f, 6f, 16f, 6.224f, 16f, 6.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(14f)
            verticalLineTo(13f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(15.776f, 14f, 15.5f, 14f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(10f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineTo(15f)
            verticalLineTo(7f)
            horizontalLineToRelative(-1.5f)
            curveTo(13.224f, 7f, 13f, 6.776f, 13f, 6.5f)
            reflectiveCurveTo(13.224f, 6f, 13.5f, 6f)
            close()
        }
    }.build()
}
