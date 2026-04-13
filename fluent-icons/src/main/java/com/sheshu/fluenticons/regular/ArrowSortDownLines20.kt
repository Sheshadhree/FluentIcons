package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSortDownLines20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSortDownLines20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 2.5f)
            curveTo(15f, 2.224f, 14.776f, 2f, 14.5f, 2f)
            reflectiveCurveTo(14f, 2.224f, 14f, 2.5f)
            verticalLineToRelative(13.793f)
            lineToRelative(-2.146f, -2.147f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(3f, 3f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(15f, 16.293f)
            verticalLineTo(2.5f)
            close()
            moveTo(2.5f, 4f)
            curveTo(2.224f, 4f, 2f, 4.224f, 2f, 4.5f)
            reflectiveCurveTo(2.224f, 5f, 2.5f, 5f)
            horizontalLineToRelative(9f)
            curveTo(11.776f, 5f, 12f, 4.776f, 12f, 4.5f)
            reflectiveCurveTo(11.776f, 4f, 11.5f, 4f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(5f, 7.5f)
            curveTo(5f, 7.224f, 5.224f, 7f, 5.5f, 7f)
            horizontalLineToRelative(6f)
            curveTo(11.776f, 7f, 12f, 7.224f, 12f, 7.5f)
            reflectiveCurveTo(11.776f, 8f, 11.5f, 8f)
            horizontalLineToRelative(-6f)
            curveTo(5.224f, 8f, 5f, 7.776f, 5f, 7.5f)
            close()
            moveTo(8.5f, 10f)
            curveTo(8.224f, 10f, 8f, 10.224f, 8f, 10.5f)
            reflectiveCurveTo(8.224f, 11f, 8.5f, 11f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 10f, 11.5f, 10f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
