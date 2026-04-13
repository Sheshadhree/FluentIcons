package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Open12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Open12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3f)
            curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveTo(10f, 6.724f, 10f, 7f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(5.276f, 3f, 5f, 3f)
            horizontalLineTo(4f)
            close()
            moveToRelative(3f, 0f)
            curveTo(6.724f, 3f, 6.5f, 2.776f, 6.5f, 2.5f)
            reflectiveCurveTo(6.724f, 2f, 7f, 2f)
            horizontalLineToRelative(2.5f)
            curveTo(9.776f, 2f, 10f, 2.224f, 10f, 2.5f)
            verticalLineTo(5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(9f, 5.276f, 9f, 5f)
            verticalLineTo(3.707f)
            lineTo(7.354f, 5.354f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(8.293f, 3f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}
