package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowExportUp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowExportUp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 14.5f)
            curveTo(3f, 14.224f, 3.224f, 14f, 3.5f, 14f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.776f, 15f, 12.5f, 15f)
            horizontalLineToRelative(-9f)
            curveTo(3.224f, 15f, 3f, 14.776f, 3f, 14.5f)
            close()
            moveToRelative(1.146f, -9.146f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(3.5f, -3.5f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(8.5f, 2.707f)
            verticalLineTo(11.5f)
            curveTo(8.5f, 11.776f, 8.276f, 12f, 8f, 12f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(2.707f)
            lineTo(4.854f, 5.354f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            close()
        }
    }.build()
}
