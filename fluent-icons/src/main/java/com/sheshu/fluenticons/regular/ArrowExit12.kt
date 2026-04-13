package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowExit12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowExit12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 2f)
            curveTo(2.895f, 2f, 2f, 2.895f, 2f, 4f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(3.5f)
            curveTo(7.776f, 10f, 8f, 9.776f, 8f, 9.5f)
            reflectiveCurveTo(7.776f, 9f, 7.5f, 9f)
            horizontalLineTo(4f)
            curveTo(3.448f, 9f, 3f, 8.552f, 3f, 8f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3.5f)
            curveTo(7.776f, 3f, 8f, 2.776f, 8f, 2.5f)
            reflectiveCurveTo(7.776f, 2f, 7.5f, 2f)
            horizontalLineTo(4f)
            close()
            moveToRelative(4.854f, 1.647f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.195f, -0.196f, 0.511f, 0f, 0.707f)
            lineTo(9.293f, 5.5f)
            horizontalLineTo(5f)
            curveTo(4.724f, 5.5f, 4.5f, 5.724f, 4.5f, 6f)
            reflectiveCurveTo(4.724f, 6.5f, 5f, 6.5f)
            horizontalLineToRelative(4.293f)
            lineTo(8.147f, 7.646f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-2f, -2f)
            close()
        }
    }.build()
}
