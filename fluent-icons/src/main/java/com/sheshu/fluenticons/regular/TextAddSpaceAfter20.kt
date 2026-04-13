package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAddSpaceAfter20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAddSpaceAfter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.5f)
            curveTo(3f, 5.224f, 3.224f, 5f, 3.5f, 5f)
            horizontalLineToRelative(13f)
            curveTo(16.776f, 5f, 17f, 5.224f, 17f, 5.5f)
            reflectiveCurveTo(16.776f, 6f, 16.5f, 6f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 6f, 3f, 5.776f, 3f, 5.5f)
            close()
            moveToRelative(0f, 4f)
            curveTo(3f, 9.224f, 3.224f, 9f, 3.5f, 9f)
            horizontalLineToRelative(13f)
            curveTo(16.776f, 9f, 17f, 9.224f, 17f, 9.5f)
            reflectiveCurveTo(16.776f, 10f, 16.5f, 10f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 10f, 3f, 9.776f, 3f, 9.5f)
            close()
            moveToRelative(5.146f, 5.146f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            lineTo(10f, 14.207f)
            lineToRelative(1.146f, 1.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineToRelative(-1.5f, 1.5f)
            close()
        }
    }.build()
}
