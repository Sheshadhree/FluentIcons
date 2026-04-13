package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Receipt20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Receipt20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(7f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(5f)
            close()
            moveToRelative(11f, 8f)
            verticalLineToRelative(3f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(-1f, 3f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(5f)
            curveTo(4.448f, 4f, 4f, 4.448f, 4f, 5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(7f)
            close()
            moveTo(6f, 6.5f)
            curveTo(6f, 6.224f, 6.224f, 6f, 6.5f, 6f)
            horizontalLineToRelative(4f)
            curveTo(10.776f, 6f, 11f, 6.224f, 11f, 6.5f)
            reflectiveCurveTo(10.776f, 7f, 10.5f, 7f)
            horizontalLineToRelative(-4f)
            curveTo(6.224f, 7f, 6f, 6.776f, 6f, 6.5f)
            close()
            moveToRelative(0f, 3f)
            curveTo(6f, 9.224f, 6.224f, 9f, 6.5f, 9f)
            horizontalLineToRelative(4f)
            curveTo(10.776f, 9f, 11f, 9.224f, 11f, 9.5f)
            reflectiveCurveTo(10.776f, 10f, 10.5f, 10f)
            horizontalLineToRelative(-4f)
            curveTo(6.224f, 10f, 6f, 9.776f, 6f, 9.5f)
            close()
            moveToRelative(0f, 3f)
            curveTo(6f, 12.224f, 6.224f, 12f, 6.5f, 12f)
            horizontalLineToRelative(2f)
            curveTo(8.776f, 12f, 9f, 12.224f, 9f, 12.5f)
            reflectiveCurveTo(8.776f, 13f, 8.5f, 13f)
            horizontalLineToRelative(-2f)
            curveTo(6.224f, 13f, 6f, 12.776f, 6f, 12.5f)
            close()
        }
    }.build()
}
