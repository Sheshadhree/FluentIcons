package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.List16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.List16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.5f)
            curveTo(2f, 3.224f, 2.224f, 3f, 2.5f, 3f)
            horizontalLineToRelative(8f)
            curveTo(10.776f, 3f, 11f, 3.224f, 11f, 3.5f)
            reflectiveCurveTo(10.776f, 4f, 10.5f, 4f)
            horizontalLineToRelative(-8f)
            curveTo(2.224f, 4f, 2f, 3.776f, 2f, 3.5f)
            close()
            moveToRelative(0f, 8f)
            curveTo(2f, 11.224f, 2.224f, 11f, 2.5f, 11f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(9.776f, 12f, 9.5f, 12f)
            horizontalLineToRelative(-7f)
            curveTo(2.224f, 12f, 2f, 11.776f, 2f, 11.5f)
            close()
            moveTo(2.5f, 7f)
            curveTo(2.224f, 7f, 2f, 7.224f, 2f, 7.5f)
            reflectiveCurveTo(2.224f, 8f, 2.5f, 8f)
            horizontalLineToRelative(11f)
            curveTo(13.776f, 8f, 14f, 7.776f, 14f, 7.5f)
            reflectiveCurveTo(13.776f, 7f, 13.5f, 7f)
            horizontalLineToRelative(-11f)
            close()
        }
    }.build()
}
