package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ExpandUpLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ExpandUpLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 4f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(4f)
            horizontalLineTo(6f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-2.5f)
            curveTo(4f, 11.224f, 3.776f, 11f, 3.5f, 11f)
            reflectiveCurveTo(3f, 11.224f, 3f, 11.5f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineToRelative(-2.5f)
            curveTo(11.224f, 3f, 11f, 3.224f, 11f, 3.5f)
            reflectiveCurveTo(11.224f, 4f, 11.5f, 4f)
            horizontalLineTo(14f)
            close()
            moveTo(9f, 3.5f)
            curveTo(9f, 3.224f, 8.776f, 3f, 8.5f, 3f)
            horizontalLineToRelative(-5f)
            curveTo(3.224f, 3f, 3f, 3.224f, 3f, 3.5f)
            verticalLineToRelative(5f)
            curveTo(3f, 8.776f, 3.224f, 9f, 3.5f, 9f)
            reflectiveCurveTo(4f, 8.776f, 4f, 8.5f)
            verticalLineTo(4.707f)
            lineToRelative(4.146f, 4.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            curveToRelative(0.196f, -0.196f, 0.196f, -0.512f, 0f, -0.707f)
            lineTo(4.708f, 4f)
            horizontalLineTo(8.5f)
            curveTo(8.776f, 4f, 9f, 3.776f, 9f, 3.5f)
            close()
        }
    }.build()
}
