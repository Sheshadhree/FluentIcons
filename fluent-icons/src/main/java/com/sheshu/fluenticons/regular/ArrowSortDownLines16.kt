package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSortDownLines16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSortDownLines16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 1.5f)
            curveTo(13f, 1.224f, 12.776f, 1f, 12.5f, 1f)
            reflectiveCurveTo(12f, 1.224f, 12f, 1.5f)
            verticalLineToRelative(11.793f)
            lineToRelative(-1.146f, -1.147f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2f, 2f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(13f, 13.293f)
            verticalLineTo(1.5f)
            close()
            moveTo(2.5f, 3f)
            curveTo(2.224f, 3f, 2f, 3.224f, 2f, 3.5f)
            reflectiveCurveTo(2.224f, 4f, 2.5f, 4f)
            horizontalLineToRelative(7f)
            curveTo(9.776f, 4f, 10f, 3.776f, 10f, 3.5f)
            reflectiveCurveTo(9.776f, 3f, 9.5f, 3f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(2f, 3f)
            curveTo(4.224f, 6f, 4f, 6.224f, 4f, 6.5f)
            reflectiveCurveTo(4.224f, 7f, 4.5f, 7f)
            horizontalLineToRelative(5f)
            curveTo(9.776f, 7f, 10f, 6.776f, 10f, 6.5f)
            reflectiveCurveTo(9.776f, 6f, 9.5f, 6f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(6f, 9.5f)
            curveTo(6f, 9.224f, 6.224f, 9f, 6.5f, 9f)
            horizontalLineToRelative(3f)
            curveTo(9.776f, 9f, 10f, 9.224f, 10f, 9.5f)
            reflectiveCurveTo(9.776f, 10f, 9.5f, 10f)
            horizontalLineToRelative(-3f)
            curveTo(6.224f, 10f, 6f, 9.776f, 6f, 9.5f)
            close()
        }
    }.build()
}
