package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextHanging20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextHanging20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 4f)
            curveTo(3.224f, 4f, 3f, 4.224f, 3f, 4.5f)
            reflectiveCurveTo(3.224f, 5f, 3.5f, 5f)
            horizontalLineToRelative(13f)
            curveTo(16.776f, 5f, 17f, 4.776f, 17f, 4.5f)
            reflectiveCurveTo(16.776f, 4f, 16.5f, 4f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(4f, 10f)
            curveTo(7.224f, 14f, 7f, 14.224f, 7f, 14.5f)
            reflectiveCurveTo(7.224f, 15f, 7.5f, 15f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.776f, 14f, 16.5f, 14f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(7f, 9.5f)
            curveTo(7f, 9.224f, 7.224f, 9f, 7.5f, 9f)
            horizontalLineToRelative(9f)
            curveTo(16.776f, 9f, 17f, 9.224f, 17f, 9.5f)
            reflectiveCurveTo(16.776f, 10f, 16.5f, 10f)
            horizontalLineToRelative(-9f)
            curveTo(7.224f, 10f, 7f, 9.776f, 7f, 9.5f)
            close()
            moveToRelative(-2.146f, 2.146f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(3.793f, 12f)
            lineToRelative(-1.147f, 1.146f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}
