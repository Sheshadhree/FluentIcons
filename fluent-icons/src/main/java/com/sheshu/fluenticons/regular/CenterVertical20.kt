package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CenterVertical20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CenterVertical20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.5f)
            curveTo(2f, 3.224f, 2.224f, 3f, 2.5f, 3f)
            horizontalLineToRelative(15f)
            curveTo(17.776f, 3f, 18f, 3.224f, 18f, 3.5f)
            reflectiveCurveTo(17.776f, 4f, 17.5f, 4f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 4f, 2f, 3.776f, 2f, 3.5f)
            close()
            moveTo(2.5f, 16f)
            curveTo(2.224f, 16f, 2f, 16.224f, 2f, 16.5f)
            reflectiveCurveTo(2.224f, 17f, 2.5f, 17f)
            horizontalLineToRelative(15f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 16f, 17.5f, 16f)
            horizontalLineToRelative(-15f)
            close()
            moveTo(6f, 7f)
            curveTo(4.895f, 7f, 4f, 7.895f, 4f, 9f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            close()
            moveTo(5f, 9f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(9f)
            close()
        }
    }.build()
}
