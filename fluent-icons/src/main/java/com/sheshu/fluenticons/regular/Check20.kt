package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Check20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Check20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 7.121f)
            verticalLineTo(13f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(11.879f)
            lineToRelative(-1f, 1f)
            horizontalLineTo(4f)
            curveTo(3.448f, 6f, 3f, 6.448f, 3f, 7f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(12f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(8.121f)
            lineToRelative(1f, -1f)
            close()
            moveTo(4f, 8.5f)
            curveTo(4f, 8.224f, 4.224f, 8f, 4.5f, 8f)
            horizontalLineToRelative(2f)
            curveTo(6.776f, 8f, 7f, 8.224f, 7f, 8.5f)
            reflectiveCurveTo(6.776f, 9f, 6.5f, 9f)
            horizontalLineToRelative(-2f)
            curveTo(4.224f, 9f, 4f, 8.776f, 4f, 8.5f)
            close()
            moveToRelative(0f, 3f)
            curveTo(4f, 11.224f, 4.224f, 11f, 4.5f, 11f)
            horizontalLineTo(9f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(9.276f, 12f, 9f, 12f)
            horizontalLineTo(4.5f)
            curveTo(4.224f, 12f, 4f, 11.776f, 4f, 11.5f)
            close()
            moveToRelative(13.854f, -6.354f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-6f, 6f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(6f, -6f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            close()
        }
    }.build()
}
