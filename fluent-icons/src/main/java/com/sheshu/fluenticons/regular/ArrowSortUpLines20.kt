package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSortUpLines20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSortUpLines20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 17.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(14f, 17.776f, 14f, 17.5f)
            verticalLineTo(3.707f)
            lineToRelative(-2.146f, 2.147f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(3f, -3f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(3f, 3f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(15f, 3.707f)
            verticalLineTo(17.5f)
            close()
            moveTo(2.5f, 16f)
            curveTo(2.224f, 16f, 2f, 15.776f, 2f, 15.5f)
            reflectiveCurveTo(2.224f, 15f, 2.5f, 15f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(11.776f, 16f, 11.5f, 16f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(5f, 12.5f)
            curveTo(5f, 12.776f, 5.224f, 13f, 5.5f, 13f)
            horizontalLineToRelative(6f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 12f, 11.5f, 12f)
            horizontalLineToRelative(-6f)
            curveTo(5.224f, 12f, 5f, 12.224f, 5f, 12.5f)
            close()
            moveTo(8.5f, 10f)
            curveTo(8.224f, 10f, 8f, 9.776f, 8f, 9.5f)
            reflectiveCurveTo(8.224f, 9f, 8.5f, 9f)
            horizontalLineToRelative(3f)
            curveTo(11.776f, 9f, 12f, 9.224f, 12f, 9.5f)
            reflectiveCurveTo(11.776f, 10f, 11.5f, 10f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
