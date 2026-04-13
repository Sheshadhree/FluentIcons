package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSortUpLines16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSortUpLines16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 14.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(12f, 14.776f, 12f, 14.5f)
            verticalLineTo(2.707f)
            lineToRelative(-1.146f, 1.147f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(2f, -2f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(13f, 2.707f)
            verticalLineTo(14.5f)
            close()
            moveTo(2.5f, 13f)
            curveTo(2.224f, 13f, 2f, 12.776f, 2f, 12.5f)
            reflectiveCurveTo(2.224f, 12f, 2.5f, 12f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(9.776f, 13f, 9.5f, 13f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(2f, -3f)
            curveTo(4.224f, 10f, 4f, 9.776f, 4f, 9.5f)
            reflectiveCurveTo(4.224f, 9f, 4.5f, 9f)
            horizontalLineToRelative(5f)
            curveTo(9.776f, 9f, 10f, 9.224f, 10f, 9.5f)
            reflectiveCurveTo(9.776f, 10f, 9.5f, 10f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(6f, 6.5f)
            curveTo(6f, 6.776f, 6.224f, 7f, 6.5f, 7f)
            horizontalLineToRelative(3f)
            curveTo(9.776f, 7f, 10f, 6.776f, 10f, 6.5f)
            reflectiveCurveTo(9.776f, 6f, 9.5f, 6f)
            horizontalLineToRelative(-3f)
            curveTo(6.224f, 6f, 6f, 6.224f, 6f, 6.5f)
            close()
        }
    }.build()
}
