package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextDescription16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextDescription16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.5f, 3f)
            curveTo(1.224f, 3f, 1f, 3.224f, 1f, 3.5f)
            reflectiveCurveTo(1.224f, 4f, 1.5f, 4f)
            horizontalLineToRelative(13f)
            curveTo(14.776f, 4f, 15f, 3.776f, 15f, 3.5f)
            reflectiveCurveTo(14.776f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(0f, 3f)
            curveTo(1.224f, 6f, 1f, 6.224f, 1f, 6.5f)
            reflectiveCurveTo(1.224f, 7f, 1.5f, 7f)
            horizontalLineToRelative(13f)
            curveTo(14.776f, 7f, 15f, 6.776f, 15f, 6.5f)
            reflectiveCurveTo(14.776f, 6f, 14.5f, 6f)
            horizontalLineToRelative(-13f)
            close()
            moveTo(1f, 9.5f)
            curveTo(1f, 9.224f, 1.224f, 9f, 1.5f, 9f)
            horizontalLineToRelative(13f)
            curveTo(14.776f, 9f, 15f, 9.224f, 15f, 9.5f)
            reflectiveCurveTo(14.776f, 10f, 14.5f, 10f)
            horizontalLineToRelative(-13f)
            curveTo(1.224f, 10f, 1f, 9.776f, 1f, 9.5f)
            close()
            moveTo(1.5f, 12f)
            curveTo(1.224f, 12f, 1f, 12.224f, 1f, 12.5f)
            reflectiveCurveTo(1.224f, 13f, 1.5f, 13f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.776f, 12f, 10.5f, 12f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}
