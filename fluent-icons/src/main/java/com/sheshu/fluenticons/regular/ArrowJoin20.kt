package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowJoin20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowJoin20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 2.5f)
            curveTo(5f, 2.224f, 4.776f, 2f, 4.5f, 2f)
            reflectiveCurveTo(4f, 2.224f, 4f, 2.5f)
            curveToRelative(0f, 3.213f, 1.968f, 5.922f, 4.777f, 7f)
            curveTo(5.967f, 10.578f, 4f, 13.287f, 4f, 16.5f)
            curveTo(4f, 16.776f, 4.224f, 17f, 4.5f, 17f)
            reflectiveCurveTo(5f, 16.776f, 5f, 16.5f)
            curveToRelative(0f, -3.624f, 2.876f, -6.5f, 6.5f, -6.5f)
            horizontalLineToRelative(0.793f)
            lineToRelative(-1.147f, 1.146f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(12.293f, 9f)
            horizontalLineTo(11.5f)
            curveTo(7.876f, 9f, 5f, 6.124f, 5f, 2.5f)
            close()
            moveTo(8.5f, 4f)
            curveTo(8.224f, 4f, 8f, 4.224f, 8f, 4.5f)
            reflectiveCurveTo(8.224f, 5f, 8.5f, 5f)
            horizontalLineTo(15f)
            curveToRelative(0.524f, 0f, 1f, 0.476f, 1f, 1f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.524f, -0.476f, 1f, -1f, 1f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 14f, 8f, 14.224f, 8f, 14.5f)
            reflectiveCurveTo(8.224f, 15f, 8.5f, 15f)
            horizontalLineTo(15f)
            curveToRelative(1.076f, 0f, 2f, -0.924f, 2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.076f, -0.924f, -2f, -2f, -2f)
            horizontalLineTo(8.5f)
            close()
        }
    }.build()
}
