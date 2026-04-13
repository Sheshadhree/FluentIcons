package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCollapseAll16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCollapseAll16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 3.5f)
            curveTo(1f, 3.224f, 1.224f, 3f, 1.5f, 3f)
            horizontalLineToRelative(13f)
            curveTo(14.776f, 3f, 15f, 3.224f, 15f, 3.5f)
            reflectiveCurveTo(14.776f, 4f, 14.5f, 4f)
            horizontalLineToRelative(-13f)
            curveTo(1.224f, 4f, 1f, 3.776f, 1f, 3.5f)
            close()
            moveToRelative(3.146f, 2.646f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(-0.196f, 0.196f, -0.512f, 0.196f, -0.708f, 0f)
            lineTo(5f, 7.708f)
            verticalLineTo(12.5f)
            curveTo(5f, 12.776f, 4.776f, 13f, 4.5f, 13f)
            reflectiveCurveTo(4f, 12.776f, 4f, 12.5f)
            verticalLineTo(7.707f)
            lineTo(2.853f, 8.854f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(2f, -2f)
            close()
            moveTo(14.5f, 6f)
            horizontalLineToRelative(-6f)
            curveTo(8.224f, 6f, 8f, 6.224f, 8f, 6.5f)
            reflectiveCurveTo(8.224f, 7f, 8.5f, 7f)
            horizontalLineToRelative(6f)
            curveTo(14.776f, 7f, 15f, 6.776f, 15f, 6.5f)
            reflectiveCurveTo(14.776f, 6f, 14.5f, 6f)
            close()
        }
    }.build()
}
