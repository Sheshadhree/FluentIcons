package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ExpandUpRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ExpandUpRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 4f)
            curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(2.5f)
            curveTo(8.776f, 3f, 9f, 3.224f, 9f, 3.5f)
            reflectiveCurveTo(8.776f, 4f, 8.5f, 4f)
            horizontalLineTo(6f)
            close()
            moveToRelative(5f, -0.5f)
            curveTo(11f, 3.224f, 11.224f, 3f, 11.5f, 3f)
            horizontalLineToRelative(5f)
            curveTo(16.776f, 3f, 17f, 3.224f, 17f, 3.5f)
            verticalLineToRelative(5f)
            curveTo(17f, 8.776f, 16.776f, 9f, 16.5f, 9f)
            reflectiveCurveTo(16f, 8.776f, 16f, 8.5f)
            verticalLineTo(4.707f)
            lineToRelative(-4.146f, 4.147f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            lineTo(15.293f, 4f)
            horizontalLineTo(11.5f)
            curveTo(11.224f, 4f, 11f, 3.776f, 11f, 3.5f)
            close()
        }
    }.build()
}
