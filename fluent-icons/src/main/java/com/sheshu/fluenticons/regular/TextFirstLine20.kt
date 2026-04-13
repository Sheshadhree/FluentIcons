package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextFirstLine20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextFirstLine20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.646f, 3.147f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineTo(16.207f, 5f)
            lineToRelative(1.147f, 1.146f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(1.5f, -1.5f)
            close()
            moveTo(12.5f, 4f)
            curveTo(12.776f, 4f, 13f, 4.224f, 13f, 4.5f)
            reflectiveCurveTo(12.776f, 5f, 12.5f, 5f)
            horizontalLineToRelative(-10f)
            curveTo(2.224f, 5f, 2f, 4.776f, 2f, 4.5f)
            reflectiveCurveTo(2.224f, 4f, 2.5f, 4f)
            horizontalLineToRelative(10f)
            close()
            moveToRelative(5f, 10f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(17.776f, 15f, 17.5f, 15f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 15f, 2f, 14.776f, 2f, 14.5f)
            reflectiveCurveTo(2.224f, 14f, 2.5f, 14f)
            horizontalLineToRelative(15f)
            close()
            moveTo(18f, 9.5f)
            curveTo(18f, 9.224f, 17.776f, 9f, 17.5f, 9f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 9f, 2f, 9.224f, 2f, 9.5f)
            reflectiveCurveTo(2.224f, 10f, 2.5f, 10f)
            horizontalLineToRelative(15f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
